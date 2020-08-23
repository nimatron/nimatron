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

public class NimParamsImpl extends NimElementImpl implements NimParams {

  public NimParamsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitParams(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimComma> getCommaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimComma.class);
  }

  @Override
  @NotNull
  public List<NimDeclColonEquals> getDeclColonEqualsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDeclColonEquals.class);
  }

  @Override
  @NotNull
  public List<NimSemicolon> getSemicolonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimSemicolon.class);
  }

}
