// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimarySuffix extends PsiElement {

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimExprColonEqExpr> getExprColonEqExprList();

  @Nullable
  NimExprColonEqExprList2 getExprColonEqExprList2();

  @Nullable
  NimOptInd6 getOptInd6();

  @Nullable
  NimOptInd7 getOptInd7();

  @Nullable
  NimOptInd8 getOptInd8();

}
