package com.example.composedemo.test1.lazyverticalgrid

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * LazyVerticalGrid 网格列表
 */
class LazyVerticalGridActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazyverticalgrid)
    }

    /**
     * 简单使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LazyVerticalGridActivity1::class.java))
    }

    /**
     * 设置列数
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LazyVerticalGridActivity2::class.java))
    }

    /**
     * 使用Array构建
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, LazyVerticalGridActivity3::class.java))
    }



}

