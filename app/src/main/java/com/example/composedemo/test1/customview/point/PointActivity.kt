package com.example.composedemo.test1.customview.point

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制点
 */
class PointActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_point)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, PointActivity1::class.java))
    }

    /**
     * test2
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, PointActivity2::class.java))
    }

    /**
     * test3
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, PointActivity3::class.java))
    }

    /**
     * Stroke.cap
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, PointActivity4::class.java))
    }


    /**
     * Stroke.cap
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, PointActivity5::class.java))
    }

    /**
     * Brush
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, PointActivity6::class.java))
    }

    /**
     * Brush
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, PointActivity7::class.java))
    }


}

