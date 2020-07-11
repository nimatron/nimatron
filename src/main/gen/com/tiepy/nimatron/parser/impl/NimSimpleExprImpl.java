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

public class NimSimpleExprImpl extends ASTWrapperPsiElement implements NimSimpleExpr {

  public NimSimpleExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitSimpleExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimIdentOrLiteral> getIdentOrLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdentOrLiteral.class);
  }

  @Override
  @NotNull
  public List<NimOp> getOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOp.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

  @Override
  @NotNull
  public List<NimPrimarySuffix> getPrimarySuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPrimarySuffix.class);
  }

  @Override
  @NotNull
  public List<NimTypeDesc> getTypeDescList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTypeDesc.class);
  }

  @Override
  @NotNull
  public List<NimTypeKeyw> getTypeKeywList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTypeKeyw.class);
  }

}
