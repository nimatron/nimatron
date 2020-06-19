// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.NimElementType;
import com.tiepy.nimatron.psi.NimTokenType;
import com.tiepy.nimatron.parser.impl.*;

public interface NimTypes {

  IElementType AMP_EXPR = new NimElementType("AMP_EXPR");
  IElementType AND_EXPR = new NimElementType("AND_EXPR");
  IElementType ARRAY_CONSTR = new NimElementType("ARRAY_CONSTR");
  IElementType ARROW_EXPR = new NimElementType("ARROW_EXPR");
  IElementType ASM_STMT = new NimElementType("ASM_STMT");
  IElementType ASSIGN_EXPR = new NimElementType("ASSIGN_EXPR");
  IElementType BIND_STMT = new NimElementType("BIND_STMT");
  IElementType BLOCK_EXPR = new NimElementType("BLOCK_EXPR");
  IElementType BLOCK_STMT = new NimElementType("BLOCK_STMT");
  IElementType BREAK_STMT = new NimElementType("BREAK_STMT");
  IElementType CASE_STMT = new NimElementType("CASE_STMT");
  IElementType CAST_EXPR = new NimElementType("CAST_EXPR");
  IElementType CMP_EXPR = new NimElementType("CMP_EXPR");
  IElementType COLON_BODY = new NimElementType("COLON_BODY");
  IElementType COMPLEX_OR_SIMPLE_STMT = new NimElementType("COMPLEX_OR_SIMPLE_STMT");
  IElementType COND_EXPR = new NimElementType("COND_EXPR");
  IElementType COND_STMT = new NimElementType("COND_STMT");
  IElementType CONSTANT = new NimElementType("CONSTANT");
  IElementType CONTINUE_STMT = new NimElementType("CONTINUE_STMT");
  IElementType DECL_COLON_EQUALS = new NimElementType("DECL_COLON_EQUALS");
  IElementType DEFER_STMT = new NimElementType("DEFER_STMT");
  IElementType DISCARD_STMT = new NimElementType("DISCARD_STMT");
  IElementType DOLLAR_EXPR = new NimElementType("DOLLAR_EXPR");
  IElementType DO_BLOCK = new NimElementType("DO_BLOCK");
  IElementType EXPORT_STMT = new NimElementType("EXPORT_STMT");
  IElementType EXPR = new NimElementType("EXPR");
  IElementType EXPR_COLON_EQ_EXPR = new NimElementType("EXPR_COLON_EQ_EXPR");
  IElementType EXPR_COLON_EQ_EXPR_LIST_2 = new NimElementType("EXPR_COLON_EQ_EXPR_LIST_2");
  IElementType EXPR_LIST = new NimElementType("EXPR_LIST");
  IElementType EXPR_STMT = new NimElementType("EXPR_STMT");
  IElementType FOR_EXPR = new NimElementType("FOR_EXPR");
  IElementType FOR_STMT = new NimElementType("FOR_STMT");
  IElementType FROM_STMT = new NimElementType("FROM_STMT");
  IElementType GENERALIZED_LIT = new NimElementType("GENERALIZED_LIT");
  IElementType GENERIC_PARAM = new NimElementType("GENERIC_PARAM");
  IElementType GENERIC_PARAM_LIST = new NimElementType("GENERIC_PARAM_LIST");
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
  IElementType LITERAL = new NimElementType("LITERAL");
  IElementType MIXIN_STMT = new NimElementType("MIXIN_STMT");
  IElementType MUL_EXPR = new NimElementType("MUL_EXPR");
  IElementType OF_BRANCH = new NimElementType("OF_BRANCH");
  IElementType OF_BRANCHES = new NimElementType("OF_BRANCHES");
  IElementType OPERATOR = new NimElementType("OPERATOR");
  IElementType OPT_IND = new NimElementType("OPT_IND");
  IElementType OPT_PAR = new NimElementType("OPT_PAR");
  IElementType OR_EXPR = new NimElementType("OR_EXPR");
  IElementType PAR = new NimElementType("PAR");
  IElementType PARAM_LIST = new NimElementType("PARAM_LIST");
  IElementType PARAM_LIST_ARROW = new NimElementType("PARAM_LIST_ARROW");
  IElementType PARAM_LIST_COLON = new NimElementType("PARAM_LIST_COLON");
  IElementType PATTERN = new NimElementType("PATTERN");
  IElementType PLUS_EXPR = new NimElementType("PLUS_EXPR");
  IElementType POST_EXPR_BLOCKS = new NimElementType("POST_EXPR_BLOCKS");
  IElementType PRAGMA = new NimElementType("PRAGMA");
  IElementType PRAGMA_STMT = new NimElementType("PRAGMA_STMT");
  IElementType PREFIX_OPERATOR = new NimElementType("PREFIX_OPERATOR");
  IElementType PRIMARY = new NimElementType("PRIMARY");
  IElementType PRIMARY_SUFFIX = new NimElementType("PRIMARY_SUFFIX");
  IElementType QUALIFIED_IDENT = new NimElementType("QUALIFIED_IDENT");
  IElementType RAISE_STMT = new NimElementType("RAISE_STMT");
  IElementType RETURN_STMT = new NimElementType("RETURN_STMT");
  IElementType ROUTINE = new NimElementType("ROUTINE");
  IElementType SET_OR_TABLE_CONSTR = new NimElementType("SET_OR_TABLE_CONSTR");
  IElementType SIMPLE_EXPR = new NimElementType("SIMPLE_EXPR");
  IElementType SIMPLE_STMT = new NimElementType("SIMPLE_STMT");
  IElementType SLICE_EXPR = new NimElementType("SLICE_EXPR");
  IElementType STATIC_STMT = new NimElementType("STATIC_STMT");
  IElementType STMT = new NimElementType("STMT");
  IElementType SYMBOL = new NimElementType("SYMBOL");
  IElementType TRY_EXPR = new NimElementType("TRY_EXPR");
  IElementType TRY_STMT = new NimElementType("TRY_STMT");
  IElementType TYPE_CLASS = new NimElementType("TYPE_CLASS");
  IElementType TYPE_CLASS_PARAM = new NimElementType("TYPE_CLASS_PARAM");
  IElementType TYPE_DEF = new NimElementType("TYPE_DEF");
  IElementType TYPE_DEF_AUX = new NimElementType("TYPE_DEF_AUX");
  IElementType TYPE_DESC = new NimElementType("TYPE_DESC");
  IElementType TYPE_KEYW = new NimElementType("TYPE_KEYW");
  IElementType VARIABLE = new NimElementType("VARIABLE");
  IElementType VAR_TUPLE = new NimElementType("VAR_TUPLE");
  IElementType WHEN_EXPR = new NimElementType("WHEN_EXPR");
  IElementType WHEN_STMT = new NimElementType("WHEN_STMT");
  IElementType WHILE_STMT = new NimElementType("WHILE_STMT");
  IElementType YIELD_STMT = new NimElementType("YIELD_STMT");

  IElementType BRACKET = new NimTokenType("BRACKET");
  IElementType CHAR_LIT = new NimTokenType("CHAR_LIT");
  IElementType C_COMMA = new NimTokenType("C_COMMA");
  IElementType C_GRAVE_ACCENT = new NimTokenType("C_GRAVE_ACCENT");
  IElementType C_SEMICOLON = new NimTokenType("C_SEMICOLON");
  IElementType FLOAT32_LIT = new NimTokenType("FLOAT32_LIT");
  IElementType FLOAT64_LIT = new NimTokenType("FLOAT64_LIT");
  IElementType FLOAT_LIT = new NimTokenType("FLOAT_LIT");
  IElementType GENERALIZED_STR_LIT = new NimTokenType("GENERALIZED_STR_LIT");
  IElementType GENERALIZED_TRIPLESTR_LIT = new NimTokenType("GENERALIZED_TRIPLESTR_LIT");
  IElementType IDENT = new NimTokenType("IDENT");
  IElementType IND_EQ = new NimTokenType("IND_EQ");
  IElementType IND_GT = new NimTokenType("IND_GT");
  IElementType IND_LT = new NimTokenType("IND_LT");
  IElementType INT16_LIT = new NimTokenType("INT16_LIT");
  IElementType INT32_LIT = new NimTokenType("INT32_LIT");
  IElementType INT64_LIT = new NimTokenType("INT64_LIT");
  IElementType INT8_LIT = new NimTokenType("INT8_LIT");
  IElementType INT_LIT = new NimTokenType("INT_LIT");
  IElementType KEYW = new NimTokenType("KEYW");
  IElementType NIL = new NimTokenType("NIL");
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
      if (type == AMP_EXPR) {
        return new NimAmpExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new NimAndExprImpl(node);
      }
      else if (type == ARRAY_CONSTR) {
        return new NimArrayConstrImpl(node);
      }
      else if (type == ARROW_EXPR) {
        return new NimArrowExprImpl(node);
      }
      else if (type == ASM_STMT) {
        return new NimAsmStmtImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new NimAssignExprImpl(node);
      }
      else if (type == BIND_STMT) {
        return new NimBindStmtImpl(node);
      }
      else if (type == BLOCK_EXPR) {
        return new NimBlockExprImpl(node);
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
      else if (type == CMP_EXPR) {
        return new NimCmpExprImpl(node);
      }
      else if (type == COLON_BODY) {
        return new NimColonBodyImpl(node);
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
      else if (type == CONTINUE_STMT) {
        return new NimContinueStmtImpl(node);
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
      else if (type == DOLLAR_EXPR) {
        return new NimDollarExprImpl(node);
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
      else if (type == EXPR_COLON_EQ_EXPR) {
        return new NimExprColonEqExprImpl(node);
      }
      else if (type == EXPR_COLON_EQ_EXPR_LIST_2) {
        return new NimExprColonEqExprList2Impl(node);
      }
      else if (type == EXPR_LIST) {
        return new NimExprListImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new NimExprStmtImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new NimForExprImpl(node);
      }
      else if (type == FOR_STMT) {
        return new NimForStmtImpl(node);
      }
      else if (type == FROM_STMT) {
        return new NimFromStmtImpl(node);
      }
      else if (type == GENERALIZED_LIT) {
        return new NimGeneralizedLitImpl(node);
      }
      else if (type == GENERIC_PARAM) {
        return new NimGenericParamImpl(node);
      }
      else if (type == GENERIC_PARAM_LIST) {
        return new NimGenericParamListImpl(node);
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
      else if (type == LITERAL) {
        return new NimLiteralImpl(node);
      }
      else if (type == MIXIN_STMT) {
        return new NimMixinStmtImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new NimMulExprImpl(node);
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
      else if (type == OR_EXPR) {
        return new NimOrExprImpl(node);
      }
      else if (type == PAR) {
        return new NimParImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new NimParamListImpl(node);
      }
      else if (type == PARAM_LIST_ARROW) {
        return new NimParamListArrowImpl(node);
      }
      else if (type == PARAM_LIST_COLON) {
        return new NimParamListColonImpl(node);
      }
      else if (type == PATTERN) {
        return new NimPatternImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new NimPlusExprImpl(node);
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
      else if (type == SLICE_EXPR) {
        return new NimSliceExprImpl(node);
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
      else if (type == TYPE_DEF_AUX) {
        return new NimTypeDefAuxImpl(node);
      }
      else if (type == TYPE_DESC) {
        return new NimTypeDescImpl(node);
      }
      else if (type == TYPE_KEYW) {
        return new NimTypeKeywImpl(node);
      }
      else if (type == VARIABLE) {
        return new NimVariableImpl(node);
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
