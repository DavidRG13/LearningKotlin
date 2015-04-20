package com.playgroundapp.app

import android.app.Activity
import android.widget.TextView
import kotlinx.android.anko.*

public class NoXMLActivity : Activity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)


        verticalLayout {
            padding = dip(16)
            val login = inputField("Username")
            val email = inputField("E-mail")

            button("Sign up") {
                textSize = 20f
                onClick { login(login.text) }
            }.layoutParams { topMargin = dip(8) }
        }
    }

    fun _LinearLayout.inputField(name: String): TextView {
        textView("$name:") {
            textSize = 18f
        }.layoutParams { verticalMargin = dip(4) }
        return editText()
    }

    fun login(text: CharSequence?){
        // do login
        // launch MainActivity



        // Without Anko
//        val intent = Intent(this, javaClass<MainActivity>())
//        intent.putExtra("id", 5)
//        startActivity(intent)

        // With Anko
        startActivity<MainActivity>("id" to 5)

        toast("wolaa")

        // We can access all android system services
        vibrator
        activityManager
        sensorManager
    }
}
