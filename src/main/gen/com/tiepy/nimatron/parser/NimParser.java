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
  // plusExpr (OP7 <<optInd (plusExpr)>>)*
  public static boolean ampExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AMP_EXPR, "<amp expr>");
    r = plusExpr(b, l + 1);
    r = r && ampExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP7 <<optInd (plusExpr)>>)*
  private static boolean ampExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ampExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ampExpr_1", c)) break;
    }
    return true;
  }

  // OP7 <<optInd (plusExpr)>>
  private static boolean ampExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP7);
    r = r && optInd(b, l + 1, ampExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (plusExpr)
  private static boolean ampExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ampExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = plusExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cmpExpr (OP4 <<optInd (cmpExpr)>>)*
  public static boolean andExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = cmpExpr(b, l + 1);
    r = r && andExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP4 <<optInd (cmpExpr)>>)*
  private static boolean andExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!andExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "andExpr_1", c)) break;
    }
    return true;
  }

  // OP4 <<optInd (cmpExpr)>>
  private static boolean andExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP4);
    r = r && optInd(b, l + 1, andExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (cmpExpr)
  private static boolean andExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmpExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' <<optInd (optInd5)>> <<optInd (optInd6)>>
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

  // (optInd5)
  private static boolean arrayConstr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd6)
  private static boolean arrayConstr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayConstr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignExpr (OP1 <<optInd (assignExpr)>>)*
  public static boolean arrowExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARROW_EXPR, "<arrow expr>");
    r = assignExpr(b, l + 1);
    r = r && arrowExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP1 <<optInd (assignExpr)>>)*
  private static boolean arrowExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrowExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrowExpr_1", c)) break;
    }
    return true;
  }

  // OP1 <<optInd (assignExpr)>>
  private static boolean arrowExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP1);
    r = r && optInd(b, l + 1, arrowExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assignExpr)
  private static boolean arrowExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignExpr(b, l + 1);
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
  // orExpr (OP2 <<optInd (orExpr)>>)*
  public static boolean assignExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_EXPR, "<assign expr>");
    r = orExpr(b, l + 1);
    r = r && assignExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP2 <<optInd (orExpr)>>)*
  private static boolean assignExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!assignExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignExpr_1", c)) break;
    }
    return true;
  }

  // OP2 <<optInd (orExpr)>>
  private static boolean assignExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP2);
    r = r && optInd(b, l + 1, assignExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (orExpr)
  private static boolean assignExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = orExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bind' <<optInd (optInd18)>>
  public static boolean bindStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_STMT, "<bind stmt>");
    r = consumeToken(b, "bind");
    r = r && optInd(b, l + 1, bindStmt_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd18)
  private static boolean bindStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd18(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'block' symbol? ':' stmt
  public static boolean blockExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_EXPR, "<block expr>");
    r = consumeToken(b, "block");
    r = r && blockExpr_1(b, l + 1);
    r = r && consumeToken(b, ":");
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
  // 'block' symbol? ':' stmt
  public static boolean blockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, "<block stmt>");
    r = consumeToken(b, "block");
    r = r && blockStmt_1(b, l + 1);
    r = r && consumeToken(b, ":");
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
  // 'break' <<optInd (expr)>>?
  public static boolean breakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, "<break stmt>");
    r = consumeToken(b, "break");
    r = r && breakStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean breakStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt_1")) return false;
    optInd(b, l + 1, breakStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean breakStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'case' expr ':'? ((IND_GT ofBranches IND_LT) | (IND_EQ ofBranches))
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

  // (IND_GT ofBranches IND_LT) | (IND_EQ ofBranches)
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
  // 'cast' '[' <<optInd (typeDesc)>> <<optInd (optInd1)>> '(' <<optInd (optInd2)>> ')'
  public static boolean castExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXPR, "<cast expr>");
    r = consumeToken(b, "cast");
    r = r && consumeToken(b, "[");
    r = r && optInd(b, l + 1, castExpr_2_0_parser_);
    r = r && optInd(b, l + 1, castExpr_3_0_parser_);
    r = r && consumeToken(b, "(");
    r = r && optInd(b, l + 1, castExpr_5_0_parser_);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (typeDesc)
  private static boolean castExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd1)
  private static boolean castExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd2)
  private static boolean castExpr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sliceExpr (OP5 <<optInd (sliceExpr)>>)*
  public static boolean cmpExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CMP_EXPR, "<cmp expr>");
    r = sliceExpr(b, l + 1);
    r = r && cmpExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP5 <<optInd (sliceExpr)>>)*
  private static boolean cmpExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmpExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmpExpr_1", c)) break;
    }
    return true;
  }

  // OP5 <<optInd (sliceExpr)>>
  private static boolean cmpExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP5);
    r = r && optInd(b, l + 1, cmpExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (sliceExpr)
  private static boolean cmpExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sliceExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' stmt postExprBlocks?
  public static boolean colonBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON_BODY, "<colon body>");
    r = consumeToken(b, ":");
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
  // ifStmt
  //                       | whenStmt
  //                       | whileStmt
  //                       | tryStmt
  //                       | forStmt
  //                       | blockStmt
  //                       | staticStmt
  //                       | deferStmt
  //                       | asmStmt
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
  //                       | bindStmt
  //                       | mixinStmt
  //                       | simpleStmt
  public static boolean complexOrSimpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPLEX_OR_SIMPLE_STMT, "<complex or simple stmt>");
    r = ifStmt(b, l + 1);
    if (!r) r = whenStmt(b, l + 1);
    if (!r) r = whileStmt(b, l + 1);
    if (!r) r = tryStmt(b, l + 1);
    if (!r) r = forStmt(b, l + 1);
    if (!r) r = blockStmt(b, l + 1);
    if (!r) r = staticStmt(b, l + 1);
    if (!r) r = deferStmt(b, l + 1);
    if (!r) r = asmStmt(b, l + 1);
    if (!r) r = complexOrSimpleStmt_9(b, l + 1);
    if (!r) r = complexOrSimpleStmt_10(b, l + 1);
    if (!r) r = complexOrSimpleStmt_11(b, l + 1);
    if (!r) r = complexOrSimpleStmt_12(b, l + 1);
    if (!r) r = complexOrSimpleStmt_13(b, l + 1);
    if (!r) r = complexOrSimpleStmt_14(b, l + 1);
    if (!r) r = complexOrSimpleStmt_15(b, l + 1);
    if (!r) r = complexOrSimpleStmt_16(b, l + 1);
    if (!r) r = complexOrSimpleStmt_17(b, l + 1);
    if (!r) r = complexOrSimpleStmt_18(b, l + 1);
    if (!r) r = bindStmt(b, l + 1);
    if (!r) r = mixinStmt(b, l + 1);
    if (!r) r = simpleStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'proc' routine
  private static boolean complexOrSimpleStmt_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "proc");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'func' routine
  private static boolean complexOrSimpleStmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "func");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'method' routine
  private static boolean complexOrSimpleStmt_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "method");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'iterator' routine
  private static boolean complexOrSimpleStmt_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "iterator");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'macro' routine
  private static boolean complexOrSimpleStmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "macro");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'template' routine
  private static boolean complexOrSimpleStmt_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "template");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'converter' routine
  private static boolean complexOrSimpleStmt_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "converter");
    r = r && routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'type' <<section typeDef>>
  private static boolean complexOrSimpleStmt_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "type");
    r = r && section(b, l + 1, typeDef_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'const' <<section constant>>
  private static boolean complexOrSimpleStmt_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "const");
    r = r && section(b, l + 1, constant_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('let'|'var'|'using') <<section variable>>
  private static boolean complexOrSimpleStmt_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexOrSimpleStmt_18_0(b, l + 1);
    r = r && section(b, l + 1, variable_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'let'|'var'|'using'
  private static boolean complexOrSimpleStmt_18_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexOrSimpleStmt_18_0")) return false;
    boolean r;
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "using");
    return r;
  }

  /* ********************************************************** */
  // expr ':' <<optInd (expr)>> ('elif' expr ':' <<optInd (expr)>>)* 'else' ':' expr
  public static boolean condExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<cond expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, condExpr_2_0_parser_);
    r = r && condExpr_3(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && consumeToken(b, ":");
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr)
  private static boolean condExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('elif' expr ':' <<optInd (expr)>>)*
  private static boolean condExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condExpr_3", c)) break;
    }
    return true;
  }

  // 'elif' expr ':' <<optInd (expr)>>
  private static boolean condExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elif");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && optInd(b, l + 1, condExpr_3_0_3_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean condExpr_3_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condExpr_3_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr ':' stmt (IND_EQ 'elif' expr ':' stmt)* (IND_EQ 'else' ':' stmt)?
  public static boolean condStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    r = r && condStmt_3(b, l + 1);
    r = r && condStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ 'elif' expr ':' stmt)*
  private static boolean condStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr ':' stmt
  private static boolean condStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_3_0")) return false;
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
  private static boolean condStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4")) return false;
    condStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' ':' stmt
  private static boolean condStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condStmt_4_0")) return false;
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
  // (varTuple|identWithPragma) (':' typeDesc)? '=' <<optInd (expr)>>
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = constant_0(b, l + 1);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, constant_3_0_parser_);
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

  // (':' typeDesc)?
  private static boolean constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1")) return false;
    constant_1_0(b, l + 1);
    return true;
  }

  // ':' typeDesc
  private static boolean constant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean constant_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'break' <<optInd (expr)>>?
  public static boolean continueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, "<continue stmt>");
    r = consumeToken(b, "break");
    r = r && continueStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean continueStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt_1")) return false;
    optInd(b, l + 1, continueStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean continueStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identWithPragma (',' identWithPragma)* ','? (':' <<optInd (typeDesc)>>)? ('=' <<optInd (expr)>>)?
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

  // (':' <<optInd (typeDesc)>>)?
  private static boolean declColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3")) return false;
    declColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' <<optInd (typeDesc)>>
  private static boolean declColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, declColonEquals_3_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc)
  private static boolean declColonEquals_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd (expr)>>)?
  private static boolean declColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4")) return false;
    declColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' <<optInd (expr)>>
  private static boolean declColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, declColonEquals_4_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean declColonEquals_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declColonEquals_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'defer' ':' stmt
  public static boolean deferStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deferStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFER_STMT, "<defer stmt>");
    r = consumeToken(b, "defer");
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'discard' <<optInd (expr)>>?
  public static boolean discardStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCARD_STMT, "<discard stmt>");
    r = consumeToken(b, "discard");
    r = r && discardStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean discardStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt_1")) return false;
    optInd(b, l + 1, discardStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean discardStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discardStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'do' paramListArrow pragma? ':' stmt
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_BLOCK, "<do block>");
    r = consumeToken(b, "do");
    r = r && paramListArrow(b, l + 1);
    r = r && doBlock_2(b, l + 1);
    r = r && consumeToken(b, ":");
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
  // primary (OP10 <<optInd (primary)>>)*
  public static boolean dollarExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOLLAR_EXPR, "<dollar expr>");
    r = primary(b, l + 1);
    r = r && dollarExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP10 <<optInd (primary)>>)*
  private static boolean dollarExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dollarExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dollarExpr_1", c)) break;
    }
    return true;
  }

  // OP10 <<optInd (primary)>>
  private static boolean dollarExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP10);
    r = r && optInd(b, l + 1, dollarExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (primary)
  private static boolean dollarExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollarExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'export' <<optInd (expr)>> ((',' expr)+ | ('except' <<optInd (optInd11)>> ))
  public static boolean exportStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT, "<export stmt>");
    r = consumeToken(b, "export");
    r = r && optInd(b, l + 1, exportStmt_1_0_parser_);
    r = r && exportStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr)
  private static boolean exportStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)+ | ('except' <<optInd (optInd11)>> )
  private static boolean exportStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exportStmt_2_0(b, l + 1);
    if (!r) r = exportStmt_2_1(b, l + 1);
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

  // 'except' <<optInd (optInd11)>>
  private static boolean exportStmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, exportStmt_2_1_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd11)
  private static boolean exportStmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exportStmt_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd11(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // blockExpr|ifExpr|whenExpr|caseStmt|forStmt|tryExpr|simpleExpr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = blockExpr(b, l + 1);
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
  // exprColonEqExpr (',' exprColonEqExpr)* ','?
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

  // (',' exprColonEqExpr)*
  private static boolean exprColonEqExprList2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprColonEqExprList2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprColonEqExprList2_1", c)) break;
    }
    return true;
  }

  // ',' exprColonEqExpr
  private static boolean exprColonEqExprList2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean exprColonEqExprList2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprColonEqExprList2_2")) return false;
    consumeToken(b, ",");
    return true;
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
  // simpleExpr (('=' <<optInd (expr)>> colonBody?) | (expr (',' expr)* postExprBlocks))?
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = simpleExpr(b, l + 1);
    r = r && exprStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('=' <<optInd (expr)>> colonBody?) | (expr (',' expr)* postExprBlocks))?
  private static boolean exprStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1")) return false;
    exprStmt_1_0(b, l + 1);
    return true;
  }

  // ('=' <<optInd (expr)>> colonBody?) | (expr (',' expr)* postExprBlocks)
  private static boolean exprStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprStmt_1_0_0(b, l + 1);
    if (!r) r = exprStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' <<optInd (expr)>> colonBody?
  private static boolean exprStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, exprStmt_1_0_0_1_0_parser_);
    r = r && exprStmt_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean exprStmt_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colonBody?
  private static boolean exprStmt_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt_1_0_0_2")) return false;
    colonBody(b, l + 1);
    return true;
  }

  // expr (',' expr)* postExprBlocks
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
  // 'for' (identWithPragma (',' identWithPragma)*) 'in' expr ':' stmt
  public static boolean forStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, "<for stmt>");
    r = consumeToken(b, "for");
    r = r && forStmt_1(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identWithPragma (',' identWithPragma)*
  private static boolean forStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identWithPragma(b, l + 1);
    r = r && forStmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' identWithPragma)*
  private static boolean forStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!forStmt_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forStmt_1_1", c)) break;
    }
    return true;
  }

  // ',' identWithPragma
  private static boolean forStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStmt_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'from' expr 'import' <<optInd (expr)>> (',' expr)*
  public static boolean fromStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FROM_STMT, "<from stmt>");
    r = consumeToken(b, "from");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, "import");
    r = r && optInd(b, l + 1, fromStmt_3_0_parser_);
    r = r && fromStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr)
  private static boolean fromStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean fromStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fromStmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromStmt_4", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean fromStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
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
  // symbol (',' symbol)* (':' expr)? ('=' <<optInd (expr)>>)?
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

  // (',' symbol)*
  private static boolean genericParam_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!genericParam_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "genericParam_1", c)) break;
    }
    return true;
  }

  // ',' symbol
  private static boolean genericParam_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' expr)?
  private static boolean genericParam_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_2")) return false;
    genericParam_2_0(b, l + 1);
    return true;
  }

  // ':' expr
  private static boolean genericParam_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd (expr)>>)?
  private static boolean genericParam_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3")) return false;
    genericParam_3_0(b, l + 1);
    return true;
  }

  // '=' <<optInd (expr)>>
  private static boolean genericParam_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, genericParam_3_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean genericParam_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParam_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' <<optInd (optInd14)>> <<optInd (optInd6)>>
  public static boolean genericParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAM_LIST, "<generic param list>");
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, genericParamList_1_0_parser_);
    r = r && optInd(b, l + 1, genericParamList_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd14)
  private static boolean genericParamList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd14(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd6)
  private static boolean genericParamList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericParamList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT (',' IDENT)* ','? (':' <<optInd (typeDesc)>>)? ('=' <<optInd (expr)>>)?
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

  // (':' <<optInd (typeDesc)>>)?
  private static boolean identColonEquals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3")) return false;
    identColonEquals_3_0(b, l + 1);
    return true;
  }

  // ':' <<optInd (typeDesc)>>
  private static boolean identColonEquals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, identColonEquals_3_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc)
  private static boolean identColonEquals_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' <<optInd (expr)>>)?
  private static boolean identColonEquals_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4")) return false;
    identColonEquals_4_0(b, l + 1);
    return true;
  }

  // '=' <<optInd (expr)>>
  private static boolean identColonEquals_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && optInd(b, l + 1, identColonEquals_4_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean identColonEquals_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identColonEquals_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
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
  // symbol '.' <<optInd (symbol)>> OPR?
  public static boolean identVisDot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS_DOT, "<ident vis dot>");
    r = symbol(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && optInd(b, l + 1, identVisDot_2_0_parser_);
    r = r && identVisDot_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (symbol)
  private static boolean identVisDot_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPR?
  private static boolean identVisDot_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identVisDot_3")) return false;
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
  // 'import' <<optInd (expr)>> ((',' expr)+ | ('except' <<optInd (optInd11)>> ))
  public static boolean importStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = consumeToken(b, "import");
    r = r && optInd(b, l + 1, importStmt_1_0_parser_);
    r = r && importStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr)
  private static boolean importStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)+ | ('except' <<optInd (optInd11)>> )
  private static boolean importStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importStmt_2_0(b, l + 1);
    if (!r) r = importStmt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)+
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

  // ',' expr
  private static boolean importStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'except' <<optInd (optInd11)>>
  private static boolean importStmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "except");
    r = r && optInd(b, l + 1, importStmt_2_1_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd11)
  private static boolean importStmt_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importStmt_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd11(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' <<optInd (expr)>> (',' expr)*
  public static boolean includeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, "<include stmt>");
    r = consumeToken(b, "include");
    r = r && optInd(b, l + 1, includeStmt_1_0_parser_);
    r = r && includeStmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr)
  private static boolean includeStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean includeStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!includeStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "includeStmt_2", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean includeStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
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
    if (!r) r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, NIL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'mixin' <<optInd (optInd18)>>
  public static boolean mixinStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MIXIN_STMT, "<mixin stmt>");
    r = consumeToken(b, "mixin");
    r = r && optInd(b, l + 1, mixinStmt_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd18)
  private static boolean mixinStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd18(b, l + 1);
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
  // dollarExpr (OP9 <<optInd (dollarExpr)>>)*
  public static boolean mulExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_EXPR, "<mul expr>");
    r = dollarExpr(b, l + 1);
    r = r && mulExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP9 <<optInd (dollarExpr)>>)*
  private static boolean mulExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mulExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mulExpr_1", c)) break;
    }
    return true;
  }

  // OP9 <<optInd (dollarExpr)>>
  private static boolean mulExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP9);
    r = r && optInd(b, l + 1, mulExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dollarExpr)
  private static boolean mulExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dollarExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'of' exprList ':' stmt
  public static boolean ofBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCH, "<of branch>");
    r = consumeToken(b, "of");
    r = r && exprList(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ofBranch (IND_EQ ofBranch)* (IND_EQ 'elif' expr ':' stmt)* (IND_EQ 'else' ':' stmt)?
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

  // (IND_EQ 'elif' expr ':' stmt)*
  private static boolean ofBranches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ofBranches_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ofBranches_2", c)) break;
    }
    return true;
  }

  // IND_EQ 'elif' expr ':' stmt
  private static boolean ofBranches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_2_0")) return false;
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
  private static boolean ofBranches_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3")) return false;
    ofBranches_3_0(b, l + 1);
    return true;
  }

  // IND_EQ 'else' ':' stmt
  private static boolean ofBranches_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ofBranches_3_0")) return false;
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
  // (<<RULE>>) | (IND_GT (<<RULE>>) IND_LT)
  static boolean optInd(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd_0(b, l + 1, _RULE);
    if (!r) r = optInd_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>
  private static boolean optInd_0(PsiBuilder b, int l, Parser _RULE) {
    return _RULE.parse(b, l);
  }

  // IND_GT (<<RULE>>) IND_LT
  private static boolean optInd_1(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "optInd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IND_GT);
    r = r && optInd_1_1(b, l + 1, _RULE);
    r = r && consumeToken(b, IND_LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<RULE>>
  private static boolean optInd_1_1(PsiBuilder b, int l, Parser _RULE) {
    return _RULE.parse(b, l);
  }

  /* ********************************************************** */
  // ']'
  static boolean optInd1(PsiBuilder b, int l) {
    return consumeToken(b, "]");
  }

  /* ********************************************************** */
  // '.}'|'}'
  public static boolean optInd10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd10")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_10, "<opt ind 10>");
    r = consumeToken(b, ".}");
    if (!r) r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr (',' expr)*
  public static boolean optInd11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd11")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_11, "<opt ind 11>");
    r = expr(b, l + 1);
    r = r && optInd11_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expr)*
  private static boolean optInd11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd11_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd11_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd11_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean optInd11_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd11_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'except' exprList ':' stmt
  public static boolean optInd12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd12")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_12, "<opt ind 12>");
    r = consumeToken(b, "except");
    r = r && exprList(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'finally' ':' stmt
  public static boolean optInd13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd13")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_13, "<opt ind 13>");
    r = consumeToken(b, "finally");
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (genericParam ((','|';') genericParam)*)?
  public static boolean optInd14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd14")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_14, "<opt ind 14>");
    optInd14_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // genericParam ((','|';') genericParam)*
  private static boolean optInd14_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd14_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = genericParam(b, l + 1);
    r = r && optInd14_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((','|';') genericParam)*
  private static boolean optInd14_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd14_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd14_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd14_0_1", c)) break;
    }
    return true;
  }

  // (','|';') genericParam
  private static boolean optInd14_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd14_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd14_0_1_0_0(b, l + 1);
    r = r && genericParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','|';'
  private static boolean optInd14_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd14_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ",");
    if (!r) r = consumeToken(b, ";");
    return r;
  }

  /* ********************************************************** */
  // identVis pattern? genericParamList? paramListColon pragma? ('=' stmt)?
  public static boolean optInd15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_15, "<opt ind 15>");
    r = identVis(b, l + 1);
    r = r && optInd15_1(b, l + 1);
    r = r && optInd15_2(b, l + 1);
    r = r && paramListColon(b, l + 1);
    r = r && optInd15_4(b, l + 1);
    r = r && optInd15_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pattern?
  private static boolean optInd15_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15_1")) return false;
    pattern(b, l + 1);
    return true;
  }

  // genericParamList?
  private static boolean optInd15_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15_2")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean optInd15_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15_4")) return false;
    pragma(b, l + 1);
    return true;
  }

  // ('=' stmt)?
  private static boolean optInd15_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15_5")) return false;
    optInd15_5_0(b, l + 1);
    return true;
  }

  // '=' stmt
  private static boolean optInd15_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd15_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identWithPragma (',' identWithPragma)*
  public static boolean optInd16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd16")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_16, "<opt ind 16>");
    r = identWithPragma(b, l + 1);
    r = r && optInd16_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' identWithPragma)*
  private static boolean optInd16_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd16_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd16_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd16_1", c)) break;
    }
    return true;
  }

  // ',' identWithPragma
  private static boolean optInd16_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd16_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && identWithPragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean optInd17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd17")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_17, "<opt ind 17>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qualifiedIdent (',' qualifiedIdent)*
  public static boolean optInd18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd18")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_18, "<opt ind 18>");
    r = qualifiedIdent(b, l + 1);
    r = r && optInd18_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' qualifiedIdent)*
  private static boolean optInd18_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd18_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd18_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd18_1", c)) break;
    }
    return true;
  }

  // ',' qualifiedIdent
  private static boolean optInd18_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd18_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && qualifiedIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr optInd
  static boolean optInd2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && optInd(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (complexOrSimpleStmt (';' complexOrSimpleStmt)*)
  //             | (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)
  //             | pragmaStmt
  //             | (simpleExpr (('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?)
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?)))
  public static boolean optInd3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_3, "<opt ind 3>");
    r = optInd3_0(b, l + 1);
    if (!r) r = optInd3_1(b, l + 1);
    if (!r) r = pragmaStmt(b, l + 1);
    if (!r) r = optInd3_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean optInd3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexOrSimpleStmt(b, l + 1);
    r = r && optInd3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean optInd3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd3_0_1", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean optInd3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean optInd3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && optInd3_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean optInd3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd3_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd3_1_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean optInd3_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // simpleExpr (('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?)
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?))
  private static boolean optInd3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleExpr(b, l + 1);
    r = r && optInd3_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?)
  //                          | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?)
  private static boolean optInd3_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd3_3_1_0(b, l + 1);
    if (!r) r = optInd3_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?
  private static boolean optInd3_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && optInd3_3_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)?
  private static boolean optInd3_3_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_0_2")) return false;
    optInd3_3_1_0_2_0(b, l + 1);
    return true;
  }

  // ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
  private static boolean optInd3_3_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    r = r && optInd3_3_1_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' complexOrSimpleStmt)*
  private static boolean optInd3_3_1_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_0_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd3_3_1_0_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd3_3_1_0_2_0_2", c)) break;
    }
    return true;
  }

  // ';' complexOrSimpleStmt
  private static boolean optInd3_3_1_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && complexOrSimpleStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)?
  private static boolean optInd3_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && expr(b, l + 1);
    r = r && optInd3_3_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' exprColonEqExpr (',' exprColonEqExpr)*)?
  private static boolean optInd3_3_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_1_2")) return false;
    optInd3_3_1_1_2_0(b, l + 1);
    return true;
  }

  // ',' exprColonEqExpr (',' exprColonEqExpr)*
  private static boolean optInd3_3_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    r = r && optInd3_3_1_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' exprColonEqExpr)*
  private static boolean optInd3_3_1_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_1_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optInd3_3_1_1_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd3_3_1_1_2_0_2", c)) break;
    }
    return true;
  }

  // ',' exprColonEqExpr
  private static boolean optInd3_3_1_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd3_3_1_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprColonEqExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean optInd4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_4, "<opt ind 4>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (exprColonEqExpr ','?)*
  public static boolean optInd5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd5")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_5, "<opt ind 5>");
    while (true) {
      int c = current_position_(b);
      if (!optInd5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd5", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // exprColonEqExpr ','?
  private static boolean optInd5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && optInd5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean optInd5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd5_0_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // ']'
  public static boolean optInd6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd6")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_6, "<opt ind 6>");
    r = consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol generalizedLit?
  public static boolean optInd7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd7")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_7, "<opt ind 7>");
    r = symbol(b, l + 1);
    r = r && optInd7_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generalizedLit?
  private static boolean optInd7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd7_1")) return false;
    generalizedLit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '}'
  public static boolean optInd8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd8")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_8, "<opt ind 8>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (exprColonEqExpr ','?)*
  public static boolean optInd9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd9")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_IND_9, "<opt ind 9>");
    while (true) {
      int c = current_position_(b);
      if (!optInd9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "optInd9", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // exprColonEqExpr ','?
  private static boolean optInd9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && optInd9_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean optInd9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optInd9_0_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // andExpr (OP3 <<optInd (andExpr)>>)*
  public static boolean orExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = andExpr(b, l + 1);
    r = r && orExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP3 <<optInd (andExpr)>>)*
  private static boolean orExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!orExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orExpr_1", c)) break;
    }
    return true;
  }

  // OP3 <<optInd (andExpr)>>
  private static boolean orExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP3);
    r = r && optInd(b, l + 1, orExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (andExpr)
  private static boolean orExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = andExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <<optInd (optInd3)>> <<optInd (optInd4)>>
  public static boolean par(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR, "<par>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, par_1_0_parser_);
    r = r && optInd(b, l + 1, par_2_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd3)
  private static boolean par_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd4)
  private static boolean par_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (declColonEquals ((','|';') declColonEquals)*)? ')'
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

  // (declColonEquals ((','|';') declColonEquals)*)?
  private static boolean paramList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1")) return false;
    paramList_1_0(b, l + 1);
    return true;
  }

  // declColonEquals ((','|';') declColonEquals)*
  private static boolean paramList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declColonEquals(b, l + 1);
    r = r && paramList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((','|';') declColonEquals)*
  private static boolean paramList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paramList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paramList_1_0_1", c)) break;
    }
    return true;
  }

  // (','|';') declColonEquals
  private static boolean paramList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paramList_1_0_1_0_0(b, l + 1);
    r = r && declColonEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','|';'
  private static boolean paramList_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramList_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ",");
    if (!r) r = consumeToken(b, ";");
    return r;
  }

  /* ********************************************************** */
  // paramList? ('->' <<optInd (typeDesc)>>)?
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

  // ('->' <<optInd (typeDesc)>>)?
  private static boolean paramListArrow_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_1")) return false;
    paramListArrow_1_0(b, l + 1);
    return true;
  }

  // '->' <<optInd (typeDesc)>>
  private static boolean paramListArrow_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && optInd(b, l + 1, paramListArrow_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc)
  private static boolean paramListArrow_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListArrow_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // paramList? (':' <<optInd (typeDesc)>>)?
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

  // (':' <<optInd (typeDesc)>>)?
  private static boolean paramListColon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_1")) return false;
    paramListColon_1_0(b, l + 1);
    return true;
  }

  // ':' <<optInd (typeDesc)>>
  private static boolean paramListColon_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && optInd(b, l + 1, paramListColon_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc)
  private static boolean paramListColon_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paramListColon_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
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
  // mulExpr (OP8 <<optInd (mulExpr)>>)*
  public static boolean plusExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_EXPR, "<plus expr>");
    r = mulExpr(b, l + 1);
    r = r && plusExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP8 <<optInd (mulExpr)>>)*
  private static boolean plusExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!plusExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plusExpr_1", c)) break;
    }
    return true;
  }

  // OP8 <<optInd (mulExpr)>>
  private static boolean plusExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP8);
    r = r && optInd(b, l + 1, plusExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (mulExpr)
  private static boolean plusExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mulExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' stmt? ( (IND_EQ doBlock)
  //                              | (IND_EQ 'of' exprList ':' stmt)
  //                              | (IND_EQ 'elif' expr ':' stmt)
  //                              | (IND_EQ 'except' exprList ':' stmt)
  //                              | (IND_EQ 'else' ':' stmt) )*
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

  // ( (IND_EQ doBlock)
  //                              | (IND_EQ 'of' exprList ':' stmt)
  //                              | (IND_EQ 'elif' expr ':' stmt)
  //                              | (IND_EQ 'except' exprList ':' stmt)
  //                              | (IND_EQ 'else' ':' stmt) )*
  private static boolean postExprBlocks_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postExprBlocks_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postExprBlocks_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postExprBlocks_2", c)) break;
    }
    return true;
  }

  // (IND_EQ doBlock)
  //                              | (IND_EQ 'of' exprList ':' stmt)
  //                              | (IND_EQ 'elif' expr ':' stmt)
  //                              | (IND_EQ 'except' exprList ':' stmt)
  //                              | (IND_EQ 'else' ':' stmt)
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
  // '{.' <<optInd (optInd9)>> <<optInd (optInd10)>>
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

  // (optInd9)
  private static boolean pragma_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd10)
  private static boolean pragma_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd10(b, l + 1);
    exit_section_(b, m, null, r);
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
  // (typeKeyw <<optInd (typeDesc)>>) | (operator* identOrLiteral primarySuffix*) | ('bind' primary)
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

  // typeKeyw <<optInd (typeDesc)>>
  private static boolean primary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeKeyw(b, l + 1);
    r = r && optInd(b, l + 1, primary_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeDesc)
  private static boolean primary_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDesc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // operator* identOrLiteral primarySuffix*
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

  // operator*
  private static boolean primary_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator(b, l + 1)) break;
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
  // ('(' (exprColonEqExpr ','?)* ')')
  //         | ('.' <<optInd (optInd7)>>)
  //         | ('[' <<optInd (exprColonEqExprList2)>> <<optInd (optInd6)>>)
  //         | ('{' <<optInd (exprColonEqExprList2)>> <<optInd (optInd8)>>)
  //         | expr
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

  // '(' (exprColonEqExpr ','?)* ')'
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

  // (exprColonEqExpr ','?)*
  private static boolean primarySuffix_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primarySuffix_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primarySuffix_0_1", c)) break;
    }
    return true;
  }

  // exprColonEqExpr ','?
  private static boolean primarySuffix_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && primarySuffix_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean primarySuffix_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_0_1_0_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '.' <<optInd (optInd7)>>
  private static boolean primarySuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, primarySuffix_1_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd7)
  private static boolean primarySuffix_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' <<optInd (exprColonEqExprList2)>> <<optInd (optInd6)>>
  private static boolean primarySuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && optInd(b, l + 1, primarySuffix_2_1_0_parser_);
    r = r && optInd(b, l + 1, primarySuffix_2_2_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExprList2)
  private static boolean primarySuffix_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExprList2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd6)
  private static boolean primarySuffix_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<optInd (exprColonEqExprList2)>> <<optInd (optInd8)>>
  private static boolean primarySuffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && optInd(b, l + 1, primarySuffix_3_1_0_parser_);
    r = r && optInd(b, l + 1, primarySuffix_3_2_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExprList2)
  private static boolean primarySuffix_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExprList2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd8)
  private static boolean primarySuffix_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primarySuffix_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol ('.' <<optInd (symbol)>>)?
  public static boolean qualifiedIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_IDENT, "<qualified ident>");
    r = symbol(b, l + 1);
    r = r && qualifiedIdent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' <<optInd (symbol)>>)?
  private static boolean qualifiedIdent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1")) return false;
    qualifiedIdent_1_0(b, l + 1);
    return true;
  }

  // '.' <<optInd (symbol)>>
  private static boolean qualifiedIdent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && optInd(b, l + 1, qualifiedIdent_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (symbol)
  private static boolean qualifiedIdent_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedIdent_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'raise' <<optInd (expr)>>?
  public static boolean raiseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, "<raise stmt>");
    r = consumeToken(b, "raise");
    r = r && raiseStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean raiseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt_1")) return false;
    optInd(b, l + 1, raiseStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean raiseStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' <<optInd (expr)>>?
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = consumeToken(b, "return");
    r = r && returnStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean returnStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt_1")) return false;
    optInd(b, l + 1, returnStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean returnStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<optInd (optInd15)>>
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = optInd(b, l + 1, routine_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd15)
  private static boolean routine_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<RULE>> | (IND_GT <<RULE>>? (IND_EQ <<RULE>>?)* IND_LT)
  static boolean section(PsiBuilder b, int l, Parser _RULE) {
    if (!recursion_guard_(b, l, "section")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _RULE.parse(b, l);
    if (!r) r = section_1(b, l + 1, _RULE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IND_GT <<RULE>>? (IND_EQ <<RULE>>?)* IND_LT
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
  // '{' ((exprColonEqExpr ',')+ | ':') '}'
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

  // (exprColonEqExpr ',')+ | ':'
  private static boolean setOrTableConstr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setOrTableConstr_1_0(b, l + 1);
    if (!r) r = consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // (exprColonEqExpr ',')+
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

  // exprColonEqExpr ','
  private static boolean setOrTableConstr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setOrTableConstr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprColonEqExpr(b, l + 1);
    r = r && consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arrowExpr (OP0 <<optInd (arrowExpr)>>)* pragma?
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

  // (OP0 <<optInd (arrowExpr)>>)*
  private static boolean simpleExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleExpr_1", c)) break;
    }
    return true;
  }

  // OP0 <<optInd (arrowExpr)>>
  private static boolean simpleExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP0);
    r = r && optInd(b, l + 1, simpleExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (arrowExpr)
  private static boolean simpleExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrowExpr(b, l + 1);
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
  // returnStmt
  //              | raiseStmt
  //              | yieldStmt
  //              | discardStmt
  //              | breakStmt
  //              | continueStmt
  //              | pragmaStmt
  //              | importStmt
  //              | exportStmt
  //              | fromStmt
  //              | includeStmt
  //              | exprStmt
  public static boolean simpleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
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
    if (!r) r = exprStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ampExpr (OP6 <<optInd (ampExpr)>>)*
  public static boolean sliceExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_EXPR, "<slice expr>");
    r = ampExpr(b, l + 1);
    r = r && sliceExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP6 <<optInd (ampExpr)>>)*
  private static boolean sliceExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sliceExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sliceExpr_1", c)) break;
    }
    return true;
  }

  // OP6 <<optInd (ampExpr)>>
  private static boolean sliceExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP6);
    r = r && optInd(b, l + 1, sliceExpr_1_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ampExpr)
  private static boolean sliceExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ampExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'static' ':' stmt
  public static boolean staticStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATIC_STMT, "<static stmt>");
    r = consumeToken(b, "static");
    r = r && consumeToken(b, ":");
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
  // 'try' ':' stmt (<<optInd (optInd12)>> )* (<<optInd (optInd13)>>)?
  public static boolean tryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPR, "<try expr>");
    r = consumeToken(b, "try");
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    r = r && tryExpr_3(b, l + 1);
    r = r && tryExpr_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (<<optInd (optInd12)>> )*
  private static boolean tryExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpr_3", c)) break;
    }
    return true;
  }

  // <<optInd (optInd12)>>
  private static boolean tryExpr_3_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr_3_0_0_0_parser_);
  }

  // (optInd12)
  private static boolean tryExpr_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd12(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<optInd (optInd13)>>)?
  private static boolean tryExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4")) return false;
    tryExpr_4_0(b, l + 1);
    return true;
  }

  // <<optInd (optInd13)>>
  private static boolean tryExpr_4_0(PsiBuilder b, int l) {
    return optInd(b, l + 1, tryExpr_4_0_0_0_parser_);
  }

  // (optInd13)
  private static boolean tryExpr_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpr_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd13(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' ':' stmt (IND_EQ? 'except' exprList ':' stmt)* (IND_EQ? 'finally' ':' stmt)?
  public static boolean tryStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, "<try stmt>");
    r = consumeToken(b, "try");
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    r = r && tryStmt_3(b, l + 1);
    r = r && tryStmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IND_EQ? 'except' exprList ':' stmt)*
  private static boolean tryStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryStmt_3", c)) break;
    }
    return true;
  }

  // IND_EQ? 'except' exprList ':' stmt
  private static boolean tryStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_3_0_0(b, l + 1);
    r = r && consumeToken(b, "except");
    r = r && exprList(b, l + 1);
    r = r && consumeToken(b, ":");
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

  // (IND_EQ? 'finally' ':' stmt)?
  private static boolean tryStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4")) return false;
    tryStmt_4_0(b, l + 1);
    return true;
  }

  // IND_EQ? 'finally' ':' stmt
  private static boolean tryStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStmt_4_0_0(b, l + 1);
    r = r && consumeToken(b, "finally");
    r = r && consumeToken(b, ":");
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
  // identWithPragmaDot genericParamList? '=' <<optInd (typeDefAux)>>
  //             identVisDot genericParamList? pragma '=' <<optInd (typeDefAux)>>
  public static boolean typeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = identWithPragmaDot(b, l + 1);
    r = r && typeDef_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDef_3_0_parser_);
    r = r && identVisDot(b, l + 1);
    r = r && typeDef_5(b, l + 1);
    r = r && pragma(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, typeDef_8_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // genericParamList?
  private static boolean typeDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_1")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  // (typeDefAux)
  private static boolean typeDef_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDefAux(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // genericParamList?
  private static boolean typeDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_5")) return false;
    genericParamList(b, l + 1);
    return true;
  }

  // (typeDefAux)
  private static boolean typeDef_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDef_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDefAux(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleExpr ('not' expr)? | 'concept' typeClass
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
  // '(' <<optInd (optInd16)>> <<optInd (optInd17)>> '=' <<optInd (expr)>>
  public static boolean varTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_TUPLE, "<var tuple>");
    r = consumeToken(b, "(");
    r = r && optInd(b, l + 1, varTuple_1_0_parser_);
    r = r && optInd(b, l + 1, varTuple_2_0_parser_);
    r = r && consumeToken(b, "=");
    r = r && optInd(b, l + 1, varTuple_4_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (optInd16)
  private static boolean varTuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd16(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (optInd17)
  private static boolean varTuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optInd17(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr)
  private static boolean varTuple_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varTuple_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
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
  // 'while' expr ':' stmt
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "while");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'yield' <<optInd (expr)>>?
  public static boolean yieldStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, "<yield stmt>");
    r = consumeToken(b, "yield");
    r = r && yieldStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<optInd (expr)>>?
  private static boolean yieldStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt_1")) return false;
    optInd(b, l + 1, yieldStmt_1_0_0_parser_);
    return true;
  }

  // (expr)
  private static boolean yieldStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yieldStmt_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  static final Parser ampExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ampExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser andExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return andExpr_1_0_1_0(b, l + 1);
    }
  };
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
  static final Parser arrowExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return arrowExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser assignExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return assignExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser bindStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return bindStmt_1_0(b, l + 1);
    }
  };
  static final Parser breakStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return breakStmt_1_0_0(b, l + 1);
    }
  };
  static final Parser castExpr_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return castExpr_2_0(b, l + 1);
    }
  };
  static final Parser castExpr_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return castExpr_3_0(b, l + 1);
    }
  };
  static final Parser castExpr_5_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return castExpr_5_0(b, l + 1);
    }
  };
  static final Parser cmpExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return cmpExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser condExpr_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return condExpr_2_0(b, l + 1);
    }
  };
  static final Parser condExpr_3_0_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return condExpr_3_0_3_0(b, l + 1);
    }
  };
  static final Parser constant_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return constant_3_0(b, l + 1);
    }
  };
  static final Parser constant_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return constant(b, l + 1);
    }
  };
  static final Parser continueStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return continueStmt_1_0_0(b, l + 1);
    }
  };
  static final Parser declColonEquals_3_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return declColonEquals_3_0_1_0(b, l + 1);
    }
  };
  static final Parser declColonEquals_4_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return declColonEquals_4_0_1_0(b, l + 1);
    }
  };
  static final Parser discardStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return discardStmt_1_0_0(b, l + 1);
    }
  };
  static final Parser dollarExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return dollarExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser exportStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt_1_0(b, l + 1);
    }
  };
  static final Parser exportStmt_2_1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exportStmt_2_1_1_0(b, l + 1);
    }
  };
  static final Parser exprStmt_1_0_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return exprStmt_1_0_0_1_0(b, l + 1);
    }
  };
  static final Parser fromStmt_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return fromStmt_3_0(b, l + 1);
    }
  };
  static final Parser genericParamList_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParamList_1_0(b, l + 1);
    }
  };
  static final Parser genericParamList_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParamList_2_0(b, l + 1);
    }
  };
  static final Parser genericParam_3_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return genericParam_3_0_1_0(b, l + 1);
    }
  };
  static final Parser identColonEquals_3_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return identColonEquals_3_0_1_0(b, l + 1);
    }
  };
  static final Parser identColonEquals_4_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return identColonEquals_4_0_1_0(b, l + 1);
    }
  };
  static final Parser identVisDot_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return identVisDot_2_0(b, l + 1);
    }
  };
  static final Parser importStmt_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt_1_0(b, l + 1);
    }
  };
  static final Parser importStmt_2_1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return importStmt_2_1_1_0(b, l + 1);
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
  static final Parser mulExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return mulExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser orExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return orExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser par_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return par_1_0(b, l + 1);
    }
  };
  static final Parser par_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return par_2_0(b, l + 1);
    }
  };
  static final Parser paramListArrow_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return paramListArrow_1_0_1_0(b, l + 1);
    }
  };
  static final Parser paramListColon_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return paramListColon_1_0_1_0(b, l + 1);
    }
  };
  static final Parser plusExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return plusExpr_1_0_1_0(b, l + 1);
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
  static final Parser primarySuffix_1_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_1_1_0(b, l + 1);
    }
  };
  static final Parser primarySuffix_2_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_2_1_0(b, l + 1);
    }
  };
  static final Parser primarySuffix_2_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_2_2_0(b, l + 1);
    }
  };
  static final Parser primarySuffix_3_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_3_1_0(b, l + 1);
    }
  };
  static final Parser primarySuffix_3_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primarySuffix_3_2_0(b, l + 1);
    }
  };
  static final Parser primary_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return primary_0_1_0(b, l + 1);
    }
  };
  static final Parser qualifiedIdent_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return qualifiedIdent_1_0_1_0(b, l + 1);
    }
  };
  static final Parser raiseStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return raiseStmt_1_0_0(b, l + 1);
    }
  };
  static final Parser returnStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return returnStmt_1_0_0(b, l + 1);
    }
  };
  static final Parser routine_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return routine_0_0(b, l + 1);
    }
  };
  static final Parser simpleExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return simpleExpr_1_0_1_0(b, l + 1);
    }
  };
  static final Parser sliceExpr_1_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return sliceExpr_1_0_1_0(b, l + 1);
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
  static final Parser typeDef_3_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDef_3_0(b, l + 1);
    }
  };
  static final Parser typeDef_8_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDef_8_0(b, l + 1);
    }
  };
  static final Parser typeDef_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return typeDef(b, l + 1);
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
  static final Parser varTuple_4_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return varTuple_4_0(b, l + 1);
    }
  };
  static final Parser variable_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return variable(b, l + 1);
    }
  };
  static final Parser yieldStmt_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return yieldStmt_1_0_0(b, l + 1);
    }
  };
}
