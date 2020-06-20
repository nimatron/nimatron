// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimStmt extends PsiElement {

  @NotNull
  List<NimConstant> getConstantList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimPrimary> getPrimaryList();

  @NotNull
  List<NimStmt> getStmtList();

  @NotNull
  List<NimVariable> getVariableList();

}
