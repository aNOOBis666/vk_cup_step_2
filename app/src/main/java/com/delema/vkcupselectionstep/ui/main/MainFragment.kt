package com.delema.vkcupselectionstep.ui.main

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.delema.vkcupselectionstep.R
import com.delema.vkcupselectionstep.data.ActionTypes
import com.delema.vkcupselectionstep.navigation.IFragmentsNavigation
import com.delema.vkcupselectionstep.ui.multistepsaction.InteractionFragment

class MainFragment : Fragment(R.layout.fragment_main), IFragmentsNavigation {

    private var navigationInteractor: IFragmentsNavigation? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        navigationInteractor = activity as? IFragmentsNavigation
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val screenTypes = arrayOf(
            ActionTypes.MULTI_SELECTION, ActionTypes.COMPARE,
            ActionTypes.MOVING_INTO_BLANK,
            ActionTypes.FILLING_BLANK,
            ActionTypes.RATE
        )
        screenTypes.forEach { initViewWithListener(it) }
    }

    override fun openFragment(fragment: Fragment, bundle: Bundle?) {
        TODO("Not yet implemented")
    }

    private fun initViewWithListener(
        actionTypes: ActionTypes,
        action: (ActionTypes) -> Unit = {
            openFragment(
                InteractionFragment(),
                InteractionFragment.getArgs(it)
            )
        }
    ) = view?.findViewById<Button>(actionTypes.value)?.setOnClickListener {
        action(actionTypes)
    }
}