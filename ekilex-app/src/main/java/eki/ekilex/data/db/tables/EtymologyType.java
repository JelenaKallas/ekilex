/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.EtymologyTypeRecord;

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
public class EtymologyType extends TableImpl<EtymologyTypeRecord> {

    private static final long serialVersionUID = 465634773;

    /**
     * The reference instance of <code>public.etymology_type</code>
     */
    public static final EtymologyType ETYMOLOGY_TYPE = new EtymologyType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EtymologyTypeRecord> getRecordType() {
        return EtymologyTypeRecord.class;
    }

    /**
     * The column <code>public.etymology_type.code</code>.
     */
    public final TableField<EtymologyTypeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.etymology_type.datasets</code>.
     */
    public final TableField<EtymologyTypeRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.etymology_type</code> table reference
     */
    public EtymologyType() {
        this(DSL.name("etymology_type"), null);
    }

    /**
     * Create an aliased <code>public.etymology_type</code> table reference
     */
    public EtymologyType(String alias) {
        this(DSL.name(alias), ETYMOLOGY_TYPE);
    }

    /**
     * Create an aliased <code>public.etymology_type</code> table reference
     */
    public EtymologyType(Name alias) {
        this(alias, ETYMOLOGY_TYPE);
    }

    private EtymologyType(Name alias, Table<EtymologyTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private EtymologyType(Name alias, Table<EtymologyTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EtymologyType(Table<O> child, ForeignKey<O, EtymologyTypeRecord> key) {
        super(child, key, ETYMOLOGY_TYPE);
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
        return Arrays.<Index>asList(Indexes.ETYMOLOGY_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EtymologyTypeRecord> getPrimaryKey() {
        return Keys.ETYMOLOGY_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EtymologyTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<EtymologyTypeRecord>>asList(Keys.ETYMOLOGY_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EtymologyType as(String alias) {
        return new EtymologyType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EtymologyType as(Name alias) {
        return new EtymologyType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EtymologyType rename(String name) {
        return new EtymologyType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EtymologyType rename(Name name) {
        return new EtymologyType(name, null);
    }
}
