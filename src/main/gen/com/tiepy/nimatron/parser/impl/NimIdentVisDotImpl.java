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

public class NimIdentVisDotImpl extends ASTWrapperPsiElement implements NimIdentVisDot {

  public NimIdentVisDotImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitIdentVisDot(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimOptInd getOptInd() {
    return findNotNullChildByClass(NimOptInd.class);
  }

  @Override
  @NotNull
  public List<NimSymbol> getSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimSymbol.class);
  }

}
