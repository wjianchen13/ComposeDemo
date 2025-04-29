package com.example.composedemo.test2.anim

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.lazylayout.LazyLayoutActivity1

/**
 * Compose 动画
 */
class AnimActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_anim)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimActivity1::class.java))
    }

    /**
     * AnimatedVisibility
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, AnimActivity2::class.java))
    }

    /**
     * animateContentSize
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, AnimActivity3::class.java))
    }

    /**
     * 例子
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, AnimActivity4::class.java))
    }

    /**
     * AnimatedContent
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, AnimActivity5::class.java))
    }

    /**
     * 例子
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, AnimActivity6::class.java))
    }

    /**
     * animateFloatAsState
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, AnimActivity7::class.java))
    }

    /**
     * 例子
     */
    fun onTest8(v: View) {
        startActivity(Intent(this, AnimActivity8::class.java))
    }

    /**
     * animateColorAsState
     */
    fun onTest9(v: View) {
        startActivity(Intent(this, AnimActivity9::class.java))
    }

    /**
     * AnimationSpec tween
     */
    fun onTest10(v: View) {
        startActivity(Intent(this, AnimActivity10::class.java))
    }

    /**
     * AnimationSpec spring
     */
    fun onTest11(v: View) {
        startActivity(Intent(this, AnimActivity11::class.java))
    }

    /**
     * enter和exit动画
     */
    fun onTest12(v: View) {
        startActivity(Intent(this, AnimActivity12::class.java))
    }

    /**
     * 重复性动画
     */
    fun onTest13(v: View) {
        startActivity(Intent(this, AnimActivity13::class.java))
    }


}

