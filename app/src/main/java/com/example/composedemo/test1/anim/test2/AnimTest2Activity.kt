package com.example.composedemo.test1.anim.test2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 低级别动画
 */
class AnimTest2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_test2)
    }

    /**
     * 属性动画
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimTest2Activity1::class.java))
    }

    /**
     * 属性动画
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, AnimTest2Activity2::class.java))
    }

    /**
     * 帧动画
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, AnimTest2Activity3::class.java))
    }

    /**
     * 帧动画
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, AnimTest2Activity4::class.java))
    }

    /**
     * 多动画同步
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, AnimTest2Activity5::class.java))
    }

    /**
     * 多动画重复
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, AnimTest2Activity6::class.java))
    }


}

