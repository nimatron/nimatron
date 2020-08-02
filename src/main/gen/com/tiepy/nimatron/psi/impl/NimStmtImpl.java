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

public class NimStmtImpl extends NimElementImpl implements NimStmt {

  public NimStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimAsmStmt getAsmStmt() {
    return findChildByClass(NimAsmStmt.class);
  }

  @Override
  @Nullable
  public NimBindStmt getBindStmt() {
    return findChildByClass(NimBindStmt.class);
  }

  @Override
  @Nullable
  public NimBlockStmt getBlockStmt() {
    return findChildByClass(NimBlockStmt.class);
  }

  @Override
  @Nullable
  public NimConstStmt getConstStmt() {
    return findChildByClass(NimConstStmt.class);
  }

  @Override
  @Nullable
  public NimConverterStmt getConverterStmt() {
    return findChildByClass(NimConverterStmt.class);
  }

  @Override
  @Nullable
  public NimDeferStmt getDeferStmt() {
    return findChildByClass(NimDeferStmt.class);
  }

  @Override
  @Nullable
  public NimForStmt getForStmt() {
    return findChildByClass(NimForStmt.class);
  }

  @Override
  @Nullable
  public NimFuncStmt getFuncStmt() {
    return findChildByClass(NimFuncStmt.class);
  }

  @Override
  @Nullable
  public NimIfStmt getIfStmt() {
    return findChildByClass(NimIfStmt.class);
  }

  @Override
  @Nullable
  public NimIteratorStmt getIteratorStmt() {
    return findChildByClass(NimIteratorStmt.class);
  }

  @Override
  @Nullable
  public NimMacroStmt getMacroStmt() {
    return findChildByClass(NimMacroStmt.class);
  }

  @Override
  @Nullable
  public NimMethodStmt getMethodStmt() {
    return findChildByClass(NimMethodStmt.class);
  }

  @Override
  @Nullable
  public NimMixinStmt getMixinStmt() {
    return findChildByClass(NimMixinStmt.class);
  }

  @Override
  @Nullable
  public NimProcStmt getProcStmt() {
    return findChildByClass(NimProcStmt.class);
  }

  @Override
  @Nullable
  public NimSimpleStmt getSimpleStmt() {
    return findChildByClass(NimSimpleStmt.class);
  }

  @Override
  @Nullable
  public NimStaticStmt getStaticStmt() {
    return findChildByClass(NimStaticStmt.class);
  }

  @Override
  @Nullable
  public NimTemplateStmt getTemplateStmt() {
    return findChildByClass(NimTemplateStmt.class);
  }

  @Override
  @Nullable
  public NimTryStmt getTryStmt() {
    return findChildByClass(NimTryStmt.class);
  }

  @Override
  @Nullable
  public NimTypeStmt getTypeStmt() {
    return findChildByClass(NimTypeStmt.class);
  }

  @Override
  @Nullable
  public NimVarStmt getVarStmt() {
    return findChildByClass(NimVarStmt.class);
  }

  @Override
  @Nullable
  public NimWhenStmt getWhenStmt() {
    return findChildByClass(NimWhenStmt.class);
  }

  @Override
  @Nullable
  public NimWhileStmt getWhileStmt() {
    return findChildByClass(NimWhileStmt.class);
  }

}
