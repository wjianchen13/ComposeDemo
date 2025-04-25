package com.example.composedemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.test1.TestActivity1
import com.example.composedemo.test2.TestActivity2

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

    /**
     * 写给初学者的Jetpack Compose教程
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, TestActivity2::class.java))
    }

    fun onTest3(v: View) {

    }


    fun onTest4(v: View) {

    }

    fun onTest5(v: View) {

    }

    fun onTest6(v: View) {

    }

    fun onTest7(v: View) {

    }

    fun onTest8(v: View) {

    }

    fun onTest9(v: View) {

    }

    fun onTest10(v: View) {

    }


}

