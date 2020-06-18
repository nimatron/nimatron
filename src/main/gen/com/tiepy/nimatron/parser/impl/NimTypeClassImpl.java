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

public class NimTypeClassImpl extends ASTWrapperPsiElement implements NimTypeClass {

  public NimTypeClassImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTypeClass(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

  @Override
  @NotNull
  public NimStmt getStmt() {
    return findNotNullChildByClass(NimStmt.class);
  }

  @Override
  @NotNull
  public List<NimTypeClassParam> getTypeClassParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTypeClassParam.class);
  }

  @Override
  @NotNull
  public List<NimTypeDesc> getTypeDescList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTypeDesc.class);
  }

}
