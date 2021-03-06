/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeDerivRecord;

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
public class LexemeDeriv extends TableImpl<LexemeDerivRecord> {

    private static final long serialVersionUID = -1547866281;

    /**
     * The reference instance of <code>public.lexeme_deriv</code>
     */
    public static final LexemeDeriv LEXEME_DERIV = new LexemeDeriv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeDerivRecord> getRecordType() {
        return LexemeDerivRecord.class;
    }

    /**
     * The column <code>public.lexeme_deriv.id</code>.
     */
    public final TableField<LexemeDerivRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_deriv_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme_deriv.lexeme_id</code>.
     */
    public final TableField<LexemeDerivRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme_deriv.deriv_code</code>.
     */
    public final TableField<LexemeDerivRecord, String> DERIV_CODE = createField("deriv_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.lexeme_deriv.process_state_code</code>.
     */
    public final TableField<LexemeDerivRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>public.lexeme_deriv</code> table reference
     */
    public LexemeDeriv() {
        this(DSL.name("lexeme_deriv"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_deriv</code> table reference
     */
    public LexemeDeriv(String alias) {
        this(DSL.name(alias), LEXEME_DERIV);
    }

    /**
     * Create an aliased <code>public.lexeme_deriv</code> table reference
     */
    public LexemeDeriv(Name alias) {
        this(alias, LEXEME_DERIV);
    }

    private LexemeDeriv(Name alias, Table<LexemeDerivRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeDeriv(Name alias, Table<LexemeDerivRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LexemeDeriv(Table<O> child, ForeignKey<O, LexemeDerivRecord> key) {
        super(child, key, LEXEME_DERIV);
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
        return Arrays.<Index>asList(Indexes.LEXEME_DERIV_LEXEME_ID_DERIV_CODE_KEY, Indexes.LEXEME_DERIV_LEXEME_ID_IDX, Indexes.LEXEME_DERIV_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexemeDerivRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME_DERIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeDerivRecord> getPrimaryKey() {
        return Keys.LEXEME_DERIV_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeDerivRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeDerivRecord>>asList(Keys.LEXEME_DERIV_PKEY, Keys.LEXEME_DERIV_LEXEME_ID_DERIV_CODE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeDerivRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeDerivRecord, ?>>asList(Keys.LEXEME_DERIV__LEXEME_DERIV_LEXEME_ID_FKEY, Keys.LEXEME_DERIV__LEXEME_DERIV_DERIV_CODE_FKEY, Keys.LEXEME_DERIV__LEXEME_DERIV_PROCESS_STATE_CODE_FKEY);
    }

    public Lexeme lexeme() {
        return new Lexeme(this, Keys.LEXEME_DERIV__LEXEME_DERIV_LEXEME_ID_FKEY);
    }

    public Deriv deriv() {
        return new Deriv(this, Keys.LEXEME_DERIV__LEXEME_DERIV_DERIV_CODE_FKEY);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.LEXEME_DERIV__LEXEME_DERIV_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDeriv as(String alias) {
        return new LexemeDeriv(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeDeriv as(Name alias) {
        return new LexemeDeriv(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeDeriv rename(String name) {
        return new LexemeDeriv(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeDeriv rename(Name name) {
        return new LexemeDeriv(name, null);
    }
}
