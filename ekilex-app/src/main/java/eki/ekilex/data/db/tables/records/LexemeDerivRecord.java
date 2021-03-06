/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.LexemeDeriv;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeDerivRecord extends UpdatableRecordImpl<LexemeDerivRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = 914717031;

    /**
     * Setter for <code>public.lexeme_deriv.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lexeme_deriv.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.lexeme_deriv.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lexeme_deriv.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.lexeme_deriv.deriv_code</code>.
     */
    public void setDerivCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lexeme_deriv.deriv_code</code>.
     */
    public String getDerivCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.lexeme_deriv.process_state_code</code>.
     */
    public void setProcessStateCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lexeme_deriv.process_state_code</code>.
     */
    public String getProcessStateCode() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LexemeDeriv.LEXEME_DERIV.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LexemeDeriv.LEXEME_DERIV.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LexemeDeriv.LEXEME_DERIV.DERIV_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LexemeDeriv.LEXEME_DERIV.PROCESS_STATE_CODE;
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
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDerivCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProcessStateCode();
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
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDerivCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProcessStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDerivRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDerivRecord value2(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDerivRecord value3(String value) {
        setDerivCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDerivRecord value4(String value) {
        setProcessStateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDerivRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LexemeDerivRecord
     */
    public LexemeDerivRecord() {
        super(LexemeDeriv.LEXEME_DERIV);
    }

    /**
     * Create a detached, initialised LexemeDerivRecord
     */
    public LexemeDerivRecord(Long id, Long lexemeId, String derivCode, String processStateCode) {
        super(LexemeDeriv.LEXEME_DERIV);

        set(0, id);
        set(1, lexemeId);
        set(2, derivCode);
        set(3, processStateCode);
    }
}
