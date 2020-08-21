// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObject extends NimElement {

  @NotNull
  NimObjectPart getObjectPart();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimTypeDesc getTypeDesc();

}
