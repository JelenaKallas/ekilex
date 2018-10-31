/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexRelTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class LexRelType extends TableImpl<LexRelTypeRecord> {

    private static final long serialVersionUID = 1475496538;

    /**
     * The reference instance of <code>public.lex_rel_type</code>
     */
    public static final LexRelType LEX_REL_TYPE = new LexRelType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexRelTypeRecord> getRecordType() {
        return LexRelTypeRecord.class;
    }

    /**
     * The column <code>public.lex_rel_type.code</code>.
     */
    public final TableField<LexRelTypeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.lex_rel_type.datasets</code>.
     */
    public final TableField<LexRelTypeRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.lex_rel_type</code> table reference
     */
    public LexRelType() {
        this(DSL.name("lex_rel_type"), null);
    }

    /**
     * Create an aliased <code>public.lex_rel_type</code> table reference
     */
    public LexRelType(String alias) {
        this(DSL.name(alias), LEX_REL_TYPE);
    }

    /**
     * Create an aliased <code>public.lex_rel_type</code> table reference
     */
    public LexRelType(Name alias) {
        this(alias, LEX_REL_TYPE);
    }

    private LexRelType(Name alias, Table<LexRelTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexRelType(Name alias, Table<LexRelTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LexRelType(Table<O> child, ForeignKey<O, LexRelTypeRecord> key) {
        super(child, key, LEX_REL_TYPE);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEX_REL_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexRelTypeRecord> getPrimaryKey() {
        return Keys.LEX_REL_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexRelTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<LexRelTypeRecord>>asList(Keys.LEX_REL_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexRelType as(String alias) {
        return new LexRelType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexRelType as(Name alias) {
        return new LexRelType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexRelType rename(String name) {
        return new LexRelType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexRelType rename(Name name) {
        return new LexRelType(name, null);
    }
}
