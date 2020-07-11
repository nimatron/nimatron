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

public class NimPrimaryImpl extends ASTWrapperPsiElement implements NimPrimary {

  public NimPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimPrimary1 getPrimary1() {
    return findChildByClass(NimPrimary1.class);
  }

  @Override
  @Nullable
  public NimPrimary2 getPrimary2() {
    return findChildByClass(NimPrimary2.class);
  }

  @Override
  @Nullable
  public NimPrimary3 getPrimary3() {
    return findChildByClass(NimPrimary3.class);
  }

}
