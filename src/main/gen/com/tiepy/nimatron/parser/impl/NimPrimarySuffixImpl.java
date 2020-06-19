// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tiepy.nimatron.parser.NimTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tiepy.nimatron.parser.*;

public class NimPrimarySuffixImpl extends ASTWrapperPsiElement implements NimPrimarySuffix {

  public NimPrimarySuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimarySuffix(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
  }

  @Override
  @NotNull
  public List<NimExprColonEqExpr> getExprColonEqExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExprColonEqExpr.class);
  }

  @Override
  @Nullable
  public NimExprColonEqExprList2 getExprColonEqExprList2() {
    return findChildByClass(NimExprColonEqExprList2.class);
  }

  @Override
  @Nullable
  public NimOptInd6 getOptInd6() {
    return findChildByClass(NimOptInd6.class);
  }

  @Override
  @Nullable
  public NimOptInd7 getOptInd7() {
    return findChildByClass(NimOptInd7.class);
  }

  @Override
  @Nullable
  public NimOptInd8 getOptInd8() {
    return findChildByClass(NimOptInd8.class);
  }

}
