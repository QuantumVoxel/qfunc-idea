// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QuantumStatement extends PsiElement {

  @Nullable
  QuantumAssignment getAssignment();

  @Nullable
  QuantumBlockStatement getBlockStatement();

  @Nullable
  QuantumBreakStatement getBreakStatement();

  @Nullable
  QuantumContinueStatement getContinueStatement();

  @Nullable
  QuantumExpressionStatement getExpressionStatement();

  @Nullable
  QuantumForStatement getForStatement();

  @Nullable
  QuantumFunctionCall getFunctionCall();

  @Nullable
  QuantumIfStatement getIfStatement();

  @Nullable
  QuantumInputStatement getInputStatement();

  @Nullable
  QuantumLineComment getLineComment();

  @Nullable
  QuantumLoopStatement getLoopStatement();

  @Nullable
  QuantumPersistStatement getPersistStatement();

  @Nullable
  QuantumReturnStatement getReturnStatement();

  @Nullable
  QuantumStopStatement getStopStatement();

  @Nullable
  QuantumWhileStatement getWhileStatement();

}
