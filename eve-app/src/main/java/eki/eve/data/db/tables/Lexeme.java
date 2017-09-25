/*
 * This file is generated by jOOQ.
*/
package eki.eve.data.db.tables;


import eki.eve.data.db.Keys;
import eki.eve.data.db.Public;
import eki.eve.data.db.tables.records.LexemeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Lexeme extends TableImpl<LexemeRecord> {

    private static final long serialVersionUID = 1479127088;

    /**
     * The reference instance of <code>public.lexeme</code>
     */
    public static final Lexeme LEXEME = new Lexeme();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeRecord> getRecordType() {
        return LexemeRecord.class;
    }

    /**
     * The column <code>public.lexeme.id</code>.
     */
    public final TableField<LexemeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme.word_id</code>.
     */
    public final TableField<LexemeRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme.meaning_id</code>.
     */
    public final TableField<LexemeRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme.level1</code>.
     */
    public final TableField<LexemeRecord, Integer> LEVEL1 = createField("level1", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.lexeme.level2</code>.
     */
    public final TableField<LexemeRecord, Integer> LEVEL2 = createField("level2", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.lexeme.dataset</code>.
     */
    public final TableField<LexemeRecord, String[]> DATASET = createField("dataset", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.lexeme</code> table reference
     */
    public Lexeme() {
        this("lexeme", null);
    }

    /**
     * Create an aliased <code>public.lexeme</code> table reference
     */
    public Lexeme(String alias) {
        this(alias, LEXEME);
    }

    private Lexeme(String alias, Table<LexemeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Lexeme(String alias, Table<LexemeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<LexemeRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeRecord> getPrimaryKey() {
        return Keys.LEXEME_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeRecord>>asList(Keys.LEXEME_PKEY, Keys.LEXEME_WORD_ID_MEANING_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeRecord, ?>>asList(Keys.LEXEME__LEXEME_WORD_ID_FKEY, Keys.LEXEME__LEXEME_MEANING_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lexeme as(String alias) {
        return new Lexeme(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Lexeme rename(String name) {
        return new Lexeme(name, null);
    }
}