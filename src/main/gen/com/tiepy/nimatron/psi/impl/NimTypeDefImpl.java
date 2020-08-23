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

public class NimTypeDefImpl extends NimElementImpl implements NimTypeDef {

  public NimTypeDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTypeDef(this);
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
  @Nullable
  public NimIdentVisDot getIdentVisDot() {
    return findChildByClass(NimIdentVisDot.class);
  }

  @Override
  @Nullable
  public NimIdentWithPragmaDot getIdentWithPragmaDot() {
    return findChildByClass(NimIdentWithPragmaDot.class);
  }

  @Override
  @NotNull
  public NimIndAndComment getIndAndComment() {
    return findNotNullChildByClass(NimIndAndComment.class);
  }

  @Override
  @NotNull
  public NimOptInd getOptInd() {
    return findNotNullChildByClass(NimOptInd.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

}
