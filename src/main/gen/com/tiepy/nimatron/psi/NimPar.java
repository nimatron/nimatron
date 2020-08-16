// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar extends NimElement {

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimExprColonEqExpr> getExprColonEqExprList();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @Nullable
  NimSimpleExpr getSimpleExpr();

  @NotNull
  List<NimStmt> getStmtList();

}
