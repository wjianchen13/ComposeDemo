package com.example.composedemo.test2.sideeffect

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.anim.AnimActivity1

/**
 * Side Effect
 */
class SideEffectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_side_effect)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, SideEffectActivity1::class.java))
    }

    /**
     * LaunchedEffect
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, SideEffectActivity2::class.java))
    }

    /**
     * rememberUpdatedState
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, SideEffectActivity3::class.java))
    }

    /**
     * rememberCoroutineScope
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, SideEffectActivity4::class.java))
    }

    /**
     * DisposableEffect
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, SideEffectActivity5::class.java))
    }

    /**
     * produceState
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, SideEffectActivity6::class.java))
    }

    /**
     * SideEffect
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, SideEffectActivity7::class.java))
    }

    /**
     * 例子
     */
    fun onTest8(v: View) {

    }

}

