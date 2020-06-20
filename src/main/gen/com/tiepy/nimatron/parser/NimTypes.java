// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.NimElementType;
import com.tiepy.nimatron.psi.NimTokenType;
import com.tiepy.nimatron.parser.impl.*;

public interface NimTypes {

  IElementType COMMAND = new NimElementType("COMMAND");
  IElementType EXPR = new NimElementType("EXPR");
  IElementType EXPR_LIST = new NimElementType("EXPR_LIST");
  IElementType IF_STMT = new NimElementType("IF_STMT");
  IElementType LITERAL = new NimElementType("LITERAL");
  IElementType OPT_IND = new NimElementType("OPT_IND");
  IElementType STMT = new NimElementType("STMT");

  IElementType BOOL_LIT = new NimTokenType("BOOL_LIT");
  IElementType BRACKET = new NimTokenType("BRACKET");
  IElementType CHAR_LIT = new NimTokenType("CHAR_LIT");
  IElementType COMMA = new NimTokenType("COMMA");
  IElementType FLOAT32_LIT = new NimTokenType("FLOAT32_LIT");
  IElementType FLOAT64_LIT = new NimTokenType("FLOAT64_LIT");
  IElementType FLOAT_LIT = new NimTokenType("FLOAT_LIT");
  IElementType GENERALIZED_STR_LIT = new NimTokenType("GENERALIZED_STR_LIT");
  IElementType GENERALIZED_TRIPLESTR_LIT = new NimTokenType("GENERALIZED_TRIPLESTR_LIT");
  IElementType GRAVE_ACCENT = new NimTokenType("GRAVE_ACCENT");
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
  IElementType RSTR_LIT = new NimTokenType("RSTR_LIT");
  IElementType SEMICOLON = new NimTokenType("SEMICOLON");
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
      if (type == COMMAND) {
        return new NimCommandImpl(node);
      }
      else if (type == EXPR) {
        return new NimExprImpl(node);
      }
      else if (type == EXPR_LIST) {
        return new NimExprListImpl(node);
      }
      else if (type == IF_STMT) {
        return new NimIfStmtImpl(node);
      }
      else if (type == LITERAL) {
        return new NimLiteralImpl(node);
      }
      else if (type == OPT_IND) {
        return new NimOptIndImpl(node);
      }
      else if (type == STMT) {
        return new NimStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
