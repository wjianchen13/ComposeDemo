package com.example.composedemo.test1.lazycolumn

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * LazyColumn 竖向列表
 */
class LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazycolumn)
    }

    /**
     * 使用List items
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LazyColumnActivity1::class.java))
    }

    /**
     * 使用List itemsIndexed
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LazyColumnActivity2::class.java))
    }

    /**
     * 使用Array itemsIndexed
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, LazyColumnActivity3::class.java))
    }

    /**
     * 多Type
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, LazyColumnActivity4::class.java))
    }

    /**
     * 粘性标题
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, LazyColumnActivity5::class.java))
    }

    /**
     * 复杂粘性标题
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, LazyColumnActivity6::class.java))
    }

    /**
     * 回到顶部
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, LazyColumnActivity7::class.java))
    }



}

