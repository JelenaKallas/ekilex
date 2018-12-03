/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwSimilarityJudgementDataRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwSimilarityJudgementData extends TableImpl<ViewWwSimilarityJudgementDataRecord> {

    private static final long serialVersionUID = -304743879;

    /**
     * The reference instance of <code>public.view_ww_similarity_judgement_data</code>
     */
    public static final ViewWwSimilarityJudgementData VIEW_WW_SIMILARITY_JUDGEMENT_DATA = new ViewWwSimilarityJudgementData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwSimilarityJudgementDataRecord> getRecordType() {
        return ViewWwSimilarityJudgementDataRecord.class;
    }

    /**
     * The column <code>public.view_ww_similarity_judgement_data.meaning_id</code>.
     */
    public final TableField<ViewWwSimilarityJudgementDataRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_similarity_judgement_data.word</code>.
     */
    public final TableField<ViewWwSimilarityJudgementDataRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_similarity_judgement_data.lang</code>.
     */
    public final TableField<ViewWwSimilarityJudgementDataRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.view_ww_similarity_judgement_data.dataset_code</code>.
     */
    public final TableField<ViewWwSimilarityJudgementDataRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.view_ww_similarity_judgement_data</code> table reference
     */
    public ViewWwSimilarityJudgementData() {
        this(DSL.name("view_ww_similarity_judgement_data"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_similarity_judgement_data</code> table reference
     */
    public ViewWwSimilarityJudgementData(String alias) {
        this(DSL.name(alias), VIEW_WW_SIMILARITY_JUDGEMENT_DATA);
    }

    /**
     * Create an aliased <code>public.view_ww_similarity_judgement_data</code> table reference
     */
    public ViewWwSimilarityJudgementData(Name alias) {
        this(alias, VIEW_WW_SIMILARITY_JUDGEMENT_DATA);
    }

    private ViewWwSimilarityJudgementData(Name alias, Table<ViewWwSimilarityJudgementDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwSimilarityJudgementData(Name alias, Table<ViewWwSimilarityJudgementDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwSimilarityJudgementData(Table<O> child, ForeignKey<O, ViewWwSimilarityJudgementDataRecord> key) {
        super(child, key, VIEW_WW_SIMILARITY_JUDGEMENT_DATA);
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
    public ViewWwSimilarityJudgementData as(String alias) {
        return new ViewWwSimilarityJudgementData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementData as(Name alias) {
        return new ViewWwSimilarityJudgementData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwSimilarityJudgementData rename(String name) {
        return new ViewWwSimilarityJudgementData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwSimilarityJudgementData rename(Name name) {
        return new ViewWwSimilarityJudgementData(name, null);
    }
}
