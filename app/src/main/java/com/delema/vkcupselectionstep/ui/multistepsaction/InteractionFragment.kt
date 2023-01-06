package com.delema.vkcupselectionstep.ui.multistepsaction

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.delema.vkcupselectionstep.R
import com.delema.vkcupselectionstep.data.ActionTypes

class InteractionFragment : Fragment(R.layout.fragment_interaction) {

    companion object {
        private const val SCREEN_TYPE_KEY = "screen_type_key"
        fun getArgs(actionTypes: ActionTypes) = bundleOf(SCREEN_TYPE_KEY to actionTypes)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}