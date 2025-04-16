package com.example.composedemo.test1.customview.line

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制线
 */
class LineActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_line)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LineActivity1::class.java))
    }



}

