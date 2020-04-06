package com.github.izhangzhihao.rainbow.brackets.provider

import com.intellij.lang.BracePair
import com.jetbrains.twig.TwigTokenTypes.*

class TwigProvider : PairedBraceProvider {

    override val pairs: List<BracePair> = PAIRS

    companion object {
        private val PAIRS: List<BracePair> = listOf(
                BracePair(STATEMENT_BLOCK_START, STATEMENT_BLOCK_END, false),
                BracePair(PRINT_BLOCK_START, PRINT_BLOCK_END, false)
        )
    }
}
