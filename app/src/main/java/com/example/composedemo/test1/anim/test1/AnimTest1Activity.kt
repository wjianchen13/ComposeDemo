package com.example.composedemo.test1.anim.test1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 简单使用动画
 */
class AnimTest1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_test1)
    }

    /**
     * 可见性动画
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimTest1Activity1::class.java))
    }

    /**
     * 可见性动画
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, AnimTest1Activity2::class.java))
    }

    /**
     * 布局大小动画
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, AnimTest1Activity3::class.java))
    }

    /**
     * 布局切换动画
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, AnimTest1Activity4::class.java))
    }


}

