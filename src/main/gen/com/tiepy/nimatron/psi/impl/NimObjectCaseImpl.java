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

public class NimObjectCaseImpl extends NimElementImpl implements NimObjectCase {

  public NimObjectCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitObjectCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimIdentWithPragma getIdentWithPragma() {
    return findNotNullChildByClass(NimIdentWithPragma.class);
  }

  @Override
  @NotNull
  public NimObjectBranches getObjectBranches() {
    return findNotNullChildByClass(NimObjectBranches.class);
  }

  @Override
  @NotNull
  public NimTypeDesc getTypeDesc() {
    return findNotNullChildByClass(NimTypeDesc.class);
  }

}
