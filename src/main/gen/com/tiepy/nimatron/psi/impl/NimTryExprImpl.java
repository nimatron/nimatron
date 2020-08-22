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

public class NimTryExprImpl extends NimElementImpl implements NimTryExpr {

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
  public NimInlineStmt getInlineStmt() {
    return findNotNullChildByClass(NimInlineStmt.class);
  }

  @Override
  @NotNull
  public List<NimOptInd> getOptIndList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptInd.class);
  }

}
