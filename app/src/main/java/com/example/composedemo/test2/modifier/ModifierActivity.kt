package com.example.composedemo.test2.modifier

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.anim.AnimActivity1

/**
 * Compose Modifier
 */
class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_modifier)
    }

    /**
     * 修改尺寸、布局、行为和样式
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ModifierActivity1::class.java))
    }

    /**
     * 处理用户的输入
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ModifierActivity2::class.java))
    }

    /**
     *
     */
    fun onTest3(v: View) {

    }

    /**
     *
     */
    fun onTest4(v: View) {

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

    /**
     *
     */
    fun onTest7(v: View) {

    }

    /**
     *
     */
    fun onTest8(v: View) {

    }

    /**
     *
     */
    fun onTest9(v: View) {

    }

    /**
     *
     */
    fun onTest10(v: View) {

    }

    /**
     *
     */
    fun onTest11(v: View) {

    }

    /**
     *
     */
    fun onTest12(v: View) {

    }

    /**
     *
     */
    fun onTest13(v: View) {

    }


}

