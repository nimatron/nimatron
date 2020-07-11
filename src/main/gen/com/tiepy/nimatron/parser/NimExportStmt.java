// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimExportStmt extends PsiElement {

  @Nullable
  NimExportStmt1 getExportStmt1();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  NimOptInd getOptInd();

}
