// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.ultreon.quantum.qfunc.psi.QuantumTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.ultreon.quantum.qfunc.psi.*;

public class QuantumNegationExprImpl extends ASTWrapperPsiElement implements QuantumNegationExpr {

  public QuantumNegationExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QuantumVisitor visitor) {
    visitor.visitNegationExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QuantumVisitor) accept((QuantumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QuantumEqualityExpr getEqualityExpr() {
    return findChildByClass(QuantumEqualityExpr.class);
  }

  @Override
  @Nullable
  public QuantumNegationExpr getNegationExpr() {
    return findChildByClass(QuantumNegationExpr.class);
  }

}
