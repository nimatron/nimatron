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
  // plusExpr (OP7 optInd plusExpr)*
  public static boolean ampExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AMP_EXPR, "<amp expr>");
    r = plusExpr(b, l + 1);
    r = r && ampExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP7 optInd plusExpr)*
  private static boolean ampExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ampExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ampExpr_1", c)) break;
    }
    return true;
  }

  // OP7 optInd plusExpr
  private static boolean ampExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP7);
    r = r && optInd(b, l + 1);
    r = r && plusExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cmpExpr (OP4 optInd cmpExpr)*
  public static boolean andExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = cmpExpr(b, l + 1);
    r = r && andExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP4 optInd cmpExpr)*
  private static boolean andExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!andExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "andExpr_1", c)) break;
    }
    return true;
  }

  // OP4 optInd cmpExpr
  private static boolean andExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP4);
    r = r && optInd(b, l + 1);
    r = r && cmpExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' optInd (exprColonEqExpr comma?)* optPar ']'
  public static boolean arrayConstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CONSTR, "<array constr>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1);
    r = r && arrayConstr_2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean arrayConstr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayConstr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayConstr_2", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean arrayConstr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && arrayConstr_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean arrayConstr_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // assignExpr (OP1 optInd assignExpr)*
  public static boolean arrowExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARROW_EXPR, "<arrow expr>");
    r = assignExpr(b, l + 1);
    r = r && arrowExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP1 optInd assignExpr)*
  private static boolean arrowExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrowExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrowExpr_1", c)) break;
    }
    return true;
  }

  // OP1 optInd assignExpr
  private static boolean arrowExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP1);
    r = r && optInd(b, l + 1);
    r = r && assignExpr(b, l + 1);
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
  // orExpr (OP2 optInd orExpr)*
  public static boolean assignExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_EXPR, "<assign expr>");
    r = orExpr(b, l + 1);
    r = r && assignExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP2 optInd orExpr)*
  private static boolean assignExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!assignExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignExpr_1", c)) break;
    }
    return true;
  }

  // OP2 optInd orExpr
  private static boolean assignExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP2);
    r = r && optInd(b, l + 1);
    r = r && orExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bind' optInd qualifiedIdent (comma qualifiedIdent)*
  public static boolean bindStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_STMT, "<bind stmt>");
    r = consumeToken(b, "bind");
    r = r && optInd(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    r = r && bindStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma qualifiedIdent)*
  private static boolean bindStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bindStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bindStmt_3", c)) break;
    }
    return true;
  }

  // comma qualifiedIdent
  private static boolean bindStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'block' symbol? colcom stmt
  public static boolean blockExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_EXPR, "<block expr>");
    r = consumeToken(b, "block");
    r = r && blockExpr_1(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbol?
  private static boolean blockExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr_1")) return false;
    symbol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'block' symbol? colcom stmt
  public static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, "<block stmt>");
    r = consumeToken(b, "block");
    r = r && blockStmt_1(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
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
  // 'break' optInd expr?
  public static boolean breakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, "<break stmt>");
    r = consumeToken(b, "break");
    r = r && optInd(b, l + 1);
    r = r && breakStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean breakStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'case' expr ':'? (IND_GT ofBranches IND_LT|IND_EQ ofBranches)
  public static boolean caseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STMT, "<case stmt>");
    r = consumeToken(b, "case");
    r = r && expr(b, l + 1);
    r = r && caseStmt_2(b, l + 1);
    r = r && caseStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'?
  private static boolean caseStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_2")) return false;
    consumeToken(b, ":");
    return true;
  }

  // IND_GT ofBranches IND_LT|IND_EQ ofBranches
  private static boolean caseStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = caseStmt_3_0(b, l + 1);
    if (!r) r = caseStmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_GT ofBranches IND_LT
  private static boolean caseStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_GT);
    r = r && ofBranches(b, l + 1);
    r = r && consumeToken(b, IND_LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ ofBranches
  private static boolean caseStmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStmt_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && ofBranches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'cast' '[' optInd typeDesc optPar ']' '(' optInd expr optPar ')'
  public static boolean castExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXPR, "<cast expr>");
    r = consumeToken(b, "cast");
    r = r && consumeToken(b, "[");
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "(");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sliceExpr (OP5 optInd sliceExpr)*
  public static boolean cmpExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMP_EXPR, "<cmp expr>");
    r = sliceExpr(b, l + 1);
    r = r && cmpExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP5 optInd sliceExpr)*
  private static boolean cmpExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmpExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmpExpr_1", c)) break;
    }
    return true;
  }

  // OP5 optInd sliceExpr
  private static boolean cmpExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP5);
    r = r && optInd(b, l + 1);
    r = r && sliceExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':'
  public static boolean colcom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colcom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLCOM, "<colcom>");
    r = consumeToken(b, ":");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':'
  public static boolean colon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON, "<colon>");
    r = consumeToken(b, ":");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // colcom stmt postExprBlocks?
  public static boolean colonBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON_BODY, "<colon body>");
    r = colcom(b, l + 1);
    r = r && stmt(b, l + 1);
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
  // ','
  public static boolean comma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA, "<comma>");
    r = consumeToken(b, ",");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ifStmt|whenStmt|whileStmt
  //                       | tryStmt|forStmt
  //                       | blockStmt|staticStmt|deferStmt|asmStmt
  //                       | 'proc' routine
  //                       | 'func' routine
  //                       | 'method' routine
  //                       | 'iterator' routine
  //                       | 'macro' routine
  //                       | 'template' routine
  //                       | 'converter' routine
  //                       | 'type' <<section typeDef>>
  //                       | 'const' <<section constant>>
  //                       | ('let'|'var'|'using') <<section variable>>
  //                       | bindStmt|mixinStmt)
  //                       | simpleStmt
  public static boolean complexOrSimpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPLEX_OR_SIMPLE_STMT, "<complex or simple stmt>");
    r = complexOrSimpleStmt_0(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ifStmt|whenStmt|whileStmt
  //                       | tryStmt|forStmt
  //                       | blockStmt|staticStmt|deferStmt|asmStmt
  //                       | 'proc' routine
  //                       | 'func' routine
  //                       | 'method' routine
  //                       | 'iterator' routine
  //                       | 'macro' routine
  //                       | 'template' routine
  //                       | 'converter' routine
  //                       | 'type' <<section typeDef>>
  //                       | 'const' <<section constant>>
  //                       | ('let'|'var'|'using') <<section variable>>
  //                       | bindStmt|mixinStmt
  private static boolean complexOrSimpleStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStmt(b, l + 1);
    if (!r) r = whenStmt(b, l + 1);
    if (!r) r = whileStmt(b, l + 1);
    if (!r) r = tryStmt(b, l + 1);
    if (!r) r = forStmt(b, l + 1);
    if (!r) r = blockStmt(b, l + 1);
    if (!r) r = staticStmt(b, l + 1);
    if (!r) r = deferStmt(b, l + 1);
    if (!r) r = asmStmt(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_9(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_10(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_11(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_12(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_13(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_14(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_15(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_16(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_17(b, l + 1);
    if (!r) r = complexOrSimpleStmt_0_18(b, l + 1);
    if (!r) r = bindStmt(b, l + 1);
    if (!r) r = mixinStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'proc' routine
  private static boolean complexOrSimpleStmt_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "proc");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'func' routine
  private static boolean complexOrSimpleStmt_0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "func");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'method' routine
  private static boolean complexOrSimpleStmt_0_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "method");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'iterator' routine
  private static boolean complexOrSimpleStmt_0_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "iterator");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'macro' routine
  private static boolean complexOrSimpleStmt_0_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "macro");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'template' routine
  private static boolean complexOrSimpleStmt_0_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "template");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'converter' routine
  private static boolean complexOrSimpleStmt_0_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "converter");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'type' <<section typeDef>>
  private static boolean complexOrSimpleStmt_0_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "type");
    r = r && section(b, l + 1, typeDef_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'const' <<section constant>>
  private static boolean complexOrSimpleStmt_0_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "const");
    r = r && section(b, l + 1, constant_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('let'|'var'|'using') <<section variable>>
  private static boolean complexOrSimpleStmt_0_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexOrSimpleStmt_0_18_0(b, l + 1);
    r = r && section(b, l + 1, variable_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'let'|'var'|'using'
  private static boolean complexOrSimpleStmt_0_18_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_0_18_0")) return false;
    boolean r;
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "using");
    return r;
  }

  /* ********************************************************** */
  // expr colcom expr optInd ('elif' expr colcom expr optInd)* 'else' colcom expr
  public static boolean condExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<cond expr>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && optInd(b, l + 1);
    r = r && condExpr_4(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('elif' expr colcom expr optInd)*
  private static boolean condExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condExpr_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condExpr_4", c)) break;
    }
    return true;
  }

  // 'elif' expr colcom expr optInd
  private static boolean condExpr_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && optInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr colcom stmt (IND_EQ 'elif' expr colcom stmt)* (IND_EQ 'else' colcom stmt)?
  public static boolean condStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    r = r && condStmt_3(b, l + 1);
    r = r && condStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ 'elif' expr colcom stmt)*
  private static boolean condStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr colcom stmt
  private static boolean condStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' colcom stmt)?
  private static boolean condStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4")) return false;
    condStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' colcom stmt
  private static boolean condStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (varTuple|identWithPragma) (colon typeDesc)? '=' optInd expr
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = constant_0(b, l + 1);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
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
  // 'break' optInd expr?
  public static boolean continueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, "<continue stmt>");
    r = consumeToken(b, "break");
    r = r && optInd(b, l + 1);
    r = r && continueStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean continueStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identWithPragma (comma identWithPragma)* comma? (':' optInd typeDesc)? ('=' optInd expr)?
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

  // (':' optInd typeDesc)?
  private static boolean declColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3")) return false;
    declColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' optInd typeDesc
  private static boolean declColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' optInd expr)?
  private static boolean declColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4")) return false;
    declColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' optInd expr
  private static boolean declColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defer' colcom stmt
  public static boolean deferStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deferStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFER_STMT, "<defer stmt>");
    r = consumeToken(b, "defer");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'discard' optInd expr?
  public static boolean discardStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCARD_STMT, "<discard stmt>");
    r = consumeToken(b, "discard");
    r = r && optInd(b, l + 1);
    r = r && discardStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean discardStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'do' paramListArrow pragma? colcom stmt
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_BLOCK, "<do block>");
    r = consumeToken(b, "do");
    r = r && paramListArrow(b, l + 1);
    r = r && doBlock_2(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
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
  // primary (OP10 optInd primary)*
  public static boolean dollarExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOLLAR_EXPR, "<dollar expr>");
    r = primary(b, l + 1);
    r = r && dollarExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP10 optInd primary)*
  private static boolean dollarExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dollarExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dollarExpr_1", c)) break;
    }
    return true;
  }

  // OP10 optInd primary
  private static boolean dollarExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP10);
    r = r && optInd(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'export' optInd expr ((comma expr)+|'except' optInd (expr (comma expr)*))
  public static boolean exportStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT, "<export stmt>");
    r = consumeToken(b, "export");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && exportStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)+|'except' optInd (expr (comma expr)*)
  private static boolean exportStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt_3_0(b, l + 1);
    if (!r) r = exportStmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)+
  private static boolean exportStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt_3_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!exportStmt_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt_3_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // comma expr
  private static boolean exportStmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'except' optInd (expr (comma expr)*)
  private static boolean exportStmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1);
    r = r && exportStmt_3_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (comma expr)*
  private static boolean exportStmt_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exportStmt_3_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)*
  private static boolean exportStmt_3_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_1_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exportStmt_3_1_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exportStmt_3_1_2_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exportStmt_3_1_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_3_1_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (blockExpr|ifExpr|whenExpr|caseStmt|forExpr|tryExpr)|simpleExpr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = expr_0(b, l + 1);
    if (!r) r = simpleExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // blockExpr|ifExpr|whenExpr|caseStmt|forExpr|tryExpr
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r;
    r = blockExpr(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = whenExpr(b, l + 1);
    if (!r) r = caseStmt(b, l + 1);
    if (!r) r = forExpr(b, l + 1);
    if (!r) r = tryExpr(b, l + 1);
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
  // exprColonEqExpr (comma exprColonEqExpr)* (comma)?
  public static boolean exprColonEqExprList2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COLON_EQ_EXPR_LIST_2, "<expr colon eq expr list 2>");
    r = exprColonEqExpr(b, l + 1);
    r = r && exprColonEqExprList2_1(b, l + 1);
    r = r && exprColonEqExprList2_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma exprColonEqExpr)*
  private static boolean exprColonEqExprList2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprColonEqExprList2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprColonEqExprList2_1", c)) break;
    }
    return true;
  }

  // comma exprColonEqExpr
  private static boolean exprColonEqExprList2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma)?
  private static boolean exprColonEqExprList2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_2")) return false;
    exprColonEqExprList2_2_0(b, l + 1);
    return true;
  }

  // (comma)
  private static boolean exprColonEqExprList2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr (comma expr)*
  public static boolean exprList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_LIST, "<expr list>");
    r = expr(b, l + 1);
    r = r && exprList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean exprList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprList_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exprList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr (( '=' optInd expr colonBody? )|( expr (comma expr)* postExprBlocks ))?
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = simpleExpr(b, l + 1);
    r = r && exprStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (( '=' optInd expr colonBody? )|( expr (comma expr)* postExprBlocks ))?
  private static boolean exprStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1")) return false;
    exprStmt_1_0(b, l + 1);
    return true;
  }

  // ( '=' optInd expr colonBody? )|( expr (comma expr)* postExprBlocks )
  private static boolean exprStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprStmt_1_0_0(b, l + 1);
    if (!r) r = exprStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' optInd expr colonBody?
  private static boolean exprStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && exprStmt_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colonBody?
  private static boolean exprStmt_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0_3")) return false;
    colonBody(b, l + 1);
    return true;
  }

  // expr (comma expr)* postExprBlocks
  private static boolean exprStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && exprStmt_1_0_1_1(b, l + 1);
    r = r && postExprBlocks(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)*
  private static boolean exprStmt_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprStmt_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprStmt_1_0_1_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean exprStmt_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // forStmt
  public static boolean forExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_EXPR, "<for expr>");
    r = forStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for' (identWithPragma (comma identWithPragma)*) 'in' expr colcom stmt
  public static boolean forStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, "<for stmt>");
    r = consumeToken(b, "for");
    r = r && forStmt_1(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
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
  // 'from' expr 'import' optInd expr (comma expr)*
  public static boolean fromStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FROM_STMT, "<from stmt>");
    r = consumeToken(b, "from");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, "import");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && fromStmt_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean fromStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fromStmt_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromStmt_5", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean fromStmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GENERALIZED_STR_LIT|GENERALIZED_TRIPLESTR_LIT
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
  // symbol (comma symbol)* (colon expr)? ('=' optInd expr)?
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

  // ('=' optInd expr)?
  private static boolean genericParam_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3")) return false;
    genericParam_3_0(b, l + 1);
    return true;
  }

  // '=' optInd expr
  private static boolean genericParam_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' optInd (genericParam ((comma|semicolon) genericParam)*)? optPar ']'
  public static boolean genericParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAM_LIST, "<generic param list>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1);
    r = r && genericParamList_2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (genericParam ((comma|semicolon) genericParam)*)?
  private static boolean genericParamList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2")) return false;
    genericParamList_2_0(b, l + 1);
    return true;
  }

  // genericParam ((comma|semicolon) genericParam)*
  private static boolean genericParamList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = genericParam(b, l + 1);
    r = r && genericParamList_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((comma|semicolon) genericParam)*
  private static boolean genericParamList_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!genericParamList_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "genericParamList_2_0_1", c)) break;
    }
    return true;
  }

  // (comma|semicolon) genericParam
  private static boolean genericParamList_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = genericParamList_2_0_1_0_0(b, l + 1);
    r = r && genericParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma|semicolon
  private static boolean genericParamList_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2_0_1_0_0")) return false;
    boolean r;
    r = comma(b, l + 1);
    if (!r) r = semicolon(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENT (comma IDENT)* comma? (':' optInd typeDesc)? ('=' optInd expr)?
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

  // (':' optInd typeDesc)?
  private static boolean identColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3")) return false;
    identColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' optInd typeDesc
  private static boolean identColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' optInd expr)?
  private static boolean identColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4")) return false;
    identColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' optInd expr
  private static boolean identColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generalizedLit|symbol|literal|par|arrayConstr|setOrTableConstr|castExpr
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
  // symbol OPR?
  public static boolean identVis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS, "<ident vis>");
    r = symbol(b, l + 1);
    r = r && identVis_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPR?
  private static boolean identVis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVis_1")) return false;
    consumeToken(b, OPR);
    return true;
  }

  /* ********************************************************** */
  // symbol '.' optInd symbol OPR?
  public static boolean identVisDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS_DOT, "<ident vis dot>");
    r = symbol(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && optInd(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && identVisDot_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPR?
  private static boolean identVisDot_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_4")) return false;
    consumeToken(b, OPR);
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
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "if");
    r = r && condStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'import' optInd expr ((comma expr)+|'except' optInd (expr (comma expr)*))
  public static boolean importStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = consumeToken(b, "import");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && importStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)+|'except' optInd (expr (comma expr)*)
  private static boolean importStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt_3_0(b, l + 1);
    if (!r) r = importStmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)+
  private static boolean importStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt_3_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!importStmt_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt_3_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // comma expr
  private static boolean importStmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'except' optInd (expr (comma expr)*)
  private static boolean importStmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1);
    r = r && importStmt_3_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (comma expr)*
  private static boolean importStmt_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && importStmt_3_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma expr)*
  private static boolean importStmt_3_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_1_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importStmt_3_1_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importStmt_3_1_2_1", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean importStmt_3_1_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_3_1_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' optInd expr (comma expr)*
  public static boolean includeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, "<include stmt>");
    r = consumeToken(b, "include");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && includeStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma expr)*
  private static boolean includeStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!includeStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "includeStmt_3", c)) break;
    }
    return true;
  }

  // comma expr
  private static boolean includeStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LIT|INT8_LIT|INT16_LIT|INT32_LIT|INT64_LIT
  //             |UINT_LIT|UINT8_LIT|UINT16_LIT|UINT32_LIT|UINT64_LIT
  //             |FLOAT_LIT|FLOAT32_LIT|FLOAT64_LIT
  //             |STR_LIT|RSTR_LIT|TRIPLESTR_LIT
  //             |CHAR_LIT
  //             |NIL
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
    if (!r) r = consumeToken(b, NIL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'mixin' optInd qualifiedIdent (comma qualifiedIdent)*
  public static boolean mixinStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MIXIN_STMT, "<mixin stmt>");
    r = consumeToken(b, "mixin");
    r = r && optInd(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    r = r && mixinStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma qualifiedIdent)*
  private static boolean mixinStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mixinStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mixinStmt_3", c)) break;
    }
    return true;
  }

  // comma qualifiedIdent
  private static boolean mixinStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && qualifiedIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IND_EQ* (stmt ((';'|IND_EQ) stmt)*)? ';'? IND_EQ*
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

  // (stmt ((';'|IND_EQ) stmt)*)?
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    module_1_0(b, l + 1);
    return true;
  }

  // stmt ((';'|IND_EQ) stmt)*
  private static boolean module_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && module_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((';'|IND_EQ) stmt)*
  private static boolean module_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_1_0_1", c)) break;
    }
    return true;
  }

  // (';'|IND_EQ) stmt
  private static boolean module_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_1_0_1_0_0(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'|IND_EQ
  private static boolean module_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
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
  // dollarExpr (OP9 optInd dollarExpr)*
  public static boolean mulExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_EXPR, "<mul expr>");
    r = dollarExpr(b, l + 1);
    r = r && mulExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP9 optInd dollarExpr)*
  private static boolean mulExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mulExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mulExpr_1", c)) break;
    }
    return true;
  }

  // OP9 optInd dollarExpr
  private static boolean mulExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP9);
    r = r && optInd(b, l + 1);
    r = r && dollarExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'of' exprList colcom stmt
  public static boolean ofBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCH, "<of branch>");
    r = consumeToken(b, "of");
    r = r && exprList(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ofBranch (IND_EQ ofBranch)* (IND_EQ 'elif' expr colcom stmt)* (IND_EQ 'else' colcom stmt)?
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

  // (IND_EQ 'elif' expr colcom stmt)*
  private static boolean ofBranches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_2", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr colcom stmt
  private static boolean ofBranches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IND_EQ 'else' colcom stmt)?
  private static boolean ofBranches_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3")) return false;
    ofBranches_3_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' colcom stmt
  private static boolean ofBranches_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "else");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP0|OP1|OP2|OP3|OP4|OP5|OP6|OP7|OP8|OP9|'from'|'static'|'..'
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
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
    if (!r) r = consumeToken(b, "from");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "..");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (IND_GT|IND_EQ)?
  public static boolean optInd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND, "<opt ind>");
    optInd_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // IND_GT|IND_EQ
  private static boolean optInd_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd_0")) return false;
    boolean r;
    r = consumeToken(b, IND_GT);
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  /* ********************************************************** */
  // (IND_GT|IND_EQ)?
  public static boolean optPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optPar")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_PAR, "<opt par>");
    optPar_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // IND_GT|IND_EQ
  private static boolean optPar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optPar_0")) return false;
    boolean r;
    r = consumeToken(b, IND_GT);
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  /* ********************************************************** */
  // andExpr (OP3 optInd andExpr)*
  public static boolean orExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = andExpr(b, l + 1);
    r = r && orExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP3 optInd andExpr)*
  private static boolean orExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!orExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orExpr_1", c)) break;
    }
    return true;
  }

  // OP3 optInd andExpr
  private static boolean orExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP3);
    r = r && optInd(b, l + 1);
    r = r && andExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' optInd ( /*&parKeyw*/ complexOrSimpleStmt (';' complexOrSimpleStmt)*
  //             | ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  //             | pragmaStmt
  //             | simpleExpr ( ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )? )
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)* )? ) ) ) optPar ')'
  public static boolean par(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR, "<par>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1);
    r = r && par_2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // complexOrSimpleStmt (';' complexOrSimpleStmt)*
  //             | ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  //             | pragmaStmt
  //             | simpleExpr ( ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )? )
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)* )? ) )
  private static boolean par_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_0(b, l + 1);
    if (!r) r = par_2_1(b, l + 1);
    if (!r) r = pragmaStmt(b, l + 1);
    if (!r) r = par_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean par_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexOrSimpleStmt(b, l + 1);
    r = r && par_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par_2_0_1", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean par_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && par_2_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par_2_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par_2_1_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par_2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // simpleExpr ( ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )? )
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)* )? ) )
  private static boolean par_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && par_2_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )? )
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)* )? )
  private static boolean par_2_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_3_1_0(b, l + 1);
    if (!r) r = par_2_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )?
  private static boolean par_2_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && par_2_3_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt (';' complexOrSimpleStmt)* )?
  private static boolean par_2_3_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0_2")) return false;
    par_2_3_1_0_2_0(b, l + 1);
    return true;
  }

  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean par_2_3_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && par_2_3_1_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean par_2_3_1_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par_2_3_1_0_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par_2_3_1_0_2_0_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean par_2_3_1_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' expr (',' exprColonEqExpr (',' exprColonEqExpr)* )?
  private static boolean par_2_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expr(b, l + 1);
    r = r && par_2_3_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' exprColonEqExpr (',' exprColonEqExpr)* )?
  private static boolean par_2_3_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_2")) return false;
    par_2_3_1_1_2_0(b, l + 1);
    return true;
  }

  // ',' exprColonEqExpr (',' exprColonEqExpr)*
  private static boolean par_2_3_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    r = r && par_2_3_1_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' exprColonEqExpr)*
  private static boolean par_2_3_1_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!par_2_3_1_1_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par_2_3_1_1_2_0_2", c)) break;
    }
    return true;
  }

  // ',' exprColonEqExpr
  private static boolean par_2_3_1_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (declColonEquals ((comma|semicolon) declColonEquals)*)? ')'
  public static boolean paramList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST, "<param list>");
    r = consumeToken(b, "(");
    r = r && paramList_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (declColonEquals ((comma|semicolon) declColonEquals)*)?
  private static boolean paramList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1")) return false;
    paramList_1_0(b, l + 1);
    return true;
  }

  // declColonEquals ((comma|semicolon) declColonEquals)*
  private static boolean paramList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declColonEquals(b, l + 1);
    r = r && paramList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((comma|semicolon) declColonEquals)*
  private static boolean paramList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paramList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paramList_1_0_1", c)) break;
    }
    return true;
  }

  // (comma|semicolon) declColonEquals
  private static boolean paramList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paramList_1_0_1_0_0(b, l + 1);
    r = r && declColonEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma|semicolon
  private static boolean paramList_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1_0_0")) return false;
    boolean r;
    r = comma(b, l + 1);
    if (!r) r = semicolon(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // paramList? ('->' optInd typeDesc)?
  public static boolean paramListArrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST_ARROW, "<param list arrow>");
    r = paramListArrow_0(b, l + 1);
    r = r && paramListArrow_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // paramList?
  private static boolean paramListArrow_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_0")) return false;
    paramList(b, l + 1);
    return true;
  }

  // ('->' optInd typeDesc)?
  private static boolean paramListArrow_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_1")) return false;
    paramListArrow_1_0(b, l + 1);
    return true;
  }

  // '->' optInd typeDesc
  private static boolean paramListArrow_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // paramList? (':' optInd typeDesc)?
  public static boolean paramListColon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST_COLON, "<param list colon>");
    r = paramListColon_0(b, l + 1);
    r = r && paramListColon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // paramList?
  private static boolean paramListColon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_0")) return false;
    paramList(b, l + 1);
    return true;
  }

  // (':' optInd typeDesc)?
  private static boolean paramListColon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_1")) return false;
    paramListColon_1_0(b, l + 1);
    return true;
  }

  // ':' optInd typeDesc
  private static boolean paramListColon_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' stmt '}'
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = consumeToken(b, "{");
    r = r && stmt(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mulExpr (OP8 optInd mulExpr)*
  public static boolean plusExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_EXPR, "<plus expr>");
    r = mulExpr(b, l + 1);
    r = r && plusExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP8 optInd mulExpr)*
  private static boolean plusExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!plusExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plusExpr_1", c)) break;
    }
    return true;
  }

  // OP8 optInd mulExpr
  private static boolean plusExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP8);
    r = r && optInd(b, l + 1);
    r = r && mulExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' stmt? ( IND_EQ doBlock
  //                              | IND_EQ 'of' exprList ':' stmt
  //                              | IND_EQ 'elif' expr ':' stmt
  //                              | IND_EQ 'except' exprList ':' stmt
  //                              | IND_EQ 'else' ':' stmt )*
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

  // stmt?
  private static boolean postExprBlocks_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_1")) return false;
    stmt(b, l + 1);
    return true;
  }

  // ( IND_EQ doBlock
  //                              | IND_EQ 'of' exprList ':' stmt
  //                              | IND_EQ 'elif' expr ':' stmt
  //                              | IND_EQ 'except' exprList ':' stmt
  //                              | IND_EQ 'else' ':' stmt )*
  private static boolean postExprBlocks_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postExprBlocks_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postExprBlocks_2", c)) break;
    }
    return true;
  }

  // IND_EQ doBlock
  //                              | IND_EQ 'of' exprList ':' stmt
  //                              | IND_EQ 'elif' expr ':' stmt
  //                              | IND_EQ 'except' exprList ':' stmt
  //                              | IND_EQ 'else' ':' stmt
  private static boolean postExprBlocks_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postExprBlocks_2_0_0(b, l + 1);
    if (!r) r = postExprBlocks_2_0_1(b, l + 1);
    if (!r) r = postExprBlocks_2_0_2(b, l + 1);
    if (!r) r = postExprBlocks_2_0_3(b, l + 1);
    if (!r) r = postExprBlocks_2_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ doBlock
  private static boolean postExprBlocks_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && doBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ 'of' exprList ':' stmt
  private static boolean postExprBlocks_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "of");
    r = r && exprList(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ 'elif' expr ':' stmt
  private static boolean postExprBlocks_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0_2")) return false;
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

  // IND_EQ 'except' exprList ':' stmt
  private static boolean postExprBlocks_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && consumeToken(b, "except");
    r = r && exprList(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ 'else' ':' stmt
  private static boolean postExprBlocks_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2_0_4")) return false;
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
  // '{.' optInd (exprColonEqExpr comma?)* optPar ('.}'|'}')
  public static boolean pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA, "<pragma>");
    r = consumeToken(b, "{.");
    r = r && optInd(b, l + 1);
    r = r && pragma_2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && pragma_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean pragma_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pragma_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pragma_2", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean pragma_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && pragma_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean pragma_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  // '.}'|'}'
  private static boolean pragma_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_4")) return false;
    boolean r;
    r = consumeToken(b, ".}");
    if (!r) r = consumeToken(b, "}");
    return r;
  }

  /* ********************************************************** */
  // pragma (':' stmt)?
  public static boolean pragmaStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA_STMT, "<pragma stmt>");
    r = pragma(b, l + 1);
    r = r && pragmaStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (':' stmt)?
  private static boolean pragmaStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1")) return false;
    pragmaStmt_1_0(b, l + 1);
    return true;
  }

  // ':' stmt
  private static boolean pragmaStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // typeKeyw optInd typeDesc | prefixOperator* identOrLiteral primarySuffix* | 'bind' primary
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = primary_0(b, l + 1);
    if (!r) r = primary_1(b, l + 1);
    if (!r) r = primary_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeKeyw optInd typeDesc
  private static boolean primary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeKeyw(b, l + 1);
    r = r && optInd(b, l + 1);
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixOperator* identOrLiteral primarySuffix*
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_1_0(b, l + 1);
    r = r && identOrLiteral(b, l + 1);
    r = r && primary_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixOperator*
  private static boolean primary_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prefixOperator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_1_0", c)) break;
    }
    return true;
  }

  // primarySuffix*
  private static boolean primary_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_1_2", c)) break;
    }
    return true;
  }

  // 'bind' primary
  private static boolean primary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "bind");
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (exprColonEqExpr comma?)* ')'
  //         | '.' optInd symbol generalizedLit?
  //         | '[' optInd exprColonEqExprList2 optPar ']'
  //         | '{' optInd exprColonEqExprList2 optPar '}'
  //         | /*&('`'|IDENT|literal|'cast'|'addr'|'type')*/ expr
  public static boolean primarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX, "<primary suffix>");
    r = primarySuffix_0(b, l + 1);
    if (!r) r = primarySuffix_1(b, l + 1);
    if (!r) r = primarySuffix_2(b, l + 1);
    if (!r) r = primarySuffix_3(b, l + 1);
    if (!r) r = expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' (exprColonEqExpr comma?)* ')'
  private static boolean primarySuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && primarySuffix_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExpr comma?)*
  private static boolean primarySuffix_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primarySuffix_0_1", c)) break;
    }
    return true;
  }

  // exprColonEqExpr comma?
  private static boolean primarySuffix_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && primarySuffix_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean primarySuffix_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0_1")) return false;
    comma(b, l + 1);
    return true;
  }

  // '.' optInd symbol generalizedLit?
  private static boolean primarySuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && primarySuffix_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generalizedLit?
  private static boolean primarySuffix_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_1_3")) return false;
    generalizedLit(b, l + 1);
    return true;
  }

  // '[' optInd exprColonEqExprList2 optPar ']'
  private static boolean primarySuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1);
    r = r && exprColonEqExprList2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' optInd exprColonEqExprList2 optPar '}'
  private static boolean primarySuffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && optInd(b, l + 1);
    r = r && exprColonEqExprList2(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol ('.' optInd symbol)?
  public static boolean qualifiedIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_IDENT, "<qualified ident>");
    r = symbol(b, l + 1);
    r = r && qualifiedIdent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' optInd symbol)?
  private static boolean qualifiedIdent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1")) return false;
    qualifiedIdent_1_0(b, l + 1);
    return true;
  }

  // '.' optInd symbol
  private static boolean qualifiedIdent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'raise' optInd expr?
  public static boolean raiseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, "<raise stmt>");
    r = consumeToken(b, "raise");
    r = r && optInd(b, l + 1);
    r = r && raiseStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean raiseStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'return' optInd expr?
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = consumeToken(b, "return");
    r = r && optInd(b, l + 1);
    r = r && returnStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean returnStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // optInd identVis pattern? genericParamList? paramListColon pragma? ('=' stmt)?
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = optInd(b, l + 1);
    r = r && identVis(b, l + 1);
    r = r && routine_2(b, l + 1);
    r = r && routine_3(b, l + 1);
    r = r && paramListColon(b, l + 1);
    r = r && routine_5(b, l + 1);
    r = r && routine_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pattern?
  private static boolean routine_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_2")) return false;
    pattern(b, l + 1);
    return true;
  }

  // genericParamList?
  private static boolean routine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_3")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean routine_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_5")) return false;
    pragma(b, l + 1);
    return true;
  }

  // ('=' stmt)?
  private static boolean routine_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_6")) return false;
    routine_6_0(b, l + 1);
    return true;
  }

  // '=' stmt
  private static boolean routine_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<RULE>> | (IND_GT (<<RULE>>)? (IND_EQ (<<RULE>>)?)* IND_LT)
  static boolean section(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = section_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_GT (<<RULE>>)? (IND_EQ (<<RULE>>)?)* IND_LT
  private static boolean section_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_GT);
    r = r && section_1_1(b, l + 1, _RULE);
    r = r && section_1_2(b, l + 1, _RULE);
    r = r && consumeToken(b, IND_LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<RULE>>)?
  private static boolean section_1_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_1")) return false;
    section_1_1_0(b, l + 1, _RULE);
    return true;
  }

  // <<RULE>>
  private static boolean section_1_1_0(PsiBuilder b, int l, Parser _RULE) {
    return _RULE.parse(b, l);
  }

  // (IND_EQ (<<RULE>>)?)*
  private static boolean section_1_2(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!section_1_2_0(b, l + 1, _RULE)) break;
      if (!empty_element_parsed_guard_(b, "section_1_2", c)) break;
    }
    return true;
  }

  // IND_EQ (<<RULE>>)?
  private static boolean section_1_2_0(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_EQ);
    r = r && section_1_2_0_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<RULE>>)?
  private static boolean section_1_2_0_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section_1_2_0_1")) return false;
    section_1_2_0_1_0(b, l + 1, _RULE);
    return true;
  }

  // <<RULE>>
  private static boolean section_1_2_0_1_0(PsiBuilder b, int l, Parser _RULE) {
    return _RULE.parse(b, l);
  }

  /* ********************************************************** */
  // ';'
  public static boolean semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' ((exprColonEqExpr comma)+|':' ) '}'
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

  // (exprColonEqExpr comma)+|':'
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
  // arrowExpr (OP0 optInd arrowExpr)* pragma?
  public static boolean simpleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPR, "<simple expr>");
    r = arrowExpr(b, l + 1);
    r = r && simpleExpr_1(b, l + 1);
    r = r && simpleExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP0 optInd arrowExpr)*
  private static boolean simpleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleExpr_1", c)) break;
    }
    return true;
  }

  // OP0 optInd arrowExpr
  private static boolean simpleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP0);
    r = r && optInd(b, l + 1);
    r = r && arrowExpr(b, l + 1);
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
  // (returnStmt|raiseStmt|yieldStmt|discardStmt|breakStmt
  //              | continueStmt|pragmaStmt|importStmt|exportStmt|fromStmt
  //              | includeStmt)|exprStmt
  public static boolean simpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
    r = simpleStmt_0(b, l + 1);
    if (!r) r = exprStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // returnStmt|raiseStmt|yieldStmt|discardStmt|breakStmt
  //              | continueStmt|pragmaStmt|importStmt|exportStmt|fromStmt
  //              | includeStmt
  private static boolean simpleStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt_0")) return false;
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
    return r;
  }

  /* ********************************************************** */
  // ampExpr (OP6 optInd ampExpr)*
  public static boolean sliceExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_EXPR, "<slice expr>");
    r = ampExpr(b, l + 1);
    r = r && sliceExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP6 optInd ampExpr)*
  private static boolean sliceExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sliceExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sliceExpr_1", c)) break;
    }
    return true;
  }

  // OP6 optInd ampExpr
  private static boolean sliceExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP6);
    r = r && optInd(b, l + 1);
    r = r && ampExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'static' colcom stmt
  public static boolean staticStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATIC_STMT, "<static stmt>");
    r = consumeToken(b, "static");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (IND_GT complexOrSimpleStmt ((IND_EQ|';') complexOrSimpleStmt)* IND_LT) | simpleStmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = stmt_0(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IND_GT complexOrSimpleStmt ((IND_EQ|';') complexOrSimpleStmt)* IND_LT
  private static boolean stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_GT);
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && stmt_0_2(b, l + 1);
    r = r && consumeToken(b, IND_LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((IND_EQ|';') complexOrSimpleStmt)*
  private static boolean stmt_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_0_2", c)) break;
    }
    return true;
  }

  // (IND_EQ|';') complexOrSimpleStmt
  private static boolean stmt_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_0_2_0_0(b, l + 1);
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ|';'
  private static boolean stmt_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, IND_EQ);
    if (!r) r = consumeToken(b, ";");
    return r;
  }

  /* ********************************************************** */
  // '`' (KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`'|IDENT|KEYW
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

  // '`' (KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`'
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

  // (KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+)+
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

  // KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+
  private static boolean symbol_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYW);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = literal(b, l + 1);
    if (!r) r = symbol_0_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (operator|'('|')'|'['|']'|'{'|'}'|'=')+
  private static boolean symbol_0_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol_0_1_0_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol_0_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_0_1_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // operator|'('|')'|'['|']'|'{'|'}'|'='
  private static boolean symbol_0_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0_3_0")) return false;
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
  // 'try' colcom stmt /*&(optInd 'except'|'finally')*/
  //              (optInd 'except' exprList colcom stmt)*
  //              (optInd 'finally' colcom stmt)?
  public static boolean tryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPR, "<try expr>");
    r = consumeToken(b, "try");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    r = r && tryExpr_3(b, l + 1);
    r = r && tryExpr_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd 'except' exprList colcom stmt)*
  private static boolean tryExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpr_3", c)) break;
    }
    return true;
  }

  // optInd 'except' exprList colcom stmt
  private static boolean tryExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd(b, l + 1);
    r = r && consumeToken(b, "except");
    r = r && exprList(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd 'finally' colcom stmt)?
  private static boolean tryExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4")) return false;
    tryExpr_4_0(b, l + 1);
    return true;
  }

  // optInd 'finally' colcom stmt
  private static boolean tryExpr_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd(b, l + 1);
    r = r && consumeToken(b, "finally");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' colcom stmt /*&(IND_EQ? 'except'|'finally')*/
  //              (IND_EQ? 'except' exprList colcom stmt)*
  //              (IND_EQ? 'finally' colcom stmt)?
  public static boolean tryStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, "<try stmt>");
    r = consumeToken(b, "try");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    r = r && tryStmt_3(b, l + 1);
    r = r && tryStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ? 'except' exprList colcom stmt)*
  private static boolean tryStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ? 'except' exprList colcom stmt
  private static boolean tryStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_3_0_0(b, l + 1);
    r = r && consumeToken(b, "except");
    r = r && exprList(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_EQ?
  private static boolean tryStmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0_0")) return false;
    consumeToken(b, IND_EQ);
    return true;
  }

  // (IND_EQ? 'finally' colcom stmt)?
  private static boolean tryStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4")) return false;
    tryStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ? 'finally' colcom stmt
  private static boolean tryStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_4_0_0(b, l + 1);
    r = r && consumeToken(b, "finally");
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
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
  // (typeClassParam (',' typeClassParam)*)? (pragma)? ('of' (typeDesc (',' typeDesc)*)?)?
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

  // (pragma)?
  private static boolean typeClass_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_1")) return false;
    typeClass_1_0(b, l + 1);
    return true;
  }

  // (pragma)
  private static boolean typeClass_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeClass_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // identWithPragmaDot genericParamList? '=' optInd typeDefAux
  //               identVisDot genericParamList? pragma '=' optInd typeDefAux
  public static boolean typeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = identWithPragmaDot(b, l + 1);
    r = r && typeDef_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && typeDefAux(b, l + 1);
    r = r && identVisDot(b, l + 1);
    r = r && typeDef_6(b, l + 1);
    r = r && pragma(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && typeDefAux(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // genericParamList?
  private static boolean typeDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_1")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  // genericParamList?
  private static boolean typeDef_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_6")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)?|'concept' typeClass
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
  // 'var'|'out'|'ref'|'ptr'|'shared'|'tuple'|'proc'|'iterator'|'distinct'|'object'|'enum'
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
  // '(' optInd identWithPragma (comma identWithPragma)* optPar ')' '=' optInd expr
  public static boolean varTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_TUPLE, "<var tuple>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1);
    r = r && identWithPragma(b, l + 1);
    r = r && varTuple_3(b, l + 1);
    r = r && optPar(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma identWithPragma)*
  private static boolean varTuple_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varTuple_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varTuple_3", c)) break;
    }
    return true;
  }

  // comma identWithPragma
  private static boolean varTuple_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma(b, l + 1);
    r = r && identWithPragma(b, l + 1);
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
  // 'while' expr colcom stmt
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "while");
    r = r && expr(b, l + 1);
    r = r && colcom(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'yield' optInd expr?
  public static boolean yieldStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, "<yield stmt>");
    r = consumeToken(b, "yield");
    r = r && optInd(b, l + 1);
    r = r && yieldStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr?
  private static boolean yieldStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt_2")) return false;
    expr(b, l + 1);
    return true;
  }

  static final Parser constant_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return constant(b, l + 1);
    }
  };
  static final Parser typeDef_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDef(b, l + 1);
    }
  };
  static final Parser variable_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return variable(b, l + 1);
    }
  };
}
