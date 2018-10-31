/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.LexicalDecisionResult;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexicalDecisionResultRecord extends UpdatableRecordImpl<LexicalDecisionResultRecord> implements Record7<Long, Long, String, String, Boolean, Long, Timestamp> {

    private static final long serialVersionUID = -1226503788;

    /**
     * Setter for <code>public.lexical_decision_result.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.lexical_decision_result.data_id</code>.
     */
    public void setDataId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.data_id</code>.
     */
    public Long getDataId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.lexical_decision_result.remote_addr</code>.
     */
    public void setRemoteAddr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.remote_addr</code>.
     */
    public String getRemoteAddr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.lexical_decision_result.session_id</code>.
     */
    public void setSessionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.session_id</code>.
     */
    public String getSessionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.lexical_decision_result.answer</code>.
     */
    public void setAnswer(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.answer</code>.
     */
    public Boolean getAnswer() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.lexical_decision_result.delay</code>.
     */
    public void setDelay(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.delay</code>.
     */
    public Long getDelay() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.lexical_decision_result.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.lexical_decision_result.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, Boolean, Long, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, Boolean, Long, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.REMOTE_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.DELAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return LexicalDecisionResult.LEXICAL_DECISION_RESULT.CREATED;
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
        return getDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRemoteAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreated();
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
        return getDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRemoteAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value2(Long value) {
        setDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value3(String value) {
        setRemoteAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value4(String value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value5(Boolean value) {
        setAnswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value6(Long value) {
        setDelay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord value7(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionResultRecord values(Long value1, Long value2, String value3, String value4, Boolean value5, Long value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LexicalDecisionResultRecord
     */
    public LexicalDecisionResultRecord() {
        super(LexicalDecisionResult.LEXICAL_DECISION_RESULT);
    }

    /**
     * Create a detached, initialised LexicalDecisionResultRecord
     */
    public LexicalDecisionResultRecord(Long id, Long dataId, String remoteAddr, String sessionId, Boolean answer, Long delay, Timestamp created) {
        super(LexicalDecisionResult.LEXICAL_DECISION_RESULT);

        set(0, id);
        set(1, dataId);
        set(2, remoteAddr);
        set(3, sessionId);
        set(4, answer);
        set(5, delay);
        set(6, created);
    }
}
