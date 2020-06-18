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

public class NimInlTupleDeclImpl extends ASTWrapperPsiElement implements NimInlTupleDecl {

  public NimInlTupleDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitInlTupleDecl(this);
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
  public List<NimIdentColonEquals> getIdentColonEqualsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdentColonEquals.class);
  }

  @Override
  @NotNull
  public NimOptInd getOptInd() {
    return findNotNullChildByClass(NimOptInd.class);
  }

  @Override
  @NotNull
  public NimOptPar getOptPar() {
    return findNotNullChildByClass(NimOptPar.class);
  }

  @Override
  @NotNull
  public List<NimSemicolon> getSemicolonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimSemicolon.class);
  }

}