package com.chann.vincent.kotlindemo.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

/**
 * Created by vincentchann on 17/01/2018.
 */

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginView().setContentView(this)
    }
}