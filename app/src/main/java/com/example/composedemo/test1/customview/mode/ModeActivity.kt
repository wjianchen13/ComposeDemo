package com.example.composedemo.test1.customview.mode

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 混合模式
 */
class ModeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_mode)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ModeActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {

    }

    /**
     * test1
     */
    fun onTest3(v: View) {

    }


}

