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

public class NimComplexOrSimpleStmtImpl extends ASTWrapperPsiElement implements NimComplexOrSimpleStmt {

  public NimComplexOrSimpleStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitComplexOrSimpleStmt(this);
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
  public NimIfStmt getIfStmt() {
    return findChildByClass(NimIfStmt.class);
  }

  @Override
  @Nullable
  public NimMixinStmt getMixinStmt() {
    return findChildByClass(NimMixinStmt.class);
  }

  @Override
  @Nullable
  public NimRoutine getRoutine() {
    return findChildByClass(NimRoutine.class);
  }

  @Override
  @Nullable
  public NimSection getSection() {
    return findChildByClass(NimSection.class);
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
  public NimTryStmt getTryStmt() {
    return findChildByClass(NimTryStmt.class);
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
