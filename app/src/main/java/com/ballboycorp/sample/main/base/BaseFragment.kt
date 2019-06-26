package com.ballboycorp.sample.main.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.ballboycorp.sample.R

/**
 * Created by muso on 2019-06-26.
 */

open class BaseFragment : Fragment() {

    fun initToolbar(title: String?, withBackButton: Boolean = false) {
        val toolbar = view?.findViewById<Toolbar>(R.id.toolbar) ?: return
        toolbar.title = title ?: " "
        val activity = (activity as AppCompatActivity)
        activity.setSupportActionBar(toolbar)
        if (withBackButton) {
            activity.supportActionBar?.apply {
                setDisplayShowHomeEnabled(true)
                setDisplayHomeAsUpEnabled(true)
            }
        }

    }
}