package eki.wordweb.service;

import static java.lang.Math.max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eki.common.constant.FormMode;
import eki.wordweb.constant.SystemConstant;
import eki.wordweb.data.CollocationTuple;
import eki.wordweb.data.Form;
import eki.wordweb.data.Lexeme;
import eki.wordweb.data.LexemeDetailsTuple;
import eki.wordweb.data.LexemeMeaningTuple;
import eki.wordweb.data.Paradigm;
import eki.wordweb.data.ParadigmGroup;
import eki.wordweb.data.Word;
import eki.wordweb.data.WordData;
import eki.wordweb.data.WordEtymology;
import eki.wordweb.data.WordOrForm;
import eki.wordweb.data.WordRelationTuple;
import eki.wordweb.data.WordsData;
import eki.wordweb.service.db.LexSearchDbService;
import eki.wordweb.service.util.ClassifierUtil;
import eki.wordweb.service.util.ConversionUtil;

@Component
public class LexSearchService implements InitializingBean, SystemConstant {

	@Autowired
	private LexSearchDbService lexSearchDbService;

	@Autowired
	private ClassifierUtil classifierUtil;

	@Autowired
	private ConversionUtil conversionUtil;

	private Map<String, String[]> languagesDatasetMap;

	@Override
	public void afterPropertiesSet() throws Exception {

		languagesDatasetMap = new HashMap<>();
		languagesDatasetMap.put("est-est-detail", new String[] {"ss1", "kol"});
		languagesDatasetMap.put("est-est-simple", new String[] {"psv"});
		languagesDatasetMap.put("est-rus-detail", new String[] {"ev2"});
		languagesDatasetMap.put("est-rus-simple", new String[] {"qq2"});
		languagesDatasetMap.put("rus-est-detail", new String[] {"ev2"});
		languagesDatasetMap.put("rus-est-simple", new String[] {"qq2"});
	}

	@Transactional
	public WordsData findWords(String searchWord, String sourceLang, String destinLang, Integer homonymNr, String searchMode) {

		String[] datasets = getDatasets(sourceLang, destinLang, searchMode);
		List<Word> allWords = lexSearchDbService.findWords(searchWord, sourceLang, datasets);
		if (CollectionUtils.isEmpty(allWords) && StringUtils.equals(searchMode, SEARCH_MODE_SIMPLE)) {
			datasets = getDatasets(sourceLang, destinLang, SEARCH_MODE_DETAIL);
			allWords = lexSearchDbService.findWords(searchWord, sourceLang, datasets);
			if (CollectionUtils.isNotEmpty(allWords)) {
				searchMode = SEARCH_MODE_DETAIL;
			}
		}
		conversionUtil.setAffixoidFlags(allWords);
		conversionUtil.filterIrrelevantValues(allWords, destinLang, datasets);
		conversionUtil.selectHomonym(allWords, homonymNr);
		List<Word> fullMatchWords = allWords.stream().filter(word -> StringUtils.equalsIgnoreCase(word.getWord(), searchWord)).collect(Collectors.toList());
		if (CollectionUtils.isNotEmpty(fullMatchWords)) {
			List<String> formMatchWords = CollectionUtils.subtract(allWords, fullMatchWords).stream().map(word -> word.getWord()).distinct().collect(Collectors.toList());
			return new WordsData(fullMatchWords, formMatchWords, searchMode);
		}
		return new WordsData(allWords, Collections.emptyList(), searchMode);
	}

	@Transactional
	public Map<String, List<String>> findWordsByPrefix(String wordPrefix, String sourceLang, String destinLang, int limit) {

		String[] datasets = getDatasets(sourceLang, destinLang, SEARCH_MODE_DETAIL);
		Map<String, List<WordOrForm>> results = lexSearchDbService.findWordsByPrefix(wordPrefix, sourceLang, datasets, limit);
		List<WordOrForm> prefWordsResult = results.get("prefWords");
		List<WordOrForm> formWordsResult = results.get("formWords");
		List<String> prefWords, formWords;
		if (CollectionUtils.isEmpty(prefWordsResult)) {
			prefWords = Collections.emptyList();
		} else {
			prefWords = prefWordsResult.stream().map(WordOrForm::getValue).collect(Collectors.toList());
		}
		if (CollectionUtils.isEmpty(formWordsResult)) {
			formWords = Collections.emptyList();
		} else {
			formWords = formWordsResult.stream().map(WordOrForm::getValue).collect(Collectors.toList());
		}
		if (CollectionUtils.isNotEmpty(prefWords)) {
			prefWords.forEach(prefWord -> formWords.remove(prefWord));
			int prefWordsCount = prefWords.size();
			int formWordsCount = formWords.size();
			int requiredPrefWordsCount = Math.min(prefWordsCount, limit - formWordsCount);
			prefWords = prefWords.subList(0, requiredPrefWordsCount);
		}
		Map<String, List<String>> searchResultCandidates = new HashMap<>();
		searchResultCandidates.put("prefWords", prefWords);
		searchResultCandidates.put("formWords", formWords);
		return searchResultCandidates;
	}

	@Transactional
	public WordData getWordData(Long wordId, String sourceLang, String destinLang, String displayLang, String searchMode) {

		String[] datasets = getDatasets(sourceLang, destinLang, searchMode);
		Word word = lexSearchDbService.getWord(wordId);
		classifierUtil.applyClassifiers(word, displayLang);
		conversionUtil.setWordTypeFlags(word);
		WordEtymology wordEtymology = lexSearchDbService.findWordEtymology(wordId);
		conversionUtil.composeWordEtymology(word, wordEtymology, displayLang);
		List<WordRelationTuple> wordRelationTuples = lexSearchDbService.findWordRelationTuples(wordId);
		conversionUtil.composeWordRelations(word, wordRelationTuples, datasets, displayLang);
		List<LexemeDetailsTuple> lexemeDetailsTuples = lexSearchDbService.findLexemeDetailsTuples(wordId, datasets);
		List<LexemeMeaningTuple> lexemeMeaningTuples = lexSearchDbService.findLexemeMeaningTuples(wordId, datasets);
		List<CollocationTuple> collocTuples = lexSearchDbService.findCollocations(wordId, datasets);
		List<Lexeme> lexemes = conversionUtil.composeLexemes(word, lexemeDetailsTuples, lexemeMeaningTuples, collocTuples, sourceLang, destinLang, displayLang);
		Map<Long, List<Form>> paradigmFormsMap = lexSearchDbService.findWordForms(wordId);
		List<Paradigm> paradigms = conversionUtil.composeParadigms(word, paradigmFormsMap, displayLang);
		List<String> allImageFiles = new ArrayList<>();
		lexemes.forEach(lexeme -> {
			if (CollectionUtils.isNotEmpty(lexeme.getImageFiles())) {
				allImageFiles.addAll(lexeme.getImageFiles());
			}
		});

		String firstAvailableVocalForm = null;
		String firstAvailableSoundFile = null;
		boolean isUnknownForm = false;
		if (CollectionUtils.isNotEmpty(paradigms)) {
			List<ParadigmGroup> paradigmFirstGroup = paradigms.get(0).getGroups();
			if (CollectionUtils.isNotEmpty(paradigmFirstGroup)) {
				List<Form> firstForms = paradigmFirstGroup.get(0).getForms1();
				if (CollectionUtils.isNotEmpty(firstForms)) {
					Optional<Form> firstFormOption = firstForms.stream().filter(form -> form.getMode().equals(FormMode.WORD)).findFirst();
					if (firstFormOption.isPresent()) {
						Form firstForm = firstFormOption.get();
						firstAvailableVocalForm = firstForm.getVocalForm();
						firstAvailableSoundFile = firstForm.getSoundFile();
						isUnknownForm = StringUtils.equals(UNKNOWN_FORM_CODE, firstForm.getMorphCode());
					}
				}
			}
		}
		WordData wordData = new WordData();
		wordData.setWord(word);
		wordData.setLexemes(lexemes);
		wordData.setParadigms(paradigms);
		wordData.setImageFiles(allImageFiles);
		wordData.setFirstAvailableVocalForm(firstAvailableVocalForm);
		wordData.setFirstAvailableSoundFile(firstAvailableSoundFile);
		wordData.setUnknownForm(isUnknownForm);
		combineLevels(wordData.getLexemes());
		return wordData;
	}

	private void combineLevels(List<Lexeme> lexemes) {

		if (CollectionUtils.isEmpty(lexemes)) {
			return;
		}

		lexemes.forEach(lexeme -> {
			if (lexeme.getLevel1() == 0) {
				lexeme.setLevels(null);
				return;
			}
			String levels;
			long nrOfLexemesWithSameLevel1 = lexemes.stream()
					.filter(otherLexeme ->
							otherLexeme.getLevel1().equals(lexeme.getLevel1())
									&& StringUtils.equals(otherLexeme.getDatasetCode(), lexeme.getDatasetCode()))
					.count();
			if (nrOfLexemesWithSameLevel1 == 1) {
				levels = String.valueOf(lexeme.getLevel1());
			} else {
				long nrOfLexemesWithSameLevel2 = lexemes.stream()
						.filter(otherLexeme ->
								otherLexeme.getLevel1().equals(lexeme.getLevel1())
										&& otherLexeme.getLevel2().equals(lexeme.getLevel2())
										&& StringUtils.equals(otherLexeme.getDatasetCode(), lexeme.getDatasetCode()))
						.count();
				if (nrOfLexemesWithSameLevel2 == 1) {
					int level2 = max(lexeme.getLevel2() - 1, 0);
					levels = lexeme.getLevel1() + (level2 == 0 ? "" : "." + level2);
				} else {
					int level3 = max(lexeme.getLevel3() - 1, 0);
					levels = lexeme.getLevel1() + "." + lexeme.getLevel2() + (level3 == 0 ? "" : "." + level3);
				}
			}
			lexeme.setLevels(levels);
		});
	}

	private String[] getDatasets(String sourceLang, String destinLang, String searchMode) {
		String datasetKey = sourceLang + "-" + destinLang + "-" + searchMode;
		String[] datasets = languagesDatasetMap.get(datasetKey);
		return datasets;
	}
}
