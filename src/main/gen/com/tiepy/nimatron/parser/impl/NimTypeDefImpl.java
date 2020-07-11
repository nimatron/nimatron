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

public class NimTypeDefImpl extends ASTWrapperPsiElement implements NimTypeDef {

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
  @NotNull
  public List<NimGenericParams> getGenericParamsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimGenericParams.class);
  }

  @Override
  @NotNull
  public NimIdentVisDot getIdentVisDot() {
    return findNotNullChildByClass(NimIdentVisDot.class);
  }

  @Override
  @NotNull
  public NimIdentWithPragmaDot getIdentWithPragmaDot() {
    return findNotNullChildByClass(NimIdentWithPragmaDot.class);
  }

  @Override
  @NotNull
  public List<NimOptInd> getOptIndList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptInd.class);
  }

  @Override
  @NotNull
  public NimPragma getPragma() {
    return findNotNullChildByClass(NimPragma.class);
  }

}
