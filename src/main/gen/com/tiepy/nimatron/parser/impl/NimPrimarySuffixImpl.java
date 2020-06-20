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
  public NimExprList getExprList() {
    return findChildByClass(NimExprList.class);
  }

  @Override
  @Nullable
  public NimGeneralizedLit getGeneralizedLit() {
    return findChildByClass(NimGeneralizedLit.class);
  }

  @Override
  @Nullable
  public NimSymbol getSymbol() {
    return findChildByClass(NimSymbol.class);
  }

}
