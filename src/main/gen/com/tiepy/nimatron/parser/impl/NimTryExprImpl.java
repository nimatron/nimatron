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

public class NimTryExprImpl extends ASTWrapperPsiElement implements NimTryExpr {

  public NimTryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimOptInd12> getOptInd12List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptInd12.class);
  }

  @Override
  @Nullable
  public NimOptInd13 getOptInd13() {
    return findChildByClass(NimOptInd13.class);
  }

  @Override
  @NotNull
  public NimStmt getStmt() {
    return findNotNullChildByClass(NimStmt.class);
  }

}
