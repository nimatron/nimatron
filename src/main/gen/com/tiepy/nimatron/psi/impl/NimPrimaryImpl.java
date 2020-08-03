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

public class NimPrimaryImpl extends NimElementImpl implements NimPrimary {

  public NimPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimIdentOrLiteral getIdentOrLiteral() {
    return findChildByClass(NimIdentOrLiteral.class);
  }

  @Override
  @Nullable
  public NimOperator getOperator() {
    return findChildByClass(NimOperator.class);
  }

  @Override
  @Nullable
  public NimOptInd getOptInd() {
    return findChildByClass(NimOptInd.class);
  }

  @Override
  @Nullable
  public NimPrimary getPrimary() {
    return findChildByClass(NimPrimary.class);
  }

  @Override
  @Nullable
  public NimPrimarySuffix getPrimarySuffix() {
    return findChildByClass(NimPrimarySuffix.class);
  }

}
