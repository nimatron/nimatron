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

public class NimPrimarySuffix1Impl extends NimElementImpl implements NimPrimarySuffix1 {

  public NimPrimarySuffix1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimarySuffix1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimComma> getCommaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimComma.class);
  }

  @Override
  @NotNull
  public List<NimExprColonEqExpr> getExprColonEqExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExprColonEqExpr.class);
  }

}
