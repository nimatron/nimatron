// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tiepy.nimatron.psi.NimTypes.*;
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
  // token*
  static boolean nimFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nimFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!token(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nimFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD
  //         | COMMENT
  //         | STRING_LITERAL
  //         | NUMERICAL_CONSTANT
  //         | OPERATOR
  //         | BRACKET
  //         | PARENTHESIS
  //         | SEMICOLON
  //         | COMMA
  //         | GRAVE_ACCENT
  //         | TYPES
  //         | PROCS
  //         | IDENT
  public static boolean token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN, "<token>");
    r = consumeToken(b, KEYWORD);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMERICAL_CONSTANT);
    if (!r) r = consumeToken(b, OPERATOR);
    if (!r) r = consumeToken(b, BRACKET);
    if (!r) r = consumeToken(b, PARENTHESIS);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, GRAVE_ACCENT);
    if (!r) r = consumeToken(b, TYPES);
    if (!r) r = consumeToken(b, PROCS);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
