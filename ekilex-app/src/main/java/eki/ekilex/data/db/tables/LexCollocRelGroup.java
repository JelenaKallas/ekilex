/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexCollocRelGroupRecord;

import java.math.BigDecimal;
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
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexCollocRelGroup extends TableImpl<LexCollocRelGroupRecord> {

    private static final long serialVersionUID = -1350509384;

    /**
     * The reference instance of <code>public.lex_colloc_rel_group</code>
     */
    public static final LexCollocRelGroup LEX_COLLOC_REL_GROUP = new LexCollocRelGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexCollocRelGroupRecord> getRecordType() {
        return LexCollocRelGroupRecord.class;
    }

    /**
     * The column <code>public.lex_colloc_rel_group.id</code>.
     */
    public final TableField<LexCollocRelGroupRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lex_colloc_rel_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lex_colloc_rel_group.pos_group_id</code>.
     */
    public final TableField<LexCollocRelGroupRecord, Long> POS_GROUP_ID = createField("pos_group_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lex_colloc_rel_group.name</code>.
     */
    public final TableField<LexCollocRelGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.lex_colloc_rel_group.frequency</code>.
     */
    public final TableField<LexCollocRelGroupRecord, BigDecimal> FREQUENCY = createField("frequency", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>public.lex_colloc_rel_group.score</code>.
     */
    public final TableField<LexCollocRelGroupRecord, BigDecimal> SCORE = createField("score", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>public.lex_colloc_rel_group.order_by</code>.
     */
    public final TableField<LexCollocRelGroupRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lex_colloc_rel_group_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.lex_colloc_rel_group</code> table reference
     */
    public LexCollocRelGroup() {
        this(DSL.name("lex_colloc_rel_group"), null);
    }

    /**
     * Create an aliased <code>public.lex_colloc_rel_group</code> table reference
     */
    public LexCollocRelGroup(String alias) {
        this(DSL.name(alias), LEX_COLLOC_REL_GROUP);
    }

    /**
     * Create an aliased <code>public.lex_colloc_rel_group</code> table reference
     */
    public LexCollocRelGroup(Name alias) {
        this(alias, LEX_COLLOC_REL_GROUP);
    }

    private LexCollocRelGroup(Name alias, Table<LexCollocRelGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexCollocRelGroup(Name alias, Table<LexCollocRelGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LexCollocRelGroup(Table<O> child, ForeignKey<O, LexCollocRelGroupRecord> key) {
        super(child, key, LEX_COLLOC_REL_GROUP);
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
        return Arrays.<Index>asList(Indexes.LEX_COLLOC_REL_GROUP_PKEY, Indexes.LEX_COLLOC_REL_GROUP_POS_GROUP_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexCollocRelGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEX_COLLOC_REL_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexCollocRelGroupRecord> getPrimaryKey() {
        return Keys.LEX_COLLOC_REL_GROUP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexCollocRelGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<LexCollocRelGroupRecord>>asList(Keys.LEX_COLLOC_REL_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexCollocRelGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexCollocRelGroupRecord, ?>>asList(Keys.LEX_COLLOC_REL_GROUP__LEX_COLLOC_REL_GROUP_POS_GROUP_ID_FKEY);
    }

    public LexCollocPosGroup lexCollocPosGroup() {
        return new LexCollocPosGroup(this, Keys.LEX_COLLOC_REL_GROUP__LEX_COLLOC_REL_GROUP_POS_GROUP_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRelGroup as(String alias) {
        return new LexCollocRelGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRelGroup as(Name alias) {
        return new LexCollocRelGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexCollocRelGroup rename(String name) {
        return new LexCollocRelGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexCollocRelGroup rename(Name name) {
        return new LexCollocRelGroup(name, null);
    }
}
