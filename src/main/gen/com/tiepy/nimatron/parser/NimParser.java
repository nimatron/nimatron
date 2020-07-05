// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tiepy.nimatron.parser.NimTypes.*;
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
  // ':' stmt
  static boolean colonBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ifStmt
  //                               | varStmt
  //                               | simpleStmt
  static boolean complexOrSimpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt")) return false;
    boolean r;
    r = ifStmt(b, l + 1);
    if (!r) r = varStmt(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expr ':' <<optInd stmts>>
  //              (IND_EQ 'elif' expr ':' <<optInd stmts>>)*
  //              (IND_EQ 'else' ':' <<optInd stmts>>)?
  public static boolean condStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, ":");
    p = r; // pin = 2
    r = r && report_error_(b, optInd(b, l + 1, stmts_parser_));
    r = p && report_error_(b, condStmt_3(b, l + 1)) && r;
    r = p && condStmt_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (IND_EQ 'elif' expr ':' <<optInd stmts>>)*
  private static boolean condStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr ':' <<optInd stmts>>
  private static boolean condStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' ':' <<optInd stmts>>)?
  private static boolean condStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4")) return false;
    condStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' ':' <<optInd stmts>>
  private static boolean condStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, stmts_parser_);
    exit_section_(b, m, null, r);
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
  // simpleExpr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = simpleExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr (':'|'=' expr)?
  static boolean exprColonEqExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExpr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprColonEqExpr_1(b, l + 1);
    exit_section_(b, m, null, r);
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
  // expr (',' expr)*
  public static boolean exprList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_LIST, "<expr list>");
    r = expr(b, l + 1);
    r = r && exprList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expr)*
  private static boolean exprList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprList_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean exprList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr
  //            (( '=' <<optInd (expr colonBody?)>>)
  //            | ( expr (',' expr)* ))?
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = simpleExpr(b, l + 1);
    r = r && exprStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (( '=' <<optInd (expr colonBody?)>>)
  //            | ( expr (',' expr)* ))?
  private static boolean exprStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1")) return false;
    exprStmt_1_0(b, l + 1);
    return true;
  }

  // ( '=' <<optInd (expr colonBody?)>>)
  //            | ( expr (',' expr)* )
  private static boolean exprStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprStmt_1_0_0(b, l + 1);
    if (!r) r = exprStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' <<optInd (expr colonBody?)>>
  private static boolean exprStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, exprStmt_1_0_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr colonBody?
  private static boolean exprStmt_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprStmt_1_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colonBody?
  private static boolean exprStmt_1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0_1_0_1")) return false;
    colonBody(b, l + 1);
    return true;
  }

  // expr (',' expr)*
  private static boolean exprStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprStmt_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean exprStmt_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprStmt_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprStmt_1_0_1_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean exprStmt_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // IDENT (',' IDENT)* ','?
  //        ('=' <<optInd expr>>)?
  static boolean identColonEquals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && identColonEquals_1(b, l + 1);
    r = r && identColonEquals_2(b, l + 1);
    r = r && identColonEquals_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' IDENT)*
  private static boolean identColonEquals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identColonEquals_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identColonEquals_1", c)) break;
    }
    return true;
  }

  // ',' IDENT
  private static boolean identColonEquals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean identColonEquals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // ('=' <<optInd expr>>)?
  private static boolean identColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3")) return false;
    identColonEquals_3_0(b, l + 1);
    return true;
  }

  // '=' <<optInd expr>>
  private static boolean identColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, expr_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generalizedLit | IDENT | literal
  static boolean identOrLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identOrLiteral")) return false;
    boolean r;
    r = generalizedLit(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = literal(b, l + 1);
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
  // INT_LIT | INT8_LIT | INT16_LIT | INT32_LIT | INT64_LIT
  //           | UINT_LIT | UINT8_LIT | UINT16_LIT | UINT32_LIT | UINT64_LIT
  //           | FLOAT_LIT | FLOAT32_LIT | FLOAT64_LIT
  //           | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
  //           | CHAR_LIT
  //           | BOOL_LIT
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
  // IND_EQ* stmts? ';'? IND_EQ*
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

  // ';'?
  private static boolean module_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2")) return false;
    consumeToken(b, ";");
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
  // <<RULE>> | (INDENT <<RULE>> termInd)
  static boolean optInd(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = optInd_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT <<RULE>> termInd
  private static boolean optInd_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && _RULE.parse(b, l);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (typeKeyw <<optInd typeDesc>>)
  //                   | (/*operator**/ identOrLiteral primarySuffix*)
  static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_0(b, l + 1);
    if (!r) r = primary_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeKeyw <<optInd typeDesc>>
  private static boolean primary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeKeyw(b, l + 1);
    r = r && optInd(b, l + 1, typeDesc_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // identOrLiteral primarySuffix*
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identOrLiteral(b, l + 1);
    r = r && primary_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primarySuffix*
  private static boolean primary_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('(' <<optInd ((exprColonEqExpr ','?)*)>> ')')
  //                              | <<optInd exprList>>
  static boolean primarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primarySuffix_0(b, l + 1);
    if (!r) r = optInd(b, l + 1, exprList_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <<optInd ((exprColonEqExpr ','?)*)>> ')'
  private static boolean primarySuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, primarySuffix_0_1_0_parser_);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExpr ','?)*
  private static boolean primarySuffix_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primarySuffix_0_1_0", c)) break;
    }
    return true;
  }

  // exprColonEqExpr ','?
  private static boolean primarySuffix_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && primarySuffix_0_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean primarySuffix_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0_0_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // <<RULE>> | (INDENT <<RULE>>? (IND_EQ <<RULE>>?)* DEDENT)
  static boolean section(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = section_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENT <<RULE>>? (IND_EQ <<RULE>>?)* DEDENT
  private static boolean section_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && section_1_1(b, l + 1, _RULE);
    r = r && section_1_2(b, l + 1, _RULE);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>?
  private static boolean section_1_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1")) return false;
    _RULE.parse(b, l);
    return true;
  }

  // (IND_EQ <<RULE>>?)*
  private static boolean section_1_2(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!section_1_2_0(b, l + 1, _RULE)) break;
      if (!empty_element_parsed_guard_(b, "section_1_2", c)) break;
    }
    return true;
  }

  // IND_EQ <<RULE>>?
  private static boolean section_1_2_0(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && section_1_2_0_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>?
  private static boolean section_1_2_0_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2_0_1")) return false;
    _RULE.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // primary (OP5 <<optInd primary>>)*
  public static boolean simpleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPR, "<simple expr>");
    r = primary(b, l + 1);
    r = r && simpleExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP5 <<optInd primary>>)*
  private static boolean simpleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleExpr_1", c)) break;
    }
    return true;
  }

  // OP5 <<optInd primary>>
  private static boolean simpleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP5);
    r = r && optInd(b, l + 1, primary_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // discardStmt | exprStmt
  static boolean simpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt")) return false;
    boolean r;
    r = discardStmt(b, l + 1);
    if (!r) r = exprStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // complexOrSimpleStmt|simpleStmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = complexOrSimpleStmt(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stmt ((';'|IND_EQ) stmt)*
  static boolean stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && stmts_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((';'|IND_EQ) stmt)*
  private static boolean stmts_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmts_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmts_1", c)) break;
    }
    return true;
  }

  // (';'|IND_EQ) stmt
  private static boolean stmts_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmts_1_0_0(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'|IND_EQ
  private static boolean stmts_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  /* ********************************************************** */
  // DEDENT | <<eof>>
  static boolean termInd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEDENT);
    if (!r) r = eof(b, l + 1);
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
  // ('let'|'var'|'using') <<section variable>>
  public static boolean varStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VAR_STMT, "<var stmt>");
    r = varStmt_0(b, l + 1);
    p = r; // pin = 1
    r = r && section(b, l + 1, variable_parser_);
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
  // identColonEquals colonBody?
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identColonEquals(b, l + 1);
    r = r && variable_1(b, l + 1);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // colonBody?
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    colonBody(b, l + 1);
    return true;
  }

  static final Parser exprList_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprList(b, l + 1);
    }
  };
  static final Parser exprStmt_1_0_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprStmt_1_0_0_1_0(b, l + 1);
    }
  };
  static final Parser expr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return expr(b, l + 1);
    }
  };
  static final Parser primarySuffix_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_0_1_0(b, l + 1);
    }
  };
  static final Parser primary_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primary(b, l + 1);
    }
  };
  static final Parser stmts_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return stmts(b, l + 1);
    }
  };
  static final Parser typeDesc_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDesc(b, l + 1);
    }
  };
  static final Parser variable_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return variable(b, l + 1);
    }
  };
}
