package com.example.composedemo.test1.customview.circle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制圆
 */
class CircleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_circle)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, CircleActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, CircleActivity2::class.java))
    }


}

