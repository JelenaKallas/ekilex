/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.FeedbackLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class FeedbackLogRecord extends UpdatableRecordImpl<FeedbackLogRecord> implements Record11<Long, String, String, String, Timestamp, String, String, String, String, String, String> {

    private static final long serialVersionUID = 2015311451;

    /**
     * Setter for <code>public.feedback_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.feedback_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.feedback_log.feedback_type</code>.
     */
    public void setFeedbackType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.feedback_log.feedback_type</code>.
     */
    public String getFeedbackType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.feedback_log.sender_name</code>.
     */
    public void setSenderName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.feedback_log.sender_name</code>.
     */
    public String getSenderName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.feedback_log.sender_email</code>.
     */
    public void setSenderEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.feedback_log.sender_email</code>.
     */
    public String getSenderEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.feedback_log.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.feedback_log.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.feedback_log.word</code>.
     */
    public void setWord(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.feedback_log.word</code>.
     */
    public String getWord() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.feedback_log.definition</code>.
     */
    public void setDefinition(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.feedback_log.definition</code>.
     */
    public String getDefinition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.feedback_log.comments</code>.
     */
    public void setComments(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.feedback_log.comments</code>.
     */
    public String getComments() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.feedback_log.usages</code>.
     */
    public void setUsages(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.feedback_log.usages</code>.
     */
    public String getUsages() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.feedback_log.other_info</code>.
     */
    public void setOtherInfo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.feedback_log.other_info</code>.
     */
    public String getOtherInfo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.feedback_log.last_search</code>.
     */
    public void setLastSearch(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.feedback_log.last_search</code>.
     */
    public String getLastSearch() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, Timestamp, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, Timestamp, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FeedbackLog.FEEDBACK_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FeedbackLog.FEEDBACK_LOG.FEEDBACK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FeedbackLog.FEEDBACK_LOG.SENDER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FeedbackLog.FEEDBACK_LOG.SENDER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return FeedbackLog.FEEDBACK_LOG.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FeedbackLog.FEEDBACK_LOG.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FeedbackLog.FEEDBACK_LOG.DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FeedbackLog.FEEDBACK_LOG.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FeedbackLog.FEEDBACK_LOG.USAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FeedbackLog.FEEDBACK_LOG.OTHER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FeedbackLog.FEEDBACK_LOG.LAST_SEARCH;
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
    public String component2() {
        return getFeedbackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSenderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSenderEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOtherInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getLastSearch();
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
    public String value2() {
        return getFeedbackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSenderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSenderEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOtherInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLastSearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value2(String value) {
        setFeedbackType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value3(String value) {
        setSenderName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value4(String value) {
        setSenderEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value6(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value7(String value) {
        setDefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value8(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value9(String value) {
        setUsages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value10(String value) {
        setOtherInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord value11(String value) {
        setLastSearch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedbackLogRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, String value6, String value7, String value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FeedbackLogRecord
     */
    public FeedbackLogRecord() {
        super(FeedbackLog.FEEDBACK_LOG);
    }

    /**
     * Create a detached, initialised FeedbackLogRecord
     */
    public FeedbackLogRecord(Long id, String feedbackType, String senderName, String senderEmail, Timestamp createdOn, String word, String definition, String comments, String usages, String otherInfo, String lastSearch) {
        super(FeedbackLog.FEEDBACK_LOG);

        set(0, id);
        set(1, feedbackType);
        set(2, senderName);
        set(3, senderEmail);
        set(4, createdOn);
        set(5, word);
        set(6, definition);
        set(7, comments);
        set(8, usages);
        set(9, otherInfo);
        set(10, lastSearch);
    }
}
