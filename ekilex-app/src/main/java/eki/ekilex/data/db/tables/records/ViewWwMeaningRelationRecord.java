/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwMeaningRelation;
import eki.ekilex.data.db.udt.records.TypeMeaningRelationRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class ViewWwMeaningRelationRecord extends TableRecordImpl<ViewWwMeaningRelationRecord> implements Record2<Long, TypeMeaningRelationRecord[]> {

    private static final long serialVersionUID = -1154575108;

    /**
     * Setter for <code>public.view_ww_meaning_relation.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning_relation.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_meaning_relation.related_meanings</code>.
     */
    public void setRelatedMeanings(TypeMeaningRelationRecord... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning_relation.related_meanings</code>.
     */
    public TypeMeaningRelationRecord[] getRelatedMeanings() {
        return (TypeMeaningRelationRecord[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, TypeMeaningRelationRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, TypeMeaningRelationRecord[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeMeaningRelationRecord[]> field2() {
        return ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION.RELATED_MEANINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningRelationRecord[] component2() {
        return getRelatedMeanings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningRelationRecord[] value2() {
        return getRelatedMeanings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRelationRecord value1(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRelationRecord value2(TypeMeaningRelationRecord... value) {
        setRelatedMeanings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRelationRecord values(Long value1, TypeMeaningRelationRecord[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwMeaningRelationRecord
     */
    public ViewWwMeaningRelationRecord() {
        super(ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION);
    }

    /**
     * Create a detached, initialised ViewWwMeaningRelationRecord
     */
    public ViewWwMeaningRelationRecord(Long meaningId, TypeMeaningRelationRecord[] relatedMeanings) {
        super(ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION);

        set(0, meaningId);
        set(1, relatedMeanings);
    }
}
