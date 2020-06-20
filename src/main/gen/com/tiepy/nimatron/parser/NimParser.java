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
    return nimFile(b, l + 1);
  }

  /* ********************************************************** */
  // IDENT ('(' <<optInd exprList>>? ')' | <<optInd exprList>>)
  public static boolean command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && command_1(b, l + 1);
    exit_section_(b, m, COMMAND, r);
    return r;
  }

  // '(' <<optInd exprList>>? ')' | <<optInd exprList>>
  private static boolean command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_1_0(b, l + 1);
    if (!r) r = optInd(b, l + 1, exprList_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <<optInd exprList>>? ')'
  private static boolean command_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && command_1_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <<optInd exprList>>?
  private static boolean command_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_1_0_1")) return false;
    optInd(b, l + 1, exprList_parser_);
    return true;
  }

  /* ********************************************************** */
  // literal
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // 'if' expr ':' stmt (IND_EQ 'elif' expr ':' stmt)* (IND_EQ 'else' ':' stmt)?
  public static boolean ifStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "if");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    r = r && ifStmt_4(b, l + 1);
    r = r && ifStmt_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ 'elif' expr ':' stmt)*
  private static boolean ifStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStmt_4", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr ':' stmt
  private static boolean ifStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' ':' stmt)?
  private static boolean ifStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_5")) return false;
    ifStmt_5_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' ':' stmt
  private static boolean ifStmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LIT
  //           | INT8_LIT
  //           | INT16_LIT
  //           | INT32_LIT
  //           | INT64_LIT
  //           | UINT_LIT
  //           | UINT8_LIT
  //           | UINT16_LIT
  //           | UINT32_LIT
  //           | UINT64_LIT
  //           | FLOAT_LIT
  //           | FLOAT32_LIT
  //           | FLOAT64_LIT
  //           | BOOL_LIT
  //           | STR_LIT
  //           | RSTR_LIT
  //           | TRIPLESTR_LIT
  //           | CHAR_LIT
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
    if (!r) r = consumeToken(b, BOOL_LIT);
    if (!r) r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, NIL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ* (stmt ((';'|IND_EQ) stmt)*)? ';'? IND_EQ*
  static boolean nimFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nimFile_0(b, l + 1);
    r = r && nimFile_1(b, l + 1);
    r = r && nimFile_2(b, l + 1);
    r = r && nimFile_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ*
  private static boolean nimFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IND_EQ)) break;
      if (!empty_element_parsed_guard_(b, "nimFile_0", c)) break;
    }
    return true;
  }

  // (stmt ((';'|IND_EQ) stmt)*)?
  private static boolean nimFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_1")) return false;
    nimFile_1_0(b, l + 1);
    return true;
  }

  // stmt ((';'|IND_EQ) stmt)*
  private static boolean nimFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && nimFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((';'|IND_EQ) stmt)*
  private static boolean nimFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nimFile_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nimFile_1_0_1", c)) break;
    }
    return true;
  }

  // (';'|IND_EQ) stmt
  private static boolean nimFile_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nimFile_1_0_1_0_0(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'|IND_EQ
  private static boolean nimFile_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  // ';'?
  private static boolean nimFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_2")) return false;
    consumeToken(b, ";");
    return true;
  }

  // IND_EQ*
  private static boolean nimFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IND_EQ)) break;
      if (!empty_element_parsed_guard_(b, "nimFile_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<RULE>> | (IND_GT <<RULE>> termInd)
  static boolean optInd(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = optInd_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_GT <<RULE>> termInd
  private static boolean optInd_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_GT);
    r = r && _RULE.parse(b, l);
    r = r && termInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ifStmt|command
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = ifStmt(b, l + 1);
    if (!r) r = command(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IND_LT | <<eof>>
  static boolean termInd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "termInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_LT);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  static final Parser exprList_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprList(b, l + 1);
    }
  };
}
