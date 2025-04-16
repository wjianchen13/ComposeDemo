package com.example.composedemo.test1.scaffold

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Scaffold 脚手架
 */
class ScaffoldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scaffold)
    }

    /**
     *
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ScaffoldActivity1::class.java))
    }

    /**
     * 实现圆角
     */
    fun onTest2(v: View) {

    }

    /**
     *
     */
    fun onTest3(v: View) {

    }


}

