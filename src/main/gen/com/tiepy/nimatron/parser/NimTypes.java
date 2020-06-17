// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.NimElementType;
import com.tiepy.nimatron.psi.NimTokenType;
import com.tiepy.nimatron.parser.impl.*;

public interface NimTypes {

  IElementType TOKEN = new NimElementType("TOKEN");

  IElementType BRACKET = new NimTokenType("BRACKET");
  IElementType COMMA = new NimTokenType("COMMA");
  IElementType COMMENT = new NimTokenType("COMMENT");
  IElementType FRAGMENT = new NimTokenType("FRAGMENT");
  IElementType GRAVE_ACCENT = new NimTokenType("GRAVE_ACCENT");
  IElementType IDENT = new NimTokenType("IDENT");
  IElementType IND_EQ = new NimTokenType("IND_EQ");
  IElementType IND_GT = new NimTokenType("IND_GT");
  IElementType IND_LT = new NimTokenType("IND_LT");
  IElementType KEYWORD = new NimTokenType("KEYWORD");
  IElementType NUMERICAL_CONSTANT = new NimTokenType("NUMERICAL_CONSTANT");
  IElementType OPERATOR = new NimTokenType("OPERATOR");
  IElementType PARENTHESIS = new NimTokenType("PARENTHESIS");
  IElementType PROCS = new NimTokenType("PROCS");
  IElementType SEMICOLON = new NimTokenType("SEMICOLON");
  IElementType STRING_LITERAL = new NimTokenType("STRING_LITERAL");
  IElementType TYPES = new NimTokenType("TYPES");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == TOKEN) {
        return new NimTokenImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
