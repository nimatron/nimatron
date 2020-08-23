// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPostExprBlocks extends NimElement {

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprs> getExprsList();

  @NotNull
  List<NimIndEq> getIndEqList();

  @NotNull
  List<NimInlineStmt> getInlineStmtList();

}
