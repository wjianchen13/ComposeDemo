package com.example.composedemo.test2.layout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.lazylayout.LazyLayoutActivity1

/**
 * 高级Layout
 */
class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_layout)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LayoutActivity1::class.java))
    }

    /**
     * test2
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LayoutActivity2::class.java))
    }

    /**
     * test3
     */
    fun onTest3(v: View) {

    }


}

