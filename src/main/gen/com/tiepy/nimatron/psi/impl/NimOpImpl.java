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

public class NimOpImpl extends NimElementImpl implements NimOp {

  public NimOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimOp0 getOp0() {
    return findChildByClass(NimOp0.class);
  }

  @Override
  @Nullable
  public NimOp1 getOp1() {
    return findChildByClass(NimOp1.class);
  }

  @Override
  @Nullable
  public NimOp10 getOp10() {
    return findChildByClass(NimOp10.class);
  }

  @Override
  @Nullable
  public NimOp2 getOp2() {
    return findChildByClass(NimOp2.class);
  }

  @Override
  @Nullable
  public NimOp3 getOp3() {
    return findChildByClass(NimOp3.class);
  }

  @Override
  @Nullable
  public NimOp4 getOp4() {
    return findChildByClass(NimOp4.class);
  }

  @Override
  @Nullable
  public NimOp5 getOp5() {
    return findChildByClass(NimOp5.class);
  }

  @Override
  @Nullable
  public NimOp6 getOp6() {
    return findChildByClass(NimOp6.class);
  }

  @Override
  @Nullable
  public NimOp7 getOp7() {
    return findChildByClass(NimOp7.class);
  }

  @Override
  @Nullable
  public NimOp8 getOp8() {
    return findChildByClass(NimOp8.class);
  }

  @Override
  @Nullable
  public NimOp9 getOp9() {
    return findChildByClass(NimOp9.class);
  }

}
