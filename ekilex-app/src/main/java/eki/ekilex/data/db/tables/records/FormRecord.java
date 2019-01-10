/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Form;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormRecord extends UpdatableRecordImpl<FormRecord> implements Record16<Long, Long, String, String, String, String, Integer, String, Boolean, String, String, String[], String, String, String, Integer> {

    private static final long serialVersionUID = -1656430054;

    /**
     * Setter for <code>public.form.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.form.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.form.mode</code>.
     */
    public void setMode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.form.mode</code>.
     */
    public String getMode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.form.morph_group1</code>.
     */
    public void setMorphGroup1(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.form.morph_group1</code>.
     */
    public String getMorphGroup1() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.form.morph_group2</code>.
     */
    public void setMorphGroup2(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.form.morph_group2</code>.
     */
    public String getMorphGroup2() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.form.morph_group3</code>.
     */
    public void setMorphGroup3(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.form.morph_group3</code>.
     */
    public String getMorphGroup3() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.form.display_level</code>.
     */
    public void setDisplayLevel(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.form.display_level</code>.
     */
    public Integer getDisplayLevel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.form.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.form.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.form.morph_exists</code>.
     */
    public void setMorphExists(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.form.morph_exists</code>.
     */
    public Boolean getMorphExists() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.form.value</code>.
     */
    public void setValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.form.value</code>.
     */
    public String getValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.form.value_prese</code>.
     */
    public void setValuePrese(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.form.value_prese</code>.
     */
    public String getValuePrese() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.form.components</code>.
     */
    public void setComponents(String... value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.form.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>public.form.display_form</code>.
     */
    public void setDisplayForm(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.form.display_form</code>.
     */
    public String getDisplayForm() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.form.vocal_form</code>.
     */
    public void setVocalForm(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.form.vocal_form</code>.
     */
    public String getVocalForm() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.form.sound_file</code>.
     */
    public void setSoundFile(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.form.sound_file</code>.
     */
    public String getSoundFile() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.form.order_by</code>.
     */
    public void setOrderBy(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.form.order_by</code>.
     */
    public Integer getOrderBy() {
        return (Integer) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, String, String, String, String, Integer, String, Boolean, String, String, String[], String, String, String, Integer> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, String, String, String, String, Integer, String, Boolean, String, String, String[], String, String, String, Integer> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Form.FORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Form.FORM.PARADIGM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Form.FORM.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Form.FORM.MORPH_GROUP1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Form.FORM.MORPH_GROUP2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Form.FORM.MORPH_GROUP3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Form.FORM.DISPLAY_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Form.FORM.MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Form.FORM.MORPH_EXISTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Form.FORM.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Form.FORM.VALUE_PRESE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return Form.FORM.COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Form.FORM.DISPLAY_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Form.FORM.VOCAL_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Form.FORM.SOUND_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Form.FORM.ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMorphGroup1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMorphGroup2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMorphGroup3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDisplayLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getMorphExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getValuePrese();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component12() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMorphGroup1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMorphGroup2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMorphGroup3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDisplayLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getMorphExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getValuePrese();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value2(Long value) {
        setParadigmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value3(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value4(String value) {
        setMorphGroup1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value5(String value) {
        setMorphGroup2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value6(String value) {
        setMorphGroup3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value7(Integer value) {
        setDisplayLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value8(String value) {
        setMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value9(Boolean value) {
        setMorphExists(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value10(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value11(String value) {
        setValuePrese(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value12(String... value) {
        setComponents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value13(String value) {
        setDisplayForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value14(String value) {
        setVocalForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value15(String value) {
        setSoundFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord value16(Integer value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, Integer value7, String value8, Boolean value9, String value10, String value11, String[] value12, String value13, String value14, String value15, Integer value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FormRecord
     */
    public FormRecord() {
        super(Form.FORM);
    }

    /**
     * Create a detached, initialised FormRecord
     */
    public FormRecord(Long id, Long paradigmId, String mode, String morphGroup1, String morphGroup2, String morphGroup3, Integer displayLevel, String morphCode, Boolean morphExists, String value, String valuePrese, String[] components, String displayForm, String vocalForm, String soundFile, Integer orderBy) {
        super(Form.FORM);

        set(0, id);
        set(1, paradigmId);
        set(2, mode);
        set(3, morphGroup1);
        set(4, morphGroup2);
        set(5, morphGroup3);
        set(6, displayLevel);
        set(7, morphCode);
        set(8, morphExists);
        set(9, value);
        set(10, valuePrese);
        set(11, components);
        set(12, displayForm);
        set(13, vocalForm);
        set(14, soundFile);
        set(15, orderBy);
    }
}
