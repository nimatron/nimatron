// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimComplexOrSimpleStmt extends PsiElement {

  @Nullable
  NimAsmStmt getAsmStmt();

  @Nullable
  NimBindStmt getBindStmt();

  @Nullable
  NimBlockStmt getBlockStmt();

  @Nullable
  NimConstStmt getConstStmt();

  @Nullable
  NimConverterStmt getConverterStmt();

  @Nullable
  NimDeferStmt getDeferStmt();

  @Nullable
  NimForStmt getForStmt();

  @Nullable
  NimFuncStmt getFuncStmt();

  @Nullable
  NimIfStmt getIfStmt();

  @Nullable
  NimIteratorStmt getIteratorStmt();

  @Nullable
  NimMacroStmt getMacroStmt();

  @Nullable
  NimMethodStmt getMethodStmt();

  @Nullable
  NimMixinStmt getMixinStmt();

  @Nullable
  NimProcStmt getProcStmt();

  @Nullable
  NimSimpleStmt getSimpleStmt();

  @Nullable
  NimStaticStmt getStaticStmt();

  @Nullable
  NimTemplateStmt getTemplateStmt();

  @Nullable
  NimTryStmt getTryStmt();

  @Nullable
  NimTypeStmt getTypeStmt();

  @Nullable
  NimVarStmt getVarStmt();

  @Nullable
  NimWhenStmt getWhenStmt();

  @Nullable
  NimWhileStmt getWhileStmt();

}
