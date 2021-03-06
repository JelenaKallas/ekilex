package eki.ekilex.data.transform;

import java.util.List;

import eki.common.data.AbstractDataObject;

public class Usage extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private String value;

	private String author;

	private String authorType;

	private String extSourceId;

	private List<UsageTranslation> usageTranslations;

	private List<String> definitions;

	private String usageType;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorType() {
		return authorType;
	}

	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}

	public String getExtSourceId() {
		return extSourceId;
	}

	public void setExtSourceId(String extSourceId) {
		this.extSourceId = extSourceId;
	}

	public List<UsageTranslation> getUsageTranslations() {
		return usageTranslations;
	}

	public void setUsageTranslations(List<UsageTranslation> usageTranslations) {
		this.usageTranslations = usageTranslations;
	}

	public List<String> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<String> definitions) {
		this.definitions = definitions;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
