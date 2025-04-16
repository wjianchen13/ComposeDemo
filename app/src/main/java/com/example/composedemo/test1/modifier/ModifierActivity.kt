package com.example.composedemo.test1.modifier

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Modifier 修饰符
 */
class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modifier)
    }

    /**
     *
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ModifierActivity1::class.java))
    }

    /**
     * 实现圆角
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ModifierActivity2::class.java))
    }

    /**
     *
     */
    fun onTest3(v: View) {

    }


}

