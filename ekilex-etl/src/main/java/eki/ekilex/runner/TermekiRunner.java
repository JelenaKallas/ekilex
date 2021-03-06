package eki.ekilex.runner;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.postgresql.jdbc.PgArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import eki.common.constant.FreeformType;
import eki.common.constant.ReferenceType;
import eki.common.constant.SourceType;
import eki.common.data.Count;
import eki.common.data.PgVarcharArray;
import eki.ekilex.data.transform.Lexeme;
import eki.ekilex.data.transform.Word;
import eki.ekilex.service.TermekiService;

@Component
@ConditionalOnBean(name = "dataSourceTermeki")
public class TermekiRunner extends AbstractLoaderRunner {

	private static Logger logger = LoggerFactory.getLogger(TermekiRunner.class);

	private static final String SQL_UPDATE_DOMAIN_DATSETS = "update " + DOMAIN + " set datasets = :datasets where code = :code and origin = :origin";

	private final static String LEXEME_RELATION_ABBREVIATION = "lyh";
	private static final String TERMEKI_CLASSIFIER_PRONUNCIATION = "termeki_pronunciation";
	private static final String TERMEKI_CLASSIFIER_WORD_CLASS = "termeki_word_class";

	private Map<String, String> posCodes;

	private String dataset;

	@Autowired
	private TermekiService termekiService;

	@Override
	String getDataset() {
		return dataset;
	}

	@Override
	public void deleteDatasetData() throws Exception {
		//deleteDatasetData(String dataset) does it
	}

	@Transactional
	public void deleteTermekiDatasetData(String dataset) throws Exception {
		deleteDatasetData(dataset);
	}

	@Override
	void initialise() throws Exception {
		posCodes = loadClassifierMappingsFor(TERMEKI_CLASSIFIER_PRONUNCIATION);
		posCodes.putAll(loadClassifierMappingsFor(TERMEKI_CLASSIFIER_WORD_CLASS));
	}

	@Transactional
	public void execute(Integer baseId, String dataset) throws Exception {

		if (!hasTermDatabaseAndIsKnownDataset(baseId, dataset)) {
			return;
		}
		this.dataset = dataset;
		start();

		Context context = new Context();
		context.terms = termekiService.getTerms(baseId);
		logger.info("Found {} terms.", context.terms.size());
		context.definitions = termekiService.getDefinitions(baseId);
		logger.info("Found {} definitions.", context.definitions.size());
		context.sourceMapping = loadSources(baseId);
		logger.info("Found {} sources.", context.sourceMapping.size());
		context.comments = termekiService.getComments(baseId);
		logger.info("Found {} comments.", context.comments.size());
		context.examples = termekiService.getExamples(baseId);
		logger.info("Found {} examples.", context.examples.size());
		context.images = termekiService.getImages(baseId);
		logger.info("Found {} images.", context.images.size());
		context.abbreviations = loadAbbreviations(dataset);
		context.genuses = loadGenuses(dataset);
		context.families = loadFamilies(dataset);
		context.describers = loadDescribers(dataset);
		context.describingYears = loadDescribingYears(dataset);
		context.geolDomains = loadGeolDomains(dataset);
		context.models = loadModelHtml(dataset);
		doImport(context, dataset);
		updateDataset(baseId, dataset);

		end();
	}

	// abbreviations are present only in termbase 1283851 - Eesti E-tervise SA terminibaas (ett)
	private List<Map<String, Object>> loadAbbreviations(String dataset) {
		if ("ett".equals(dataset)) {
			List<Map<String, Object>> abbreviations = termekiService.getTermAttributes(38708);
			logger.info("Found {} abbreviations.", abbreviations.size());
			return abbreviations;
		} else {
			return emptyList();
		}
	}

	// genuses are present only in termbase 7351963 - Ihtüoloogia (iht)
	private List<Map<String, Object>> loadGenuses(String dataset) {
		if ("iht".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(41152);
			logger.info("Found {} genuses.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	// families are present only in termbase 7351963 - Ihtüoloogia (iht)
	private List<Map<String, Object>> loadFamilies(String dataset) {
		if ("iht".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(41153);
			logger.info("Found {} families.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	// describers are present only in termbase 7351963 - Ihtüoloogia (iht)
	private List<Map<String, Object>> loadDescribers(String dataset) {
		if ("iht".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(44274);
			logger.info("Found {} describers.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	// describing years are present only in termbase 7351963 - Ihtüoloogia (iht)
	private List<Map<String, Object>> loadDescribingYears(String dataset) {
		if ("iht".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(44275);
			logger.info("Found {} describing years.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	// in case of Geol, domains are stored as concept extended attributes, termbase 4441577 - Geol (get)
	private List<Map<String, Object>> loadGeolDomains(String dataset) {
		if ("get".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(44388);
			logger.info("Found {} domains.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	// models html, termbase 3651782 - Arheoloogia terminibaas (arh)
	private List<Map<String, Object>> loadModelHtml(String dataset) {
		if ("arh".equals(dataset)) {
			List<Map<String, Object>> attributes = termekiService.getConceptAttributes(57314);
			logger.info("Found {} models.", attributes.size());
			return attributes;
		} else {
			return emptyList();
		}
	}

	private Map<Integer, SourceData> loadSources(Integer baseId) throws Exception {
		List<Map<String, Object>> sources = termekiService.getSources(baseId);
		Map<Integer, SourceData> termekiSourceToEkilexSourceMap = new HashMap<>();
		for (Map<String, Object> source : sources) {
			SourceData sourceData = getOrCreateSource(source);
			if (sourceData != null) {
				termekiSourceToEkilexSourceMap.put(sourceData.origId, sourceData);
			}
		}
		return termekiSourceToEkilexSourceMap;
	}

	private SourceData getOrCreateSource(Map<String, Object> origSource) throws Exception {
		String sourceName = (String) origSource.get("source_name");
		if (StringUtils.isBlank(sourceName)) {
			return null;
		}
		Integer origExtSourceId = (Integer) origSource.get("source_id");
		String extSourceId = origExtSourceId.toString();
		String author = (String) origSource.get("author");
		String publisher = (String) origSource.get("publisher");
		String isbn = (String) origSource.get("isbn");
		String www = (String) origSource.get("source_link");
		Date publishDate = (Date) origSource.get("publish_date");
		SourceType sourceType;
		if (StringUtils.isNotBlank(author)) {
			sourceType = SourceType.PERSON;
		} else if (StringUtils.isNotBlank(publisher)) {
			sourceType = SourceType.PERSON;
		} else if (StringUtils.isNotBlank(isbn)) {
			sourceType = SourceType.DOCUMENT;
		} else if (StringUtils.isNotBlank(www)) {
			sourceType = SourceType.DOCUMENT;
		} else {
			sourceType = SourceType.UNKNOWN;
		}
		Long sourceId = getSource(sourceType, extSourceId, sourceName);
		if (sourceId == null) {
			sourceId = createSource(sourceType, extSourceId, sourceName);
			if (StringUtils.isNotBlank(author)) {
				createSourceFreeform(sourceId, FreeformType.SOURCE_AUTHOR, author);
			}
			if (StringUtils.isNotBlank(publisher)) {
				createSourceFreeform(sourceId, FreeformType.SOURCE_PUBLISHER, publisher);
			}
			if (StringUtils.isNotBlank(isbn)) {
				createSourceFreeform(sourceId, FreeformType.SOURCE_ISBN, isbn);
			}
			if (StringUtils.isNotBlank(www)) {
				createSourceFreeform(sourceId, FreeformType.SOURCE_WWW, www);
			}
			if (publishDate != null) {
				Timestamp publishedTs = new Timestamp(publishDate.getTime());
				createSourceFreeform(sourceId, FreeformType.SOURCE_PUBLICATION_YEAR, publishedTs);
			}
		}
		return new SourceData(origExtSourceId, sourceId, sourceName);
	}

	private void updateDataset(Integer baseId, String dataset) throws Exception {

		Map<String, Object> termbase = termekiService.getTermbase(baseId);
		Map<String, Object> params = new HashMap<>();
		params.put("code", dataset);
		Map<String, Object> values = new HashMap<>();
		values.put("description", termbase.get("description"));
		values.put("is_public", termbase.get("is_public"));
		basicDbService.update(DATASET, params, values);
	}

	private void doImport(
			Context context,
			String dataset) throws Exception {

		Count wordDuplicateCount = new Count();
		Map<Integer, Long> conceptMeanings = new HashMap<>();
		List<String> existingGenders = getGenders();
		long count = 0;

		for (Map<String, Object> term : context.terms) {
			String language = unifyLang((String) term.get("lang"));
			String wordValue = (String) term.get("term");
			int homonymNr = getWordMaxHomonymNr(wordValue, language) + 1;
			Word word = new Word(wordValue, language, null, null, null, null, homonymNr, DEFAULT_WORD_MORPH_CODE, null, null);
			String genderCode = intoGenderCode((String) term.get("gender"));
			if (StringUtils.isNotBlank(genderCode)) {
				if (existingGenders.contains(genderCode)) {
					word.setGenderCode(genderCode);
				} else {
					logger.info("Invalid gender code : {}", genderCode);
				}
			}
			Long wordId = createOrSelectWord(word, null, null, wordDuplicateCount);

			Integer conceptId = (Integer) term.get("concept_id");
			if (!conceptMeanings.containsKey(conceptId)) {
				Long meaningId = createMeaning();
				createMeaningFreeform(meaningId, FreeformType.CONCEPT_ID, conceptId.toString());
				conceptMeanings.put(conceptId, meaningId);
				List<String> domainCodes = domainCodes(term, context, dataset);
				for (String domainCode : domainCodes) {
					Map<String, Object> domain = getDomain(domainCode, dataset);
					if (domain == null) {
						logger.info("Invalid domain code : {}", domainCode);
					} else {
						createMeaningDomain(meaningId, domainCode, dataset);
						//						updateDomainDatsetsIfNeeded(domain, dataset);
					}
				}
				addMeaningFreeforms(context, conceptId, meaningId);
				saveImages(context, conceptId, meaningId);
			}

			Long meaningId = conceptMeanings.get(conceptId);
			Lexeme lexeme = new Lexeme();
			lexeme.setWordId(wordId);
			lexeme.setMeaningId(meaningId);
			Long lexemeId = createLexeme(lexeme, dataset);
			String posCode = StringUtils.isNotBlank((String) term.get("pronunciation")) ? (String) term.get("pronunciation") : term.get("word_class").toString();
			savePosCode(lexemeId, posCode);
			Integer sourceId = (Integer) term.get("source_id");
			connectSourceToLexeme(sourceId, lexemeId, context.sourceMapping);
			Integer termId = (Integer) term.get("term_id");
			createAbbreviationIfNeeded(context, termId, meaningId, lexemeId, language, dataset, wordDuplicateCount);
			saveUsages(lexemeId, context, termId);
			if (++count % 100 == 0) {
				System.out.print(".");
			}
		}
		System.out.println();
		logger.info("{} words imported", context.terms.size());
		logger.info("{} duplicate words found", wordDuplicateCount.getValue());
		logger.info("{} meanings created", conceptMeanings.size());

		int definitionsCount = 0;
		for (Map<String, Object> definition : context.definitions) {
			String language = unifyLang((String) definition.get("lang"));
			Integer conceptId = (Integer) definition.get("concept_id");
			if (conceptMeanings.containsKey(conceptId)) {
				Long meaningId = conceptMeanings.get(conceptId);
				String definitionValue = (String) definition.get("definition");
				Long definitionId = createDefinition(meaningId, definitionValue, language, dataset);
				definitionsCount++;
				String publicNote = (String) definition.get("description");
				if (isNotBlank(publicNote)) {
					createMeaningFreeform(meaningId, FreeformType.PUBLIC_NOTE, publicNote);
				}
				Integer sourceId = (Integer) definition.get("source_id");
				connectSourceToDefinition(sourceId, definitionId, context.sourceMapping, definitionValue);
			}
		}
		logger.info("{} definitions created", definitionsCount);

		for (Map<String, Object> comment : context.comments) {
			Integer conceptId = (Integer) comment.get("concept_id");
			if (conceptMeanings.containsKey(conceptId)) {
				Long meaningId = conceptMeanings.get(conceptId);
				String privateNote = (String) comment.get("content");
				if (isNotBlank(privateNote)) {
					createMeaningFreeform(meaningId, FreeformType.PRIVATE_NOTE, privateNote);
				}
			}
		}
	}

	private void saveImages(Context context, Integer conceptId, Long meaningId) throws Exception {

		List<Map<String, Object>> images = context.images.stream().filter(f -> f.get("concept_id").equals(conceptId)).collect(toList());
		if (images.isEmpty())
			return;

		for (Map<String, Object> image : images) {
			createMeaningFreeform(meaningId, FreeformType.IMAGE_FILE, image.get("image_id").toString());
		}
	}

	private void saveUsages(Long lexemeId, Context context, Integer termId) throws Exception {

		List<Map<String, Object>> examples = context.examples.stream().filter(f -> f.get("term_id").equals(termId)).collect(toList());
		if (examples.isEmpty())
			return;

		for (Map<String, Object> example : examples) {
			String lang = unifyLang((String) example.get("lang"));
			Long usageId = createLexemeFreeform(lexemeId, FreeformType.USAGE, example.get("example"), lang);
			Integer sourceId = (Integer) example.get("source_id");
			connectSourceToUsage(sourceId, usageId, context.sourceMapping);
		}
	}

	private String intoGenderCode(String gender) {

		if (StringUtils.startsWith(gender, "die")) {
			return "f";
		} else if (StringUtils.startsWith(gender, "der")) {
			return "n";
		} else if (StringUtils.startsWith(gender, "das")) {
			return "m";
		} else {
			return gender;
		}
	}

	private List<String> domainCodes(Map<String, Object> term, Context context, String dataset) {

		List<String> codes = new ArrayList<>();
		if ("get".equals(dataset)) {
			Integer conceptId = (Integer) term.get("concept_id");
			Optional<Map<String, Object>> domainCode = context.geolDomains.stream().filter(d -> d.get("concept_id").equals(conceptId)).findFirst();
			if (domainCode.isPresent()) {
				String codeValue = cleanUpGeoDomainCodes((String) domainCode.get().get("attribute_value"));
				String[] codeValues = codeValue.split(",");
				for (String code : codeValues) {
					if (isNotBlank(code)) {
						codes.add(code);
					}
				}
			}
		} else {
			String code = (String) term.get("domain_code");
			if (isNotBlank(code)) {
				codes.add(code);
			}
		}
		return codes;
	}

	private String cleanUpGeoDomainCodes(String domainCodes) {
		String cleanedUp = domainCodes.toLowerCase()
				.replace("(paleo)", "pecol,")
				.replace("ecology", "ecol")
				.replace("cim", "clim")
				.replace("paleoecol", "pecol")
				.replace("glscio", "glacio")
				.replace("goechem", "geochem")
				.replace("hydrogeology", "hydro")
				.replace(" ", "")
				.replace("gen.gl", "gen. gl")
				.replace("gengl", "gen. gl")
				.replace("q", "Q")
				.replace(";", ",");
		if (cleanedUp.equals("eco")) {
			cleanedUp = "ecol";
		}
		return cleanedUp;
	}

	private void addMeaningFreeforms(Context context, Integer conceptId, Long meaningId) throws Exception {
		createMeaningFreeformOfType(FreeformType.GENUS, context.genuses, conceptId, meaningId);
		createMeaningFreeformOfType(FreeformType.FAMILY, context.families, conceptId, meaningId);
		createMeaningFreeformOfType(FreeformType.DESCRIBER, context.describers, conceptId, meaningId);
		createMeaningFreeformOfType(FreeformType.DESCRIBING_YEAR, context.describingYears, conceptId, meaningId);
		createMeaningFreeformOfType(FreeformType.PUBLIC_NOTE, context.models, conceptId, meaningId);
	}

	private void createMeaningFreeformOfType(FreeformType freeformType, List<Map<String, Object>> items, Integer conceptId, Long meaningId) throws Exception {
		if (!items.isEmpty()) {
			Optional<Map<String, Object>> item = items.stream().filter(i -> i.get("concept_id").equals(conceptId)).findFirst();
			if (item.isPresent()) {
				createMeaningFreeform(meaningId, freeformType, item.get().get("attribute_value"));
			}
		}
	}

	private void createAbbreviationIfNeeded(
			Context context,
			Integer termId,
			Long meaningId,
			Long termLexemeId,
			String language,
			String dataset,
			Count wordDuplicateCount) throws Exception {

		if (context.abbreviations.isEmpty())
			return;

		Optional<Map<String, Object>> abbreviation = context.abbreviations.stream().filter(a -> a.get("term_id").equals(termId)).findFirst();
		if (abbreviation.isPresent()) {
			String abbreviationValue = (String) abbreviation.get().get("attribute_value");
			int homonymNr = getWordMaxHomonymNr(abbreviationValue, language) + 1;
			Word word = new Word(abbreviationValue, language, null, null, null, null, homonymNr, DEFAULT_WORD_MORPH_CODE, null, null);
			Long wordId = createOrSelectWord(word, null, null, wordDuplicateCount);
			Lexeme lexeme = new Lexeme();
			lexeme.setWordId(wordId);
			lexeme.setMeaningId(meaningId);
			Long abbreviationLexemeId = createLexeme(lexeme, dataset);
			createLexemeRelation(abbreviationLexemeId, termLexemeId, LEXEME_RELATION_ABBREVIATION);
		}
	}

	private void connectSourceToDefinition(Integer sourceId, Long definitionId, Map<Integer, SourceData> sourceMapping, String definition) throws Exception {

		if (sourceMapping.containsKey(sourceId)) {
			SourceData ekilexSource = sourceMapping.get(sourceId);
			//TODO define proper ref type
			createDefinitionSourceLink(definitionId, ReferenceType.ANY, ekilexSource.id, null, ekilexSource.name);
		}
	}

	private void connectSourceToLexeme(Integer sourceId, Long lexemeId, Map<Integer, SourceData> sourceMapping) throws Exception {

		if (sourceMapping.containsKey(sourceId)) {
			SourceData ekilexSource = sourceMapping.get(sourceId);
			//TODO define proper ref type
			createLexemeSourceLink(lexemeId, ReferenceType.ANY, ekilexSource.id, null, ekilexSource.name);
		}
	}

	private void connectSourceToUsage(Integer sourceId, Long usageId, Map<Integer, SourceData> sourceMapping) throws Exception {

		if (sourceMapping.containsKey(sourceId)) {
			SourceData ekilexSource = sourceMapping.get(sourceId);
			//TODO define proper ref type
			createFreeformSourceLink(usageId, ReferenceType.ANY, ekilexSource.id, null, ekilexSource.name);
		}
	}

	private void savePosCode(Long lexemeId, String posCode) throws Exception {

		if (posCodes.containsKey(posCode)) {
			Map<String, Object> params = new HashMap<>();
			params.put("lexeme_id", lexemeId);
			params.put("pos_code", posCodes.get(posCode));
			basicDbService.create(LEXEME_POS, params);
		}
	}

	private void updateDomainDatsetsIfNeeded(Map<String, Object> domain, String dataset) throws Exception {

		PgArray datasetArrObj = (PgArray) domain.get("datasets");
		String[] datasetArr = (String[]) datasetArrObj.getArray();
		List<String> datasets = Arrays.asList(datasetArr);
		if (!datasets.contains(dataset)) {
			List<String> updatedDatasets = new ArrayList<>(datasets);
			updatedDatasets.add(dataset);
			Map<String, Object> tableRowParamMap = new HashMap<>();
			tableRowParamMap.put("code", domain.get("code"));
			tableRowParamMap.put("origin", domain.get("origin"));
			tableRowParamMap.put("datasets", new PgVarcharArray(updatedDatasets));
			basicDbService.executeScript(SQL_UPDATE_DOMAIN_DATSETS, tableRowParamMap);
		}
	}

	private boolean hasTermDatabaseAndIsKnownDataset(Integer baseId, String dataset) throws Exception {
		return termekiService.hasTermDatabase(baseId) && isKnownDataset(dataset);
	}

	private Map<String, Object> getDomain(String code, String origin) throws Exception {

		Map<String, Object> tableRowParamMap = new HashMap<>();
		tableRowParamMap.put("code", code);
		tableRowParamMap.put("origin", origin);
		return basicDbService.select(DOMAIN, tableRowParamMap);
	}

	private List<String> getGenders() throws Exception {
		return basicDbService.selectAll(GENDER, emptyMap())
				.stream().map(rec -> (String) rec.get("code")).collect(toList());
	}

	private boolean isKnownDataset(String dataset) throws Exception {

		Map<String, Object> params = new HashMap<>();
		params.put("code", dataset);
		Map<String, Object> selectedDataset = basicDbService.select(DATASET, params);
		if (selectedDataset == null) {
			logger.info("No dataset with id {} defined in EKILEX", dataset);
		} else {
			logger.info("Dataset {} : {}", dataset, selectedDataset.get("name"));
		}
		return selectedDataset != null;
	}

	private class SourceData {
		Integer origId;
		Long id;
		String name;

		SourceData(Integer origId, Long id, String name) {
			this.origId = origId;
			this.id = id;
			this.name = name;
		}
	}

	private class Context {
		List<Map<String, Object>> terms;
		List<Map<String, Object>> definitions;
		Map<Integer, SourceData> sourceMapping;
		List<Map<String, Object>> comments;
		List<Map<String, Object>> abbreviations;
		List<Map<String, Object>> genuses;
		List<Map<String, Object>> families;
		List<Map<String, Object>> describers;
		List<Map<String, Object>> describingYears;
		List<Map<String, Object>> geolDomains;
		List<Map<String, Object>> examples;
		List<Map<String, Object>> images;
		List<Map<String, Object>> models;
	}
}
