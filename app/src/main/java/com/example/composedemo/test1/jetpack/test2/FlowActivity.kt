package com.example.composedemo.test1.jetpack.test2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Flow
 */
class FlowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack_flow)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, FlowActivity1::class.java))
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
     * 布局切换动画
     */
    fun onTest4(v: View) {

    }


}

