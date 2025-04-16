package com.example.composedemo.test1.bottomnavigationview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * BottomNavigation 底部导航栏
 */
class BottomNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nagivation)
    }

    /**
     * 简单使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, BottomNavigationViewActivity1::class.java))
    }

}

