// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimExprStmt extends PsiElement {

  @Nullable
  NimColonBody getColonBody();

  @NotNull
  List<NimComma> getCommaList();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimOptInd getOptInd();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

  @NotNull
  NimSimpleExpr getSimpleExpr();

}
