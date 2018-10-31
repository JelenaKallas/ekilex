/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.udt;


import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.udt.records.TypeLexemeRelationRecord;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;


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
public class TypeLexemeRelation extends UDTImpl<TypeLexemeRelationRecord> {

    private static final long serialVersionUID = 1798730174;

    /**
     * The reference instance of <code>public.type_lexeme_relation</code>
     */
    public static final TypeLexemeRelation TYPE_LEXEME_RELATION = new TypeLexemeRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeLexemeRelationRecord> getRecordType() {
        return TypeLexemeRelationRecord.class;
    }

    /**
     * The attribute <code>public.type_lexeme_relation.lexeme_id</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word_id</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word_lang</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> WORD_LANG = createField("word_lang", org.jooq.impl.SQLDataType.CHAR(3), TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.lex_rel_type_code</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> LEX_REL_TYPE_CODE = createField("lex_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), TYPE_LEXEME_RELATION, "");

    /**
     * No further instances allowed
     */
    private TypeLexemeRelation() {
        super("type_lexeme_relation", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
