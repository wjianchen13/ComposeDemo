package com.example.composedemo.test1.jetpack

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.jetpack.test1.ViewModelActivity
import com.example.composedemo.test1.jetpack.test2.FlowActivity
import com.example.composedemo.test1.jetpack.test3.NavigationActivity

/**
 * JetPack
 */
class JetpackActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack)
    }

    /**
     * ViewModel
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ViewModelActivity::class.java))
    }

    /**
     * Flow
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, FlowActivity::class.java))
    }

    /**
     * Navigation
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, NavigationActivity::class.java))
    }

    /**
     *
     */
    fun onTest4(v: View) {

    }

    /**
     *
     */
    fun onTest5(v: View) {

    }

    /**
     *
     */
    fun onTest6(v: View) {

    }

}

