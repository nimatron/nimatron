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

public class NimTypeDef1Impl extends NimElementImpl implements NimTypeDef1 {

  public NimTypeDef1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTypeDef1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimGenericParams getGenericParams() {
    return findChildByClass(NimGenericParams.class);
  }

  @Override
  @NotNull
  public NimIdentWithPragmaDot getIdentWithPragmaDot() {
    return findNotNullChildByClass(NimIdentWithPragmaDot.class);
  }

  @Override
  @NotNull
  public NimOptInd getOptInd() {
    return findNotNullChildByClass(NimOptInd.class);
  }

}
