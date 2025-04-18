package com.example.composedemo.test1.jetpack.test3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Navigation
 */
class NavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack_navigation)
    }

    /**
     * 基础使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, NavigationActivity1::class.java))
    }

    /**
     * 返回上一层
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, NavigationActivity2::class.java))
    }

    /**
     * 带参数跳转
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, NavigationActivity3::class.java))
    }

    /**
     * 传递多个参数
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, NavigationActivity4::class.java))
    }

    /**
     * 解析参数类型
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, NavigationActivity5::class.java))
    }

    /**
     * 添加可选参数
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, NavigationActivity6::class.java))
    }

    /**
     * 实体类参数
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, NavigationActivity7::class.java))
    }

}

