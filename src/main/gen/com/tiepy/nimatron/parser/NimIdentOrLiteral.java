// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimIdentOrLiteral extends PsiElement {

  @Nullable
  NimArrayConstr getArrayConstr();

  @Nullable
  NimCastExpr getCastExpr();

  @Nullable
  NimGeneralizedLit getGeneralizedLit();

  @Nullable
  NimLiteral getLiteral();

  @Nullable
  NimPar getPar();

  @Nullable
  NimSetOrTableConstr getSetOrTableConstr();

  @Nullable
  NimSymbol getSymbol();

}
