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

public class NimStmtsImpl extends ASTWrapperPsiElement implements NimStmts {

  public NimStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitStmts(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStmt.class);
  }

}
