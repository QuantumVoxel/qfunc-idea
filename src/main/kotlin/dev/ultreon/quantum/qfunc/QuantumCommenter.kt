package dev.ultreon.quantum.qfunc

import com.intellij.lang.Commenter

internal class QuantumCommenter : Commenter {
  override fun getLineCommentPrefix(): String {
    return "// "
  }

  override fun getBlockCommentPrefix(): String {
    return ""
  }

  override fun getBlockCommentSuffix(): String? {
    return ""
  }

  override fun getCommentedBlockCommentPrefix(): String? {
    return null
  }

  override fun getCommentedBlockCommentSuffix(): String? {
    return null
  }
}