/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.udt.records;


import eki.wordweb.data.db.udt.TypeUsage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TypeUsageRecord extends UDTRecordImpl<TypeUsageRecord> implements Record6<String, String, String, String[], String[], String[]> {

    private static final long serialVersionUID = -1436106702;

    /**
     * Setter for <code>public.type_usage.usage</code>.
     */
    public void setUsage(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_usage.usage</code>.
     */
    public String getUsage() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.type_usage.usage_lang</code>.
     */
    public void setUsageLang(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_lang</code>.
     */
    public String getUsageLang() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.type_usage.usage_type_code</code>.
     */
    public void setUsageTypeCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_type_code</code>.
     */
    public String getUsageTypeCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.type_usage.usage_translations</code>.
     */
    public void setUsageTranslations(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_translations</code>.
     */
    public String[] getUsageTranslations() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.type_usage.usage_definitions</code>.
     */
    public void setUsageDefinitions(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_definitions</code>.
     */
    public String[] getUsageDefinitions() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.type_usage.usage_authors</code>.
     */
    public void setUsageAuthors(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_authors</code>.
     */
    public String[] getUsageAuthors() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String[], String[], String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String[], String[], String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TypeUsage.USAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TypeUsage.USAGE_LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TypeUsage.USAGE_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return TypeUsage.USAGE_TRANSLATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return TypeUsage.USAGE_DEFINITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return TypeUsage.USAGE_AUTHORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsageLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsageTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getUsageTranslations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getUsageDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getUsageAuthors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsageLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsageTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getUsageTranslations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getUsageDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getUsageAuthors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value1(String value) {
        setUsage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value2(String value) {
        setUsageLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value3(String value) {
        setUsageTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value4(String... value) {
        setUsageTranslations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value5(String... value) {
        setUsageDefinitions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value6(String... value) {
        setUsageAuthors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord values(String value1, String value2, String value3, String[] value4, String[] value5, String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeUsageRecord
     */
    public TypeUsageRecord() {
        super(TypeUsage.TYPE_USAGE);
    }

    /**
     * Create a detached, initialised TypeUsageRecord
     */
    public TypeUsageRecord(String usage, String usageLang, String usageTypeCode, String[] usageTranslations, String[] usageDefinitions, String[] usageAuthors) {
        super(TypeUsage.TYPE_USAGE);

        set(0, usage);
        set(1, usageLang);
        set(2, usageTypeCode);
        set(3, usageTranslations);
        set(4, usageDefinitions);
        set(5, usageAuthors);
    }
}
