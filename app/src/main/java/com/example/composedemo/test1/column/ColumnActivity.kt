package com.example.composedemo.test1.column

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Column 竖向线性布局
 */
class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_column)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ColumnActivity1::class.java))
    }

    /**
     * verticalArrangement 测试
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ColumnActivity2::class.java))
    }

    /**
     * verticalArrangement 测试
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, ColumnActivity3::class.java))
    }


}

