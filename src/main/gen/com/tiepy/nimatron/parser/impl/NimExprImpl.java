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

public class NimExprImpl extends ASTWrapperPsiElement implements NimExpr {

  public NimExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimBlockStmt getBlockStmt() {
    return findChildByClass(NimBlockStmt.class);
  }

  @Override
  @Nullable
  public NimCaseStmt getCaseStmt() {
    return findChildByClass(NimCaseStmt.class);
  }

  @Override
  @Nullable
  public NimForStmt getForStmt() {
    return findChildByClass(NimForStmt.class);
  }

  @Override
  @Nullable
  public NimIfExpr getIfExpr() {
    return findChildByClass(NimIfExpr.class);
  }

  @Override
  @Nullable
  public NimSimpleExpr getSimpleExpr() {
    return findChildByClass(NimSimpleExpr.class);
  }

  @Override
  @Nullable
  public NimTryExpr getTryExpr() {
    return findChildByClass(NimTryExpr.class);
  }

  @Override
  @Nullable
  public NimWhenExpr getWhenExpr() {
    return findChildByClass(NimWhenExpr.class);
  }

}
