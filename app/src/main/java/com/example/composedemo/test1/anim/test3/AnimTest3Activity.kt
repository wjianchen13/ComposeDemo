package com.example.composedemo.test1.anim.test3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 自定义动画
 */
class AnimTest3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_test3)
    }

    /**
     * 属性动画
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimTest3Activity1::class.java))
    }

    /**
     *
     */
    fun onTest2(v: View) {

    }

    /**
     *
     */
    fun onTest3(v: View) {

    }

    /**
     *
     */
    fun onTest4(v: View) {

    }

    /**
     *
     */
    fun onTest5(v: View) {

    }

    /**
     *
     */
    fun onTest6(v: View) {

    }


}

