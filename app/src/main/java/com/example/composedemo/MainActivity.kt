package com.example.composedemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.test1.TestActivity1

/**
 * Compose
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Jetpack Compose：Android全新UI编程
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, TestActivity1::class.java))
    }




}

