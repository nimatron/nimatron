// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimOfBranches extends NimElement {

  @NotNull
  List<NimColcom> getColcomList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimIndEq> getIndEqList();

  @NotNull
  List<NimInlineStmt> getInlineStmtList();

  @NotNull
  List<NimOfBranch> getOfBranchList();

}
