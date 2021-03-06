/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwWordEtymologyRecord;
import eki.ekilex.data.db.udt.records.TypeWordEtymRecord;

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
public class ViewWwWordEtymology extends TableImpl<ViewWwWordEtymologyRecord> {

    private static final long serialVersionUID = -2039027874;

    /**
     * The reference instance of <code>public.view_ww_word_etymology</code>
     */
    public static final ViewWwWordEtymology VIEW_WW_WORD_ETYMOLOGY = new ViewWwWordEtymology();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwWordEtymologyRecord> getRecordType() {
        return ViewWwWordEtymologyRecord.class;
    }

    /**
     * The column <code>public.view_ww_word_etymology.word_id</code>.
     */
    public final TableField<ViewWwWordEtymologyRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_word_etymology.word_sources</code>.
     */
    public final TableField<ViewWwWordEtymologyRecord, String[]> WORD_SOURCES = createField("word_sources", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_word_etymology.etym_lineup</code>.
     */
    public final TableField<ViewWwWordEtymologyRecord, TypeWordEtymRecord[]> ETYM_LINEUP = createField("etym_lineup", eki.ekilex.data.db.udt.TypeWordEtym.TYPE_WORD_ETYM.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_word_etymology</code> table reference
     */
    public ViewWwWordEtymology() {
        this(DSL.name("view_ww_word_etymology"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_word_etymology</code> table reference
     */
    public ViewWwWordEtymology(String alias) {
        this(DSL.name(alias), VIEW_WW_WORD_ETYMOLOGY);
    }

    /**
     * Create an aliased <code>public.view_ww_word_etymology</code> table reference
     */
    public ViewWwWordEtymology(Name alias) {
        this(alias, VIEW_WW_WORD_ETYMOLOGY);
    }

    private ViewWwWordEtymology(Name alias, Table<ViewWwWordEtymologyRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwWordEtymology(Name alias, Table<ViewWwWordEtymologyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwWordEtymology(Table<O> child, ForeignKey<O, ViewWwWordEtymologyRecord> key) {
        super(child, key, VIEW_WW_WORD_ETYMOLOGY);
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
    public ViewWwWordEtymology as(String alias) {
        return new ViewWwWordEtymology(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordEtymology as(Name alias) {
        return new ViewWwWordEtymology(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordEtymology rename(String name) {
        return new ViewWwWordEtymology(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwWordEtymology rename(Name name) {
        return new ViewWwWordEtymology(name, null);
    }
}
