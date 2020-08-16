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
  IElementType COLON_BODY = new NimElementType("COLON_BODY");
  IElementType COND_EXPR = new NimElementType("COND_EXPR");
  IElementType COND_STMT = new NimElementType("COND_STMT");
  IElementType CONSTANT = new NimElementType("CONSTANT");
  IElementType CONST_STMT = new NimElementType("CONST_STMT");
  IElementType CONTINUE_STMT = new NimElementType("CONTINUE_STMT");
  IElementType CONVERTER_STMT = new NimElementType("CONVERTER_STMT");
  IElementType DECL_COLON_EQUALS = new NimElementType("DECL_COLON_EQUALS");
  IElementType DEFER_STMT = new NimElementType("DEFER_STMT");
  IElementType DISCARD_STMT = new NimElementType("DISCARD_STMT");
  IElementType DO_BLOCK = new NimElementType("DO_BLOCK");
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
  IElementType IDENT_VIS_DOT = new NimElementType("IDENT_VIS_DOT");
  IElementType IDENT_WITH_PRAGMA = new NimElementType("IDENT_WITH_PRAGMA");
  IElementType IDENT_WITH_PRAGMA_DOT = new NimElementType("IDENT_WITH_PRAGMA_DOT");
  IElementType IF_EXPR = new NimElementType("IF_EXPR");
  IElementType IF_STMT = new NimElementType("IF_STMT");
  IElementType IMPORT_STMT = new NimElementType("IMPORT_STMT");
  IElementType INCLUDE_STMT = new NimElementType("INCLUDE_STMT");
  IElementType ITERATOR_STMT = new NimElementType("ITERATOR_STMT");
  IElementType LITERAL = new NimElementType("LITERAL");
  IElementType MACRO_STMT = new NimElementType("MACRO_STMT");
  IElementType METHOD_STMT = new NimElementType("METHOD_STMT");
  IElementType MIXIN_STMT = new NimElementType("MIXIN_STMT");
  IElementType NAMED_ROUTINE = new NimElementType("NAMED_ROUTINE");
  IElementType OF_BRANCH = new NimElementType("OF_BRANCH");
  IElementType OF_BRANCHES = new NimElementType("OF_BRANCHES");
  IElementType OPERATOR = new NimElementType("OPERATOR");
  IElementType OPT_IND = new NimElementType("OPT_IND");
  IElementType PAR = new NimElementType("PAR");
  IElementType PARAMS = new NimElementType("PARAMS");
  IElementType PARAMS_ARROW = new NimElementType("PARAMS_ARROW");
  IElementType PARAMS_COLON = new NimElementType("PARAMS_COLON");
  IElementType PAR_KEYW = new NimElementType("PAR_KEYW");
  IElementType PATTERN = new NimElementType("PATTERN");
  IElementType POST_EXPR_BLOCKS = new NimElementType("POST_EXPR_BLOCKS");
  IElementType PRAGMA = new NimElementType("PRAGMA");
  IElementType PRAGMA_STMT = new NimElementType("PRAGMA_STMT");
  IElementType PRIMARY = new NimElementType("PRIMARY");
  IElementType PRIMARY_SUFFIX = new NimElementType("PRIMARY_SUFFIX");
  IElementType PROC_STMT = new NimElementType("PROC_STMT");
  IElementType QUALIFIED_IDENT = new NimElementType("QUALIFIED_IDENT");
  IElementType RAISE_STMT = new NimElementType("RAISE_STMT");
  IElementType RETURN_STMT = new NimElementType("RETURN_STMT");
  IElementType ROUTINE = new NimElementType("ROUTINE");
  IElementType SET_OR_TABLE_CONSTR = new NimElementType("SET_OR_TABLE_CONSTR");
  IElementType SIMPLE_EXPR = new NimElementType("SIMPLE_EXPR");
  IElementType SIMPLE_STMT = new NimElementType("SIMPLE_STMT");
  IElementType STATIC_STMT = new NimElementType("STATIC_STMT");
  IElementType STMT = new NimElementType("STMT");
  IElementType STMTS = new NimElementType("STMTS");
  IElementType SYMBOL = new NimElementType("SYMBOL");
  IElementType TEMPLATE_STMT = new NimElementType("TEMPLATE_STMT");
  IElementType TRY_EXPR = new NimElementType("TRY_EXPR");
  IElementType TRY_STMT = new NimElementType("TRY_STMT");
  IElementType TYPE_CLASS = new NimElementType("TYPE_CLASS");
  IElementType TYPE_CLASS_PARAM = new NimElementType("TYPE_CLASS_PARAM");
  IElementType TYPE_DEF = new NimElementType("TYPE_DEF");
  IElementType TYPE_DEF_1 = new NimElementType("TYPE_DEF_1");
  IElementType TYPE_DEF_2 = new NimElementType("TYPE_DEF_2");
  IElementType TYPE_DEF_AUX = new NimElementType("TYPE_DEF_AUX");
  IElementType TYPE_DESC = new NimElementType("TYPE_DESC");
  IElementType TYPE_KEYW = new NimElementType("TYPE_KEYW");
  IElementType TYPE_STMT = new NimElementType("TYPE_STMT");
  IElementType VARIABLE = new NimElementType("VARIABLE");
  IElementType VAR_STMT = new NimElementType("VAR_STMT");
  IElementType VAR_TUPLE = new NimElementType("VAR_TUPLE");
  IElementType WHEN_EXPR = new NimElementType("WHEN_EXPR");
  IElementType WHEN_STMT = new NimElementType("WHEN_STMT");
  IElementType WHILE_STMT = new NimElementType("WHILE_STMT");
  IElementType YIELD_STMT = new NimElementType("YIELD_STMT");

  IElementType BOOL_LIT = new NimTokenType("BOOL_LIT");
  IElementType BRACKET = new NimTokenType("BRACKET");
  IElementType CHAR_LIT = new NimTokenType("CHAR_LIT");
  IElementType COMMENT = new NimTokenType("COMMENT");
  IElementType C_COMMA = new NimTokenType("C_COMMA");
  IElementType C_GRAVE_ACCENT = new NimTokenType("C_GRAVE_ACCENT");
  IElementType C_SEMICOLON = new NimTokenType("C_SEMICOLON");
  IElementType DEDENT = new NimTokenType("DEDENT");
  IElementType FLOAT32_LIT = new NimTokenType("FLOAT32_LIT");
  IElementType FLOAT64_LIT = new NimTokenType("FLOAT64_LIT");
  IElementType FLOAT_LIT = new NimTokenType("FLOAT_LIT");
  IElementType GENERALIZED_STR_LIT = new NimTokenType("GENERALIZED_STR_LIT");
  IElementType GENERALIZED_TRIPLESTR_LIT = new NimTokenType("GENERALIZED_TRIPLESTR_LIT");
  IElementType IDENT = new NimTokenType("IDENT");
  IElementType INDENT = new NimTokenType("INDENT");
  IElementType IND_EQ = new NimTokenType("IND_EQ");
  IElementType INT16_LIT = new NimTokenType("INT16_LIT");
  IElementType INT32_LIT = new NimTokenType("INT32_LIT");
  IElementType INT64_LIT = new NimTokenType("INT64_LIT");
  IElementType INT8_LIT = new NimTokenType("INT8_LIT");
  IElementType INT_LIT = new NimTokenType("INT_LIT");
  IElementType KEYW = new NimTokenType("KEYW");
  IElementType NIL = new NimTokenType("NIL");
  IElementType OP0A = new NimTokenType("OP0A");
  IElementType OP0B = new NimTokenType("OP0B");
  IElementType OP0C = new NimTokenType("OP0C");
  IElementType OP10A = new NimTokenType("OP10A");
  IElementType OP10B = new NimTokenType("OP10B");
  IElementType OP1A = new NimTokenType("OP1A");
  IElementType OP1B = new NimTokenType("OP1B");
  IElementType OP1C = new NimTokenType("OP1C");
  IElementType OP1D = new NimTokenType("OP1D");
  IElementType OP2A = new NimTokenType("OP2A");
  IElementType OP2B = new NimTokenType("OP2B");
  IElementType OP2C = new NimTokenType("OP2C");
  IElementType OP3A = new NimTokenType("OP3A");
  IElementType OP3B = new NimTokenType("OP3B");
  IElementType OP4A = new NimTokenType("OP4A");
  IElementType OP5A = new NimTokenType("OP5A");
  IElementType OP5B = new NimTokenType("OP5B");
  IElementType OP5C = new NimTokenType("OP5C");
  IElementType OP5D = new NimTokenType("OP5D");
  IElementType OP5E = new NimTokenType("OP5E");
  IElementType OP5F = new NimTokenType("OP5F");
  IElementType OP5G = new NimTokenType("OP5G");
  IElementType OP5H = new NimTokenType("OP5H");
  IElementType OP5I = new NimTokenType("OP5I");
  IElementType OP5J = new NimTokenType("OP5J");
  IElementType OP5K = new NimTokenType("OP5K");
  IElementType OP5L = new NimTokenType("OP5L");
  IElementType OP5M = new NimTokenType("OP5M");
  IElementType OP6A = new NimTokenType("OP6A");
  IElementType OP7A = new NimTokenType("OP7A");
  IElementType OP8A = new NimTokenType("OP8A");
  IElementType OP8B = new NimTokenType("OP8B");
  IElementType OP9A = new NimTokenType("OP9A");
  IElementType OP9B = new NimTokenType("OP9B");
  IElementType OP9C = new NimTokenType("OP9C");
  IElementType OP9D = new NimTokenType("OP9D");
  IElementType OP9E = new NimTokenType("OP9E");
  IElementType OP9F = new NimTokenType("OP9F");
  IElementType OP9G = new NimTokenType("OP9G");
  IElementType OPR = new NimTokenType("OPR");
  IElementType PARENTHESIS = new NimTokenType("PARENTHESIS");
  IElementType RSTR_LIT = new NimTokenType("RSTR_LIT");
  IElementType STR_LIT = new NimTokenType("STR_LIT");
  IElementType TRIPLESTR_LIT = new NimTokenType("TRIPLESTR_LIT");
  IElementType UINT16_LIT = new NimTokenType("UINT16_LIT");
  IElementType UINT32_LIT = new NimTokenType("UINT32_LIT");
  IElementType UINT64_LIT = new NimTokenType("UINT64_LIT");
  IElementType UINT8_LIT = new NimTokenType("UINT8_LIT");
  IElementType UINT_LIT = new NimTokenType("UINT_LIT");

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
      else if (type == COLON_BODY) {
        return new NimColonBodyImpl(node);
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
      else if (type == DEFER_STMT) {
        return new NimDeferStmtImpl(node);
      }
      else if (type == DISCARD_STMT) {
        return new NimDiscardStmtImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new NimDoBlockImpl(node);
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
      else if (type == ITERATOR_STMT) {
        return new NimIteratorStmtImpl(node);
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
      else if (type == PAR_KEYW) {
        return new NimParKeywImpl(node);
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
      else if (type == PRIMARY) {
        return new NimPrimaryImpl(node);
      }
      else if (type == PRIMARY_SUFFIX) {
        return new NimPrimarySuffixImpl(node);
      }
      else if (type == PROC_STMT) {
        return new NimProcStmtImpl(node);
      }
      else if (type == QUALIFIED_IDENT) {
        return new NimQualifiedIdentImpl(node);
      }
      else if (type == RAISE_STMT) {
        return new NimRaiseStmtImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new NimReturnStmtImpl(node);
      }
      else if (type == ROUTINE) {
        return new NimRoutineImpl(node);
      }
      else if (type == SET_OR_TABLE_CONSTR) {
        return new NimSetOrTableConstrImpl(node);
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
      else if (type == STMTS) {
        return new NimStmtsImpl(node);
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
      else if (type == TYPE_CLASS) {
        return new NimTypeClassImpl(node);
      }
      else if (type == TYPE_CLASS_PARAM) {
        return new NimTypeClassParamImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new NimTypeDefImpl(node);
      }
      else if (type == TYPE_DEF_1) {
        return new NimTypeDef1Impl(node);
      }
      else if (type == TYPE_DEF_2) {
        return new NimTypeDef2Impl(node);
      }
      else if (type == TYPE_DEF_AUX) {
        return new NimTypeDefAuxImpl(node);
      }
      else if (type == TYPE_DESC) {
        return new NimTypeDescImpl(node);
      }
      else if (type == TYPE_KEYW) {
        return new NimTypeKeywImpl(node);
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
