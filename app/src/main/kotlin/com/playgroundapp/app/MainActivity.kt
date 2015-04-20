package com.playgroundapp.app

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.learningkotlin.app.R
import kotlinx.android.synthetic.activity_main.*

public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        findViewById(R.id.closeButton).setOnClickListener {finish()};
//        findViewById(R.id.closeButton).setOnClickListener {it.getId()};
        closeButton.setOnClickListener { finish() }
        closeButton.setOnClickListener { it.getId() }

    }
}
