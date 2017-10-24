/*
 * This file is generated by jOOQ.
*/
package eki.eve.data.db;


import eki.eve.data.db.tables.Dataset;
import eki.eve.data.db.tables.Definition;
import eki.eve.data.db.tables.DefinitionDataset;
import eki.eve.data.db.tables.Deriv;
import eki.eve.data.db.tables.DerivLabel;
import eki.eve.data.db.tables.Domain;
import eki.eve.data.db.tables.DomainLabel;
import eki.eve.data.db.tables.EkiUser;
import eki.eve.data.db.tables.Form;
import eki.eve.data.db.tables.Gender;
import eki.eve.data.db.tables.GenderLabel;
import eki.eve.data.db.tables.Grammar;
import eki.eve.data.db.tables.GrammarDataset;
import eki.eve.data.db.tables.LabelType;
import eki.eve.data.db.tables.Lang;
import eki.eve.data.db.tables.LangLabel;
import eki.eve.data.db.tables.LexRelType;
import eki.eve.data.db.tables.LexRelTypeLabel;
import eki.eve.data.db.tables.LexRelation;
import eki.eve.data.db.tables.LexRelationDataset;
import eki.eve.data.db.tables.Lexeme;
import eki.eve.data.db.tables.LexemeDataset;
import eki.eve.data.db.tables.LexemeDeriv;
import eki.eve.data.db.tables.LexemePos;
import eki.eve.data.db.tables.LexemeRegister;
import eki.eve.data.db.tables.LexemeType;
import eki.eve.data.db.tables.LexemeTypeLabel;
import eki.eve.data.db.tables.Meaning;
import eki.eve.data.db.tables.MeaningDataset;
import eki.eve.data.db.tables.MeaningDomain;
import eki.eve.data.db.tables.Morph;
import eki.eve.data.db.tables.MorphLabel;
import eki.eve.data.db.tables.Paradigm;
import eki.eve.data.db.tables.Pos;
import eki.eve.data.db.tables.PosLabel;
import eki.eve.data.db.tables.Rection;
import eki.eve.data.db.tables.Register;
import eki.eve.data.db.tables.RegisterLabel;
import eki.eve.data.db.tables.Usage;
import eki.eve.data.db.tables.UsageTranslation;
import eki.eve.data.db.tables.Word;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index DATASET_PKEY = Indexes0.DATASET_PKEY;
    public static final Index DEFINITION_MEANING_ID_IDX = Indexes0.DEFINITION_MEANING_ID_IDX;
    public static final Index DEFINITION_PKEY = Indexes0.DEFINITION_PKEY;
    public static final Index DEFINITION_DATASET_PKEY = Indexes0.DEFINITION_DATASET_PKEY;
    public static final Index DERIV_PKEY = Indexes0.DERIV_PKEY;
    public static final Index DERIV_LABEL_CODE_LANG_TYPE_KEY = Indexes0.DERIV_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index DOMAIN_PKEY = Indexes0.DOMAIN_PKEY;
    public static final Index DOMAIN_LABEL_CODE_ORIGIN_LANG_TYPE_KEY = Indexes0.DOMAIN_LABEL_CODE_ORIGIN_LANG_TYPE_KEY;
    public static final Index EKI_USER_NAME_KEY = Indexes0.EKI_USER_NAME_KEY;
    public static final Index EKI_USER_PKEY = Indexes0.EKI_USER_PKEY;
    public static final Index FORM_PARADIGM_ID_IDX = Indexes0.FORM_PARADIGM_ID_IDX;
    public static final Index FORM_PKEY = Indexes0.FORM_PKEY;
    public static final Index FORM_VALUE_IDX = Indexes0.FORM_VALUE_IDX;
    public static final Index GENDER_PKEY = Indexes0.GENDER_PKEY;
    public static final Index GENDER_LABEL_CODE_LANG_TYPE_KEY = Indexes0.GENDER_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index GRAMMAR_LEXEME_ID_IDX = Indexes0.GRAMMAR_LEXEME_ID_IDX;
    public static final Index GRAMMAR_PKEY = Indexes0.GRAMMAR_PKEY;
    public static final Index GRAMMAR_DATASET_PKEY = Indexes0.GRAMMAR_DATASET_PKEY;
    public static final Index LABEL_TYPE_PKEY = Indexes0.LABEL_TYPE_PKEY;
    public static final Index LANG_PKEY = Indexes0.LANG_PKEY;
    public static final Index LANG_LABEL_CODE_LANG_TYPE_KEY = Indexes0.LANG_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index LEX_REL_TYPE_PKEY = Indexes0.LEX_REL_TYPE_PKEY;
    public static final Index LEX_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY = Indexes0.LEX_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index LEX_RELATION_LEXEME1_ID_IDX = Indexes0.LEX_RELATION_LEXEME1_ID_IDX;
    public static final Index LEX_RELATION_LEXEME1_ID_LEXEME2_ID_LEX_REL_TYPE_CODE_KEY = Indexes0.LEX_RELATION_LEXEME1_ID_LEXEME2_ID_LEX_REL_TYPE_CODE_KEY;
    public static final Index LEX_RELATION_LEXEME2_ID_IDX = Indexes0.LEX_RELATION_LEXEME2_ID_IDX;
    public static final Index LEX_RELATION_PKEY = Indexes0.LEX_RELATION_PKEY;
    public static final Index LEX_RELATION_DATASET_PKEY = Indexes0.LEX_RELATION_DATASET_PKEY;
    public static final Index LEXEME_MEANING_ID_IDX = Indexes0.LEXEME_MEANING_ID_IDX;
    public static final Index LEXEME_PKEY = Indexes0.LEXEME_PKEY;
    public static final Index LEXEME_WORD_ID_IDX = Indexes0.LEXEME_WORD_ID_IDX;
    public static final Index LEXEME_WORD_ID_MEANING_ID_KEY = Indexes0.LEXEME_WORD_ID_MEANING_ID_KEY;
    public static final Index LEXEME_DATASET_PKEY = Indexes0.LEXEME_DATASET_PKEY;
    public static final Index LEXEME_DERIV_LEXEME_ID_DERIV_CODE_KEY = Indexes0.LEXEME_DERIV_LEXEME_ID_DERIV_CODE_KEY;
    public static final Index LEXEME_DERIV_PKEY = Indexes0.LEXEME_DERIV_PKEY;
    public static final Index LEXEME_POS_LEXEME_ID_POS_CODE_KEY = Indexes0.LEXEME_POS_LEXEME_ID_POS_CODE_KEY;
    public static final Index LEXEME_POS_PKEY = Indexes0.LEXEME_POS_PKEY;
    public static final Index LEXEME_REGISTER_LEXEME_ID_REGISTER_CODE_KEY = Indexes0.LEXEME_REGISTER_LEXEME_ID_REGISTER_CODE_KEY;
    public static final Index LEXEME_REGISTER_PKEY = Indexes0.LEXEME_REGISTER_PKEY;
    public static final Index LEXEME_TYPE_PKEY = Indexes0.LEXEME_TYPE_PKEY;
    public static final Index LEXEME_TYPE_LABEL_CODE_LANG_TYPE_KEY = Indexes0.LEXEME_TYPE_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index MEANING_PKEY = Indexes0.MEANING_PKEY;
    public static final Index MEANING_DATASET_PKEY = Indexes0.MEANING_DATASET_PKEY;
    public static final Index MEANING_DOMAIN_MEANING_ID_DOMAIN_CODE_DOMAIN_ORIGIN_KEY = Indexes0.MEANING_DOMAIN_MEANING_ID_DOMAIN_CODE_DOMAIN_ORIGIN_KEY;
    public static final Index MEANING_DOMAIN_PKEY = Indexes0.MEANING_DOMAIN_PKEY;
    public static final Index MORPH_PKEY = Indexes0.MORPH_PKEY;
    public static final Index MORPH_LABEL_CODE_LANG_TYPE_KEY = Indexes0.MORPH_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index PARADIGM_PKEY = Indexes0.PARADIGM_PKEY;
    public static final Index PARADIGM_WORD_ID_IDX = Indexes0.PARADIGM_WORD_ID_IDX;
    public static final Index POS_PKEY = Indexes0.POS_PKEY;
    public static final Index POS_LABEL_CODE_LANG_TYPE_KEY = Indexes0.POS_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index RECTION_LEXEME_ID_IDX = Indexes0.RECTION_LEXEME_ID_IDX;
    public static final Index RECTION_PKEY = Indexes0.RECTION_PKEY;
    public static final Index REGISTER_PKEY = Indexes0.REGISTER_PKEY;
    public static final Index REGISTER_LABEL_CODE_LANG_TYPE_KEY = Indexes0.REGISTER_LABEL_CODE_LANG_TYPE_KEY;
    public static final Index USAGE_PKEY = Indexes0.USAGE_PKEY;
    public static final Index USAGE_TRANSLATION_PKEY = Indexes0.USAGE_TRANSLATION_PKEY;
    public static final Index WORD_HOMONYM_NR_IDX = Indexes0.WORD_HOMONYM_NR_IDX;
    public static final Index WORD_PKEY = Indexes0.WORD_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index DATASET_PKEY = createIndex("dataset_pkey", Dataset.DATASET, new OrderField[] { Dataset.DATASET.CODE }, true);
        public static Index DEFINITION_MEANING_ID_IDX = createIndex("definition_meaning_id_idx", Definition.DEFINITION, new OrderField[] { Definition.DEFINITION.MEANING_ID }, false);
        public static Index DEFINITION_PKEY = createIndex("definition_pkey", Definition.DEFINITION, new OrderField[] { Definition.DEFINITION.ID }, true);
        public static Index DEFINITION_DATASET_PKEY = createIndex("definition_dataset_pkey", DefinitionDataset.DEFINITION_DATASET, new OrderField[] { DefinitionDataset.DEFINITION_DATASET.DEFINITION_ID, DefinitionDataset.DEFINITION_DATASET.DATASET_CODE }, true);
        public static Index DERIV_PKEY = createIndex("deriv_pkey", Deriv.DERIV, new OrderField[] { Deriv.DERIV.CODE }, true);
        public static Index DERIV_LABEL_CODE_LANG_TYPE_KEY = createIndex("deriv_label_code_lang_type_key", DerivLabel.DERIV_LABEL, new OrderField[] { DerivLabel.DERIV_LABEL.CODE, DerivLabel.DERIV_LABEL.LANG, DerivLabel.DERIV_LABEL.TYPE }, true);
        public static Index DOMAIN_PKEY = createIndex("domain_pkey", Domain.DOMAIN, new OrderField[] { Domain.DOMAIN.CODE, Domain.DOMAIN.ORIGIN }, true);
        public static Index DOMAIN_LABEL_CODE_ORIGIN_LANG_TYPE_KEY = createIndex("domain_label_code_origin_lang_type_key", DomainLabel.DOMAIN_LABEL, new OrderField[] { DomainLabel.DOMAIN_LABEL.CODE, DomainLabel.DOMAIN_LABEL.ORIGIN, DomainLabel.DOMAIN_LABEL.LANG, DomainLabel.DOMAIN_LABEL.TYPE }, true);
        public static Index EKI_USER_NAME_KEY = createIndex("eki_user_name_key", EkiUser.EKI_USER, new OrderField[] { EkiUser.EKI_USER.NAME }, true);
        public static Index EKI_USER_PKEY = createIndex("eki_user_pkey", EkiUser.EKI_USER, new OrderField[] { EkiUser.EKI_USER.ID }, true);
        public static Index FORM_PARADIGM_ID_IDX = createIndex("form_paradigm_id_idx", Form.FORM, new OrderField[] { Form.FORM.PARADIGM_ID }, false);
        public static Index FORM_PKEY = createIndex("form_pkey", Form.FORM, new OrderField[] { Form.FORM.ID }, true);
        public static Index FORM_VALUE_IDX = createIndex("form_value_idx", Form.FORM, new OrderField[] { Form.FORM.VALUE }, false);
        public static Index GENDER_PKEY = createIndex("gender_pkey", Gender.GENDER, new OrderField[] { Gender.GENDER.CODE }, true);
        public static Index GENDER_LABEL_CODE_LANG_TYPE_KEY = createIndex("gender_label_code_lang_type_key", GenderLabel.GENDER_LABEL, new OrderField[] { GenderLabel.GENDER_LABEL.CODE, GenderLabel.GENDER_LABEL.LANG, GenderLabel.GENDER_LABEL.TYPE }, true);
        public static Index GRAMMAR_LEXEME_ID_IDX = createIndex("grammar_lexeme_id_idx", Grammar.GRAMMAR, new OrderField[] { Grammar.GRAMMAR.LEXEME_ID }, false);
        public static Index GRAMMAR_PKEY = createIndex("grammar_pkey", Grammar.GRAMMAR, new OrderField[] { Grammar.GRAMMAR.ID }, true);
        public static Index GRAMMAR_DATASET_PKEY = createIndex("grammar_dataset_pkey", GrammarDataset.GRAMMAR_DATASET, new OrderField[] { GrammarDataset.GRAMMAR_DATASET.GRAMMAR_ID, GrammarDataset.GRAMMAR_DATASET.DATASET_CODE }, true);
        public static Index LABEL_TYPE_PKEY = createIndex("label_type_pkey", LabelType.LABEL_TYPE, new OrderField[] { LabelType.LABEL_TYPE.CODE }, true);
        public static Index LANG_PKEY = createIndex("lang_pkey", Lang.LANG, new OrderField[] { Lang.LANG.CODE }, true);
        public static Index LANG_LABEL_CODE_LANG_TYPE_KEY = createIndex("lang_label_code_lang_type_key", LangLabel.LANG_LABEL, new OrderField[] { LangLabel.LANG_LABEL.CODE, LangLabel.LANG_LABEL.LANG, LangLabel.LANG_LABEL.TYPE }, true);
        public static Index LEX_REL_TYPE_PKEY = createIndex("lex_rel_type_pkey", LexRelType.LEX_REL_TYPE, new OrderField[] { LexRelType.LEX_REL_TYPE.CODE }, true);
        public static Index LEX_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY = createIndex("lex_rel_type_label_code_lang_type_key", LexRelTypeLabel.LEX_REL_TYPE_LABEL, new OrderField[] { LexRelTypeLabel.LEX_REL_TYPE_LABEL.CODE, LexRelTypeLabel.LEX_REL_TYPE_LABEL.LANG, LexRelTypeLabel.LEX_REL_TYPE_LABEL.TYPE }, true);
        public static Index LEX_RELATION_LEXEME1_ID_IDX = createIndex("lex_relation_lexeme1_id_idx", LexRelation.LEX_RELATION, new OrderField[] { LexRelation.LEX_RELATION.LEXEME1_ID }, false);
        public static Index LEX_RELATION_LEXEME1_ID_LEXEME2_ID_LEX_REL_TYPE_CODE_KEY = createIndex("lex_relation_lexeme1_id_lexeme2_id_lex_rel_type_code_key", LexRelation.LEX_RELATION, new OrderField[] { LexRelation.LEX_RELATION.LEXEME1_ID, LexRelation.LEX_RELATION.LEXEME2_ID, LexRelation.LEX_RELATION.LEX_REL_TYPE_CODE }, true);
        public static Index LEX_RELATION_LEXEME2_ID_IDX = createIndex("lex_relation_lexeme2_id_idx", LexRelation.LEX_RELATION, new OrderField[] { LexRelation.LEX_RELATION.LEXEME2_ID }, false);
        public static Index LEX_RELATION_PKEY = createIndex("lex_relation_pkey", LexRelation.LEX_RELATION, new OrderField[] { LexRelation.LEX_RELATION.ID }, true);
        public static Index LEX_RELATION_DATASET_PKEY = createIndex("lex_relation_dataset_pkey", LexRelationDataset.LEX_RELATION_DATASET, new OrderField[] { LexRelationDataset.LEX_RELATION_DATASET.LEX_RELATION_ID, LexRelationDataset.LEX_RELATION_DATASET.DATASET_CODE }, true);
        public static Index LEXEME_MEANING_ID_IDX = createIndex("lexeme_meaning_id_idx", Lexeme.LEXEME, new OrderField[] { Lexeme.LEXEME.MEANING_ID }, false);
        public static Index LEXEME_PKEY = createIndex("lexeme_pkey", Lexeme.LEXEME, new OrderField[] { Lexeme.LEXEME.ID }, true);
        public static Index LEXEME_WORD_ID_IDX = createIndex("lexeme_word_id_idx", Lexeme.LEXEME, new OrderField[] { Lexeme.LEXEME.WORD_ID }, false);
        public static Index LEXEME_WORD_ID_MEANING_ID_KEY = createIndex("lexeme_word_id_meaning_id_key", Lexeme.LEXEME, new OrderField[] { Lexeme.LEXEME.WORD_ID, Lexeme.LEXEME.MEANING_ID }, true);
        public static Index LEXEME_DATASET_PKEY = createIndex("lexeme_dataset_pkey", LexemeDataset.LEXEME_DATASET, new OrderField[] { LexemeDataset.LEXEME_DATASET.LEXEME_ID, LexemeDataset.LEXEME_DATASET.DATASET_CODE }, true);
        public static Index LEXEME_DERIV_LEXEME_ID_DERIV_CODE_KEY = createIndex("lexeme_deriv_lexeme_id_deriv_code_key", LexemeDeriv.LEXEME_DERIV, new OrderField[] { LexemeDeriv.LEXEME_DERIV.LEXEME_ID, LexemeDeriv.LEXEME_DERIV.DERIV_CODE }, true);
        public static Index LEXEME_DERIV_PKEY = createIndex("lexeme_deriv_pkey", LexemeDeriv.LEXEME_DERIV, new OrderField[] { LexemeDeriv.LEXEME_DERIV.ID }, true);
        public static Index LEXEME_POS_LEXEME_ID_POS_CODE_KEY = createIndex("lexeme_pos_lexeme_id_pos_code_key", LexemePos.LEXEME_POS, new OrderField[] { LexemePos.LEXEME_POS.LEXEME_ID, LexemePos.LEXEME_POS.POS_CODE }, true);
        public static Index LEXEME_POS_PKEY = createIndex("lexeme_pos_pkey", LexemePos.LEXEME_POS, new OrderField[] { LexemePos.LEXEME_POS.ID }, true);
        public static Index LEXEME_REGISTER_LEXEME_ID_REGISTER_CODE_KEY = createIndex("lexeme_register_lexeme_id_register_code_key", LexemeRegister.LEXEME_REGISTER, new OrderField[] { LexemeRegister.LEXEME_REGISTER.LEXEME_ID, LexemeRegister.LEXEME_REGISTER.REGISTER_CODE }, true);
        public static Index LEXEME_REGISTER_PKEY = createIndex("lexeme_register_pkey", LexemeRegister.LEXEME_REGISTER, new OrderField[] { LexemeRegister.LEXEME_REGISTER.ID }, true);
        public static Index LEXEME_TYPE_PKEY = createIndex("lexeme_type_pkey", LexemeType.LEXEME_TYPE, new OrderField[] { LexemeType.LEXEME_TYPE.CODE }, true);
        public static Index LEXEME_TYPE_LABEL_CODE_LANG_TYPE_KEY = createIndex("lexeme_type_label_code_lang_type_key", LexemeTypeLabel.LEXEME_TYPE_LABEL, new OrderField[] { LexemeTypeLabel.LEXEME_TYPE_LABEL.CODE, LexemeTypeLabel.LEXEME_TYPE_LABEL.LANG, LexemeTypeLabel.LEXEME_TYPE_LABEL.TYPE }, true);
        public static Index MEANING_PKEY = createIndex("meaning_pkey", Meaning.MEANING, new OrderField[] { Meaning.MEANING.ID }, true);
        public static Index MEANING_DATASET_PKEY = createIndex("meaning_dataset_pkey", MeaningDataset.MEANING_DATASET, new OrderField[] { MeaningDataset.MEANING_DATASET.MEANING_ID, MeaningDataset.MEANING_DATASET.DATASET_CODE }, true);
        public static Index MEANING_DOMAIN_MEANING_ID_DOMAIN_CODE_DOMAIN_ORIGIN_KEY = createIndex("meaning_domain_meaning_id_domain_code_domain_origin_key", MeaningDomain.MEANING_DOMAIN, new OrderField[] { MeaningDomain.MEANING_DOMAIN.MEANING_ID, MeaningDomain.MEANING_DOMAIN.DOMAIN_CODE, MeaningDomain.MEANING_DOMAIN.DOMAIN_ORIGIN }, true);
        public static Index MEANING_DOMAIN_PKEY = createIndex("meaning_domain_pkey", MeaningDomain.MEANING_DOMAIN, new OrderField[] { MeaningDomain.MEANING_DOMAIN.ID }, true);
        public static Index MORPH_PKEY = createIndex("morph_pkey", Morph.MORPH, new OrderField[] { Morph.MORPH.CODE }, true);
        public static Index MORPH_LABEL_CODE_LANG_TYPE_KEY = createIndex("morph_label_code_lang_type_key", MorphLabel.MORPH_LABEL, new OrderField[] { MorphLabel.MORPH_LABEL.CODE, MorphLabel.MORPH_LABEL.LANG, MorphLabel.MORPH_LABEL.TYPE }, true);
        public static Index PARADIGM_PKEY = createIndex("paradigm_pkey", Paradigm.PARADIGM, new OrderField[] { Paradigm.PARADIGM.ID }, true);
        public static Index PARADIGM_WORD_ID_IDX = createIndex("paradigm_word_id_idx", Paradigm.PARADIGM, new OrderField[] { Paradigm.PARADIGM.WORD_ID }, false);
        public static Index POS_PKEY = createIndex("pos_pkey", Pos.POS, new OrderField[] { Pos.POS.CODE }, true);
        public static Index POS_LABEL_CODE_LANG_TYPE_KEY = createIndex("pos_label_code_lang_type_key", PosLabel.POS_LABEL, new OrderField[] { PosLabel.POS_LABEL.CODE, PosLabel.POS_LABEL.LANG, PosLabel.POS_LABEL.TYPE }, true);
        public static Index RECTION_LEXEME_ID_IDX = createIndex("rection_lexeme_id_idx", Rection.RECTION, new OrderField[] { Rection.RECTION.LEXEME_ID }, false);
        public static Index RECTION_PKEY = createIndex("rection_pkey", Rection.RECTION, new OrderField[] { Rection.RECTION.ID }, true);
        public static Index REGISTER_PKEY = createIndex("register_pkey", Register.REGISTER, new OrderField[] { Register.REGISTER.CODE }, true);
        public static Index REGISTER_LABEL_CODE_LANG_TYPE_KEY = createIndex("register_label_code_lang_type_key", RegisterLabel.REGISTER_LABEL, new OrderField[] { RegisterLabel.REGISTER_LABEL.CODE, RegisterLabel.REGISTER_LABEL.LANG, RegisterLabel.REGISTER_LABEL.TYPE }, true);
        public static Index USAGE_PKEY = createIndex("usage_pkey", Usage.USAGE, new OrderField[] { Usage.USAGE.ID }, true);
        public static Index USAGE_TRANSLATION_PKEY = createIndex("usage_translation_pkey", UsageTranslation.USAGE_TRANSLATION, new OrderField[] { UsageTranslation.USAGE_TRANSLATION.ID }, true);
        public static Index WORD_HOMONYM_NR_IDX = createIndex("word_homonym_nr_idx", Word.WORD, new OrderField[] { Word.WORD.HOMONYM_NR }, false);
        public static Index WORD_PKEY = createIndex("word_pkey", Word.WORD, new OrderField[] { Word.WORD.ID }, true);
    }
}
