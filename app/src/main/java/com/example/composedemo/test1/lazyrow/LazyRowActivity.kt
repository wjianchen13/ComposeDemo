package com.example.composedemo.test1.lazyrow

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * LazyColumn 竖向列表
 */
class LazyRowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazyrow)
    }

    /**
     * 使用List items
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LazyRowActivity1::class.java))
    }

    /**
     * 使用项键Key
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LazyRowActivity2::class.java))
    }





}

