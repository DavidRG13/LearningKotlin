package com.playgroundapp.app.advanced

import android.app.Fragment

open class MyFragment() : Fragment() {

    companion object {
        fun newInstance(): MyFragment {
            return MyFragment()
        }
    }
}

fun main(args: Array<String>) {
    MyFragment.newInstance()
}