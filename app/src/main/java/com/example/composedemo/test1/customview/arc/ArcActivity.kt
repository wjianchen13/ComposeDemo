package com.example.composedemo.test1.customview.arc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制圆弧
 */
class ArcActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_arc)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ArcActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ArcActivity2::class.java))
    }

    /**
     * test1
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, ArcActivity3::class.java))
    }


}

