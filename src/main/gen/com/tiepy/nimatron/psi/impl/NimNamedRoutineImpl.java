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

public class NimNamedRoutineImpl extends NimNamedElementImpl implements NimNamedRoutine {

  public NimNamedRoutineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitNamedRoutine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimRoutine getRoutine() {
    return findNotNullChildByClass(NimRoutine.class);
  }

  @Override
  @NotNull
  public NimSymbol getNameIdentifier() {
    return findNotNullChildByClass(NimSymbol.class);
  }

}
