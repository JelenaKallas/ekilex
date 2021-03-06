package eki.ekilex.data;

import java.util.function.Consumer;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import eki.common.constant.FormMode;
import eki.common.data.AbstractDataObject;

@JsonIgnoreProperties({"displayMorphCode"})
public class Form extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	@Column(name = "form_id")
	private Long id;

	@Column(name = "word")
	private String value;

	@Column(name = "mode")
	private FormMode mode;

	@Column(name = "components")
	private String[] components;

	@Column(name = "display_form")
	private String displayForm;

	@Column(name = "vocal_form")
	private String vocalForm;

	@Column(name = "morph_code")
	private String morphCode;

	@Column(name = "morph_value")
	private String morphValue;

	private boolean isDisplayMorphCode;

	public Form() {
	}

	public Form(Consumer<Form> builder) {
		builder.accept(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public FormMode getMode() {
		return mode;
	}

	public void setMode(FormMode mode) {
		this.mode = mode;
	}

	public String[] getComponents() {
		return components;
	}

	public void setComponents(String[] components) {
		this.components = components;
	}

	public String getDisplayForm() {
		return displayForm;
	}

	public void setDisplayForm(String displayForm) {
		this.displayForm = displayForm;
	}

	public String getVocalForm() {
		return vocalForm;
	}

	public void setVocalForm(String vocalForm) {
		this.vocalForm = vocalForm;
	}

	public String getMorphCode() {
		return morphCode;
	}

	public void setMorphCode(String morphCode) {
		this.morphCode = morphCode;
	}

	public String getMorphValue() {
		return morphValue;
	}

	public void setMorphValue(String morphValue) {
		this.morphValue = morphValue;
	}

	public boolean isDisplayMorphCode() {
		return isDisplayMorphCode;
	}

	public void setDisplayMorphCode(boolean isDisplayMorphCode) {
		this.isDisplayMorphCode = isDisplayMorphCode;
	}

}
