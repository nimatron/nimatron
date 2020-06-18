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
  // (stmt ((';' | IND_EQ) stmt)*)?
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    module_0(b, l + 1);
    return true;
  }

  // stmt ((';' | IND_EQ) stmt)*
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && module_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((';' | IND_EQ) stmt)*
  private static boolean module_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_0_1", c)) break;
    }
    return true;
  }

  // (';' | IND_EQ) stmt
  private static boolean module_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0_1_0_0(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | IND_EQ
  private static boolean module_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, IND_EQ);
    return r;
  }

  /* ********************************************************** */
  // IDENT '()'
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, "()");
    exit_section_(b, m, STMT, r);
    return r;
  }

}
