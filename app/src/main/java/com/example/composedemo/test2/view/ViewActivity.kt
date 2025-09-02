package com.example.composedemo.test2.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.anim.AnimActivity1

/**
 * Compose 基础控件
 */
class ViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_view)
    }

    /**
     * Text
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ViewActivity1::class.java))
    }

    /**
     * Button
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ViewActivity2::class.java))
    }

    /**
     * TextField
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, ViewActivity3::class.java))
    }

    /**
     * Image
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, ViewActivity4::class.java))
    }

    /**
     * ProgressIndicator
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, ViewActivity5::class.java))
    }

    /**
     * Column
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, ViewActivity6::class.java))
    }

    /**
     * Row
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, ViewActivity7::class.java))
    }

    /**
     * Box
     */
    fun onTest8(v: View) {
        startActivity(Intent(this, ViewActivity8::class.java))
    }



}

