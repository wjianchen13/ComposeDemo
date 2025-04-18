package com.example.composedemo.test1.anim.test4

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 手势
 */
class AnimTest4Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_test4)
    }

    /**
     * 垂直滚动
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimTest4Activity1::class.java))
    }

    /**
     * 嵌套滚动
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, AnimTest4Activity2::class.java))
    }

    /**
     * 拖动事件
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, AnimTest4Activity3::class.java))
    }

    /**
     * 拖动事件
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, AnimTest4Activity4::class.java))
    }

    /**
     * 滑动事件
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, AnimTest4Activity5::class.java))
    }

    /**
     *
     */
    fun onTest6(v: View) {

    }


}

