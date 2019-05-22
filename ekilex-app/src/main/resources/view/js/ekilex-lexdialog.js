$(document).on("change", "select.lex-def-dataset-select[name='dataset']", function() {
	var datasetCode = $(this).val();
	var localForm = $(this).closest("form");
	var permLanguageSelect = localForm.find("select[name=language]")
	if (datasetCode) {
		var getLanguageSelectUrl = applicationUrl + "comp/lexdeflangselect/" + datasetCode;
		$.get(getLanguageSelectUrl).done(function(data) {
			permLanguageSelect.replaceWith(data);
		}).fail(function(data) {
			console.log(data);
			alert('Viga!');
		});
	} else {
		permLanguageSelect.empty();
	}
});

//addLexemeDataDlg_ select
$(document).on("change", "select.lex-data-select[name='opCode']", function() {
	var opCode = $(this).val();
	var localForm = $(this).closest("form");
	localForm.find(".value-group").hide();
	var lexemeId = localForm.find("[name=id]").val();
	var dlgElemId = "#" + opCode + '_' + lexemeId;
	if (opCode.endsWith('Dlg')) {
		$(dlgElemId).modal("show");
		$("#addLexemeDataDlg_" + lexemeId).modal("hide");
	} else {
		$(dlgElemId).show();
	}
});

//addWordDataDlg_ select
$(document).on("change", "select.word-data-select[name='opCode']", function() {
	var opCode = $(this).val();
	var localForm = $(this).closest("form");
	localForm.find(".value-group").hide();
	var wordId = localForm.find("[name=id3]").val();
	var dlgElemId = "#" + opCode + '_' + wordId;
	$(dlgElemId).show();
});

$(document).on("show.bs.modal", "[id^=addWordDataDlg_]", function() {
	initAddMultiDataDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addGovernmentDlg_]", function() {
	initGenericTextAddDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editGovernmentDlg_]", function() {
	initGenericTextEditDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addUsageAuthorDlg_]", function() {
	initUsageAuthorDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addUsageMemberDlg_]", function() {
	initUsageMemberDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editUsageTranslationDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editUsageDefinitionDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=addWordRelationDlg_]", function() {
	initAddWordRelationDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addWordProcessLogDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editWordAspectDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeLevelsDlg_]", function() {
	initLexemeLevelsDlg($(this));
});
