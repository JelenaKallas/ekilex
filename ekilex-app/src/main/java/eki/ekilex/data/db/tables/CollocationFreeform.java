/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.CollocationFreeformRecord;

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
public class CollocationFreeform extends TableImpl<CollocationFreeformRecord> {

    private static final long serialVersionUID = 450427724;

    /**
     * The reference instance of <code>public.collocation_freeform</code>
     */
    public static final CollocationFreeform COLLOCATION_FREEFORM = new CollocationFreeform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollocationFreeformRecord> getRecordType() {
        return CollocationFreeformRecord.class;
    }

    /**
     * The column <code>public.collocation_freeform.id</code>.
     */
    public final TableField<CollocationFreeformRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('collocation_freeform_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.collocation_freeform.collocation_id</code>.
     */
    public final TableField<CollocationFreeformRecord, Long> COLLOCATION_ID = createField("collocation_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.collocation_freeform.freeform_id</code>.
     */
    public final TableField<CollocationFreeformRecord, Long> FREEFORM_ID = createField("freeform_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.collocation_freeform</code> table reference
     */
    public CollocationFreeform() {
        this(DSL.name("collocation_freeform"), null);
    }

    /**
     * Create an aliased <code>public.collocation_freeform</code> table reference
     */
    public CollocationFreeform(String alias) {
        this(DSL.name(alias), COLLOCATION_FREEFORM);
    }

    /**
     * Create an aliased <code>public.collocation_freeform</code> table reference
     */
    public CollocationFreeform(Name alias) {
        this(alias, COLLOCATION_FREEFORM);
    }

    private CollocationFreeform(Name alias, Table<CollocationFreeformRecord> aliased) {
        this(alias, aliased, null);
    }

    private CollocationFreeform(Name alias, Table<CollocationFreeformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CollocationFreeform(Table<O> child, ForeignKey<O, CollocationFreeformRecord> key) {
        super(child, key, COLLOCATION_FREEFORM);
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
        return Arrays.<Index>asList(Indexes.COLLOCATION_FREEFORM_COLLOCATION_ID_FREEFORM_ID_KEY, Indexes.COLLOCATION_FREEFORM_COLLOCATION_ID_IDX, Indexes.COLLOCATION_FREEFORM_FREEFORM_ID_IDX, Indexes.COLLOCATION_FREEFORM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CollocationFreeformRecord, Long> getIdentity() {
        return Keys.IDENTITY_COLLOCATION_FREEFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CollocationFreeformRecord> getPrimaryKey() {
        return Keys.COLLOCATION_FREEFORM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CollocationFreeformRecord>> getKeys() {
        return Arrays.<UniqueKey<CollocationFreeformRecord>>asList(Keys.COLLOCATION_FREEFORM_PKEY, Keys.COLLOCATION_FREEFORM_COLLOCATION_ID_FREEFORM_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CollocationFreeformRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CollocationFreeformRecord, ?>>asList(Keys.COLLOCATION_FREEFORM__COLLOCATION_FREEFORM_COLLOCATION_ID_FKEY, Keys.COLLOCATION_FREEFORM__COLLOCATION_FREEFORM_FREEFORM_ID_FKEY);
    }

    public Collocation collocation() {
        return new Collocation(this, Keys.COLLOCATION_FREEFORM__COLLOCATION_FREEFORM_COLLOCATION_ID_FKEY);
    }

    public Freeform freeform() {
        return new Freeform(this, Keys.COLLOCATION_FREEFORM__COLLOCATION_FREEFORM_FREEFORM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeform as(String alias) {
        return new CollocationFreeform(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationFreeform as(Name alias) {
        return new CollocationFreeform(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollocationFreeform rename(String name) {
        return new CollocationFreeform(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollocationFreeform rename(Name name) {
        return new CollocationFreeform(name, null);
    }
}
