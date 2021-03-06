/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningRelTypeRecord;

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
public class MeaningRelType extends TableImpl<MeaningRelTypeRecord> {

    private static final long serialVersionUID = -1568304786;

    /**
     * The reference instance of <code>public.meaning_rel_type</code>
     */
    public static final MeaningRelType MEANING_REL_TYPE = new MeaningRelType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningRelTypeRecord> getRecordType() {
        return MeaningRelTypeRecord.class;
    }

    /**
     * The column <code>public.meaning_rel_type.code</code>.
     */
    public final TableField<MeaningRelTypeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.meaning_rel_type.datasets</code>.
     */
    public final TableField<MeaningRelTypeRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR(10).getArrayDataType(), this, "");

    /**
     * The column <code>public.meaning_rel_type.order_by</code>.
     */
    public final TableField<MeaningRelTypeRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('meaning_rel_type_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.meaning_rel_type</code> table reference
     */
    public MeaningRelType() {
        this(DSL.name("meaning_rel_type"), null);
    }

    /**
     * Create an aliased <code>public.meaning_rel_type</code> table reference
     */
    public MeaningRelType(String alias) {
        this(DSL.name(alias), MEANING_REL_TYPE);
    }

    /**
     * Create an aliased <code>public.meaning_rel_type</code> table reference
     */
    public MeaningRelType(Name alias) {
        this(alias, MEANING_REL_TYPE);
    }

    private MeaningRelType(Name alias, Table<MeaningRelTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningRelType(Name alias, Table<MeaningRelTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MeaningRelType(Table<O> child, ForeignKey<O, MeaningRelTypeRecord> key) {
        super(child, key, MEANING_REL_TYPE);
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
        return Arrays.<Index>asList(Indexes.MEANING_REL_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MeaningRelTypeRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEANING_REL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeaningRelTypeRecord> getPrimaryKey() {
        return Keys.MEANING_REL_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningRelTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningRelTypeRecord>>asList(Keys.MEANING_REL_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelType as(String alias) {
        return new MeaningRelType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelType as(Name alias) {
        return new MeaningRelType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningRelType rename(String name) {
        return new MeaningRelType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningRelType rename(Name name) {
        return new MeaningRelType(name, null);
    }
}
