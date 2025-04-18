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

/**
 * 与旧的Android View搭配使用
 */
class MixActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mix)
    }

    /**
     * 简单控件使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, MixActivity1::class.java))
    }

    /**
     * 复杂控件使用
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, MixActivity2::class.java))
    }

    /**
     * 使用xml布局
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, MixActivity3::class.java))
    }

    /**
     * View使用Compose
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, MixActivity4::class.java))
    }

    /**
     *
     */
    fun onTest5(v: View) {

    }

    /**
     *
     */
    fun onTest6(v: View) {

    }

}

