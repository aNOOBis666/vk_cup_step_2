package com.delema.vkcupselectionstep.data

import androidx.annotation.IdRes
import com.delema.vkcupselectionstep.R

enum class ActionTypes(@IdRes val value: Int) {
    MULTI_SELECTION(R.id.buttonMultiStep),
    COMPARE(R.id.buttonCompare),
    MOVING_INTO_BLANK(R.id.buttonMoveToBlank),
    FILLING_BLANK(R.id.buttonFillBlank),
    RATE(R.id.buttonRate)
}