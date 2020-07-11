// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimExpr extends PsiElement {

  @Nullable
  NimBlockStmt getBlockStmt();

  @Nullable
  NimCaseStmt getCaseStmt();

  @Nullable
  NimForStmt getForStmt();

  @Nullable
  NimIfExpr getIfExpr();

  @Nullable
  NimSimpleExpr getSimpleExpr();

  @Nullable
  NimTryExpr getTryExpr();

  @Nullable
  NimWhenExpr getWhenExpr();

}
