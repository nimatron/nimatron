// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class NimVisitor extends PsiElementVisitor {

  public void visitConstant(@NotNull NimConstant o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull NimExpr o) {
    visitPsiElement(o);
  }

  public void visitPrimary(@NotNull NimPrimary o) {
    visitPsiElement(o);
  }

  public void visitStmt(@NotNull NimStmt o) {
    visitPsiElement(o);
  }

  public void visitVariable(@NotNull NimVariable o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
