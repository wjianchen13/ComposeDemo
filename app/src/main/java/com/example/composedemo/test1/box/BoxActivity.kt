package com.example.composedemo.test1.box

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Box 帧布局
 */
class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_box)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, BoxActivity1::class.java))
    }




}

