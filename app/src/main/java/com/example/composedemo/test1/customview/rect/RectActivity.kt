package com.example.composedemo.test1.customview.rect

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.customview.line.LineActivity1

/**
 * 绘制矩形
 */
class RectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_rect)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, RectActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, RectActivity2::class.java))
    }

    /**
     * test1
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, RectActivity3::class.java))
    }

    /**
     * 圆角矩形
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, RectActivity4::class.java))
    }


}

