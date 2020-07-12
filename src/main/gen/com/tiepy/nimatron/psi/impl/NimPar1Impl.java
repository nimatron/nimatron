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

public class NimPar1Impl extends NimElementImpl implements NimPar1 {

  public NimPar1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPar1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimPar2 getPar2() {
    return findChildByClass(NimPar2.class);
  }

  @Override
  @Nullable
  public NimPar3 getPar3() {
    return findChildByClass(NimPar3.class);
  }

  @Override
  @Nullable
  public NimPar4 getPar4() {
    return findChildByClass(NimPar4.class);
  }

  @Override
  @Nullable
  public NimPragmaStmt getPragmaStmt() {
    return findChildByClass(NimPragmaStmt.class);
  }

}
