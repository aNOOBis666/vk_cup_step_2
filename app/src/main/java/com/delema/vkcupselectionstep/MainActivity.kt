package com.delema.vkcupselectionstep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.delema.vkcupselectionstep.navigation.IFragmentsNavigation
import com.delema.vkcupselectionstep.navigation.replace
import com.delema.vkcupselectionstep.ui.main.MainFragment

class MainActivity : AppCompatActivity(R.layout.ac_main), IFragmentsNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)
        if (savedInstanceState == null) {
            setStartDestination()
        }
    }

    private fun setStartDestination() = openFragment(MainFragment())

    override fun openFragment(fragment: Fragment, bundle: Bundle?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment, bundle)
            .commit()
    }
}