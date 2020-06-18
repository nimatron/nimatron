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

public class NimRoutineImpl extends ASTWrapperPsiElement implements NimRoutine {

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
  public NimGenericParamList getGenericParamList() {
    return findChildByClass(NimGenericParamList.class);
  }

  @Override
  @NotNull
  public NimIdentVis getIdentVis() {
    return findNotNullChildByClass(NimIdentVis.class);
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
  @NotNull
  public NimParamListColon getParamListColon() {
    return findNotNullChildByClass(NimParamListColon.class);
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

  @Override
  @Nullable
  public NimStmt getStmt() {
    return findChildByClass(NimStmt.class);
  }

}
