/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwMeaningRelationRecord;
import eki.ekilex.data.db.udt.records.TypeMeaningRelationRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewWwMeaningRelation extends TableImpl<ViewWwMeaningRelationRecord> {

    private static final long serialVersionUID = -666104404;

    /**
     * The reference instance of <code>public.view_ww_meaning_relation</code>
     */
    public static final ViewWwMeaningRelation VIEW_WW_MEANING_RELATION = new ViewWwMeaningRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwMeaningRelationRecord> getRecordType() {
        return ViewWwMeaningRelationRecord.class;
    }

    /**
     * The column <code>public.view_ww_meaning_relation.meaning_id</code>.
     */
    public final TableField<ViewWwMeaningRelationRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_meaning_relation.related_meanings</code>.
     */
    public final TableField<ViewWwMeaningRelationRecord, TypeMeaningRelationRecord[]> RELATED_MEANINGS = createField("related_meanings", eki.ekilex.data.db.udt.TypeMeaningRelation.TYPE_MEANING_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation() {
        this(DSL.name("view_ww_meaning_relation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation(String alias) {
        this(DSL.name(alias), VIEW_WW_MEANING_RELATION);
    }

    /**
     * Create an aliased <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation(Name alias) {
        this(alias, VIEW_WW_MEANING_RELATION);
    }

    private ViewWwMeaningRelation(Name alias, Table<ViewWwMeaningRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwMeaningRelation(Name alias, Table<ViewWwMeaningRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwMeaningRelation(Table<O> child, ForeignKey<O, ViewWwMeaningRelationRecord> key) {
        super(child, key, VIEW_WW_MEANING_RELATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRelation as(String alias) {
        return new ViewWwMeaningRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRelation as(Name alias) {
        return new ViewWwMeaningRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwMeaningRelation rename(String name) {
        return new ViewWwMeaningRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwMeaningRelation rename(Name name) {
        return new ViewWwMeaningRelation(name, null);
    }
}
