// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimImportStmt extends NimElement {

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimImportStmt1 getImportStmt1();

  @Nullable
  NimOptInd getOptInd();

}
