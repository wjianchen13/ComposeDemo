package com.example.composedemo.test1.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * ConstraintLayoutActivity
 */
class ConstraintLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraintlayout)
    }

    /**
     *
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ConstraintLayoutActivity1::class.java))
    }

    /**
     * 实现圆角
     */
    fun onTest2(v: View) {

    }

    /**
     *
     */
    fun onTest3(v: View) {

    }


}

