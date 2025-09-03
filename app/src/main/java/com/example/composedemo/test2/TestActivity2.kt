package com.example.composedemo.test2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.anim.AnimActivity
import com.example.composedemo.test2.derivedstateof.DerivedStateOfActivity
import com.example.composedemo.test2.layout.LayoutActivity
import com.example.composedemo.test2.lazylayout.LazyLayoutActivity
import com.example.composedemo.test2.modifier.ModifierActivity
import com.example.composedemo.test2.sideeffect.SideEffectActivity
import com.example.composedemo.test2.view.ViewActivity
import com.example.composedemo.test2.state.StateActivity

/**
 * 写给初学者的Jetpack Compose教程
 */
class TestActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }

    /**
     * Compose 基础控件
     */
    fun onView(v: View) {
        startActivity(Intent(this, ViewActivity::class.java))
    }

    /**
     * Compose Modifier
     */
    fun onModifier(v: View) {
        startActivity(Intent(this, ModifierActivity::class.java))
    }

    /**
     * Compose State
     */
    fun onState(v: View) {
        startActivity(Intent(this, StateActivity::class.java))
    }

    /**
     * Lazy Layout
     */
    fun onLazyLayout(v: View) {
        startActivity(Intent(this, LazyLayoutActivity::class.java))
    }

    /**
     * derivedStateOf
     */
    fun onDerivedStateOf(v: View) {
        startActivity(Intent(this, DerivedStateOfActivity::class.java))
    }

    /**
     * 高级Layout
     */
    fun onLayout(v: View) {
        startActivity(Intent(this, LayoutActivity::class.java))
    }

    /**
     * Compose 动画
     */
    fun onAnim(v: View) {
        startActivity(Intent(this, AnimActivity::class.java))
    }


    /**
     * Side Effect
     */
    fun onSideEffect(v: View) {
        startActivity(Intent(this, SideEffectActivity::class.java))
    }


}


