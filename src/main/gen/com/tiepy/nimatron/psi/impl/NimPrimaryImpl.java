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

public class NimPrimaryImpl extends NimElementImpl implements NimPrimary {

  public NimPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimDistinctType getDistinctType() {
    return findChildByClass(NimDistinctType.class);
  }

  @Override
  @Nullable
  public NimEnumType getEnumType() {
    return findChildByClass(NimEnumType.class);
  }

  @Override
  @Nullable
  public NimIdentOrLiteral getIdentOrLiteral() {
    return findChildByClass(NimIdentOrLiteral.class);
  }

  @Override
  @Nullable
  public NimIteratorType getIteratorType() {
    return findChildByClass(NimIteratorType.class);
  }

  @Override
  @Nullable
  public NimObjectType getObjectType() {
    return findChildByClass(NimObjectType.class);
  }

  @Override
  @Nullable
  public NimOperator getOperator() {
    return findChildByClass(NimOperator.class);
  }

  @Override
  @Nullable
  public NimOutType getOutType() {
    return findChildByClass(NimOutType.class);
  }

  @Override
  @Nullable
  public NimPrimary getPrimary() {
    return findChildByClass(NimPrimary.class);
  }

  @Override
  @NotNull
  public List<NimPrimarySuffix> getPrimarySuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPrimarySuffix.class);
  }

  @Override
  @Nullable
  public NimProcType getProcType() {
    return findChildByClass(NimProcType.class);
  }

  @Override
  @Nullable
  public NimPtrType getPtrType() {
    return findChildByClass(NimPtrType.class);
  }

  @Override
  @Nullable
  public NimRefType getRefType() {
    return findChildByClass(NimRefType.class);
  }

  @Override
  @Nullable
  public NimSharedType getSharedType() {
    return findChildByClass(NimSharedType.class);
  }

  @Override
  @Nullable
  public NimTupleType getTupleType() {
    return findChildByClass(NimTupleType.class);
  }

  @Override
  @Nullable
  public NimVarType getVarType() {
    return findChildByClass(NimVarType.class);
  }

}
