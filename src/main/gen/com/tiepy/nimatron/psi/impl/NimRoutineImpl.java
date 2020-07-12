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

public class NimRoutineImpl extends NimElementImpl implements NimRoutine {

  public NimRoutineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitRoutine(this);
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
  public NimOptInd getOptInd() {
    return findChildByClass(NimOptInd.class);
  }

  @Override
  @NotNull
  public NimParamsColon getParamsColon() {
    return findNotNullChildByClass(NimParamsColon.class);
  }

  @Override
  @Nullable
  public NimPattern getPattern() {
    return findChildByClass(NimPattern.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

}
