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

public class NimObjectPartImpl extends NimElementImpl implements NimObjectPart {

  public NimObjectPartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitObjectPart(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimDeclColonEquals getDeclColonEquals() {
    return findChildByClass(NimDeclColonEquals.class);
  }

  @Override
  @Nullable
  public NimObjectCase getObjectCase() {
    return findChildByClass(NimObjectCase.class);
  }

  @Override
  @NotNull
  public List<NimObjectPart> getObjectPartList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimObjectPart.class);
  }

  @Override
  @Nullable
  public NimObjectWhen getObjectWhen() {
    return findChildByClass(NimObjectWhen.class);
  }

}
