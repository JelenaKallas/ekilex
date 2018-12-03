/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwLexemeRelationRecord;
import eki.ekilex.data.db.udt.records.TypeLexemeRelationRecord;

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
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexemeRelation extends TableImpl<ViewWwLexemeRelationRecord> {

    private static final long serialVersionUID = -539314913;

    /**
     * The reference instance of <code>public.view_ww_lexeme_relation</code>
     */
    public static final ViewWwLexemeRelation VIEW_WW_LEXEME_RELATION = new ViewWwLexemeRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwLexemeRelationRecord> getRecordType() {
        return ViewWwLexemeRelationRecord.class;
    }

    /**
     * The column <code>public.view_ww_lexeme_relation.lexeme_id</code>.
     */
    public final TableField<ViewWwLexemeRelationRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme_relation.related_lexemes</code>.
     */
    public final TableField<ViewWwLexemeRelationRecord, TypeLexemeRelationRecord[]> RELATED_LEXEMES = createField("related_lexemes", eki.ekilex.data.db.udt.TypeLexemeRelation.TYPE_LEXEME_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_lexeme_relation</code> table reference
     */
    public ViewWwLexemeRelation() {
        this(DSL.name("view_ww_lexeme_relation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme_relation</code> table reference
     */
    public ViewWwLexemeRelation(String alias) {
        this(DSL.name(alias), VIEW_WW_LEXEME_RELATION);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme_relation</code> table reference
     */
    public ViewWwLexemeRelation(Name alias) {
        this(alias, VIEW_WW_LEXEME_RELATION);
    }

    private ViewWwLexemeRelation(Name alias, Table<ViewWwLexemeRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwLexemeRelation(Name alias, Table<ViewWwLexemeRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwLexemeRelation(Table<O> child, ForeignKey<O, ViewWwLexemeRelationRecord> key) {
        super(child, key, VIEW_WW_LEXEME_RELATION);
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
    public ViewWwLexemeRelation as(String alias) {
        return new ViewWwLexemeRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRelation as(Name alias) {
        return new ViewWwLexemeRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexemeRelation rename(String name) {
        return new ViewWwLexemeRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexemeRelation rename(Name name) {
        return new ViewWwLexemeRelation(name, null);
    }
}
