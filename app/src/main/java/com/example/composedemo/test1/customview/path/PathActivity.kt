package com.example.composedemo.test1.customview.path

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * 绘制路径
 */
class PathActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_path)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, PathActivity1::class.java))
    }

    /**
     * test1
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, PathActivity2::class.java))
    }

    /**
     * test1
     */
    fun onTest3(v: View) {

    }


}

