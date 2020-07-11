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

public class NimPar4Impl extends ASTWrapperPsiElement implements NimPar4 {

  public NimPar4Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPar4(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimPar5 getPar5() {
    return findChildByClass(NimPar5.class);
  }

  @Override
  @Nullable
  public NimPar6 getPar6() {
    return findChildByClass(NimPar6.class);
  }

  @Override
  @NotNull
  public NimSimpleExpr getSimpleExpr() {
    return findNotNullChildByClass(NimSimpleExpr.class);
  }

}
