/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwWordRelationRecord;
import eki.ekilex.data.db.udt.records.TypeWordRelationRecord;

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
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordRelation extends TableImpl<ViewWwWordRelationRecord> {

    private static final long serialVersionUID = -1898091318;

    /**
     * The reference instance of <code>public.view_ww_word_relation</code>
     */
    public static final ViewWwWordRelation VIEW_WW_WORD_RELATION = new ViewWwWordRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwWordRelationRecord> getRecordType() {
        return ViewWwWordRelationRecord.class;
    }

    /**
     * The column <code>public.view_ww_word_relation.word_id</code>.
     */
    public final TableField<ViewWwWordRelationRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_word_relation.related_words</code>.
     */
    public final TableField<ViewWwWordRelationRecord, TypeWordRelationRecord[]> RELATED_WORDS = createField("related_words", eki.ekilex.data.db.udt.TypeWordRelation.TYPE_WORD_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_word_relation.word_group_id</code>.
     */
    public final TableField<ViewWwWordRelationRecord, Long> WORD_GROUP_ID = createField("word_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_word_relation.word_rel_type_code</code>.
     */
    public final TableField<ViewWwWordRelationRecord, String> WORD_REL_TYPE_CODE = createField("word_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.view_ww_word_relation.word_group_members</code>.
     */
    public final TableField<ViewWwWordRelationRecord, TypeWordRelationRecord[]> WORD_GROUP_MEMBERS = createField("word_group_members", eki.ekilex.data.db.udt.TypeWordRelation.TYPE_WORD_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation() {
        this(DSL.name("view_ww_word_relation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation(String alias) {
        this(DSL.name(alias), VIEW_WW_WORD_RELATION);
    }

    /**
     * Create an aliased <code>public.view_ww_word_relation</code> table reference
     */
    public ViewWwWordRelation(Name alias) {
        this(alias, VIEW_WW_WORD_RELATION);
    }

    private ViewWwWordRelation(Name alias, Table<ViewWwWordRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwWordRelation(Name alias, Table<ViewWwWordRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwWordRelation(Table<O> child, ForeignKey<O, ViewWwWordRelationRecord> key) {
        super(child, key, VIEW_WW_WORD_RELATION);
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
    public ViewWwWordRelation as(String alias) {
        return new ViewWwWordRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRelation as(Name alias) {
        return new ViewWwWordRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordRelation rename(String name) {
        return new ViewWwWordRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordRelation rename(Name name) {
        return new ViewWwWordRelation(name, null);
    }
}
