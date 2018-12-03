/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Paradigm;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ParadigmRecord extends UpdatableRecordImpl<ParadigmRecord> implements Record5<Long, Long, String, String, Boolean> {

    private static final long serialVersionUID = -1738105533;

    /**
     * Setter for <code>public.paradigm.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.paradigm.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.paradigm.word_id</code>.
     */
    public void setWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.paradigm.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.paradigm.example</code>.
     */
    public void setExample(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.paradigm.example</code>.
     */
    public String getExample() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.paradigm.inflection_type_nr</code>.
     */
    public void setInflectionTypeNr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.paradigm.inflection_type_nr</code>.
     */
    public String getInflectionTypeNr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.paradigm.is_secondary</code>.
     */
    public void setIsSecondary(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.paradigm.is_secondary</code>.
     */
    public Boolean getIsSecondary() {
        return (Boolean) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Paradigm.PARADIGM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Paradigm.PARADIGM.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Paradigm.PARADIGM.EXAMPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Paradigm.PARADIGM.INFLECTION_TYPE_NR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Paradigm.PARADIGM.IS_SECONDARY;
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
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExample();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInflectionTypeNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsSecondary();
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
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExample();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInflectionTypeNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsSecondary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord value2(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord value3(String value) {
        setExample(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord value4(String value) {
        setInflectionTypeNr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord value5(Boolean value) {
        setIsSecondary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParadigmRecord values(Long value1, Long value2, String value3, String value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParadigmRecord
     */
    public ParadigmRecord() {
        super(Paradigm.PARADIGM);
    }

    /**
     * Create a detached, initialised ParadigmRecord
     */
    public ParadigmRecord(Long id, Long wordId, String example, String inflectionTypeNr, Boolean isSecondary) {
        super(Paradigm.PARADIGM);

        set(0, id);
        set(1, wordId);
        set(2, example);
        set(3, inflectionTypeNr);
        set(4, isSecondary);
    }
}
