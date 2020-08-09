// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tiepy.nimatron.psi.NimElementTypes.*;
import com.tiepy.nimatron.psi.*;

public class NimCaseStmtImpl extends NimElementImpl implements NimCaseStmt {

  public NimCaseStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitCaseStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimExpr getExpr() {
    return findNotNullChildByClass(NimExpr.class);
  }

  @Override
  @NotNull
  public NimOfBranches getOfBranches() {
    return findNotNullChildByClass(NimOfBranches.class);
  }

}
