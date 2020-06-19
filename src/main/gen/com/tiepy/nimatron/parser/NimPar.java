// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar extends PsiElement {

  @NotNull
  List<NimComplexOrSimpleStmt> getComplexOrSimpleStmtList();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimExprColonEqExpr> getExprColonEqExprList();

  @NotNull
  List<NimOptInd> getOptIndList();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @Nullable
  NimSimpleExpr getSimpleExpr();

}
