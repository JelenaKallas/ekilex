/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.udt.records;


import eki.ekilex.data.db.udt.TypeWordEtym;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UDTRecordImpl;


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
public class TypeWordEtymRecord extends UDTRecordImpl<TypeWordEtymRecord> implements Record9<Long, Long, String, String, String[], String, String[], Boolean, Boolean> {

    private static final long serialVersionUID = -1781137779;

    /**
     * Setter for <code>public.type_word_etym.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_word_etym.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.type_word_etym.etym_word_id</code>.
     */
    public void setEtymWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_word_etym.etym_word_id</code>.
     */
    public Long getEtymWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.type_word_etym.etym_word</code>.
     */
    public void setEtymWord(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_word_etym.etym_word</code>.
     */
    public String getEtymWord() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.type_word_etym.etym_word_lang</code>.
     */
    public void setEtymWordLang(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_word_etym.etym_word_lang</code>.
     */
    public String getEtymWordLang() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.type_word_etym.etym_meaning_words</code>.
     */
    public void setEtymMeaningWords(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.type_word_etym.etym_meaning_words</code>.
     */
    public String[] getEtymMeaningWords() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.type_word_etym.etym_type_code</code>.
     */
    public void setEtymTypeCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.type_word_etym.etym_type_code</code>.
     */
    public String getEtymTypeCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.type_word_etym.comments</code>.
     */
    public void setComments(String... value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.type_word_etym.comments</code>.
     */
    public String[] getComments() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>public.type_word_etym.is_questionable</code>.
     */
    public void setIsQuestionable(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.type_word_etym.is_questionable</code>.
     */
    public Boolean getIsQuestionable() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.type_word_etym.is_compound</code>.
     */
    public void setIsCompound(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.type_word_etym.is_compound</code>.
     */
    public Boolean getIsCompound() {
        return (Boolean) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String[], String, String[], Boolean, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String[], String, String[], Boolean, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TypeWordEtym.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TypeWordEtym.ETYM_WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TypeWordEtym.ETYM_WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TypeWordEtym.ETYM_WORD_LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return TypeWordEtym.ETYM_MEANING_WORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TypeWordEtym.ETYM_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return TypeWordEtym.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return TypeWordEtym.IS_QUESTIONABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return TypeWordEtym.IS_COMPOUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getEtymWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEtymWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEtymWordLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getEtymMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEtymTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component7() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIsQuestionable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getIsCompound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEtymWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEtymWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEtymWordLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getEtymMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEtymTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsQuestionable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getIsCompound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value2(Long value) {
        setEtymWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value3(String value) {
        setEtymWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value4(String value) {
        setEtymWordLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value5(String... value) {
        setEtymMeaningWords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value6(String value) {
        setEtymTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value7(String... value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value8(Boolean value) {
        setIsQuestionable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord value9(Boolean value) {
        setIsCompound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordEtymRecord values(Long value1, Long value2, String value3, String value4, String[] value5, String value6, String[] value7, Boolean value8, Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeWordEtymRecord
     */
    public TypeWordEtymRecord() {
        super(TypeWordEtym.TYPE_WORD_ETYM);
    }

    /**
     * Create a detached, initialised TypeWordEtymRecord
     */
    public TypeWordEtymRecord(Long wordId, Long etymWordId, String etymWord, String etymWordLang, String[] etymMeaningWords, String etymTypeCode, String[] comments, Boolean isQuestionable, Boolean isCompound) {
        super(TypeWordEtym.TYPE_WORD_ETYM);

        set(0, wordId);
        set(1, etymWordId);
        set(2, etymWord);
        set(3, etymWordLang);
        set(4, etymMeaningWords);
        set(5, etymTypeCode);
        set(6, comments);
        set(7, isQuestionable);
        set(8, isCompound);
    }
}
