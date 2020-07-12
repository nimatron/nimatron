// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tiepy.nimatron.psi.NimElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NimParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // '[' <<optInd ((exprColonEqExpr comma?)*)>> <<optInd (']')>>
  public static boolean arrayConstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CONSTR, "<array constr>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, arrayConstr_1_0_parser_);
    r = r && optInd(b, l + 1, arrayConstr_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean arrayConstr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayConstr_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayConstr_1_0", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean arrayConstr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && arrayConstr_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean arrayConstr_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_1_0_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  // (']')
  private static boolean arrayConstr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'asm' pragma? (STR_LIT|RSTR_LIT|TRIPLESTR_LIT)
  public static boolean asmStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASM_STMT, "<asm stmt>");
    r = consumeToken(b, "asm");
    r = r && asmStmt_1(b, l + 1);
    r = r && asmStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean asmStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStmt_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  // STR_LIT|RSTR_LIT|TRIPLESTR_LIT
  private static boolean asmStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStmt_2")) return false;
    boolean r;
    r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    return r;
  }

  /* ********************************************************** */
  // 'bind' <<optInd (qualifiedIdent (comma qualifiedIdent)*)>>
  public static boolean bindStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_STMT, "<bind stmt>");
    r = consumeToken(b, "bind");
    r = r && optInd(b, l + 1, bindStmt_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifiedIdent (comma qualifiedIdent)*
  private static boolean bindStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedIdent(b, l + 1);
    r = r && bindStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma qualifiedIdent)*
  private static boolean bindStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bindStmt_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bindStmt_1_0_1", c)) break;
    }
    return true;
  }

  // comma qualifiedIdent
  private static boolean bindStmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'block' symbol? colcom <<optInd stmts>>
  public static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, "<block stmt>");
    r = consumeToken(b, "block");
    r = r && blockStmt_1(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbol?
  private static boolean blockStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt_1")) return false;
    symbol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'break' <<optInd expr>>?
  public static boolean breakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, "<break stmt>");
    r = consumeToken(b, "break");
    r = r && breakStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean breakStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'case' expr ':'? COMMENT? (caseStmt1 | caseStmt2)
  public static boolean caseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STMT, "<case stmt>");
    r = consumeToken(b, "case");
    r = r && expr(b, l + 1);
    r = r && caseStmt_2(b, l + 1);
    r = r && caseStmt_3(b, l + 1);
    r = r && caseStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'?
  private static boolean caseStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_2")) return false;
    consumeToken(b, ":");
    return true;
  }

  // COMMENT?
  private static boolean caseStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_3")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // caseStmt1 | caseStmt2
  private static boolean caseStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_4")) return false;
    boolean r;
    r = caseStmt1(b, l + 1);
    if (!r) r = caseStmt2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INDENT ofBranches DEDENT
  public static boolean caseStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt1")) return false;
    if (!nextTokenIs(b, INDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && ofBranches(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, CASE_STMT_1, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ ofBranches
  public static boolean caseStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt2")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && ofBranches(b, l + 1);
    exit_section_(b, m, CASE_STMT_2, r);
    return r;
  }

  /* ********************************************************** */
  // 'cast' '[' <<optInd typeDesc>> <<optInd (']')>> '(' <<optInd expr>> <<optInd (')')>>
  public static boolean castExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXPR, "<cast expr>");
    r = consumeToken(b, "cast");
    r = r && consumeToken(b, "[");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    r = r && optInd(b, l + 1, castExpr_3_0_parser_);
    r = r && consumeToken(b, "(");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && optInd(b, l + 1, castExpr_6_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (']')
  private static boolean castExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (')')
  private static boolean castExpr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' COMMENT?
  public static boolean colcom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colcom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLCOM, "<colcom>");
    r = consumeToken(b, ":");
    r = r && colcom_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean colcom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colcom_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // ':' COMMENT?
  public static boolean colon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON, "<colon>");
    r = consumeToken(b, ":");
    r = r && colon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean colon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // colcom <<optInd stmts>> postExprBlocks?
  public static boolean colonBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON_BODY, "<colon body>");
    r = colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    r = r && colonBody_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postExprBlocks?
  private static boolean colonBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody_2")) return false;
    postExprBlocks(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ',' COMMENT?
  public static boolean comma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA, "<comma>");
    r = consumeToken(b, ",");
    r = r && comma_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean comma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // expr colcom <<optInd expr>>
  //           ('elif' expr colcom <<optInd expr>>)*
  //            'else' colcom expr
  public static boolean condExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<cond expr>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && condExpr_3(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('elif' expr colcom <<optInd expr>>)*
  private static boolean condExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condExpr_3", c)) break;
    }
    return true;
  }

  // 'elif' expr colcom <<optInd expr>>
  private static boolean condExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr colcom <<optInd stmts>> COMMENT?
  //              (IND_EQ 'elif' expr colcom <<optInd stmts>>)*
  //              (IND_EQ 'else' colcom <<optInd stmts>>)?
  public static boolean condStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    r = r && condStmt_3(b, l + 1);
    r = r && condStmt_4(b, l + 1);
    r = r && condStmt_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean condStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // (IND_EQ 'elif' expr colcom <<optInd stmts>>)*
  private static boolean condStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condStmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condStmt_4", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr colcom <<optInd stmts>>
  private static boolean condStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' colcom <<optInd stmts>>)?
  private static boolean condStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_5")) return false;
    condStmt_5_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' colcom <<optInd stmts>>
  private static boolean condStmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'const' <<optInd constant>>
  public static boolean constStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_STMT, "<const stmt>");
    r = consumeToken(b, "const");
    r = r && optInd(b, l + 1, constant_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (varTuple|identWithPragma) (colon typeDesc)? '=' <<optInd expr>>
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = constant_0(b, l + 1);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // varTuple|identWithPragma
  private static boolean constant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_0")) return false;
    boolean r;
    r = varTuple(b, l + 1);
    if (!r) r = identWithPragma(b, l + 1);
    return r;
  }

  // (colon typeDesc)?
  private static boolean constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1")) return false;
    constant_1_0(b, l + 1);
    return true;
  }

  // colon typeDesc
  private static boolean constant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'break' <<optInd expr>>?
  public static boolean continueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, "<continue stmt>");
    r = consumeToken(b, "break");
    r = r && continueStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean continueStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'converter' symbol oprCombo? <<optInd routine>>
  public static boolean converterStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converterStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONVERTER_STMT, "<converter stmt>");
    r = consumeToken(b, "converter");
    r = r && symbol(b, l + 1);
    r = r && converterStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean converterStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converterStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identWithPragma (',' identWithPragma)* ','?
  //                     (':' <<optInd typeDesc>>)? ('=' <<optInd expr>>)?
  public static boolean declColonEquals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_COLON_EQUALS, "<decl colon equals>");
    r = identWithPragma(b, l + 1);
    r = r && declColonEquals_1(b, l + 1);
    r = r && declColonEquals_2(b, l + 1);
    r = r && declColonEquals_3(b, l + 1);
    r = r && declColonEquals_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' identWithPragma)*
  private static boolean declColonEquals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declColonEquals_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declColonEquals_1", c)) break;
    }
    return true;
  }

  // ',' identWithPragma
  private static boolean declColonEquals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean declColonEquals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // (':' <<optInd typeDesc>>)?
  private static boolean declColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3")) return false;
    declColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' <<optInd typeDesc>>
  private static boolean declColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd expr>>)?
  private static boolean declColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4")) return false;
    declColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' <<optInd expr>>
  private static boolean declColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defer' colcom <<optInd stmts>>
  public static boolean deferStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deferStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFER_STMT, "<defer stmt>");
    r = consumeToken(b, "defer");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'discard' <<optInd expr>>?
  public static boolean discardStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCARD_STMT, "<discard stmt>");
    r = consumeToken(b, "discard");
    r = r && discardStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean discardStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'do' paramsArrow pragma? colcom <<optInd stmts>>
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_BLOCK, "<do block>");
    r = consumeToken(b, "do");
    r = r && paramsArrow(b, l + 1);
    r = r && doBlock_2(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean doBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'export' <<optInd expr>> ((',' expr)+ | exportStmt1)
  public static boolean exportStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT, "<export stmt>");
    r = consumeToken(b, "export");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && exportStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expr)+ | exportStmt1
  private static boolean exportStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt_2_0(b, l + 1);
    if (!r) r = exportStmt1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)+
  private static boolean exportStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt_2_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!exportStmt_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt_2_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' expr
  private static boolean exportStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'except' <<optInd (expr (comma expr)*)>>
  public static boolean exportStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT_1, "<export stmt 1>");
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, exportStmt1_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr (comma expr)*
  private static boolean exportStmt1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exportStmt1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)*
  private static boolean exportStmt1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exportStmt1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt1_1_0_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exportStmt1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // blockStmt
  //        | ifExpr
  //        | whenExpr
  //        | caseStmt
  //        | forStmt
  //        | tryExpr
  //        | simpleExpr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = blockStmt(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = whenExpr(b, l + 1);
    if (!r) r = caseStmt(b, l + 1);
    if (!r) r = forStmt(b, l + 1);
    if (!r) r = tryExpr(b, l + 1);
    if (!r) r = simpleExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr (':'|'=' expr)?
  public static boolean exprColonEqExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COLON_EQ_EXPR, "<expr colon eq expr>");
    r = expr(b, l + 1);
    r = r && exprColonEqExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (':'|'=' expr)?
  private static boolean exprColonEqExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr_1")) return false;
    exprColonEqExpr_1_0(b, l + 1);
    return true;
  }

  // ':'|'=' expr
  private static boolean exprColonEqExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    if (!r) r = exprColonEqExpr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' expr
  private static boolean exprColonEqExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exprColonEqExpr (comma exprColonEqExpr)* comma?
  public static boolean exprColonEqExprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COLON_EQ_EXPRS, "<expr colon eq exprs>");
    r = exprColonEqExpr(b, l + 1);
    r = r && exprColonEqExprs_1(b, l + 1);
    r = r && exprColonEqExprs_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma exprColonEqExpr)*
  private static boolean exprColonEqExprs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprColonEqExprs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprColonEqExprs_1", c)) break;
    }
    return true;
  }

  // comma exprColonEqExpr
  private static boolean exprColonEqExprs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean exprColonEqExprs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprs_2")) return false;
    comma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simpleExpr (exprStmt1 | exprStmt2)?
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = simpleExpr(b, l + 1);
    r = r && exprStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprStmt1 | exprStmt2)?
  private static boolean exprStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1")) return false;
    exprStmt_1_0(b, l + 1);
    return true;
  }

  // exprStmt1 | exprStmt2
  private static boolean exprStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0")) return false;
    boolean r;
    r = exprStmt1(b, l + 1);
    if (!r) r = exprStmt2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '=' <<optInd expr>> colonBody?
  public static boolean exprStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT_1, "<expr stmt 1>");
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && exprStmt1_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // colonBody?
  private static boolean exprStmt1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt1_2")) return false;
    colonBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr (comma expr)* postExprBlocks
  public static boolean exprStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT_2, "<expr stmt 2>");
    r = expr(b, l + 1);
    r = r && exprStmt2_1(b, l + 1);
    r = r && postExprBlocks(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean exprStmt2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprStmt2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprStmt2_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exprStmt2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr (comma expr)*
  public static boolean exprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRS, "<exprs>");
    r = expr(b, l + 1);
    r = r && exprs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean exprs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprs_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exprs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'for' (identWithPragma (comma identWithPragma)*) 'in' expr colcom <<optInd stmts>>
  public static boolean forStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, "<for stmt>");
    r = consumeToken(b, "for");
    r = r && forStmt_1(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identWithPragma (comma identWithPragma)*
  private static boolean forStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identWithPragma(b, l + 1);
    r = r && forStmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma identWithPragma)*
  private static boolean forStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!forStmt_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forStmt_1_1", c)) break;
    }
    return true;
  }

  // comma identWithPragma
  private static boolean forStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'from' expr 'import' <<optInd expr>> (comma expr)*
  public static boolean fromStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FROM_STMT, "<from stmt>");
    r = consumeToken(b, "from");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, "import");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && fromStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean fromStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fromStmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromStmt_4", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean fromStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'func' symbol oprCombo? <<optInd routine>>
  public static boolean funcStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNC_STMT, "<func stmt>");
    r = consumeToken(b, "func");
    r = r && symbol(b, l + 1);
    r = r && funcStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean funcStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // GENERALIZED_STR_LIT | GENERALIZED_TRIPLESTR_LIT
  public static boolean generalizedLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalizedLit")) return false;
    if (!nextTokenIs(b, "<generalized lit>", GENERALIZED_STR_LIT, GENERALIZED_TRIPLESTR_LIT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERALIZED_LIT, "<generalized lit>");
    r = consumeToken(b, GENERALIZED_STR_LIT);
    if (!r) r = consumeToken(b, GENERALIZED_TRIPLESTR_LIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol (comma symbol)* (colon expr)? ('=' <<optInd expr>>)?
  public static boolean genericParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAM, "<generic param>");
    r = symbol(b, l + 1);
    r = r && genericParam_1(b, l + 1);
    r = r && genericParam_2(b, l + 1);
    r = r && genericParam_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma symbol)*
  private static boolean genericParam_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!genericParam_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "genericParam_1", c)) break;
    }
    return true;
  }

  // comma symbol
  private static boolean genericParam_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon expr)?
  private static boolean genericParam_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_2")) return false;
    genericParam_2_0(b, l + 1);
    return true;
  }

  // colon expr
  private static boolean genericParam_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd expr>>)?
  private static boolean genericParam_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3")) return false;
    genericParam_3_0(b, l + 1);
    return true;
  }

  // '=' <<optInd expr>>
  private static boolean genericParam_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' <<optInd
  //   ((genericParam ((comma|semicolon) genericParam)*)?)>> <<optInd (']')>>
  public static boolean genericParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAMS, "<generic params>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, genericParams_1_0_parser_);
    r = r && optInd(b, l + 1, genericParams_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (genericParam ((comma|semicolon) genericParam)*)?
  private static boolean genericParams_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_1_0")) return false;
    genericParams_1_0_0(b, l + 1);
    return true;
  }

  // genericParam ((comma|semicolon) genericParam)*
  private static boolean genericParams_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = genericParam(b, l + 1);
    r = r && genericParams_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((comma|semicolon) genericParam)*
  private static boolean genericParams_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!genericParams_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "genericParams_1_0_0_1", c)) break;
    }
    return true;
  }

  // (comma|semicolon) genericParam
  private static boolean genericParams_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = genericParams_1_0_0_1_0_0(b, l + 1);
    r = r && genericParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma|semicolon
  private static boolean genericParams_1_0_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_1_0_0_1_0_0")) return false;
    boolean r;
    r = comma(b, l + 1);
    if (!r) r = semicolon(b, l + 1);
    return r;
  }

  // (']')
  private static boolean genericParams_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT (comma IDENT)* comma?
  //      (':' <<optInd typeDesc>>)? ('=' <<optInd expr>>)?
  public static boolean identColonEquals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && identColonEquals_1(b, l + 1);
    r = r && identColonEquals_2(b, l + 1);
    r = r && identColonEquals_3(b, l + 1);
    r = r && identColonEquals_4(b, l + 1);
    exit_section_(b, m, IDENT_COLON_EQUALS, r);
    return r;
  }

  // (comma IDENT)*
  private static boolean identColonEquals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identColonEquals_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identColonEquals_1", c)) break;
    }
    return true;
  }

  // comma IDENT
  private static boolean identColonEquals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean identColonEquals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_2")) return false;
    comma(b, l + 1);
    return true;
  }

  // (':' <<optInd typeDesc>>)?
  private static boolean identColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3")) return false;
    identColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' <<optInd typeDesc>>
  private static boolean identColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd expr>>)?
  private static boolean identColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4")) return false;
    identColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' <<optInd expr>>
  private static boolean identColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generalizedLit | symbol | literal
  //                  | par | arrayConstr | setOrTableConstr
  //                  | castExpr
  public static boolean identOrLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identOrLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_OR_LITERAL, "<ident or literal>");
    r = generalizedLit(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = par(b, l + 1);
    if (!r) r = arrayConstr(b, l + 1);
    if (!r) r = setOrTableConstr(b, l + 1);
    if (!r) r = castExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol '.' <<optInd symbol>> oprCombo?
  public static boolean identVisDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS_DOT, "<ident vis dot>");
    r = symbol(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && optInd(b, l + 1, symbol_parser_);
    r = r && identVisDot_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean identVisDot_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_3")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol oprCombo? pragma?
  public static boolean identWithPragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_WITH_PRAGMA, "<ident with pragma>");
    r = symbol(b, l + 1);
    r = r && identWithPragma_1(b, l + 1);
    r = r && identWithPragma_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean identWithPragma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragma_1")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean identWithPragma_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragma_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identVisDot pragma?
  public static boolean identWithPragmaDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragmaDot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_WITH_PRAGMA_DOT, "<ident with pragma dot>");
    r = identVisDot(b, l + 1);
    r = r && identWithPragmaDot_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean identWithPragmaDot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragmaDot_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'if' condExpr
  public static boolean ifExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPR, "<if expr>");
    r = consumeToken(b, "if");
    r = r && condExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if' condStmt
  public static boolean ifStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "if");
    r = r && condStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'import' <<optInd expr>> ((comma expr)+ | importStmt1)
  public static boolean importStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = consumeToken(b, "import");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && importStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)+ | importStmt1
  private static boolean importStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt_2_0(b, l + 1);
    if (!r) r = importStmt1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)+
  private static boolean importStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt_2_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!importStmt_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt_2_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // comma expr
  private static boolean importStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'except' <<optInd (expr (comma expr)*)>>
  public static boolean importStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT_1, "<import stmt 1>");
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, importStmt1_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr (comma expr)*
  private static boolean importStmt1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && importStmt1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)*
  private static boolean importStmt1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importStmt1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt1_1_0_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean importStmt1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' <<optInd expr>> (comma expr)*
  public static boolean includeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, "<include stmt>");
    r = consumeToken(b, "include");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && includeStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean includeStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!includeStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "includeStmt_2", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean includeStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'iterator' symbol oprCombo? <<optInd routine>>
  public static boolean iteratorStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteratorStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_STMT, "<iterator stmt>");
    r = consumeToken(b, "iterator");
    r = r && symbol(b, l + 1);
    r = r && iteratorStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean iteratorStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteratorStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INT_LIT | INT8_LIT | INT16_LIT | INT32_LIT | INT64_LIT
  //           | UINT_LIT | UINT8_LIT | UINT16_LIT | UINT32_LIT | UINT64_LIT
  //           | FLOAT_LIT | FLOAT32_LIT | FLOAT64_LIT
  //           | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
  //           | CHAR_LIT
  //           | BOOL_LIT // NOTE: BOOL_LIT was added here.
  //           | NIL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT_LIT);
    if (!r) r = consumeToken(b, INT8_LIT);
    if (!r) r = consumeToken(b, INT16_LIT);
    if (!r) r = consumeToken(b, INT32_LIT);
    if (!r) r = consumeToken(b, INT64_LIT);
    if (!r) r = consumeToken(b, UINT_LIT);
    if (!r) r = consumeToken(b, UINT8_LIT);
    if (!r) r = consumeToken(b, UINT16_LIT);
    if (!r) r = consumeToken(b, UINT32_LIT);
    if (!r) r = consumeToken(b, UINT64_LIT);
    if (!r) r = consumeToken(b, FLOAT_LIT);
    if (!r) r = consumeToken(b, FLOAT32_LIT);
    if (!r) r = consumeToken(b, FLOAT64_LIT);
    if (!r) r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, BOOL_LIT);
    if (!r) r = consumeToken(b, NIL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'macro' symbol oprCombo? <<optInd routine>>
  public static boolean macroStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macroStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_STMT, "<macro stmt>");
    r = consumeToken(b, "macro");
    r = r && symbol(b, l + 1);
    r = r && macroStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean macroStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macroStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'method' symbol oprCombo? <<optInd routine>>
  public static boolean methodStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_STMT, "<method stmt>");
    r = consumeToken(b, "method");
    r = r && symbol(b, l + 1);
    r = r && methodStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean methodStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'mixin' <<optInd (qualifiedIdent (comma qualifiedIdent)*)>>
  public static boolean mixinStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MIXIN_STMT, "<mixin stmt>");
    r = consumeToken(b, "mixin");
    r = r && optInd(b, l + 1, mixinStmt_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifiedIdent (comma qualifiedIdent)*
  private static boolean mixinStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedIdent(b, l + 1);
    r = r && mixinStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma qualifiedIdent)*
  private static boolean mixinStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mixinStmt_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mixinStmt_1_0_1", c)) break;
    }
    return true;
  }

  // comma qualifiedIdent
  private static boolean mixinStmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ* stmts? semicolon? IND_EQ*
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    r = r && module_1(b, l + 1);
    r = r && module_2(b, l + 1);
    r = r && module_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ*
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IND_EQ)) break;
      if (!empty_element_parsed_guard_(b, "module_0", c)) break;
    }
    return true;
  }

  // stmts?
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    stmts(b, l + 1);
    return true;
  }

  // semicolon?
  private static boolean module_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2")) return false;
    semicolon(b, l + 1);
    return true;
  }

  // IND_EQ*
  private static boolean module_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IND_EQ)) break;
      if (!empty_element_parsed_guard_(b, "module_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'of' exprs colcom <<optInd stmts>>
  public static boolean ofBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCH, "<of branch>");
    r = consumeToken(b, "of");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ofBranch (IND_EQ ofBranch)*
  //                         (IND_EQ 'elif' expr colcom <<optInd stmts>>)*
  //                         (IND_EQ 'else' colcom <<optInd stmts>>)?
  public static boolean ofBranches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCHES, "<of branches>");
    r = ofBranch(b, l + 1);
    r = r && ofBranches_1(b, l + 1);
    r = r && ofBranches_2(b, l + 1);
    r = r && ofBranches_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ ofBranch)*
  private static boolean ofBranches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_1", c)) break;
    }
    return true;
  }

  // IND_EQ ofBranch
  private static boolean ofBranches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && ofBranch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'elif' expr colcom <<optInd stmts>>)*
  private static boolean ofBranches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_2", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr colcom <<optInd stmts>>
  private static boolean ofBranches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' colcom <<optInd stmts>>)?
  private static boolean ofBranches_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3")) return false;
    ofBranches_3_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' colcom <<optInd stmts>>
  private static boolean ofBranches_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // op0|op1|op2|op3|op4|op5|op6|op7|op8|op9|op10
  public static boolean op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP, "<op>");
    r = op0(b, l + 1);
    if (!r) r = op1(b, l + 1);
    if (!r) r = op2(b, l + 1);
    if (!r) r = op3(b, l + 1);
    if (!r) r = op4(b, l + 1);
    if (!r) r = op5(b, l + 1);
    if (!r) r = op6(b, l + 1);
    if (!r) r = op7(b, l + 1);
    if (!r) r = op8(b, l + 1);
    if (!r) r = op9(b, l + 1);
    if (!r) r = op10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP0A|OP0B|OP0C
  public static boolean op0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_0, "<op 0>");
    r = consumeToken(b, OP0A);
    if (!r) r = consumeToken(b, OP0B);
    if (!r) r = consumeToken(b, OP0C);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP1A|OP1B|OP1C|OP1D
  public static boolean op1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_1, "<op 1>");
    r = consumeToken(b, OP1A);
    if (!r) r = consumeToken(b, OP1B);
    if (!r) r = consumeToken(b, OP1C);
    if (!r) r = consumeToken(b, OP1D);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP10A|OP10B
  public static boolean op10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op10")) return false;
    if (!nextTokenIs(b, "<op 10>", OP10A, OP10B)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_10, "<op 10>");
    r = consumeToken(b, OP10A);
    if (!r) r = consumeToken(b, OP10B);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP2A|OP2B|OP2C
  public static boolean op2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_2, "<op 2>");
    r = consumeToken(b, OP2A);
    if (!r) r = consumeToken(b, OP2B);
    if (!r) r = consumeToken(b, OP2C);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP3A|OP3B
  public static boolean op3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op3")) return false;
    if (!nextTokenIs(b, "<op 3>", OP3A, OP3B)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_3, "<op 3>");
    r = consumeToken(b, OP3A);
    if (!r) r = consumeToken(b, OP3B);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP4A
  public static boolean op4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op4")) return false;
    if (!nextTokenIs(b, OP4A)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP4A);
    exit_section_(b, m, OP_4, r);
    return r;
  }

  /* ********************************************************** */
  // OP5A|OP5B|OP5C|OP5D|OP5E|OP5F|OP5G|OP5H|OP5I|OP5J|OP5K|OP5L|OP5M
  public static boolean op5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_5, "<op 5>");
    r = consumeToken(b, OP5A);
    if (!r) r = consumeToken(b, OP5B);
    if (!r) r = consumeToken(b, OP5C);
    if (!r) r = consumeToken(b, OP5D);
    if (!r) r = consumeToken(b, OP5E);
    if (!r) r = consumeToken(b, OP5F);
    if (!r) r = consumeToken(b, OP5G);
    if (!r) r = consumeToken(b, OP5H);
    if (!r) r = consumeToken(b, OP5I);
    if (!r) r = consumeToken(b, OP5J);
    if (!r) r = consumeToken(b, OP5K);
    if (!r) r = consumeToken(b, OP5L);
    if (!r) r = consumeToken(b, OP5M);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP6A
  public static boolean op6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op6")) return false;
    if (!nextTokenIs(b, OP6A)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP6A);
    exit_section_(b, m, OP_6, r);
    return r;
  }

  /* ********************************************************** */
  // OP7A
  public static boolean op7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op7")) return false;
    if (!nextTokenIs(b, OP7A)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP7A);
    exit_section_(b, m, OP_7, r);
    return r;
  }

  /* ********************************************************** */
  // OP8A|OP8B
  public static boolean op8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op8")) return false;
    if (!nextTokenIs(b, "<op 8>", OP8A, OP8B)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_8, "<op 8>");
    r = consumeToken(b, OP8A);
    if (!r) r = consumeToken(b, OP8B);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP9A|OP9B|OP9C|OP9D|OP9E|OP9F|OP9G
  public static boolean op9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op9")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_9, "<op 9>");
    r = consumeToken(b, OP9A);
    if (!r) r = consumeToken(b, OP9B);
    if (!r) r = consumeToken(b, OP9C);
    if (!r) r = consumeToken(b, OP9D);
    if (!r) r = consumeToken(b, OP9E);
    if (!r) r = consumeToken(b, OP9F);
    if (!r) r = consumeToken(b, OP9G);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op0|op1|op2|op3|op4|op5|op6|op7|op8|op9|'from'|'static'|'..'
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = op0(b, l + 1);
    if (!r) r = op1(b, l + 1);
    if (!r) r = op2(b, l + 1);
    if (!r) r = op3(b, l + 1);
    if (!r) r = op4(b, l + 1);
    if (!r) r = op5(b, l + 1);
    if (!r) r = op6(b, l + 1);
    if (!r) r = op7(b, l + 1);
    if (!r) r = op8(b, l + 1);
    if (!r) r = op9(b, l + 1);
    if (!r) r = consumeToken(b, "from");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "..");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPR
  public static boolean oprCombo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oprCombo")) return false;
    if (!nextTokenIs(b, OPR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPR);
    exit_section_(b, m, OPR_COMBO, r);
    return r;
  }

  /* ********************************************************** */
  // <<RULE>> | (INDENT <<RULE>>? COMMENT? (IND_EQ <<RULE>>? COMMENT?)* termInd)
  public static boolean optInd(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = optInd_1(b, l + 1, _RULE);
    exit_section_(b, m, OPT_IND, r);
    return r;
  }

  // INDENT <<RULE>>? COMMENT? (IND_EQ <<RULE>>? COMMENT?)* termInd
  private static boolean optInd_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && optInd_1_1(b, l + 1, _RULE);
    r = r && optInd_1_2(b, l + 1);
    r = r && optInd_1_3(b, l + 1, _RULE);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>?
  private static boolean optInd_1_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_1")) return false;
    _RULE.parse(b, l);
    return true;
  }

  // COMMENT?
  private static boolean optInd_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd_1_2")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // (IND_EQ <<RULE>>? COMMENT?)*
  private static boolean optInd_1_3(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd_1_3_0(b, l + 1, _RULE)) break;
      if (!empty_element_parsed_guard_(b, "optInd_1_3", c)) break;
    }
    return true;
  }

  // IND_EQ <<RULE>>? COMMENT?
  private static boolean optInd_1_3_0(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && optInd_1_3_0_1(b, l + 1, _RULE);
    r = r && optInd_1_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>?
  private static boolean optInd_1_3_0_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3_0_1")) return false;
    _RULE.parse(b, l);
    return true;
  }

  // COMMENT?
  private static boolean optInd_1_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd_1_3_0_2")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // '(' <<optInd par1>> <<optInd (')')>>
  public static boolean par(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR, "<par>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, par1_parser_);
    r = r && optInd(b, l + 1, par_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (')')
  private static boolean par_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // par2
  //        | par3
  //        | pragmaStmt
  //        | par4
  public static boolean par1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_1, "<par 1>");
    r = par2(b, l + 1);
    if (!r) r = par3(b, l + 1);
    if (!r) r = pragmaStmt(b, l + 1);
    if (!r) r = par4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stmt (';' stmt)*
  public static boolean par2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_2, "<par 2>");
    r = stmt(b, l + 1);
    r = r && par2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' stmt)*
  private static boolean par2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par2_1", c)) break;
    }
    return true;
  }

  // ';' stmt
  private static boolean par2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ';' stmt (';' stmt)*
  public static boolean par3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_3, "<par 3>");
    r = consumeToken(b, ";");
    r = r && stmt(b, l + 1);
    r = r && par3_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' stmt)*
  private static boolean par3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par3_2", c)) break;
    }
    return true;
  }

  // ';' stmt
  private static boolean par3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr (par5 | par6)
  public static boolean par4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_4, "<par 4>");
    r = simpleExpr(b, l + 1);
    r = r && par4_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // par5 | par6
  private static boolean par4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par4_1")) return false;
    boolean r;
    r = par5(b, l + 1);
    if (!r) r = par6(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '=' expr (';' stmt (';' stmt)*)?
  public static boolean par5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_5, "<par 5>");
    r = consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && par5_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' stmt (';' stmt)*)?
  private static boolean par5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2")) return false;
    par5_2_0(b, l + 1);
    return true;
  }

  // ';' stmt (';' stmt)*
  private static boolean par5_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && stmt(b, l + 1);
    r = r && par5_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' stmt)*
  private static boolean par5_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par5_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par5_2_0_2", c)) break;
    }
    return true;
  }

  // ';' stmt
  private static boolean par5_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?
  public static boolean par6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_6, "<par 6>");
    r = consumeToken(b, ":");
    r = r && expr(b, l + 1);
    r = r && par6_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' exprColonEqExpr (',' exprColonEqExpr)*)?
  private static boolean par6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6_2")) return false;
    par6_2_0(b, l + 1);
    return true;
  }

  // ',' exprColonEqExpr (',' exprColonEqExpr)*
  private static boolean par6_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    r = r && par6_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' exprColonEqExpr)*
  private static boolean par6_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par6_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par6_2_0_2", c)) break;
    }
    return true;
  }

  // ',' exprColonEqExpr
  private static boolean par6_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (declColonEquals ((comma|semicolon) declColonEquals)*)? ')'
  public static boolean params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMS, "<params>");
    r = consumeToken(b, "(");
    r = r && params_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (declColonEquals ((comma|semicolon) declColonEquals)*)?
  private static boolean params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_1")) return false;
    params_1_0(b, l + 1);
    return true;
  }

  // declColonEquals ((comma|semicolon) declColonEquals)*
  private static boolean params_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declColonEquals(b, l + 1);
    r = r && params_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((comma|semicolon) declColonEquals)*
  private static boolean params_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!params_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "params_1_0_1", c)) break;
    }
    return true;
  }

  // (comma|semicolon) declColonEquals
  private static boolean params_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = params_1_0_1_0_0(b, l + 1);
    r = r && declColonEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma|semicolon
  private static boolean params_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_1_0_1_0_0")) return false;
    boolean r;
    r = comma(b, l + 1);
    if (!r) r = semicolon(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // params? ('->' <<optInd typeDesc>>)?
  public static boolean paramsArrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsArrow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMS_ARROW, "<params arrow>");
    r = paramsArrow_0(b, l + 1);
    r = r && paramsArrow_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // params?
  private static boolean paramsArrow_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsArrow_0")) return false;
    params(b, l + 1);
    return true;
  }

  // ('->' <<optInd typeDesc>>)?
  private static boolean paramsArrow_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsArrow_1")) return false;
    paramsArrow_1_0(b, l + 1);
    return true;
  }

  // '->' <<optInd typeDesc>>
  private static boolean paramsArrow_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsArrow_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // params? (':' <<optInd typeDesc>>)?
  public static boolean paramsColon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsColon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMS_COLON, "<params colon>");
    r = paramsColon_0(b, l + 1);
    r = r && paramsColon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // params?
  private static boolean paramsColon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsColon_0")) return false;
    params(b, l + 1);
    return true;
  }

  // (':' <<optInd typeDesc>>)?
  private static boolean paramsColon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsColon_1")) return false;
    paramsColon_1_0(b, l + 1);
    return true;
  }

  // ':' <<optInd typeDesc>>
  private static boolean paramsColon_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramsColon_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' <<optInd stmts>> '}'
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = consumeToken(b, "{");
    r = r && optInd(b, l + 1, stmts_parser_);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':' <<optInd stmts>>? ( postExprBlocks1
  //                                          | postExprBlocks2
  //                                          | postExprBlocks3
  //                                          | postExprBlocks4
  //                                          | postExprBlocks5 )*
  public static boolean postExprBlocks(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POST_EXPR_BLOCKS, "<post expr blocks>");
    r = consumeToken(b, ":");
    r = r && postExprBlocks_1(b, l + 1);
    r = r && postExprBlocks_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd stmts>>?
  private static boolean postExprBlocks_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_1")) return false;
    optInd(b, l + 1, stmts_parser_);
    return true;
  }

  // ( postExprBlocks1
  //                                          | postExprBlocks2
  //                                          | postExprBlocks3
  //                                          | postExprBlocks4
  //                                          | postExprBlocks5 )*
  private static boolean postExprBlocks_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postExprBlocks_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postExprBlocks_2", c)) break;
    }
    return true;
  }

  // postExprBlocks1
  //                                          | postExprBlocks2
  //                                          | postExprBlocks3
  //                                          | postExprBlocks4
  //                                          | postExprBlocks5
  private static boolean postExprBlocks_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0")) return false;
    boolean r;
    r = postExprBlocks1(b, l + 1);
    if (!r) r = postExprBlocks2(b, l + 1);
    if (!r) r = postExprBlocks3(b, l + 1);
    if (!r) r = postExprBlocks4(b, l + 1);
    if (!r) r = postExprBlocks5(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ doBlock
  public static boolean postExprBlocks1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks1")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && doBlock(b, l + 1);
    exit_section_(b, m, POST_EXPR_BLOCKS_1, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ 'of' exprs ':' <<optInd stmts>>
  public static boolean postExprBlocks2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks2")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "of");
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, POST_EXPR_BLOCKS_2, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ 'elif' expr ':' <<optInd stmts>>
  public static boolean postExprBlocks3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks3")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, POST_EXPR_BLOCKS_3, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ 'except' exprs ':' <<optInd stmts>>
  public static boolean postExprBlocks4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks4")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "except");
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, POST_EXPR_BLOCKS_4, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ 'else' ':' <<optInd stmts>>
  public static boolean postExprBlocks5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks5")) return false;
    if (!nextTokenIs(b, IND_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, POST_EXPR_BLOCKS_5, r);
    return r;
  }

  /* ********************************************************** */
  // '{.' <<optInd ((exprColonEqExpr comma?)*)>> <<optInd ('.}'|'}')>>
  public static boolean pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA, "<pragma>");
    r = consumeToken(b, "{.");
    r = r && optInd(b, l + 1, pragma_1_0_parser_);
    r = r && optInd(b, l + 1, pragma_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean pragma_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pragma_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pragma_1_0", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean pragma_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && pragma_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean pragma_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_1_0_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  // '.}'|'}'
  private static boolean pragma_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0")) return false;
    boolean r;
    r = consumeToken(b, ".}");
    if (!r) r = consumeToken(b, "}");
    return r;
  }

  /* ********************************************************** */
  // pragma (':' COMMENT? <<optInd stmts>>)?
  public static boolean pragmaStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA_STMT, "<pragma stmt>");
    r = pragma(b, l + 1);
    r = r && pragmaStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (':' COMMENT? <<optInd stmts>>)?
  private static boolean pragmaStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1")) return false;
    pragmaStmt_1_0(b, l + 1);
    return true;
  }

  // ':' COMMENT? <<optInd stmts>>
  private static boolean pragmaStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && pragmaStmt_1_0_1(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean pragmaStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1_0_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // primary1
  //           | primary2
  //           | primary3
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = primary1(b, l + 1);
    if (!r) r = primary2(b, l + 1);
    if (!r) r = primary3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeKeyw <<optInd typeDesc>>
  public static boolean primary1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_1, "<primary 1>");
    r = typeKeyw(b, l + 1);
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // operator* identOrLiteral primarySuffix*
  public static boolean primary2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_2, "<primary 2>");
    r = primary2_0(b, l + 1);
    r = r && identOrLiteral(b, l + 1);
    r = r && primary2_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operator*
  private static boolean primary2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary2_0", c)) break;
    }
    return true;
  }

  // primarySuffix*
  private static boolean primary2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary2_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'bind' primary
  public static boolean primary3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_3, "<primary 3>");
    r = consumeToken(b, "bind");
    r = r && primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primarySuffix1
  //                 | primarySuffix2
  //                 | primarySuffix3
  //                 | primarySuffix4
  //                 | primarySuffix5
  public static boolean primarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX, "<primary suffix>");
    r = primarySuffix1(b, l + 1);
    if (!r) r = primarySuffix2(b, l + 1);
    if (!r) r = primarySuffix3(b, l + 1);
    if (!r) r = primarySuffix4(b, l + 1);
    if (!r) r = primarySuffix5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' (exprColonEqExpr comma?)* ')'
  public static boolean primarySuffix1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_1, "<primary suffix 1>");
    r = consumeToken(b, "(");
    r = r && primarySuffix1_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean primarySuffix1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primarySuffix1_1", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean primarySuffix1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && primarySuffix1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean primarySuffix1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix1_1_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '.' <<optInd (symbol generalizedLit?)>>
  public static boolean primarySuffix2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_2, "<primary suffix 2>");
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, primarySuffix2_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbol generalizedLit?
  private static boolean primarySuffix2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && primarySuffix2_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generalizedLit?
  private static boolean primarySuffix2_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix2_1_0_1")) return false;
    generalizedLit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' <<optInd exprColonEqExprs>> <<optInd (']')>>
  public static boolean primarySuffix3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_3, "<primary suffix 3>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, exprColonEqExprs_parser_);
    r = r && optInd(b, l + 1, primarySuffix3_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (']')
  private static boolean primarySuffix3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' <<optInd exprColonEqExprs>> <<optInd ('}')>>
  public static boolean primarySuffix4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_4, "<primary suffix 4>");
    r = consumeToken(b, "{");
    r = r && optInd(b, l + 1, exprColonEqExprs_parser_);
    r = r && optInd(b, l + 1, primarySuffix4_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('}')
  private static boolean primarySuffix4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<optInd exprs>>
  public static boolean primarySuffix5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_5, "<primary suffix 5>");
    r = optInd(b, l + 1, exprs_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'proc' symbol oprCombo? <<optInd routine>>
  public static boolean procStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROC_STMT, "<proc stmt>");
    r = consumeToken(b, "proc");
    r = r && symbol(b, l + 1);
    r = r && procStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean procStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol ('.' <<optInd symbol>>)?
  public static boolean qualifiedIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_IDENT, "<qualified ident>");
    r = symbol(b, l + 1);
    r = r && qualifiedIdent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' <<optInd symbol>>)?
  private static boolean qualifiedIdent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1")) return false;
    qualifiedIdent_1_0(b, l + 1);
    return true;
  }

  // '.' <<optInd symbol>>
  private static boolean qualifiedIdent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, symbol_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'raise' <<optInd expr>>?
  public static boolean raiseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, "<raise stmt>");
    r = consumeToken(b, "raise");
    r = r && raiseStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean raiseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'return' <<optInd expr>>?
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = consumeToken(b, "return");
    r = r && returnStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean returnStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // pattern? genericParams? paramsColon pragma? ('=' COMMENT? <<optInd stmts>>)?
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = routine_0(b, l + 1);
    r = r && routine_1(b, l + 1);
    r = r && paramsColon(b, l + 1);
    r = r && routine_3(b, l + 1);
    r = r && routine_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pattern?
  private static boolean routine_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_0")) return false;
    pattern(b, l + 1);
    return true;
  }

  // genericParams?
  private static boolean routine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_1")) return false;
    genericParams(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean routine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_3")) return false;
    pragma(b, l + 1);
    return true;
  }

  // ('=' COMMENT? <<optInd stmts>>)?
  private static boolean routine_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_4")) return false;
    routine_4_0(b, l + 1);
    return true;
  }

  // '=' COMMENT? <<optInd stmts>>
  private static boolean routine_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && routine_4_0_1(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean routine_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_4_0_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // ';' COMMENT?
  public static boolean semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    r = r && semicolon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean semicolon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // '{' ((exprColonEqExpr comma)+ | ':') '}'
  public static boolean setOrTableConstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_OR_TABLE_CONSTR, "<set or table constr>");
    r = consumeToken(b, "{");
    r = r && setOrTableConstr_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma)+ | ':'
  private static boolean setOrTableConstr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setOrTableConstr_1_0(b, l + 1);
    if (!r) r = consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExpr comma)+
  private static boolean setOrTableConstr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setOrTableConstr_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!setOrTableConstr_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setOrTableConstr_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // exprColonEqExpr comma
  private static boolean setOrTableConstr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && comma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary (op <<optInd primary>>)* pragma?
  public static boolean simpleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPR, "<simple expr>");
    r = primary(b, l + 1);
    r = r && simpleExpr_1(b, l + 1);
    r = r && simpleExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (op <<optInd primary>>)*
  private static boolean simpleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleExpr_1", c)) break;
    }
    return true;
  }

  // op <<optInd primary>>
  private static boolean simpleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op(b, l + 1);
    r = r && optInd(b, l + 1, primary_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // pragma?
  private static boolean simpleExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'static' colcom <<optInd stmts>>
  public static boolean staticStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATIC_STMT, "<static stmt>");
    r = consumeToken(b, "static");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ifStmt COMMENT?
  //        | whenStmt COMMENT?
  //        | whileStmt COMMENT?
  //        | tryStmt COMMENT?
  //        | forStmt COMMENT?
  //        | blockStmt COMMENT?
  //        | staticStmt COMMENT?
  //        | deferStmt COMMENT?
  //        | asmStmt COMMENT?
  //        | procStmt COMMENT?
  //        | funcStmt COMMENT?
  //        | methodStmt COMMENT?
  //        | iteratorStmt COMMENT?
  //        | macroStmt COMMENT?
  //        | templateStmt COMMENT?
  //        | converterStmt COMMENT?
  //        | typeStmt COMMENT?
  //        | constStmt COMMENT?
  //        | varStmt COMMENT?
  //        | bindStmt COMMENT?
  //        | mixinStmt COMMENT?
  //        | returnStmt COMMENT?
  //        | raiseStmt COMMENT?
  //        | yieldStmt COMMENT?
  //        | discardStmt COMMENT?
  //        | breakStmt COMMENT?
  //        | continueStmt COMMENT?
  //        | pragmaStmt COMMENT?
  //        | importStmt COMMENT?
  //        | exportStmt COMMENT?
  //        | fromStmt COMMENT?
  //        | includeStmt COMMENT?
  //        | exprStmt COMMENT?
  //        | COMMENT
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = stmt_0(b, l + 1);
    if (!r) r = stmt_1(b, l + 1);
    if (!r) r = stmt_2(b, l + 1);
    if (!r) r = stmt_3(b, l + 1);
    if (!r) r = stmt_4(b, l + 1);
    if (!r) r = stmt_5(b, l + 1);
    if (!r) r = stmt_6(b, l + 1);
    if (!r) r = stmt_7(b, l + 1);
    if (!r) r = stmt_8(b, l + 1);
    if (!r) r = stmt_9(b, l + 1);
    if (!r) r = stmt_10(b, l + 1);
    if (!r) r = stmt_11(b, l + 1);
    if (!r) r = stmt_12(b, l + 1);
    if (!r) r = stmt_13(b, l + 1);
    if (!r) r = stmt_14(b, l + 1);
    if (!r) r = stmt_15(b, l + 1);
    if (!r) r = stmt_16(b, l + 1);
    if (!r) r = stmt_17(b, l + 1);
    if (!r) r = stmt_18(b, l + 1);
    if (!r) r = stmt_19(b, l + 1);
    if (!r) r = stmt_20(b, l + 1);
    if (!r) r = stmt_21(b, l + 1);
    if (!r) r = stmt_22(b, l + 1);
    if (!r) r = stmt_23(b, l + 1);
    if (!r) r = stmt_24(b, l + 1);
    if (!r) r = stmt_25(b, l + 1);
    if (!r) r = stmt_26(b, l + 1);
    if (!r) r = stmt_27(b, l + 1);
    if (!r) r = stmt_28(b, l + 1);
    if (!r) r = stmt_29(b, l + 1);
    if (!r) r = stmt_30(b, l + 1);
    if (!r) r = stmt_31(b, l + 1);
    if (!r) r = stmt_32(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ifStmt COMMENT?
  private static boolean stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStmt(b, l + 1);
    r = r && stmt_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // whenStmt COMMENT?
  private static boolean stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenStmt(b, l + 1);
    r = r && stmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // whileStmt COMMENT?
  private static boolean stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whileStmt(b, l + 1);
    r = r && stmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_2_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // tryStmt COMMENT?
  private static boolean stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt(b, l + 1);
    r = r && stmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_3_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // forStmt COMMENT?
  private static boolean stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forStmt(b, l + 1);
    r = r && stmt_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_4_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // blockStmt COMMENT?
  private static boolean stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = blockStmt(b, l + 1);
    r = r && stmt_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_5_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // staticStmt COMMENT?
  private static boolean stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = staticStmt(b, l + 1);
    r = r && stmt_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_6_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // deferStmt COMMENT?
  private static boolean stmt_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deferStmt(b, l + 1);
    r = r && stmt_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_7_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // asmStmt COMMENT?
  private static boolean stmt_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmStmt(b, l + 1);
    r = r && stmt_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_8_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // procStmt COMMENT?
  private static boolean stmt_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procStmt(b, l + 1);
    r = r && stmt_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_9_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // funcStmt COMMENT?
  private static boolean stmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = funcStmt(b, l + 1);
    r = r && stmt_10_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_10_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // methodStmt COMMENT?
  private static boolean stmt_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodStmt(b, l + 1);
    r = r && stmt_11_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_11_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // iteratorStmt COMMENT?
  private static boolean stmt_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = iteratorStmt(b, l + 1);
    r = r && stmt_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_12_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // macroStmt COMMENT?
  private static boolean stmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = macroStmt(b, l + 1);
    r = r && stmt_13_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_13_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_13_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // templateStmt COMMENT?
  private static boolean stmt_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = templateStmt(b, l + 1);
    r = r && stmt_14_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_14_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_14_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // converterStmt COMMENT?
  private static boolean stmt_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = converterStmt(b, l + 1);
    r = r && stmt_15_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_15_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_15_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // typeStmt COMMENT?
  private static boolean stmt_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeStmt(b, l + 1);
    r = r && stmt_16_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_16_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_16_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // constStmt COMMENT?
  private static boolean stmt_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constStmt(b, l + 1);
    r = r && stmt_17_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_17_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_17_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // varStmt COMMENT?
  private static boolean stmt_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varStmt(b, l + 1);
    r = r && stmt_18_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_18_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_18_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // bindStmt COMMENT?
  private static boolean stmt_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bindStmt(b, l + 1);
    r = r && stmt_19_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_19_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_19_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // mixinStmt COMMENT?
  private static boolean stmt_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mixinStmt(b, l + 1);
    r = r && stmt_20_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_20_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_20_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // returnStmt COMMENT?
  private static boolean stmt_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_21")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = returnStmt(b, l + 1);
    r = r && stmt_21_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_21_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_21_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // raiseStmt COMMENT?
  private static boolean stmt_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_22")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = raiseStmt(b, l + 1);
    r = r && stmt_22_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_22_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_22_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // yieldStmt COMMENT?
  private static boolean stmt_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_23")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = yieldStmt(b, l + 1);
    r = r && stmt_23_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_23_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_23_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // discardStmt COMMENT?
  private static boolean stmt_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_24")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = discardStmt(b, l + 1);
    r = r && stmt_24_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_24_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_24_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // breakStmt COMMENT?
  private static boolean stmt_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_25")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = breakStmt(b, l + 1);
    r = r && stmt_25_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_25_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_25_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // continueStmt COMMENT?
  private static boolean stmt_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_26")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = continueStmt(b, l + 1);
    r = r && stmt_26_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_26_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_26_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // pragmaStmt COMMENT?
  private static boolean stmt_27(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_27")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragmaStmt(b, l + 1);
    r = r && stmt_27_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_27_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_27_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // importStmt COMMENT?
  private static boolean stmt_28(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_28")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt(b, l + 1);
    r = r && stmt_28_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_28_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_28_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // exportStmt COMMENT?
  private static boolean stmt_29(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_29")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt(b, l + 1);
    r = r && stmt_29_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_29_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_29_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // fromStmt COMMENT?
  private static boolean stmt_30(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_30")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fromStmt(b, l + 1);
    r = r && stmt_30_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_30_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_30_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // includeStmt COMMENT?
  private static boolean stmt_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_31")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = includeStmt(b, l + 1);
    r = r && stmt_31_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_31_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_31_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // exprStmt COMMENT?
  private static boolean stmt_32(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_32")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprStmt(b, l + 1);
    r = r && stmt_32_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean stmt_32_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_32_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // stmt ((semicolon | IND_EQ) stmt)*
  public static boolean stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMTS, "<stmts>");
    r = stmt(b, l + 1);
    r = r && stmts_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((semicolon | IND_EQ) stmt)*
  private static boolean stmts_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmts_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmts_1", c)) break;
    }
    return true;
  }

  // (semicolon | IND_EQ) stmt
  private static boolean stmts_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmts_1_0_0(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // semicolon | IND_EQ
  private static boolean stmts_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1_0_0")) return false;
    boolean r;
    r = semicolon(b, l + 1);
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  /* ********************************************************** */
  // '`' (KEYW|IDENT|literal|operator|'('|')'|'['|']'|'{'|'}'|'=')+ '`'|IDENT|KEYW
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = symbol_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, KEYW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '`' (KEYW|IDENT|literal|operator|'('|')'|'['|']'|'{'|'}'|'=')+ '`'
  private static boolean symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "`");
    r = r && symbol_0_1(b, l + 1);
    r = r && consumeToken(b, "`");
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYW|IDENT|literal|operator|'('|')'|'['|']'|'{'|'}'|'=')+
  private static boolean symbol_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYW|IDENT|literal|operator|'('|')'|'['|']'|'{'|'}'|'='
  private static boolean symbol_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, KEYW);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = literal(b, l + 1);
    if (!r) r = operator(b, l + 1);
    if (!r) r = consumeToken(b, "(");
    if (!r) r = consumeToken(b, ")");
    if (!r) r = consumeToken(b, "[");
    if (!r) r = consumeToken(b, "]");
    if (!r) r = consumeToken(b, "{");
    if (!r) r = consumeToken(b, "}");
    if (!r) r = consumeToken(b, "=");
    return r;
  }

  /* ********************************************************** */
  // 'template' symbol oprCombo? <<optInd routine>>
  public static boolean templateStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_STMT, "<template stmt>");
    r = consumeToken(b, "template");
    r = r && symbol(b, l + 1);
    r = r && templateStmt_2(b, l + 1);
    r = r && optInd(b, l + 1, routine_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean templateStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateStmt_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DEDENT | <<eof>>
  public static boolean termInd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termInd")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_IND, "<term ind>");
    r = consumeToken(b, DEDENT);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'try' colcom <<optInd stmts>>
  //              (<<optInd ('except' exprs colcom <<optInd stmts>>)>>)*
  //              (<<optInd ('finally' colcom <<optInd stmts>>)>>)?
  public static boolean tryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPR, "<try expr>");
    r = consumeToken(b, "try");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    r = r && tryExpr_3(b, l + 1);
    r = r && tryExpr_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (<<optInd ('except' exprs colcom <<optInd stmts>>)>>)*
  private static boolean tryExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpr_3", c)) break;
    }
    return true;
  }

  // <<optInd ('except' exprs colcom <<optInd stmts>>)>>
  private static boolean tryExpr_3_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr_3_0_0_0_parser_);
  }

  // 'except' exprs colcom <<optInd stmts>>
  private static boolean tryExpr_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<optInd ('finally' colcom <<optInd stmts>>)>>)?
  private static boolean tryExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4")) return false;
    tryExpr_4_0(b, l + 1);
    return true;
  }

  // <<optInd ('finally' colcom <<optInd stmts>>)>>
  private static boolean tryExpr_4_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr_4_0_0_0_parser_);
  }

  // 'finally' colcom <<optInd stmts>>
  private static boolean tryExpr_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "finally");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' colcom <<optInd stmts>>
  //              (IND_EQ? 'except' exprs colcom <<optInd stmts>>)*
  //              (IND_EQ? 'finally' colcom <<optInd stmts>>)?
  public static boolean tryStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, "<try stmt>");
    r = consumeToken(b, "try");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    r = r && tryStmt_3(b, l + 1);
    r = r && tryStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ? 'except' exprs colcom <<optInd stmts>>)*
  private static boolean tryStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ? 'except' exprs colcom <<optInd stmts>>
  private static boolean tryStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_3_0_0(b, l + 1);
    r = r && consumeToken(b, "except");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ?
  private static boolean tryStmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0_0")) return false;
    consumeToken(b, IND_EQ);
    return true;
  }

  // (IND_EQ? 'finally' colcom <<optInd stmts>>)?
  private static boolean tryStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4")) return false;
    tryStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ? 'finally' colcom <<optInd stmts>>
  private static boolean tryStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_4_0_0(b, l + 1);
    r = r && consumeToken(b, "finally");
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ?
  private static boolean tryStmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4_0_0")) return false;
    consumeToken(b, IND_EQ);
    return true;
  }

  /* ********************************************************** */
  // (typeClassParam (',' typeClassParam)*)? pragma? ('of' (typeDesc (',' typeDesc)*)?)?
  public static boolean typeClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CLASS, "<type class>");
    r = typeClass_0(b, l + 1);
    r = r && typeClass_1(b, l + 1);
    r = r && typeClass_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (typeClassParam (',' typeClassParam)*)?
  private static boolean typeClass_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_0")) return false;
    typeClass_0_0(b, l + 1);
    return true;
  }

  // typeClassParam (',' typeClassParam)*
  private static boolean typeClass_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeClassParam(b, l + 1);
    r = r && typeClass_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' typeClassParam)*
  private static boolean typeClass_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeClass_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeClass_0_0_1", c)) break;
    }
    return true;
  }

  // ',' typeClassParam
  private static boolean typeClass_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && typeClassParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pragma?
  private static boolean typeClass_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  // ('of' (typeDesc (',' typeDesc)*)?)?
  private static boolean typeClass_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2")) return false;
    typeClass_2_0(b, l + 1);
    return true;
  }

  // 'of' (typeDesc (',' typeDesc)*)?
  private static boolean typeClass_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "of");
    r = r && typeClass_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc (',' typeDesc)*)?
  private static boolean typeClass_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2_0_1")) return false;
    typeClass_2_0_1_0(b, l + 1);
    return true;
  }

  // typeDesc (',' typeDesc)*
  private static boolean typeClass_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    r = r && typeClass_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' typeDesc)*
  private static boolean typeClass_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeClass_2_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeClass_2_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' typeDesc
  private static boolean typeClass_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_2_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('var'|'out')? symbol
  public static boolean typeClassParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClassParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CLASS_PARAM, "<type class param>");
    r = typeClassParam_0(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('var'|'out')?
  private static boolean typeClassParam_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClassParam_0")) return false;
    typeClassParam_0_0(b, l + 1);
    return true;
  }

  // 'var'|'out'
  private static boolean typeClassParam_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClassParam_0_0")) return false;
    boolean r;
    r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "out");
    return r;
  }

  /* ********************************************************** */
  // identWithPragmaDot genericParams? '=' <<optInd typeDefAux>>
  //             identVisDot genericParams? pragma '=' <<optInd typeDefAux>>
  public static boolean typeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = identWithPragmaDot(b, l + 1);
    r = r && typeDef_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDefAux_parser_);
    r = r && identVisDot(b, l + 1);
    r = r && typeDef_5(b, l + 1);
    r = r && pragma(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDefAux_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // genericParams?
  private static boolean typeDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_1")) return false;
    genericParams(b, l + 1);
    return true;
  }

  // genericParams?
  private static boolean typeDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_5")) return false;
    genericParams(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)?
  //              | 'concept' typeClass
  public static boolean typeDefAux(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_AUX, "<type def aux>");
    r = typeDefAux_0(b, l + 1);
    if (!r) r = typeDefAux_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // simpleExpr ('not' expr)?
  private static boolean typeDefAux_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && typeDefAux_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('not' expr)?
  private static boolean typeDefAux_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux_0_1")) return false;
    typeDefAux_0_1_0(b, l + 1);
    return true;
  }

  // 'not' expr
  private static boolean typeDefAux_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "not");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'concept' typeClass
  private static boolean typeDefAux_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "concept");
    r = r && typeClass(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)?
  public static boolean typeDesc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DESC, "<type desc>");
    r = simpleExpr(b, l + 1);
    r = r && typeDesc_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('not' expr)?
  private static boolean typeDesc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc_1")) return false;
    typeDesc_1_0(b, l + 1);
    return true;
  }

  // 'not' expr
  private static boolean typeDesc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "not");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'var' | 'out' | 'ref' | 'ptr' | 'shared' | 'tuple'
  //            | 'proc' | 'iterator' | 'distinct' | 'object' | 'enum'
  public static boolean typeKeyw(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeKeyw")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_KEYW, "<type keyw>");
    r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "out");
    if (!r) r = consumeToken(b, "ref");
    if (!r) r = consumeToken(b, "ptr");
    if (!r) r = consumeToken(b, "shared");
    if (!r) r = consumeToken(b, "tuple");
    if (!r) r = consumeToken(b, "proc");
    if (!r) r = consumeToken(b, "iterator");
    if (!r) r = consumeToken(b, "distinct");
    if (!r) r = consumeToken(b, "object");
    if (!r) r = consumeToken(b, "enum");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'type' <<optInd typeDef>>
  public static boolean typeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_STMT, "<type stmt>");
    r = consumeToken(b, "type");
    r = r && optInd(b, l + 1, typeDef_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('let'|'var'|'using') <<optInd variable>>
  public static boolean varStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_STMT, "<var stmt>");
    r = varStmt_0(b, l + 1);
    r = r && optInd(b, l + 1, variable_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'let'|'var'|'using'
  private static boolean varStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varStmt_0")) return false;
    boolean r;
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "using");
    return r;
  }

  /* ********************************************************** */
  // '(' <<optInd (identWithPragma (comma identWithPragma)*)>> <<optInd (')')>> '=' <<optInd expr>>
  public static boolean varTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_TUPLE, "<var tuple>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, varTuple_1_0_parser_);
    r = r && optInd(b, l + 1, varTuple_2_0_parser_);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identWithPragma (comma identWithPragma)*
  private static boolean varTuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identWithPragma(b, l + 1);
    r = r && varTuple_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma identWithPragma)*
  private static boolean varTuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varTuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varTuple_1_0_1", c)) break;
    }
    return true;
  }

  // comma identWithPragma
  private static boolean varTuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (')')
  private static boolean varTuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (varTuple|identColonEquals) colonBody?
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = variable_0(b, l + 1);
    r = r && variable_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // varTuple|identColonEquals
  private static boolean variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_0")) return false;
    boolean r;
    r = varTuple(b, l + 1);
    if (!r) r = identColonEquals(b, l + 1);
    return r;
  }

  // colonBody?
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    colonBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'when' condExpr
  public static boolean whenExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_EXPR, "<when expr>");
    r = consumeToken(b, "when");
    r = r && condExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'when' condStmt
  public static boolean whenStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_STMT, "<when stmt>");
    r = consumeToken(b, "when");
    r = r && condStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'while' expr colcom <<optInd stmts>>
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "while");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'yield' <<optInd expr>>?
  public static boolean yieldStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, "<yield stmt>");
    r = consumeToken(b, "yield");
    r = r && yieldStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd expr>>?
  private static boolean yieldStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  static final Parser arrayConstr_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return arrayConstr_1_0(b, l + 1);
    }
  };
  static final Parser arrayConstr_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return arrayConstr_2_0(b, l + 1);
    }
  };
  static final Parser bindStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return bindStmt_1_0(b, l + 1);
    }
  };
  static final Parser castExpr_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return castExpr_3_0(b, l + 1);
    }
  };
  static final Parser castExpr_6_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return castExpr_6_0(b, l + 1);
    }
  };
  static final Parser constant_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return constant(b, l + 1);
    }
  };
  static final Parser exportStmt1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt1_1_0(b, l + 1);
    }
  };
  static final Parser exprColonEqExprs_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprColonEqExprs(b, l + 1);
    }
  };
  static final Parser expr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return expr(b, l + 1);
    }
  };
  static final Parser exprs_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprs(b, l + 1);
    }
  };
  static final Parser genericParams_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParams_1_0(b, l + 1);
    }
  };
  static final Parser genericParams_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParams_2_0(b, l + 1);
    }
  };
  static final Parser importStmt1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt1_1_0(b, l + 1);
    }
  };
  static final Parser mixinStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return mixinStmt_1_0(b, l + 1);
    }
  };
  static final Parser par1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return par1(b, l + 1);
    }
  };
  static final Parser par_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return par_2_0(b, l + 1);
    }
  };
  static final Parser pragma_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pragma_1_0(b, l + 1);
    }
  };
  static final Parser pragma_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pragma_2_0(b, l + 1);
    }
  };
  static final Parser primarySuffix2_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix2_1_0(b, l + 1);
    }
  };
  static final Parser primarySuffix3_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix3_2_0(b, l + 1);
    }
  };
  static final Parser primarySuffix4_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix4_2_0(b, l + 1);
    }
  };
  static final Parser primary_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primary(b, l + 1);
    }
  };
  static final Parser routine_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return routine(b, l + 1);
    }
  };
  static final Parser stmts_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return stmts(b, l + 1);
    }
  };
  static final Parser symbol_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return symbol(b, l + 1);
    }
  };
  static final Parser tryExpr_3_0_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tryExpr_3_0_0_0(b, l + 1);
    }
  };
  static final Parser tryExpr_4_0_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tryExpr_4_0_0_0(b, l + 1);
    }
  };
  static final Parser typeDefAux_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDefAux(b, l + 1);
    }
  };
  static final Parser typeDef_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDef(b, l + 1);
    }
  };
  static final Parser typeDesc_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDesc(b, l + 1);
    }
  };
  static final Parser varTuple_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return varTuple_1_0(b, l + 1);
    }
  };
  static final Parser varTuple_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return varTuple_2_0(b, l + 1);
    }
  };
  static final Parser variable_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return variable(b, l + 1);
    }
  };
}
