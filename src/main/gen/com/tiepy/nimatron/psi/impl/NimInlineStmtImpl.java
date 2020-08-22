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

public class NimInlineStmtImpl extends NimElementImpl implements NimInlineStmt {

  public NimInlineStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitInlineStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimComplexOrSimpleStmt> getComplexOrSimpleStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimComplexOrSimpleStmt.class);
  }

  @Override
  @NotNull
  public List<NimSimpleStmt> getSimpleStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimSimpleStmt.class);
  }

}
