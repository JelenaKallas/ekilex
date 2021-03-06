/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MorphRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Morph extends TableImpl<MorphRecord> {

    private static final long serialVersionUID = 825390900;

    /**
     * The reference instance of <code>public.morph</code>
     */
    public static final Morph MORPH = new Morph();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MorphRecord> getRecordType() {
        return MorphRecord.class;
    }

    /**
     * The column <code>public.morph.code</code>.
     */
    public final TableField<MorphRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.morph.datasets</code>.
     */
    public final TableField<MorphRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR(10).getArrayDataType(), this, "");

    /**
     * The column <code>public.morph.order_by</code>.
     */
    public final TableField<MorphRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('morph_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.morph</code> table reference
     */
    public Morph() {
        this(DSL.name("morph"), null);
    }

    /**
     * Create an aliased <code>public.morph</code> table reference
     */
    public Morph(String alias) {
        this(DSL.name(alias), MORPH);
    }

    /**
     * Create an aliased <code>public.morph</code> table reference
     */
    public Morph(Name alias) {
        this(alias, MORPH);
    }

    private Morph(Name alias, Table<MorphRecord> aliased) {
        this(alias, aliased, null);
    }

    private Morph(Name alias, Table<MorphRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Morph(Table<O> child, ForeignKey<O, MorphRecord> key) {
        super(child, key, MORPH);
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
        return Arrays.<Index>asList(Indexes.MORPH_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MorphRecord, Long> getIdentity() {
        return Keys.IDENTITY_MORPH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MorphRecord> getPrimaryKey() {
        return Keys.MORPH_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MorphRecord>> getKeys() {
        return Arrays.<UniqueKey<MorphRecord>>asList(Keys.MORPH_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Morph as(String alias) {
        return new Morph(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Morph as(Name alias) {
        return new Morph(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Morph rename(String name) {
        return new Morph(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Morph rename(Name name) {
        return new Morph(name, null);
    }
}
