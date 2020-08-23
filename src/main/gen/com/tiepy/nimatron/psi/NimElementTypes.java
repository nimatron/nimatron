// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.impl.*;

public interface NimElementTypes {

  IElementType ARRAY_CONSTR = new NimElementType("ARRAY_CONSTR");
  IElementType ASM_STMT = new NimElementType("ASM_STMT");
  IElementType BIND_STMT = new NimElementType("BIND_STMT");
  IElementType BLOCK_STMT = new NimElementType("BLOCK_STMT");
  IElementType BREAK_STMT = new NimElementType("BREAK_STMT");
  IElementType CASE_STMT = new NimElementType("CASE_STMT");
  IElementType CAST_EXPR = new NimElementType("CAST_EXPR");
  IElementType COLCOM = new NimElementType("COLCOM");
  IElementType COLON = new NimElementType("COLON");
  IElementType COLON_BODY = new NimElementType("COLON_BODY");
  IElementType COMMA = new NimElementType("COMMA");
  IElementType COMPLEX_OR_SIMPLE_STMT = new NimElementType("COMPLEX_OR_SIMPLE_STMT");
  IElementType COND_EXPR = new NimElementType("COND_EXPR");
  IElementType COND_STMT = new NimElementType("COND_STMT");
  IElementType CONSTANT = new NimElementType("CONSTANT");
  IElementType CONST_STMT = new NimElementType("CONST_STMT");
  IElementType CONTINUE_STMT = new NimElementType("CONTINUE_STMT");
  IElementType CONVERTER_STMT = new NimElementType("CONVERTER_STMT");
  IElementType DECL_COLON_EQUALS = new NimElementType("DECL_COLON_EQUALS");
  IElementType DEDENT = new NimElementType("DEDENT");
  IElementType DEFER_STMT = new NimElementType("DEFER_STMT");
  IElementType DISCARD_STMT = new NimElementType("DISCARD_STMT");
  IElementType DISTINCT_TYPE = new NimElementType("DISTINCT_TYPE");
  IElementType DO_BLOCK = new NimElementType("DO_BLOCK");
  IElementType ENUM_TYPE = new NimElementType("ENUM_TYPE");
  IElementType EXPORT_STMT = new NimElementType("EXPORT_STMT");
  IElementType EXPR = new NimElementType("EXPR");
  IElementType EXPRS = new NimElementType("EXPRS");
  IElementType EXPR_COLON_EQ_EXPR = new NimElementType("EXPR_COLON_EQ_EXPR");
  IElementType EXPR_COLON_EQ_EXPRS = new NimElementType("EXPR_COLON_EQ_EXPRS");
  IElementType EXPR_STMT = new NimElementType("EXPR_STMT");
  IElementType FOR_STMT = new NimElementType("FOR_STMT");
  IElementType FROM_STMT = new NimElementType("FROM_STMT");
  IElementType FUNC_STMT = new NimElementType("FUNC_STMT");
  IElementType GENERALIZED_LIT = new NimElementType("GENERALIZED_LIT");
  IElementType GENERIC_PARAM = new NimElementType("GENERIC_PARAM");
  IElementType GENERIC_PARAMS = new NimElementType("GENERIC_PARAMS");
  IElementType IDENT_COLON_EQUALS = new NimElementType("IDENT_COLON_EQUALS");
  IElementType IDENT_OR_LITERAL = new NimElementType("IDENT_OR_LITERAL");
  IElementType IDENT_VIS = new NimElementType("IDENT_VIS");
  IElementType IDENT_VIS_DOT = new NimElementType("IDENT_VIS_DOT");
  IElementType IDENT_WITH_PRAGMA = new NimElementType("IDENT_WITH_PRAGMA");
  IElementType IDENT_WITH_PRAGMA_DOT = new NimElementType("IDENT_WITH_PRAGMA_DOT");
  IElementType IF_EXPR = new NimElementType("IF_EXPR");
  IElementType IF_STMT = new NimElementType("IF_STMT");
  IElementType IMPORT_STMT = new NimElementType("IMPORT_STMT");
  IElementType INCLUDE_STMT = new NimElementType("INCLUDE_STMT");
  IElementType IND_EQ = new NimElementType("IND_EQ");
  IElementType INLINE_STMT = new NimElementType("INLINE_STMT");
  IElementType ITERATOR_STMT = new NimElementType("ITERATOR_STMT");
  IElementType ITERATOR_TYPE = new NimElementType("ITERATOR_TYPE");
  IElementType LITERAL = new NimElementType("LITERAL");
  IElementType MACRO_STMT = new NimElementType("MACRO_STMT");
  IElementType METHOD_STMT = new NimElementType("METHOD_STMT");
  IElementType MIXIN_STMT = new NimElementType("MIXIN_STMT");
  IElementType NAMED_ROUTINE = new NimElementType("NAMED_ROUTINE");
  IElementType OBJECT = new NimElementType("OBJECT");
  IElementType OBJECT_BRANCH = new NimElementType("OBJECT_BRANCH");
  IElementType OBJECT_BRANCHES = new NimElementType("OBJECT_BRANCHES");
  IElementType OBJECT_CASE = new NimElementType("OBJECT_CASE");
  IElementType OBJECT_PART = new NimElementType("OBJECT_PART");
  IElementType OBJECT_TYPE = new NimElementType("OBJECT_TYPE");
  IElementType OBJECT_WHEN = new NimElementType("OBJECT_WHEN");
  IElementType OF_BRANCH = new NimElementType("OF_BRANCH");
  IElementType OF_BRANCHES = new NimElementType("OF_BRANCHES");
  IElementType OPERATOR = new NimElementType("OPERATOR");
  IElementType OPT_IND = new NimElementType("OPT_IND");
  IElementType OPT_PAR = new NimElementType("OPT_PAR");
  IElementType OUT_TYPE = new NimElementType("OUT_TYPE");
  IElementType PAR = new NimElementType("PAR");
  IElementType PARAMS = new NimElementType("PARAMS");
  IElementType PARAMS_ARROW = new NimElementType("PARAMS_ARROW");
  IElementType PARAMS_COLON = new NimElementType("PARAMS_COLON");
  IElementType PATTERN = new NimElementType("PATTERN");
  IElementType POST_EXPR_BLOCKS = new NimElementType("POST_EXPR_BLOCKS");
  IElementType PRAGMA = new NimElementType("PRAGMA");
  IElementType PRAGMA_STMT = new NimElementType("PRAGMA_STMT");
  IElementType PREFIX_OPERATOR = new NimElementType("PREFIX_OPERATOR");
  IElementType PRIMARY = new NimElementType("PRIMARY");
  IElementType PRIMARY_SUFFIX = new NimElementType("PRIMARY_SUFFIX");
  IElementType PROC_STMT = new NimElementType("PROC_STMT");
  IElementType PROC_TYPE = new NimElementType("PROC_TYPE");
  IElementType PTR_TYPE = new NimElementType("PTR_TYPE");
  IElementType QUALIFIED_IDENT = new NimElementType("QUALIFIED_IDENT");
  IElementType RAISE_STMT = new NimElementType("RAISE_STMT");
  IElementType REF_TYPE = new NimElementType("REF_TYPE");
  IElementType RETURN_STMT = new NimElementType("RETURN_STMT");
  IElementType ROUTINE = new NimElementType("ROUTINE");
  IElementType SECTION = new NimElementType("SECTION");
  IElementType SEMICOLON = new NimElementType("SEMICOLON");
  IElementType SET_OR_TABLE_CONSTR = new NimElementType("SET_OR_TABLE_CONSTR");
  IElementType SHARED_TYPE = new NimElementType("SHARED_TYPE");
  IElementType SIMPLE_EXPR = new NimElementType("SIMPLE_EXPR");
  IElementType SIMPLE_STMT = new NimElementType("SIMPLE_STMT");
  IElementType STATIC_STMT = new NimElementType("STATIC_STMT");
  IElementType STMT = new NimElementType("STMT");
  IElementType SYMBOL = new NimElementType("SYMBOL");
  IElementType TEMPLATE_STMT = new NimElementType("TEMPLATE_STMT");
  IElementType TRY_EXPR = new NimElementType("TRY_EXPR");
  IElementType TRY_STMT = new NimElementType("TRY_STMT");
  IElementType TUPLE_TYPE = new NimElementType("TUPLE_TYPE");
  IElementType TYPE_CLASS = new NimElementType("TYPE_CLASS");
  IElementType TYPE_CLASS_PARAM = new NimElementType("TYPE_CLASS_PARAM");
  IElementType TYPE_DEF = new NimElementType("TYPE_DEF");
  IElementType TYPE_DEF_AUX = new NimElementType("TYPE_DEF_AUX");
  IElementType TYPE_DESC = new NimElementType("TYPE_DESC");
  IElementType TYPE_STMT = new NimElementType("TYPE_STMT");
  IElementType VARIABLE = new NimElementType("VARIABLE");
  IElementType VAR_STMT = new NimElementType("VAR_STMT");
  IElementType VAR_TUPLE = new NimElementType("VAR_TUPLE");
  IElementType VAR_TYPE = new NimElementType("VAR_TYPE");
  IElementType WHEN_EXPR = new NimElementType("WHEN_EXPR");
  IElementType WHEN_STMT = new NimElementType("WHEN_STMT");
  IElementType WHILE_STMT = new NimElementType("WHILE_STMT");
  IElementType YIELD_STMT = new NimElementType("YIELD_STMT");

  IElementType BOOL_LIT = new NimTokenType("BOOL_LIT");
  IElementType CHAR_LIT = new NimTokenType("CHAR_LIT");
  IElementType COMMENT = new NimTokenType("COMMENT");
  IElementType DEDENT0 = new NimTokenType("DEDENT0");
  IElementType DEDENTX = new NimTokenType("DEDENTX");
  IElementType GENERALIZED_STR_LIT = new NimTokenType("GENERALIZED_STR_LIT");
  IElementType IDENT = new NimTokenType("IDENT");
  IElementType INDENT = new NimTokenType("INDENT");
  IElementType IND_EQ0 = new NimTokenType("IND_EQ0");
  IElementType IND_EQX = new NimTokenType("IND_EQX");
  IElementType KEYW = new NimTokenType("KEYW");
  IElementType NOTATION = new NimTokenType("NOTATION");
  IElementType NUM_LIT = new NimTokenType("NUM_LIT");
  IElementType OP0 = new NimTokenType("OP0");
  IElementType OP1 = new NimTokenType("OP1");
  IElementType OP10 = new NimTokenType("OP10");
  IElementType OP2 = new NimTokenType("OP2");
  IElementType OP3 = new NimTokenType("OP3");
  IElementType OP4 = new NimTokenType("OP4");
  IElementType OP5 = new NimTokenType("OP5");
  IElementType OP6 = new NimTokenType("OP6");
  IElementType OP7 = new NimTokenType("OP7");
  IElementType OP8 = new NimTokenType("OP8");
  IElementType OP9 = new NimTokenType("OP9");
  IElementType OPR = new NimTokenType("OPR");
  IElementType STR_LIT = new NimTokenType("STR_LIT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_CONSTR) {
        return new NimArrayConstrImpl(node);
      }
      else if (type == ASM_STMT) {
        return new NimAsmStmtImpl(node);
      }
      else if (type == BIND_STMT) {
        return new NimBindStmtImpl(node);
      }
      else if (type == BLOCK_STMT) {
        return new NimBlockStmtImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new NimBreakStmtImpl(node);
      }
      else if (type == CASE_STMT) {
        return new NimCaseStmtImpl(node);
      }
      else if (type == CAST_EXPR) {
        return new NimCastExprImpl(node);
      }
      else if (type == COLCOM) {
        return new NimColcomImpl(node);
      }
      else if (type == COLON) {
        return new NimColonImpl(node);
      }
      else if (type == COLON_BODY) {
        return new NimColonBodyImpl(node);
      }
      else if (type == COMMA) {
        return new NimCommaImpl(node);
      }
      else if (type == COMPLEX_OR_SIMPLE_STMT) {
        return new NimComplexOrSimpleStmtImpl(node);
      }
      else if (type == COND_EXPR) {
        return new NimCondExprImpl(node);
      }
      else if (type == COND_STMT) {
        return new NimCondStmtImpl(node);
      }
      else if (type == CONSTANT) {
        return new NimConstantImpl(node);
      }
      else if (type == CONST_STMT) {
        return new NimConstStmtImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new NimContinueStmtImpl(node);
      }
      else if (type == CONVERTER_STMT) {
        return new NimConverterStmtImpl(node);
      }
      else if (type == DECL_COLON_EQUALS) {
        return new NimDeclColonEqualsImpl(node);
      }
      else if (type == DEDENT) {
        return new NimDedentImpl(node);
      }
      else if (type == DEFER_STMT) {
        return new NimDeferStmtImpl(node);
      }
      else if (type == DISCARD_STMT) {
        return new NimDiscardStmtImpl(node);
      }
      else if (type == DISTINCT_TYPE) {
        return new NimDistinctTypeImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new NimDoBlockImpl(node);
      }
      else if (type == ENUM_TYPE) {
        return new NimEnumTypeImpl(node);
      }
      else if (type == EXPORT_STMT) {
        return new NimExportStmtImpl(node);
      }
      else if (type == EXPR) {
        return new NimExprImpl(node);
      }
      else if (type == EXPRS) {
        return new NimExprsImpl(node);
      }
      else if (type == EXPR_COLON_EQ_EXPR) {
        return new NimExprColonEqExprImpl(node);
      }
      else if (type == EXPR_COLON_EQ_EXPRS) {
        return new NimExprColonEqExprsImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new NimExprStmtImpl(node);
      }
      else if (type == FOR_STMT) {
        return new NimForStmtImpl(node);
      }
      else if (type == FROM_STMT) {
        return new NimFromStmtImpl(node);
      }
      else if (type == FUNC_STMT) {
        return new NimFuncStmtImpl(node);
      }
      else if (type == GENERALIZED_LIT) {
        return new NimGeneralizedLitImpl(node);
      }
      else if (type == GENERIC_PARAM) {
        return new NimGenericParamImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new NimGenericParamsImpl(node);
      }
      else if (type == IDENT_COLON_EQUALS) {
        return new NimIdentColonEqualsImpl(node);
      }
      else if (type == IDENT_OR_LITERAL) {
        return new NimIdentOrLiteralImpl(node);
      }
      else if (type == IDENT_VIS) {
        return new NimIdentVisImpl(node);
      }
      else if (type == IDENT_VIS_DOT) {
        return new NimIdentVisDotImpl(node);
      }
      else if (type == IDENT_WITH_PRAGMA) {
        return new NimIdentWithPragmaImpl(node);
      }
      else if (type == IDENT_WITH_PRAGMA_DOT) {
        return new NimIdentWithPragmaDotImpl(node);
      }
      else if (type == IF_EXPR) {
        return new NimIfExprImpl(node);
      }
      else if (type == IF_STMT) {
        return new NimIfStmtImpl(node);
      }
      else if (type == IMPORT_STMT) {
        return new NimImportStmtImpl(node);
      }
      else if (type == INCLUDE_STMT) {
        return new NimIncludeStmtImpl(node);
      }
      else if (type == IND_EQ) {
        return new NimIndEqImpl(node);
      }
      else if (type == INLINE_STMT) {
        return new NimInlineStmtImpl(node);
      }
      else if (type == ITERATOR_STMT) {
        return new NimIteratorStmtImpl(node);
      }
      else if (type == ITERATOR_TYPE) {
        return new NimIteratorTypeImpl(node);
      }
      else if (type == LITERAL) {
        return new NimLiteralImpl(node);
      }
      else if (type == MACRO_STMT) {
        return new NimMacroStmtImpl(node);
      }
      else if (type == METHOD_STMT) {
        return new NimMethodStmtImpl(node);
      }
      else if (type == MIXIN_STMT) {
        return new NimMixinStmtImpl(node);
      }
      else if (type == NAMED_ROUTINE) {
        return new NimNamedRoutineImpl(node);
      }
      else if (type == OBJECT) {
        return new NimObjectImpl(node);
      }
      else if (type == OBJECT_BRANCH) {
        return new NimObjectBranchImpl(node);
      }
      else if (type == OBJECT_BRANCHES) {
        return new NimObjectBranchesImpl(node);
      }
      else if (type == OBJECT_CASE) {
        return new NimObjectCaseImpl(node);
      }
      else if (type == OBJECT_PART) {
        return new NimObjectPartImpl(node);
      }
      else if (type == OBJECT_TYPE) {
        return new NimObjectTypeImpl(node);
      }
      else if (type == OBJECT_WHEN) {
        return new NimObjectWhenImpl(node);
      }
      else if (type == OF_BRANCH) {
        return new NimOfBranchImpl(node);
      }
      else if (type == OF_BRANCHES) {
        return new NimOfBranchesImpl(node);
      }
      else if (type == OPERATOR) {
        return new NimOperatorImpl(node);
      }
      else if (type == OPT_IND) {
        return new NimOptIndImpl(node);
      }
      else if (type == OPT_PAR) {
        return new NimOptParImpl(node);
      }
      else if (type == OUT_TYPE) {
        return new NimOutTypeImpl(node);
      }
      else if (type == PAR) {
        return new NimParImpl(node);
      }
      else if (type == PARAMS) {
        return new NimParamsImpl(node);
      }
      else if (type == PARAMS_ARROW) {
        return new NimParamsArrowImpl(node);
      }
      else if (type == PARAMS_COLON) {
        return new NimParamsColonImpl(node);
      }
      else if (type == PATTERN) {
        return new NimPatternImpl(node);
      }
      else if (type == POST_EXPR_BLOCKS) {
        return new NimPostExprBlocksImpl(node);
      }
      else if (type == PRAGMA) {
        return new NimPragmaImpl(node);
      }
      else if (type == PRAGMA_STMT) {
        return new NimPragmaStmtImpl(node);
      }
      else if (type == PREFIX_OPERATOR) {
        return new NimPrefixOperatorImpl(node);
      }
      else if (type == PRIMARY) {
        return new NimPrimaryImpl(node);
      }
      else if (type == PRIMARY_SUFFIX) {
        return new NimPrimarySuffixImpl(node);
      }
      else if (type == PROC_STMT) {
        return new NimProcStmtImpl(node);
      }
      else if (type == PROC_TYPE) {
        return new NimProcTypeImpl(node);
      }
      else if (type == PTR_TYPE) {
        return new NimPtrTypeImpl(node);
      }
      else if (type == QUALIFIED_IDENT) {
        return new NimQualifiedIdentImpl(node);
      }
      else if (type == RAISE_STMT) {
        return new NimRaiseStmtImpl(node);
      }
      else if (type == REF_TYPE) {
        return new NimRefTypeImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new NimReturnStmtImpl(node);
      }
      else if (type == ROUTINE) {
        return new NimRoutineImpl(node);
      }
      else if (type == SECTION) {
        return new NimSectionImpl(node);
      }
      else if (type == SEMICOLON) {
        return new NimSemicolonImpl(node);
      }
      else if (type == SET_OR_TABLE_CONSTR) {
        return new NimSetOrTableConstrImpl(node);
      }
      else if (type == SHARED_TYPE) {
        return new NimSharedTypeImpl(node);
      }
      else if (type == SIMPLE_EXPR) {
        return new NimSimpleExprImpl(node);
      }
      else if (type == SIMPLE_STMT) {
        return new NimSimpleStmtImpl(node);
      }
      else if (type == STATIC_STMT) {
        return new NimStaticStmtImpl(node);
      }
      else if (type == STMT) {
        return new NimStmtImpl(node);
      }
      else if (type == SYMBOL) {
        return new NimSymbolImpl(node);
      }
      else if (type == TEMPLATE_STMT) {
        return new NimTemplateStmtImpl(node);
      }
      else if (type == TRY_EXPR) {
        return new NimTryExprImpl(node);
      }
      else if (type == TRY_STMT) {
        return new NimTryStmtImpl(node);
      }
      else if (type == TUPLE_TYPE) {
        return new NimTupleTypeImpl(node);
      }
      else if (type == TYPE_CLASS) {
        return new NimTypeClassImpl(node);
      }
      else if (type == TYPE_CLASS_PARAM) {
        return new NimTypeClassParamImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new NimTypeDefImpl(node);
      }
      else if (type == TYPE_DEF_AUX) {
        return new NimTypeDefAuxImpl(node);
      }
      else if (type == TYPE_DESC) {
        return new NimTypeDescImpl(node);
      }
      else if (type == TYPE_STMT) {
        return new NimTypeStmtImpl(node);
      }
      else if (type == VARIABLE) {
        return new NimVariableImpl(node);
      }
      else if (type == VAR_STMT) {
        return new NimVarStmtImpl(node);
      }
      else if (type == VAR_TUPLE) {
        return new NimVarTupleImpl(node);
      }
      else if (type == VAR_TYPE) {
        return new NimVarTypeImpl(node);
      }
      else if (type == WHEN_EXPR) {
        return new NimWhenExprImpl(node);
      }
      else if (type == WHEN_STMT) {
        return new NimWhenStmtImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new NimWhileStmtImpl(node);
      }
      else if (type == YIELD_STMT) {
        return new NimYieldStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
