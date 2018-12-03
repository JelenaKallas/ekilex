/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.MeaningRelation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class MeaningRelationRecord extends UpdatableRecordImpl<MeaningRelationRecord> implements Record6<Long, Long, Long, String, String, Long> {

    private static final long serialVersionUID = 170438893;

    /**
     * Setter for <code>public.meaning_relation.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.meaning_relation.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.meaning_relation.meaning1_id</code>.
     */
    public void setMeaning1Id(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.meaning_relation.meaning1_id</code>.
     */
    public Long getMeaning1Id() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.meaning_relation.meaning2_id</code>.
     */
    public void setMeaning2Id(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.meaning_relation.meaning2_id</code>.
     */
    public Long getMeaning2Id() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.meaning_relation.meaning_rel_type_code</code>.
     */
    public void setMeaningRelTypeCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.meaning_relation.meaning_rel_type_code</code>.
     */
    public String getMeaningRelTypeCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.meaning_relation.process_state_code</code>.
     */
    public void setProcessStateCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.meaning_relation.process_state_code</code>.
     */
    public String getProcessStateCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.meaning_relation.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.meaning_relation.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MeaningRelation.MEANING_RELATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MeaningRelation.MEANING_RELATION.MEANING1_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MeaningRelation.MEANING_RELATION.MEANING2_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MeaningRelation.MEANING_RELATION.MEANING_REL_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MeaningRelation.MEANING_RELATION.PROCESS_STATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return MeaningRelation.MEANING_RELATION.ORDER_BY;
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
        return getMeaning1Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMeaning2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMeaningRelTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProcessStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
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
        return getMeaning1Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMeaning2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMeaningRelTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProcessStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value2(Long value) {
        setMeaning1Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value3(Long value) {
        setMeaning2Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value4(String value) {
        setMeaningRelTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value5(String value) {
        setProcessStateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord value6(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelationRecord values(Long value1, Long value2, Long value3, String value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeaningRelationRecord
     */
    public MeaningRelationRecord() {
        super(MeaningRelation.MEANING_RELATION);
    }

    /**
     * Create a detached, initialised MeaningRelationRecord
     */
    public MeaningRelationRecord(Long id, Long meaning1Id, Long meaning2Id, String meaningRelTypeCode, String processStateCode, Long orderBy) {
        super(MeaningRelation.MEANING_RELATION);

        set(0, id);
        set(1, meaning1Id);
        set(2, meaning2Id);
        set(3, meaningRelTypeCode);
        set(4, processStateCode);
        set(5, orderBy);
    }
}
