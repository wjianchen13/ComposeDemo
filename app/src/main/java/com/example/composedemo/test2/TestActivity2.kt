package com.example.composedemo.test2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.lazylayout.LazyLayoutActivity

/**
 * 写给初学者的Jetpack Compose教程
 */
class TestActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }

    /**
     * Lazy Layout
     */
    fun onLazyLayout(v: View) {
        startActivity(Intent(this, LazyLayoutActivity::class.java))
    }

    /**
     * Row
     */
    fun onTest2(v: View) {

    }


}


