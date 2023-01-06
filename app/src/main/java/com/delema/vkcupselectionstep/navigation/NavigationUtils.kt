package com.delema.vkcupselectionstep.navigation

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

fun FragmentTransaction.replace(
    @IdRes containerRes: Int,
    targetFragment: Fragment,
    bundle: Bundle?
): FragmentTransaction = bundle?.let {
    replace(containerRes, targetFragment, it)
} ?: replace(containerRes, targetFragment)
