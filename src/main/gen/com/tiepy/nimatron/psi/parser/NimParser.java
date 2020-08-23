// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tiepy.nimatron.psi.NimElementTypes.*;
import static com.tiepy.nimatron.manualParsing.NimParserUtil.*;
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
  // plusExpr (OP7 <<optInd plusExpr>>)*
  static boolean ampExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = plusExpr(b, l + 1);
    r = r && ampExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP7 <<optInd plusExpr>>)*
  private static boolean ampExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ampExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ampExpr_1", c)) break;
    }
    return true;
  }

  // OP7 <<optInd plusExpr>>
  private static boolean ampExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP7);
    r = r && optInd(b, l + 1, plusExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cmpExpr (OP4 <<optInd cmpExpr>>)*
  static boolean andExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmpExpr(b, l + 1);
    r = r && andExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP4 <<optInd cmpExpr>>)*
  private static boolean andExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!andExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "andExpr_1", c)) break;
    }
    return true;
  }

  // OP4 <<optInd cmpExpr>>
  private static boolean andExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP4);
    r = r && optInd(b, l + 1, cmpExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@'? '[' (<<optInd (exprColonEqExpr comma?)>>)* optPar ']'
  public static boolean arrayConstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CONSTR, "<array constr>");
    r = arrayConstr_0(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && arrayConstr_2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@'?
  private static boolean arrayConstr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_0")) return false;
    consumeToken(b, "@");
    return true;
  }

  // (<<optInd (exprColonEqExpr comma?)>>)*
  private static boolean arrayConstr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayConstr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayConstr_2", c)) break;
    }
    return true;
  }

  // <<optInd (exprColonEqExpr comma?)>>
  private static boolean arrayConstr_2_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, arrayConstr_2_0_0_0_parser_);
  }

  // exprColonEqExpr comma?
  private static boolean arrayConstr_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && arrayConstr_2_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean arrayConstr_2_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0_0_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // assignExpr (OP1 <<optInd assignExpr>>)*
  static boolean arrowExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignExpr(b, l + 1);
    r = r && arrowExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP1 <<optInd assignExpr>>)*
  private static boolean arrowExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrowExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrowExpr_1", c)) break;
    }
    return true;
  }

  // OP1 <<optInd assignExpr>>
  private static boolean arrowExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP1);
    r = r && optInd(b, l + 1, assignExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'asm' pragma? asmStmt1
  public static boolean asmStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASM_STMT, "<asm stmt>");
    r = consumeToken(b, "asm");
    p = r; // pin = 1
    r = r && report_error_(b, asmStmt_1(b, l + 1));
    r = p && asmStmt1(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // pragma?
  private static boolean asmStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStmt_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STR_LIT
  static boolean asmStmt1(PsiBuilder b, int l) {
    return consumeToken(b, STR_LIT);
  }

  /* ********************************************************** */
  // orExpr (OP2 <<optInd orExpr>>)*
  static boolean assignExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = orExpr(b, l + 1);
    r = r && assignExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP2 <<optInd orExpr>>)*
  private static boolean assignExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!assignExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignExpr_1", c)) break;
    }
    return true;
  }

  // OP2 <<optInd orExpr>>
  private static boolean assignExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP2);
    r = r && optInd(b, l + 1, orExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bind' <<optInd (qualifiedIdent (comma qualifiedIdent)*)>>
  public static boolean bindStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BIND_STMT, "<bind stmt>");
    r = consumeToken(b, "bind");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, bindStmt_1_0_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'block' symbol? colcom inlineStmt
  public static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, "<block stmt>");
    r = consumeToken(b, "block");
    p = r; // pin = 1
    r = r && report_error_(b, blockStmt_1(b, l + 1));
    r = p && report_error_(b, colcom(b, l + 1)) && r;
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, "<break stmt>");
    r = consumeToken(b, "break");
    p = r; // pin = 1
    r = r && breakStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean breakStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'case' expr ':'? COMMENT? caseStmt0
  public static boolean caseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_STMT, "<case stmt>");
    r = consumeToken(b, "case");
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, caseStmt_2(b, l + 1)) && r;
    r = p && report_error_(b, caseStmt_3(b, l + 1)) && r;
    r = p && caseStmt0(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  /* ********************************************************** */
  // caseStmt1 | caseStmt2
  static boolean caseStmt0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt0")) return false;
    boolean r;
    r = caseStmt1(b, l + 1);
    if (!r) r = caseStmt2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INDENT ofBranches termInd
  static boolean caseStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt1")) return false;
    if (!nextTokenIs(b, INDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && ofBranches(b, l + 1);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq ofBranches
  static boolean caseStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt2")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && ofBranches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'cast' '[' <<optInd typeDesc>> optPar ']' '(' <<optInd expr>> optPar ')'
  public static boolean castExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXPR, "<cast expr>");
    r = consumeToken(b, "cast");
    r = r && consumeToken(b, "[");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "(");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sliceExpr (OP5 <<optInd sliceExpr>>)*
  static boolean cmpExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sliceExpr(b, l + 1);
    r = r && cmpExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP5 <<optInd sliceExpr>>)*
  private static boolean cmpExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmpExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmpExpr_1", c)) break;
    }
    return true;
  }

  // OP5 <<optInd sliceExpr>>
  private static boolean cmpExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP5);
    r = r && optInd(b, l + 1, sliceExpr_parser_);
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
  // colcom inlineStmt postExprBlocks?
  public static boolean colonBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON_BODY, "<colon body>");
    r = colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
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
  // COMMENT
  public static boolean commentStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentStmt")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, COMMENT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // complexStmt | simpleStmt
  public static boolean complexOrSimpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPLEX_OR_SIMPLE_STMT, "<complex or simple stmt>");
    r = complexStmt(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ifStmt | whenStmt | whileStmt
  //                       | tryStmt | forStmt
  //                       | blockStmt | staticStmt | deferStmt | asmStmt
  //                       | procStmt
  //                       | funcStmt
  //                       | methodStmt
  //                       | iteratorStmt
  //                       | macroStmt
  //                       | templateStmt
  //                       | converterStmt
  //                       | typeStmt
  //                       | constStmt
  //                       | varStmt
  //                       | bindStmt | mixinStmt
  //                       | caseStmt
  static boolean complexStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexStmt")) return false;
    boolean r;
    r = ifStmt(b, l + 1);
    if (!r) r = whenStmt(b, l + 1);
    if (!r) r = whileStmt(b, l + 1);
    if (!r) r = tryStmt(b, l + 1);
    if (!r) r = forStmt(b, l + 1);
    if (!r) r = blockStmt(b, l + 1);
    if (!r) r = staticStmt(b, l + 1);
    if (!r) r = deferStmt(b, l + 1);
    if (!r) r = asmStmt(b, l + 1);
    if (!r) r = procStmt(b, l + 1);
    if (!r) r = funcStmt(b, l + 1);
    if (!r) r = methodStmt(b, l + 1);
    if (!r) r = iteratorStmt(b, l + 1);
    if (!r) r = macroStmt(b, l + 1);
    if (!r) r = templateStmt(b, l + 1);
    if (!r) r = converterStmt(b, l + 1);
    if (!r) r = typeStmt(b, l + 1);
    if (!r) r = constStmt(b, l + 1);
    if (!r) r = varStmt(b, l + 1);
    if (!r) r = bindStmt(b, l + 1);
    if (!r) r = mixinStmt(b, l + 1);
    if (!r) r = caseStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expr colcom expr condExpr1* condExpr2
  public static boolean condExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<cond expr>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && condExpr_3(b, l + 1);
    r = r && condExpr2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // condExpr1*
  private static boolean condExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condExpr1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condExpr_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'elif' expr colcom expr
  static boolean condExpr1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'else' colcom expr
  static boolean condExpr2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr colcom inlineStmt COMMENT? condStmt1* condStmt2?
  public static boolean condStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
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

  // condStmt1*
  private static boolean condStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condStmt1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condStmt_4", c)) break;
    }
    return true;
  }

  // condStmt2?
  private static boolean condStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_5")) return false;
    condStmt2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ind_eq 'elif' expr colcom inlineStmt
  static boolean condStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt1")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'else' colcom inlineStmt
  static boolean condStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt2")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'const' <<section constant>>
  public static boolean constStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONST_STMT, "<const stmt>");
    r = consumeToken(b, "const");
    p = r; // pin = 1
    r = r && section(b, l + 1, constant_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (varTuple | identWithPragma) (colon typeDesc)? '=' <<optInd expr>> indAndComment
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = constant_0(b, l + 1);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    r = r && indAndComment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // varTuple | identWithPragma
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
  // 'continue' <<optInd expr>>?
  public static boolean continueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, "<continue stmt>");
    r = consumeToken(b, "continue");
    p = r; // pin = 1
    r = r && continueStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean continueStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'converter' <<optInd namedRoutine>>
  public static boolean converterStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converterStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONVERTER_STMT, "<converter stmt>");
    r = consumeToken(b, "converter");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identWithPragma (comma identWithPragma)* comma?
  //                     ( ':' <<optInd typeDesc>>)? ('=' <<optInd expr>>)?
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

  // (comma identWithPragma)*
  private static boolean declColonEquals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declColonEquals_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declColonEquals_1", c)) break;
    }
    return true;
  }

  // comma identWithPragma
  private static boolean declColonEquals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean declColonEquals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_2")) return false;
    comma(b, l + 1);
    return true;
  }

  // ( ':' <<optInd typeDesc>>)?
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
  // DEDENTX | DEDENT0
  public static boolean dedent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dedent")) return false;
    if (!nextTokenIs(b, "<dedent>", DEDENT0, DEDENTX)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEDENT, "<dedent>");
    r = consumeToken(b, DEDENTX);
    if (!r) r = consumeToken(b, DEDENT0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'defer' colcom inlineStmt
  public static boolean deferStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deferStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFER_STMT, "<defer stmt>");
    r = consumeToken(b, "defer");
    p = r; // pin = 1
    r = r && report_error_(b, colcom(b, l + 1));
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'discard' <<optInd expr>>?
  public static boolean discardStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DISCARD_STMT, "<discard stmt>");
    r = consumeToken(b, "discard");
    p = r; // pin = 1
    r = r && discardStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean discardStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'distinct' <<optInd typeDesc>>
  public static boolean distinctType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "distinctType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISTINCT_TYPE, "<distinct type>");
    r = consumeToken(b, "distinct");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'do' paramsArrow pragma? colcom inlineStmt
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_BLOCK, "<do block>");
    r = consumeToken(b, "do");
    r = r && paramsArrow(b, l + 1);
    r = r && doBlock_2(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
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
  // primary (OP10 <<optInd primary>>)*
  static boolean dollarExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && dollarExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP10 <<optInd primary>>)*
  private static boolean dollarExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dollarExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dollarExpr_1", c)) break;
    }
    return true;
  }

  // OP10 <<optInd primary>>
  private static boolean dollarExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP10);
    r = r && optInd(b, l + 1, primary_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' <<optInd typeDesc>>
  public static boolean enumType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_TYPE, "<enum type>");
    r = consumeToken(b, "enum");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'export' (exportStmt1 | exportStmt2)
  public static boolean exportStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT, "<export stmt>");
    r = consumeToken(b, "export");
    p = r; // pin = 1
    r = r && exportStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // exportStmt1 | exportStmt2
  private static boolean exportStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_1")) return false;
    boolean r;
    r = exportStmt1(b, l + 1);
    if (!r) r = exportStmt2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<optInd (expr (comma ind_eq* expr)*)>>
  static boolean exportStmt1(PsiBuilder b, int l) {
    return optInd(b, l + 1, exportStmt1_0_0_parser_);
  }

  // expr (comma ind_eq* expr)*
  private static boolean exportStmt1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exportStmt1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean exportStmt1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exportStmt1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt1_0_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean exportStmt1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && exportStmt1_0_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean exportStmt1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt1_0_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt1_0_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<optInd (expr exportStmt3)>>
  static boolean exportStmt2(PsiBuilder b, int l) {
    return optInd(b, l + 1, exportStmt2_0_0_parser_);
  }

  // expr exportStmt3
  private static boolean exportStmt2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exportStmt3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'except' <<optInd (expr (comma ind_eq* expr)*)>>
  static boolean exportStmt3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, exportStmt3_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (comma ind_eq* expr)*
  private static boolean exportStmt3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exportStmt3_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean exportStmt3_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt3_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exportStmt3_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt3_1_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean exportStmt3_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt3_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && exportStmt3_1_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean exportStmt3_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt3_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt3_1_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expr1 | simpleExpr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = expr1(b, l + 1);
    if (!r) r = simpleExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // blockStmt
  //                 | ifExpr
  //                 | whenExpr
  // //              | caseStmt
  //                 | forStmt
  //                 | tryExpr
  static boolean expr1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr1")) return false;
    boolean r;
    r = blockStmt(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = whenExpr(b, l + 1);
    if (!r) r = forStmt(b, l + 1);
    if (!r) r = tryExpr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expr (exprColonEqExpr1 expr)?
  public static boolean exprColonEqExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COLON_EQ_EXPR, "<expr colon eq expr>");
    r = expr(b, l + 1);
    r = r && exprColonEqExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr1 expr)?
  private static boolean exprColonEqExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr_1")) return false;
    exprColonEqExpr_1_0(b, l + 1);
    return true;
  }

  // exprColonEqExpr1 expr
  private static boolean exprColonEqExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':'|'='
  static boolean exprColonEqExpr1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr1")) return false;
    boolean r;
    r = consumeToken(b, ":");
    if (!r) r = consumeToken(b, "=");
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
  // simpleExpr (exprStmt1 | exprStmt2)? exprStmt1?
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = simpleExpr(b, l + 1);
    r = r && exprStmt_1(b, l + 1);
    r = r && exprStmt_2(b, l + 1);
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

  // exprStmt1?
  private static boolean exprStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_2")) return false;
    exprStmt1(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' <<optInd (expr colonBody?)>>
  static boolean exprStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, exprStmt1_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr colonBody?
  private static boolean exprStmt1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprStmt1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colonBody?
  private static boolean exprStmt1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt1_1_0_1")) return false;
    colonBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr (comma expr)* postExprBlocks
  static boolean exprStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprStmt2_1(b, l + 1);
    r = r && postExprBlocks(b, l + 1);
    exit_section_(b, m, null, r);
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
  // 'for' (identWithPragma (comma identWithPragma)*) 'in' expr colcom inlineStmt
  public static boolean forStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, "<for stmt>");
    r = consumeToken(b, "for");
    p = r; // pin = 1
    r = r && report_error_(b, forStmt_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, "in")) && r;
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && report_error_(b, colcom(b, l + 1)) && r;
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // 'from' expr 'import' <<optInd (expr (comma ind_eq* expr)*)>>
  public static boolean fromStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FROM_STMT, "<from stmt>");
    r = consumeToken(b, "from");
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, "import")) && r;
    r = p && optInd(b, l + 1, fromStmt_3_0_parser_) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expr (comma ind_eq* expr)*
  private static boolean fromStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && fromStmt_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean fromStmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fromStmt_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromStmt_3_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean fromStmt_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && fromStmt_3_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean fromStmt_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_3_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromStmt_3_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'func' <<optInd namedRoutine>>
  public static boolean funcStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNC_STMT, "<func stmt>");
    r = consumeToken(b, "func");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GENERALIZED_STR_LIT
  public static boolean generalizedLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generalizedLit")) return false;
    if (!nextTokenIs(b, GENERALIZED_STR_LIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERALIZED_STR_LIT);
    exit_section_(b, m, GENERALIZED_LIT, r);
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
  // '[' <<optInd ((genericParam ((comma|semicolon) genericParam)*)?)>> optPar ']'
  public static boolean genericParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParams")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAMS, "<generic params>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, genericParams_1_0_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
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
  // identOrLiteral1
  public static boolean identOrLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identOrLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_OR_LITERAL, "<ident or literal>");
    r = identOrLiteral1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // generalizedLit | symbol | literal
  //                           | par | arrayConstr | setOrTableConstr
  //                           | castExpr
  static boolean identOrLiteral1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identOrLiteral1")) return false;
    boolean r;
    r = generalizedLit(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = par(b, l + 1);
    if (!r) r = arrayConstr(b, l + 1);
    if (!r) r = setOrTableConstr(b, l + 1);
    if (!r) r = castExpr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // symbol oprCombo?
  public static boolean identVis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS, "<ident vis>");
    r = symbol(b, l + 1);
    r = r && identVis_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean identVis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVis_1")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol ('.' <<optInd symbol>>)? oprCombo?
  public static boolean identVisDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS_DOT, "<ident vis dot>");
    r = symbol(b, l + 1);
    r = r && identVisDot_1(b, l + 1);
    r = r && identVisDot_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' <<optInd symbol>>)?
  private static boolean identVisDot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_1")) return false;
    identVisDot_1_0(b, l + 1);
    return true;
  }

  // '.' <<optInd symbol>>
  private static boolean identVisDot_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, symbol_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // oprCombo?
  private static boolean identVisDot_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_2")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identVis pragma?
  public static boolean identWithPragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_WITH_PRAGMA, "<ident with pragma>");
    r = identVis(b, l + 1);
    r = r && identWithPragma_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean identWithPragma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identWithPragma_1")) return false;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "if");
    p = r; // pin = 1
    r = r && condStmt(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'import' (importStmt1 | importStmt2)
  public static boolean importStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = consumeToken(b, "import");
    p = r; // pin = 1
    r = r && importStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // importStmt1 | importStmt2
  private static boolean importStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_1")) return false;
    boolean r;
    r = importStmt1(b, l + 1);
    if (!r) r = importStmt2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<optInd (expr (comma ind_eq* expr)*)>>
  static boolean importStmt1(PsiBuilder b, int l) {
    return optInd(b, l + 1, importStmt1_0_0_parser_);
  }

  // expr (comma ind_eq* expr)*
  private static boolean importStmt1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && importStmt1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean importStmt1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importStmt1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt1_0_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean importStmt1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && importStmt1_0_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean importStmt1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt1_0_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt1_0_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<optInd (expr importStmt3)>>
  static boolean importStmt2(PsiBuilder b, int l) {
    return optInd(b, l + 1, importStmt2_0_0_parser_);
  }

  // expr importStmt3
  private static boolean importStmt2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && importStmt3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'except' <<optInd (expr (comma ind_eq* expr)*)>>
  static boolean importStmt3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, importStmt3_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (comma ind_eq* expr)*
  private static boolean importStmt3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && importStmt3_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean importStmt3_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt3_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importStmt3_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt3_1_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean importStmt3_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt3_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && importStmt3_1_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean importStmt3_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt3_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt3_1_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'include' <<optInd (expr (comma ind_eq* expr)*)>>
  public static boolean includeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, "<include stmt>");
    r = consumeToken(b, "include");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, includeStmt_1_0_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expr (comma ind_eq* expr)*
  private static boolean includeStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && includeStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ind_eq* expr)*
  private static boolean includeStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!includeStmt_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "includeStmt_1_0_1", c)) break;
    }
    return true;
  }

  // comma ind_eq* expr
  private static boolean includeStmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && includeStmt_1_0_1_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean includeStmt_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "includeStmt_1_0_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<optInd COMMENT>>?
  public static boolean indAndComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indAndComment")) return false;
    Marker m = enter_section_(b, l, _NONE_, IND_AND_COMMENT, "<ind and comment>");
    optInd(b, l + 1, COMMENT_parser_);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IND_EQX | IND_EQ0
  public static boolean ind_eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ind_eq")) return false;
    if (!nextTokenIs(b, "<ind eq>", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IND_EQ, "<ind eq>");
    r = consumeToken(b, IND_EQX);
    if (!r) r = consumeToken(b, IND_EQ0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INDENT complexOrSimpleStmt ((';' | ind_eq+) complexOrSimpleStmt)* termInd
  static boolean inlineComplex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineComplex")) return false;
    if (!nextTokenIs(b, INDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && inlineComplex_2(b, l + 1);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((';' | ind_eq+) complexOrSimpleStmt)*
  private static boolean inlineComplex_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineComplex_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inlineComplex_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inlineComplex_2", c)) break;
    }
    return true;
  }

  // (';' | ind_eq+) complexOrSimpleStmt
  private static boolean inlineComplex_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineComplex_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inlineComplex_2_0_0(b, l + 1);
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | ind_eq+
  private static boolean inlineComplex_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineComplex_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    if (!r) r = inlineComplex_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq+
  private static boolean inlineComplex_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineComplex_2_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inlineComplex_2_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleStmt (';' simpleStmt)*
  static boolean inlineSimple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineSimple")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleStmt(b, l + 1);
    r = r && inlineSimple_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' simpleStmt)*
  private static boolean inlineSimple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineSimple_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inlineSimple_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inlineSimple_1", c)) break;
    }
    return true;
  }

  // ';' simpleStmt
  private static boolean inlineSimple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineSimple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && simpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inlineComplex | inlineSimple
  public static boolean inlineStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlineStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INLINE_STMT, "<inline stmt>");
    r = inlineComplex(b, l + 1);
    if (!r) r = inlineSimple(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'iterator' <<optInd namedRoutine>>
  public static boolean iteratorStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteratorStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_STMT, "<iterator stmt>");
    r = consumeToken(b, "iterator");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'iterator' <<optInd typeDesc>>
  public static boolean iteratorType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteratorType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_TYPE, "<iterator type>");
    r = consumeToken(b, "iterator");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal1
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = literal1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUM_LIT | STR_LIT | CHAR_LIT | BOOL_LIT | 'nil'
  static boolean literal1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal1")) return false;
    boolean r;
    r = consumeToken(b, NUM_LIT);
    if (!r) r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, BOOL_LIT);
    if (!r) r = consumeToken(b, "nil");
    return r;
  }

  /* ********************************************************** */
  // 'macro' <<optInd namedRoutine>>
  public static boolean macroStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macroStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_STMT, "<macro stmt>");
    r = consumeToken(b, "macro");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'method' <<optInd namedRoutine>>
  public static boolean methodStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METHOD_STMT, "<method stmt>");
    r = consumeToken(b, "method");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'mixin' <<optInd (qualifiedIdent (comma qualifiedIdent)*)>>
  public static boolean mixinStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MIXIN_STMT, "<mixin stmt>");
    r = consumeToken(b, "mixin");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, mixinStmt_1_0_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // ind_eq* (stmt ';'?)? ind_eq*
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    r = r && module_1(b, l + 1);
    r = r && module_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq*
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_0", c)) break;
    }
    return true;
  }

  // (stmt ';'?)?
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    module_1_0(b, l + 1);
    return true;
  }

  // stmt ';'?
  private static boolean module_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && module_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean module_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0_1")) return false;
    consumeToken(b, ";");
    return true;
  }

  // ind_eq*
  private static boolean module_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // dollarExpr (OP9 <<optInd dollarExpr>>)*
  static boolean mulExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dollarExpr(b, l + 1);
    r = r && mulExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP9 <<optInd dollarExpr>>)*
  private static boolean mulExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mulExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mulExpr_1", c)) break;
    }
    return true;
  }

  // OP9 <<optInd dollarExpr>>
  private static boolean mulExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP9);
    r = r && optInd(b, l + 1, dollarExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol oprCombo? routine
  public static boolean namedRoutine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedRoutine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_ROUTINE, "<named routine>");
    r = symbol(b, l + 1);
    r = r && namedRoutine_1(b, l + 1);
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // oprCombo?
  private static boolean namedRoutine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedRoutine_1")) return false;
    oprCombo(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'object' pragma? ('of' typeDesc)? COMMENT? objectPart?
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    r = consumeToken(b, "object");
    r = r && object_1(b, l + 1);
    r = r && object_2(b, l + 1);
    r = r && object_3(b, l + 1);
    r = r && object_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  // ('of' typeDesc)?
  private static boolean object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_2")) return false;
    object_2_0(b, l + 1);
    return true;
  }

  // 'of' typeDesc
  private static boolean object_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "of");
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean object_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_3")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // objectPart?
  private static boolean object_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_4")) return false;
    objectPart(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'of' exprs colcom objectPart
  public static boolean objectBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BRANCH, "<object branch>");
    r = consumeToken(b, "of");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // objectBranch (ind_eq objectBranch)*
  //                         (ind_eq 'elif' expr colcom objectPart)*
  //                         (ind_eq 'else' colcom objectPart)?
  public static boolean objectBranches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BRANCHES, "<object branches>");
    r = objectBranch(b, l + 1);
    r = r && objectBranches_1(b, l + 1);
    r = r && objectBranches_2(b, l + 1);
    r = r && objectBranches_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ind_eq objectBranch)*
  private static boolean objectBranches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectBranches_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectBranches_1", c)) break;
    }
    return true;
  }

  // ind_eq objectBranch
  private static boolean objectBranches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && objectBranch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ind_eq 'elif' expr colcom objectPart)*
  private static boolean objectBranches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectBranches_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectBranches_2", c)) break;
    }
    return true;
  }

  // ind_eq 'elif' expr colcom objectPart
  private static boolean objectBranches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ind_eq 'else' colcom objectPart)?
  private static boolean objectBranches_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_3")) return false;
    objectBranches_3_0(b, l + 1);
    return true;
  }

  // ind_eq 'else' colcom objectPart
  private static boolean objectBranches_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBranches_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'case' identWithPragma ':' typeDesc ':'? COMMENT?
  //             (INDENT objectBranches termInd
  //             | ind_eq objectBranches)
  public static boolean objectCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CASE, "<object case>");
    r = consumeToken(b, "case");
    r = r && identWithPragma(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && typeDesc(b, l + 1);
    r = r && objectCase_4(b, l + 1);
    r = r && objectCase_5(b, l + 1);
    r = r && objectCase_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'?
  private static boolean objectCase_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase_4")) return false;
    consumeToken(b, ":");
    return true;
  }

  // COMMENT?
  private static boolean objectCase_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase_5")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // INDENT objectBranches termInd
  //             | ind_eq objectBranches
  private static boolean objectCase_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = objectCase_6_0(b, l + 1);
    if (!r) r = objectCase_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT objectBranches termInd
  private static boolean objectCase_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && objectBranches(b, l + 1);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq objectBranches
  private static boolean objectCase_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCase_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && objectBranches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((INDENT objectPart (ind_eq objectPart)* termInd)
  //              | objectWhen | objectCase | 'nil' | 'discard' | declColonEquals) COMMENT?
  public static boolean objectPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OBJECT_PART, "<object part>");
    r = objectPart_0(b, l + 1);
    r = r && objectPart_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (INDENT objectPart (ind_eq objectPart)* termInd)
  //              | objectWhen | objectCase | 'nil' | 'discard' | declColonEquals
  private static boolean objectPart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = objectPart_0_0(b, l + 1);
    if (!r) r = objectWhen(b, l + 1);
    if (!r) r = objectCase(b, l + 1);
    if (!r) r = consumeToken(b, "nil");
    if (!r) r = consumeToken(b, "discard");
    if (!r) r = declColonEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT objectPart (ind_eq objectPart)* termInd
  private static boolean objectPart_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && objectPart(b, l + 1);
    r = r && objectPart_0_0_2(b, l + 1);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ind_eq objectPart)*
  private static boolean objectPart_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectPart_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectPart_0_0_2", c)) break;
    }
    return true;
  }

  // ind_eq objectPart
  private static boolean objectPart_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && objectPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean objectPart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectPart_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // &'object' object
  public static boolean objectType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectType")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_TYPE, "<object type>");
    r = objectType_0(b, l + 1);
    p = r; // pin = 1
    r = r && object(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &'object'
  private static boolean objectType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectType_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, "object");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'when' expr colcom objectPart COMMENT?
  //               ('elif' expr colcom objectPart COMMENT?)*
  //               ('else' colcom objectPart COMMENT?)?
  public static boolean objectWhen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_WHEN, "<object when>");
    r = consumeToken(b, "when");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    r = r && objectWhen_4(b, l + 1);
    r = r && objectWhen_5(b, l + 1);
    r = r && objectWhen_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean objectWhen_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_4")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // ('elif' expr colcom objectPart COMMENT?)*
  private static boolean objectWhen_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectWhen_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectWhen_5", c)) break;
    }
    return true;
  }

  // 'elif' expr colcom objectPart COMMENT?
  private static boolean objectWhen_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    r = r && objectWhen_5_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean objectWhen_5_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_5_0_4")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // ('else' colcom objectPart COMMENT?)?
  private static boolean objectWhen_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_6")) return false;
    objectWhen_6_0(b, l + 1);
    return true;
  }

  // 'else' colcom objectPart COMMENT?
  private static boolean objectWhen_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && objectPart(b, l + 1);
    r = r && objectWhen_6_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean objectWhen_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectWhen_6_0_3")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // 'of' exprs colcom inlineStmt
  public static boolean ofBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCH, "<of branch>");
    r = consumeToken(b, "of");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ofBranch (ind_eq ofBranch)* ofBranches1* ofBranches2?
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

  // (ind_eq ofBranch)*
  private static boolean ofBranches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_1", c)) break;
    }
    return true;
  }

  // ind_eq ofBranch
  private static boolean ofBranches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && ofBranch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ofBranches1*
  private static boolean ofBranches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_2", c)) break;
    }
    return true;
  }

  // ofBranches2?
  private static boolean ofBranches_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3")) return false;
    ofBranches2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ind_eq 'elif' expr colcom inlineStmt
  static boolean ofBranches1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches1")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'else' colcom inlineStmt
  static boolean ofBranches2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches2")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP0
  static boolean op0(PsiBuilder b, int l) {
    return consumeToken(b, OP0);
  }

  /* ********************************************************** */
  // OP1
  static boolean op1(PsiBuilder b, int l) {
    return consumeToken(b, OP1);
  }

  /* ********************************************************** */
  // OP2
  static boolean op2(PsiBuilder b, int l) {
    return consumeToken(b, OP2);
  }

  /* ********************************************************** */
  // OP3 | 'or' | 'xor'
  static boolean op3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op3")) return false;
    boolean r;
    r = consumeToken(b, OP3);
    if (!r) r = consumeToken(b, "or");
    if (!r) r = consumeToken(b, "xor");
    return r;
  }

  /* ********************************************************** */
  // OP4 | 'and'
  static boolean op4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op4")) return false;
    boolean r;
    r = consumeToken(b, OP4);
    if (!r) r = consumeToken(b, "and");
    return r;
  }

  /* ********************************************************** */
  // OP5 | 'in' | 'notin' | 'is' | 'isnot' | 'not' | 'of' | 'as'
  static boolean op5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op5")) return false;
    boolean r;
    r = consumeToken(b, OP5);
    if (!r) r = consumeToken(b, "in");
    if (!r) r = consumeToken(b, "notin");
    if (!r) r = consumeToken(b, "is");
    if (!r) r = consumeToken(b, "isnot");
    if (!r) r = consumeToken(b, "not");
    if (!r) r = consumeToken(b, "of");
    if (!r) r = consumeToken(b, "as");
    return r;
  }

  /* ********************************************************** */
  // OP6
  static boolean op6(PsiBuilder b, int l) {
    return consumeToken(b, OP6);
  }

  /* ********************************************************** */
  // OP7
  static boolean op7(PsiBuilder b, int l) {
    return consumeToken(b, OP7);
  }

  /* ********************************************************** */
  // OP8
  static boolean op8(PsiBuilder b, int l) {
    return consumeToken(b, OP8);
  }

  /* ********************************************************** */
  // OP9 | 'div' | 'mod' | 'shl' | 'shr'
  static boolean op9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op9")) return false;
    boolean r;
    r = consumeToken(b, OP9);
    if (!r) r = consumeToken(b, "div");
    if (!r) r = consumeToken(b, "mod");
    if (!r) r = consumeToken(b, "shl");
    if (!r) r = consumeToken(b, "shr");
    return r;
  }

  /* ********************************************************** */
  // operator1
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = operator1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op0 | op1 | op2 | op3 | op4 | op5 | op6 | op7 | op8 | op9
  //            | 'from' | 'static'
  static boolean operator1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator1")) return false;
    boolean r;
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
    return r;
  }

  /* ********************************************************** */
  // OP0|OP1|OP2|OP3|OP4|OP5|OP6|OP7|OP8|OP9|OP10|OPR
  static boolean oprCombo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oprCombo")) return false;
    boolean r;
    r = consumeToken(b, OP0);
    if (!r) r = consumeToken(b, OP1);
    if (!r) r = consumeToken(b, OP2);
    if (!r) r = consumeToken(b, OP3);
    if (!r) r = consumeToken(b, OP4);
    if (!r) r = consumeToken(b, OP5);
    if (!r) r = consumeToken(b, OP6);
    if (!r) r = consumeToken(b, OP7);
    if (!r) r = consumeToken(b, OP8);
    if (!r) r = consumeToken(b, OP9);
    if (!r) r = consumeToken(b, OP10);
    if (!r) r = consumeToken(b, OPR);
    return r;
  }

  /* ********************************************************** */
  // <<RULE>> | (INDENT COMMENT? <<RULE>>? (ind_eq <<RULE>>?)* termInd)
  public static boolean optInd(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = optInd_1(b, l + 1, _RULE);
    exit_section_(b, m, OPT_IND, r);
    return r;
  }

  // INDENT COMMENT? <<RULE>>? (ind_eq <<RULE>>?)* termInd
  private static boolean optInd_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && optInd_1_1(b, l + 1);
    r = r && optInd_1_2(b, l + 1, _RULE);
    r = r && optInd_1_3(b, l + 1, _RULE);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean optInd_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd_1_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // <<RULE>>?
  private static boolean optInd_1_2(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_2")) return false;
    _RULE.parse(b, l);
    return true;
  }

  // (ind_eq <<RULE>>?)*
  private static boolean optInd_1_3(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd_1_3_0(b, l + 1, _RULE)) break;
      if (!empty_element_parsed_guard_(b, "optInd_1_3", c)) break;
    }
    return true;
  }

  // ind_eq <<RULE>>?
  private static boolean optInd_1_3_0(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && optInd_1_3_0_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>?
  private static boolean optInd_1_3_0_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1_3_0_1")) return false;
    _RULE.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // (INDENT | ind_eq)?
  public static boolean optPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optPar")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_PAR, "<opt par>");
    optPar_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // INDENT | ind_eq
  private static boolean optPar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optPar_0")) return false;
    boolean r;
    r = consumeToken(b, INDENT);
    if (!r) r = ind_eq(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // andExpr (OP3 <<optInd andExpr>>)*
  static boolean orExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = andExpr(b, l + 1);
    r = r && orExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP3 <<optInd andExpr>>)*
  private static boolean orExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!orExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orExpr_1", c)) break;
    }
    return true;
  }

  // OP3 <<optInd andExpr>>
  private static boolean orExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP3);
    r = r && optInd(b, l + 1, andExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'out' <<optInd typeDesc>>
  public static boolean outType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUT_TYPE, "<out type>");
    r = consumeToken(b, "out");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' <<optInd par1>> optPar ')'
  public static boolean par(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR, "<par>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, par1_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // par2 | par3 | pragmaStmt | par4
  static boolean par1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par1")) return false;
    boolean r;
    r = par2(b, l + 1);
    if (!r) r = par3(b, l + 1);
    if (!r) r = pragmaStmt(b, l + 1);
    if (!r) r = par4(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // complexOrSimpleStmt (';' complexOrSimpleStmt)*
  static boolean par2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexOrSimpleStmt(b, l + 1);
    r = r && par2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par2_1", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  static boolean par3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && par3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par3_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr (par5 | par6)
  static boolean par4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && par4_1(b, l + 1);
    exit_section_(b, m, null, r);
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
  // '=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?
  static boolean par5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && par5_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?
  private static boolean par5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2")) return false;
    par5_2_0(b, l + 1);
    return true;
  }

  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean par5_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && par5_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par5_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par5_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par5_2_0_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par5_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par5_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?
  static boolean par6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expr(b, l + 1);
    r = r && par6_2(b, l + 1);
    exit_section_(b, m, null, r);
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
  // '{' inlineStmt '}'
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = consumeToken(b, "{");
    r = r && inlineStmt(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mulExpr (OP8 <<optInd mulExpr>>)*
  static boolean plusExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mulExpr(b, l + 1);
    r = r && plusExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP8 <<optInd mulExpr>>)*
  private static boolean plusExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!plusExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plusExpr_1", c)) break;
    }
    return true;
  }

  // OP8 <<optInd mulExpr>>
  private static boolean plusExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP8);
    r = r && optInd(b, l + 1, mulExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' inlineStmt? postExprBlocks0*
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

  // inlineStmt?
  private static boolean postExprBlocks_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_1")) return false;
    inlineStmt(b, l + 1);
    return true;
  }

  // postExprBlocks0*
  private static boolean postExprBlocks_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postExprBlocks0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postExprBlocks_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // postExprBlocks1
  //                           | postExprBlocks2
  //                           | postExprBlocks3
  //                           | postExprBlocks4
  //                           | postExprBlocks5
  static boolean postExprBlocks0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks0")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    r = postExprBlocks1(b, l + 1);
    if (!r) r = postExprBlocks2(b, l + 1);
    if (!r) r = postExprBlocks3(b, l + 1);
    if (!r) r = postExprBlocks4(b, l + 1);
    if (!r) r = postExprBlocks5(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ind_eq doBlock
  static boolean postExprBlocks1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks1")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && doBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'of' exprs ':' inlineStmt
  static boolean postExprBlocks2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks2")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "of");
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'elif' expr ':' inlineStmt
  static boolean postExprBlocks3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks3")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'except' exprs ':' inlineStmt
  static boolean postExprBlocks4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks4")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "except");
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ind_eq 'else' ':' inlineStmt
  static boolean postExprBlocks5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks5")) return false;
    if (!nextTokenIs(b, "", IND_EQ0, IND_EQX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && consumeToken(b, ":");
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{.' <<optInd ((exprColonEqExpr comma?)*)>> optPar pragma1
  public static boolean pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA, "<pragma>");
    r = consumeToken(b, "{.");
    r = r && optInd(b, l + 1, pragma_1_0_parser_);
    r = r && optPar(b, l + 1);
    r = r && pragma1(b, l + 1);
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

  /* ********************************************************** */
  // '.}' | '}'
  static boolean pragma1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma1")) return false;
    boolean r;
    r = consumeToken(b, ".}");
    if (!r) r = consumeToken(b, "}");
    return r;
  }

  /* ********************************************************** */
  // pragma (colon COMMENT? inlineStmt)?
  public static boolean pragmaStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA_STMT, "<pragma stmt>");
    r = pragma(b, l + 1);
    r = r && pragmaStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (colon COMMENT? inlineStmt)?
  private static boolean pragmaStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1")) return false;
    pragmaStmt_1_0(b, l + 1);
    return true;
  }

  // colon COMMENT? inlineStmt
  private static boolean pragmaStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon(b, l + 1);
    r = r && pragmaStmt_1_0_1(b, l + 1);
    r = r && inlineStmt(b, l + 1);
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
  // operator
  public static boolean prefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_OPERATOR, "<prefix operator>");
    r = operator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primary1 | primary2 | primary3
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
  // type
  static boolean primary1(PsiBuilder b, int l) {
    return type(b, l + 1);
  }

  /* ********************************************************** */
  // prefixOperator? identOrLiteral primarySuffix*
  static boolean primary2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary2_0(b, l + 1);
    r = r && identOrLiteral(b, l + 1);
    r = r && primary2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixOperator?
  private static boolean primary2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary2_0")) return false;
    prefixOperator(b, l + 1);
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
  static boolean primary3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "bind");
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primarySuffix0
  public static boolean primarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX, "<primary suffix>");
    r = primarySuffix0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primarySuffix1
  //                          | primarySuffix2
  //                          | primarySuffix3
  //                          | primarySuffix4
  //                          | primarySuffix5
  static boolean primarySuffix0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix0")) return false;
    boolean r;
    r = primarySuffix1(b, l + 1);
    if (!r) r = primarySuffix2(b, l + 1);
    if (!r) r = primarySuffix3(b, l + 1);
    if (!r) r = primarySuffix4(b, l + 1);
    if (!r) r = primarySuffix5(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' (exprColonEqExpr comma?)* ')'
  static boolean primarySuffix1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && primarySuffix1_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
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
  static boolean primarySuffix2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, primarySuffix2_1_0_parser_);
    exit_section_(b, m, null, r);
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
  // '[' (<<optInd exprColonEqExprs>>)? optPar ']'
  static boolean primarySuffix3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && primarySuffix3_1(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<optInd exprColonEqExprs>>)?
  private static boolean primarySuffix3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix3_1")) return false;
    primarySuffix3_1_0(b, l + 1);
    return true;
  }

  // <<optInd exprColonEqExprs>>
  private static boolean primarySuffix3_1_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, exprColonEqExprs_parser_);
  }

  /* ********************************************************** */
  // '{' <<optInd exprColonEqExprs>> optPar '}'
  static boolean primarySuffix4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && optInd(b, l + 1, exprColonEqExprs_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // &('`'|IDENT|literal|'cast'|'addr'|'type') exprs
  static boolean primarySuffix5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primarySuffix5_0(b, l + 1);
    r = r && exprs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &('`'|IDENT|literal|'cast'|'addr'|'type')
  private static boolean primarySuffix5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix5_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = primarySuffix5_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '`'|IDENT|literal|'cast'|'addr'|'type'
  private static boolean primarySuffix5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix5_0_0")) return false;
    boolean r;
    r = consumeToken(b, "`");
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, "cast");
    if (!r) r = consumeToken(b, "addr");
    if (!r) r = consumeToken(b, "type");
    return r;
  }

  /* ********************************************************** */
  // 'proc' <<optInd namedRoutine>>
  public static boolean procStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROC_STMT, "<proc stmt>");
    r = consumeToken(b, "proc");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'proc' <<optInd typeDesc>>
  public static boolean procType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROC_TYPE, "<proc type>");
    r = consumeToken(b, "proc");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'ptr' <<optInd typeDesc>>
  public static boolean ptrType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ptrType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PTR_TYPE, "<ptr type>");
    r = consumeToken(b, "ptr");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, "<raise stmt>");
    r = consumeToken(b, "raise");
    p = r; // pin = 1
    r = r && raiseStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean raiseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'ref' <<optInd typeDesc>>
  public static boolean refType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REF_TYPE, "<ref type>");
    r = consumeToken(b, "ref");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return' <<optInd expr>>?
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = consumeToken(b, "return");
    p = r; // pin = 1
    r = r && returnStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean returnStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  /* ********************************************************** */
  // pattern? genericParams? paramsColon pragma? ('=' COMMENT? inlineStmt)? indAndComment
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = routine_0(b, l + 1);
    r = r && routine_1(b, l + 1);
    r = r && paramsColon(b, l + 1);
    r = r && routine_3(b, l + 1);
    r = r && routine_4(b, l + 1);
    r = r && indAndComment(b, l + 1);
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

  // ('=' COMMENT? inlineStmt)?
  private static boolean routine_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_4")) return false;
    routine_4_0(b, l + 1);
    return true;
  }

  // '=' COMMENT? inlineStmt
  private static boolean routine_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && routine_4_0_1(b, l + 1);
    r = r && inlineStmt(b, l + 1);
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
  // COMMENT? (<<RULE>> | (INDENT (<<RULE>> | COMMENT) (ind_eq (<<RULE>> | COMMENT))* termInd))
  public static boolean section(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = section_0(b, l + 1);
    r = r && section_1(b, l + 1, _RULE);
    exit_section_(b, m, SECTION, r);
    return r;
  }

  // COMMENT?
  private static boolean section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_0")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // <<RULE>> | (INDENT (<<RULE>> | COMMENT) (ind_eq (<<RULE>> | COMMENT))* termInd)
  private static boolean section_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = section_1_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT (<<RULE>> | COMMENT) (ind_eq (<<RULE>> | COMMENT))* termInd
  private static boolean section_1_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && section_1_1_1(b, l + 1, _RULE);
    r = r && section_1_1_2(b, l + 1, _RULE);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>> | COMMENT
  private static boolean section_1_1_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ind_eq (<<RULE>> | COMMENT))*
  private static boolean section_1_1_2(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!section_1_1_2_0(b, l + 1, _RULE)) break;
      if (!empty_element_parsed_guard_(b, "section_1_1_2", c)) break;
    }
    return true;
  }

  // ind_eq (<<RULE>> | COMMENT)
  private static boolean section_1_1_2_0(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    r = r && section_1_1_2_0_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>> | COMMENT
  private static boolean section_1_1_2_0_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
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
  // '{' setOrTableConstr1 '}'
  public static boolean setOrTableConstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_OR_TABLE_CONSTR, "<set or table constr>");
    r = consumeToken(b, "{");
    r = r && setOrTableConstr1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((exprColonEqExpr comma)+ | ':')?
  static boolean setOrTableConstr1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr1")) return false;
    setOrTableConstr1_0(b, l + 1);
    return true;
  }

  // (exprColonEqExpr comma)+ | ':'
  private static boolean setOrTableConstr1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setOrTableConstr1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExpr comma)+
  private static boolean setOrTableConstr1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setOrTableConstr1_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!setOrTableConstr1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setOrTableConstr1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // exprColonEqExpr comma
  private static boolean setOrTableConstr1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && comma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'shared' <<optInd typeDesc>>
  public static boolean sharedType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharedType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHARED_TYPE, "<shared type>");
    r = consumeToken(b, "shared");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // arrowExpr (OP0 <<optInd arrowExpr>>)*
  public static boolean simpleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPR, "<simple expr>");
    r = arrowExpr(b, l + 1);
    r = r && simpleExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP0 <<optInd arrowExpr>>)*
  private static boolean simpleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleExpr_1", c)) break;
    }
    return true;
  }

  // OP0 <<optInd arrowExpr>>
  private static boolean simpleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP0);
    r = r && optInd(b, l + 1, arrowExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (simpleStmt1 | exprStmt) COMMENT?
  public static boolean simpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
    r = simpleStmt_0(b, l + 1);
    r = r && simpleStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // simpleStmt1 | exprStmt
  private static boolean simpleStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt_0")) return false;
    boolean r;
    r = simpleStmt1(b, l + 1);
    if (!r) r = exprStmt(b, l + 1);
    return r;
  }

  // COMMENT?
  private static boolean simpleStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  /* ********************************************************** */
  // returnStmt | raiseStmt | yieldStmt | discardStmt | breakStmt
  //                       | continueStmt | pragmaStmt | importStmt | exportStmt | fromStmt
  //                       | includeStmt | commentStmt
  static boolean simpleStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt1")) return false;
    boolean r;
    r = returnStmt(b, l + 1);
    if (!r) r = raiseStmt(b, l + 1);
    if (!r) r = yieldStmt(b, l + 1);
    if (!r) r = discardStmt(b, l + 1);
    if (!r) r = breakStmt(b, l + 1);
    if (!r) r = continueStmt(b, l + 1);
    if (!r) r = pragmaStmt(b, l + 1);
    if (!r) r = importStmt(b, l + 1);
    if (!r) r = exportStmt(b, l + 1);
    if (!r) r = fromStmt(b, l + 1);
    if (!r) r = includeStmt(b, l + 1);
    if (!r) r = commentStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ampExpr (OP6 <<optInd ampExpr>>)*
  static boolean sliceExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ampExpr(b, l + 1);
    r = r && sliceExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP6 <<optInd ampExpr>>)*
  private static boolean sliceExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sliceExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sliceExpr_1", c)) break;
    }
    return true;
  }

  // OP6 <<optInd ampExpr>>
  private static boolean sliceExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP6);
    r = r && optInd(b, l + 1, ampExpr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'static' colcom inlineStmt
  public static boolean staticStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_STMT, "<static stmt>");
    r = consumeToken(b, "static");
    p = r; // pin = 1
    r = r && report_error_(b, colcom(b, l + 1));
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // complexOrSimpleStmt ((';' | ind_eq+) complexOrSimpleStmt)*
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = complexOrSimpleStmt(b, l + 1);
    r = r && stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((';' | ind_eq+) complexOrSimpleStmt)*
  private static boolean stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_1", c)) break;
    }
    return true;
  }

  // (';' | ind_eq+) complexOrSimpleStmt
  private static boolean stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_1_0_0(b, l + 1);
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | ind_eq+
  private static boolean stmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    if (!r) r = stmt_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq+
  private static boolean stmt_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ind_eq(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ind_eq(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_1_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol1
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = symbol1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol2|IDENT|KEYW
  static boolean symbol1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol1")) return false;
    boolean r;
    r = symbol2(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, KEYW);
    return r;
  }

  /* ********************************************************** */
  // '`' symbol3+ '`'
  static boolean symbol2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "`");
    r = r && symbol2_1(b, l + 1);
    r = r && consumeToken(b, "`");
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol3+
  private static boolean symbol2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol3(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol3(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol2_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+
  static boolean symbol3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYW);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = literal(b, l + 1);
    if (!r) r = symbol3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (operator|'('|')'|'['|']'|'{'|'}'|'=')+
  private static boolean symbol3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol3_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol3_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol3_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol3_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // operator|'('|')'|'['|']'|'{'|'}'|'='
  private static boolean symbol3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol3_3_0")) return false;
    boolean r;
    r = operator(b, l + 1);
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
  // 'template' <<optInd namedRoutine>>
  public static boolean templateStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_STMT, "<template stmt>");
    r = consumeToken(b, "template");
    p = r; // pin = 1
    r = r && optInd(b, l + 1, namedRoutine_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dedent | <<eof>>
  static boolean termInd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dedent(b, l + 1);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' colcom inlineStmt &(<<optInd ('except'|'finally')>>) tryExpr1* tryExpr2?
  public static boolean tryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPR, "<try expr>");
    r = consumeToken(b, "try");
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    r = r && tryExpr_3(b, l + 1);
    r = r && tryExpr_4(b, l + 1);
    r = r && tryExpr_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &(<<optInd ('except'|'finally')>>)
  private static boolean tryExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = tryExpr_3_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd ('except'|'finally')>>
  private static boolean tryExpr_3_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr_3_0_0_0_parser_);
  }

  // 'except'|'finally'
  private static boolean tryExpr_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "except");
    if (!r) r = consumeToken(b, "finally");
    return r;
  }

  // tryExpr1*
  private static boolean tryExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryExpr1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpr_4", c)) break;
    }
    return true;
  }

  // tryExpr2?
  private static boolean tryExpr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_5")) return false;
    tryExpr2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<optInd ('except' exprs colcom inlineStmt)>>
  static boolean tryExpr1(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr1_0_0_parser_);
  }

  // 'except' exprs colcom inlineStmt
  private static boolean tryExpr1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && exprs(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<optInd ('finally' colcom inlineStmt)>>
  static boolean tryExpr2(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr2_0_0_parser_);
  }

  // 'finally' colcom inlineStmt
  private static boolean tryExpr2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "finally");
    r = r && colcom(b, l + 1);
    r = r && inlineStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' colcom inlineStmt &(ind_eq? 'except'|'finally') tryStmt1* tryStmt2?
  public static boolean tryStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, "<try stmt>");
    r = consumeToken(b, "try");
    p = r; // pin = 1
    r = r && report_error_(b, colcom(b, l + 1));
    r = p && report_error_(b, inlineStmt(b, l + 1)) && r;
    r = p && report_error_(b, tryStmt_3(b, l + 1)) && r;
    r = p && report_error_(b, tryStmt_4(b, l + 1)) && r;
    r = p && tryStmt_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &(ind_eq? 'except'|'finally')
  private static boolean tryStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = tryStmt_3_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ind_eq? 'except'|'finally'
  private static boolean tryStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_3_0_0(b, l + 1);
    if (!r) r = consumeToken(b, "finally");
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq? 'except'
  private static boolean tryStmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_3_0_0_0(b, l + 1);
    r = r && consumeToken(b, "except");
    exit_section_(b, m, null, r);
    return r;
  }

  // ind_eq?
  private static boolean tryStmt_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0_0_0")) return false;
    ind_eq(b, l + 1);
    return true;
  }

  // tryStmt1*
  private static boolean tryStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryStmt1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryStmt_4", c)) break;
    }
    return true;
  }

  // tryStmt2?
  private static boolean tryStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_5")) return false;
    tryStmt2(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ind_eq? 'except' exprs colcom inlineStmt
  static boolean tryStmt1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tryStmt1_0(b, l + 1);
    r = r && consumeToken(b, "except");
    p = r; // pin = 2
    r = r && report_error_(b, exprs(b, l + 1));
    r = p && report_error_(b, colcom(b, l + 1)) && r;
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ind_eq?
  private static boolean tryStmt1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt1_0")) return false;
    ind_eq(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ind_eq? 'finally' colcom inlineStmt
  static boolean tryStmt2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt2")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = tryStmt2_0(b, l + 1);
    r = r && consumeToken(b, "finally");
    p = r; // pin = 2
    r = r && report_error_(b, colcom(b, l + 1));
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ind_eq?
  private static boolean tryStmt2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt2_0")) return false;
    ind_eq(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'tuple' <<optInd typeDesc>>
  public static boolean tupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tupleType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_TYPE, "<tuple type>");
    r = consumeToken(b, "tuple");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // varType
  //                | outType
  //                | refType
  //                | ptrType
  //                | sharedType
  //                | tupleType
  //                | procType
  //                | iteratorType
  //                | distinctType
  //                | objectType
  //                | enumType
  static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    r = varType(b, l + 1);
    if (!r) r = outType(b, l + 1);
    if (!r) r = refType(b, l + 1);
    if (!r) r = ptrType(b, l + 1);
    if (!r) r = sharedType(b, l + 1);
    if (!r) r = tupleType(b, l + 1);
    if (!r) r = procType(b, l + 1);
    if (!r) r = iteratorType(b, l + 1);
    if (!r) r = distinctType(b, l + 1);
    if (!r) r = objectType(b, l + 1);
    if (!r) r = enumType(b, l + 1);
    return r;
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
  // typeDef1 | typeDef2
  public static boolean typeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = typeDef1(b, l + 1);
    if (!r) r = typeDef2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identWithPragmaDot genericParams? '=' <<optInd typeDefAux>> indAndComment
  static boolean typeDef1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identWithPragmaDot(b, l + 1);
    r = r && typeDef1_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDefAux_parser_);
    r = r && indAndComment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // genericParams?
  private static boolean typeDef1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef1_1")) return false;
    genericParams(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identVisDot genericParams? pragma '=' <<optInd typeDefAux>> indAndComment
  static boolean typeDef2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identVisDot(b, l + 1);
    r = r && typeDef2_1(b, l + 1);
    r = r && pragma(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDefAux_parser_);
    r = r && indAndComment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // genericParams?
  private static boolean typeDef2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef2_1")) return false;
    genericParams(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typeDefAux0
  public static boolean typeDefAux(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_AUX, "<type def aux>");
    r = typeDefAux0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)? | typeDefAux1
  static boolean typeDefAux0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDefAux0_0(b, l + 1);
    if (!r) r = typeDefAux1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // simpleExpr ('not' expr)?
  private static boolean typeDefAux0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && typeDefAux0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('not' expr)?
  private static boolean typeDefAux0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux0_0_1")) return false;
    typeDefAux0_0_1_0(b, l + 1);
    return true;
  }

  // 'not' expr
  private static boolean typeDefAux0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "not");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'concept' typeClass
  static boolean typeDefAux1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDefAux1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "concept");
    r = r && typeClass(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typeDesc0
  public static boolean typeDesc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DESC, "<type desc>");
    r = typeDesc0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeDesc1 | typeDesc2
  static boolean typeDesc0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc0")) return false;
    boolean r;
    r = typeDesc1(b, l + 1);
    if (!r) r = typeDesc2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'proc' paramsColon
  static boolean typeDesc1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "proc");
    r = r && paramsColon(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)?
  static boolean typeDesc2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && typeDesc2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('not' expr)?
  private static boolean typeDesc2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc2_1")) return false;
    typeDesc2_1_0(b, l + 1);
    return true;
  }

  // 'not' expr
  private static boolean typeDesc2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDesc2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "not");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'type' <<section typeDef>>
  public static boolean typeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_STMT, "<type stmt>");
    r = consumeToken(b, "type");
    p = r; // pin = 1
    r = r && section(b, l + 1, typeDef_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ('let'|'var'|'using') <<optInd variable>>
  public static boolean varStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VAR_STMT, "<var stmt>");
    r = varStmt_0(b, l + 1);
    p = r; // pin = 1
    r = r && optInd(b, l + 1, variable_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // '(' <<optInd (identWithPragma (comma identWithPragma)*)>> optPar ')' '=' <<optInd expr>>
  public static boolean varTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_TUPLE, "<var tuple>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, varTuple_1_0_parser_);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
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

  /* ********************************************************** */
  // 'var' <<optInd typeDesc>>
  public static boolean varType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_TYPE, "<var type>");
    r = consumeToken(b, "var");
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (varTuple | identColonEquals) colonBody? indAndComment
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = variable_0(b, l + 1);
    r = r && variable_1(b, l + 1);
    r = r && indAndComment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // varTuple | identColonEquals
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_STMT, "<when stmt>");
    r = consumeToken(b, "when");
    p = r; // pin = 1
    r = r && condStmt(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'while' expr colcom inlineStmt
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "while");
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, colcom(b, l + 1)) && r;
    r = p && inlineStmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'yield' <<optInd expr>>?
  public static boolean yieldStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, "<yield stmt>");
    r = consumeToken(b, "yield");
    p = r; // pin = 1
    r = r && yieldStmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<optInd expr>>?
  private static boolean yieldStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt_1")) return false;
    optInd(b, l + 1, expr_parser_);
    return true;
  }

  static final Parser COMMENT_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, COMMENT);
    }
  };
  static final Parser ampExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ampExpr(b, l + 1);
    }
  };
  static final Parser andExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return andExpr(b, l + 1);
    }
  };
  static final Parser arrayConstr_2_0_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return arrayConstr_2_0_0_0(b, l + 1);
    }
  };
  static final Parser arrowExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return arrowExpr(b, l + 1);
    }
  };
  static final Parser assignExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return assignExpr(b, l + 1);
    }
  };
  static final Parser bindStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return bindStmt_1_0(b, l + 1);
    }
  };
  static final Parser cmpExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return cmpExpr(b, l + 1);
    }
  };
  static final Parser constant_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return constant(b, l + 1);
    }
  };
  static final Parser dollarExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return dollarExpr(b, l + 1);
    }
  };
  static final Parser exportStmt1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt1_0_0(b, l + 1);
    }
  };
  static final Parser exportStmt2_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt2_0_0(b, l + 1);
    }
  };
  static final Parser exportStmt3_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt3_1_0(b, l + 1);
    }
  };
  static final Parser exprColonEqExprs_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprColonEqExprs(b, l + 1);
    }
  };
  static final Parser exprStmt1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprStmt1_1_0(b, l + 1);
    }
  };
  static final Parser expr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return expr(b, l + 1);
    }
  };
  static final Parser fromStmt_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return fromStmt_3_0(b, l + 1);
    }
  };
  static final Parser genericParams_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParams_1_0(b, l + 1);
    }
  };
  static final Parser importStmt1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt1_0_0(b, l + 1);
    }
  };
  static final Parser importStmt2_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt2_0_0(b, l + 1);
    }
  };
  static final Parser importStmt3_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt3_1_0(b, l + 1);
    }
  };
  static final Parser includeStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return includeStmt_1_0(b, l + 1);
    }
  };
  static final Parser mixinStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return mixinStmt_1_0(b, l + 1);
    }
  };
  static final Parser mulExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return mulExpr(b, l + 1);
    }
  };
  static final Parser namedRoutine_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return namedRoutine(b, l + 1);
    }
  };
  static final Parser orExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return orExpr(b, l + 1);
    }
  };
  static final Parser par1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return par1(b, l + 1);
    }
  };
  static final Parser plusExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return plusExpr(b, l + 1);
    }
  };
  static final Parser pragma_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pragma_1_0(b, l + 1);
    }
  };
  static final Parser primarySuffix2_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix2_1_0(b, l + 1);
    }
  };
  static final Parser primary_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primary(b, l + 1);
    }
  };
  static final Parser sliceExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return sliceExpr(b, l + 1);
    }
  };
  static final Parser symbol_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return symbol(b, l + 1);
    }
  };
  static final Parser tryExpr1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tryExpr1_0_0(b, l + 1);
    }
  };
  static final Parser tryExpr2_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tryExpr2_0_0(b, l + 1);
    }
  };
  static final Parser tryExpr_3_0_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return tryExpr_3_0_0_0(b, l + 1);
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
  static final Parser variable_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return variable(b, l + 1);
    }
  };
}
