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

public class NimPrimarySuffixImpl extends NimElementImpl implements NimPrimarySuffix {

  public NimPrimarySuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimarySuffix(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimPrimarySuffix1 getPrimarySuffix1() {
    return findChildByClass(NimPrimarySuffix1.class);
  }

  @Override
  @Nullable
  public NimPrimarySuffix2 getPrimarySuffix2() {
    return findChildByClass(NimPrimarySuffix2.class);
  }

  @Override
  @Nullable
  public NimPrimarySuffix3 getPrimarySuffix3() {
    return findChildByClass(NimPrimarySuffix3.class);
  }

  @Override
  @Nullable
  public NimPrimarySuffix4 getPrimarySuffix4() {
    return findChildByClass(NimPrimarySuffix4.class);
  }

  @Override
  @Nullable
  public NimPrimarySuffix5 getPrimarySuffix5() {
    return findChildByClass(NimPrimarySuffix5.class);
  }

}
