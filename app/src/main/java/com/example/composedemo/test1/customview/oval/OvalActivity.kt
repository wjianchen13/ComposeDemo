package com.example.composedemo.test1.customview.oval

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制椭圆
 */
class OvalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_oval)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, OvalActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, OvalActivity2::class.java))
    }


}

