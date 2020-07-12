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

public class NimPostExprBlocksImpl extends NimElementImpl implements NimPostExprBlocks {

  public NimPostExprBlocksImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPostExprBlocks(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimOptInd getOptInd() {
    return findChildByClass(NimOptInd.class);
  }

  @Override
  @NotNull
  public List<NimPostExprBlocks1> getPostExprBlocks1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPostExprBlocks1.class);
  }

  @Override
  @NotNull
  public List<NimPostExprBlocks2> getPostExprBlocks2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPostExprBlocks2.class);
  }

  @Override
  @NotNull
  public List<NimPostExprBlocks3> getPostExprBlocks3List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPostExprBlocks3.class);
  }

  @Override
  @NotNull
  public List<NimPostExprBlocks4> getPostExprBlocks4List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPostExprBlocks4.class);
  }

  @Override
  @NotNull
  public List<NimPostExprBlocks5> getPostExprBlocks5List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPostExprBlocks5.class);
  }

}
