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

public class NimBlockStmtImpl extends NimElementImpl implements NimBlockStmt {

  public NimBlockStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitBlockStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimColcom getColcom() {
    return findChildByClass(NimColcom.class);
  }

  @Override
  @Nullable
  public NimInlineStmt getInlineStmt() {
    return findChildByClass(NimInlineStmt.class);
  }

  @Override
  @Nullable
  public NimSymbol getSymbol() {
    return findChildByClass(NimSymbol.class);
  }

}
