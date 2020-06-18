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

public class NimObjectBranchImpl extends ASTWrapperPsiElement implements NimObjectBranch {

  public NimObjectBranchImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitObjectBranch(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimColcom getColcom() {
    return findNotNullChildByClass(NimColcom.class);
  }

  @Override
  @NotNull
  public NimExprList getExprList() {
    return findNotNullChildByClass(NimExprList.class);
  }

  @Override
  @NotNull
  public NimObjectPart getObjectPart() {
    return findNotNullChildByClass(NimObjectPart.class);
  }

}
