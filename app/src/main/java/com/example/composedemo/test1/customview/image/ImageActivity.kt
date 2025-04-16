package com.example.composedemo.test1.customview.image

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制图片
 */
class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_image)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ImageActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ImageActivity2::class.java))
    }


}

