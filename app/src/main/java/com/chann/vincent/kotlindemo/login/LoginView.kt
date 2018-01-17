package com.chann.vincent.kotlindemo.login

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by vincentchann on 17/01/2018.
 */

class LoginView : AnkoComponent<LoginActivity> {

    override fun createView(ui: AnkoContext<LoginActivity>): View = with(ui) {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }

}