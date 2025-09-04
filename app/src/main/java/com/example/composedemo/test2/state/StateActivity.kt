package com.example.composedemo.test2.state

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Compose State
 */
class StateActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_state)
    }

    /**
     * 简单入门有问题的代码
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, StateActivity1::class.java))
    }

    /**
     * 计数器
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, StateActivity2::class.java))
    }

    /**
     * 简化State代码
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, StateActivity3::class.java))
    }

    /**
     * 恢复State数据
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, StateActivity4::class.java))
    }

    /**
     * 状态提升
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, StateActivity5::class.java))
    }

    /**
     * 结合ViewModel一起使用 LiveData
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, StateActivity6::class.java))
    }

    /**
     * 结合ViewModel一起使用 Flow
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, StateActivity7::class.java))
    }

}

