// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimFromStmt extends NimElement {

  @NotNull
  List<NimComma> getCommaList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  NimOptInd getOptInd();

}
