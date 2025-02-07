// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QuantumMultExpr extends PsiElement {

  @NotNull
  QuantumAddExpr getAddExpr();

  @NotNull
  List<QuantumMultExpr> getMultExprList();

}
