package com.delema.vkcupselectionstep.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment

interface IFragmentsNavigation {
    fun openFragment(fragment: Fragment, bundle: Bundle? = null)
}