package com.example.composedemo.test1.mix

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.jetpack.test1.ViewModelActivity
import com.example.composedemo.test1.jetpack.test2.FlowActivity
import com.example.composedemo.test1.jetpack.test3.NavigationActivity
import com.example.composedemo.test1.mix.test1.MixActivity1
import com.example.composedemo.test1.mix.test2.MixActivity2
import com.example.composedemo.test1.mix.test3.MixActivity3
import com.example.composedemo.test1.mix.test4.MixActivity4
import com.example.composedemo.test1.mix.test5.MixActivity5
import com.example.composedemo.test1.mix.test6.MixActivity6
import com.example.composedemo.test1.mix.test7.MixActivity7

/**
 * 与旧的Android View搭配使用
 */
class MixActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mix)
    }

    /**
     * Compose使用View 简单控件使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, MixActivity1::class.java))
    }

    /**
     * Compose使用View 复杂控件使用
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, MixActivity2::class.java))
    }

    /**
     * Compose使用View 使用xml布局
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, MixActivity3::class.java))
    }

    /**
     * View使用Compose Activity
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, MixActivity4::class.java))
    }

    /**
     * View使用Compose Fragment
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, MixActivity5::class.java))
    }

    /**
     * 在布局中使用Compose
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, MixActivity6::class.java))
    }

    /**
     * 创建Android View和Compose中通用的控件
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, MixActivity7::class.java))
    }

}

