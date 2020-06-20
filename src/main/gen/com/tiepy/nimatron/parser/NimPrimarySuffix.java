// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimarySuffix extends PsiElement {

  @NotNull
  List<NimExprColonEqExpr> getExprColonEqExprList();

  @Nullable
  NimExprColonEqExprList2 getExprColonEqExprList2();

  @Nullable
  NimExprList getExprList();

  @Nullable
  NimGeneralizedLit getGeneralizedLit();

  @Nullable
  NimSymbol getSymbol();

}
