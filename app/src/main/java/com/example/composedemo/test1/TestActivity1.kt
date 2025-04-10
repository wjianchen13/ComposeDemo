package com.example.composedemo.test1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.box.BoxActivity
import com.example.composedemo.test1.column.ColumnActivity
import com.example.composedemo.test1.row.RowActivity

/**
 * Jetpack Compose：Android全新UI编程
 */
class TestActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
    }

    /**
     * Row
     */
    fun onRow(v: View) {
        startActivity(Intent(this, RowActivity::class.java))
    }

    /**
     * Row
     */
    fun onBox(v: View) {
        startActivity(Intent(this, BoxActivity::class.java))
    }

    /**
     * Column 竖向线性布局
     */
    fun onColumn(v: View) {
        startActivity(Intent(this, ColumnActivity::class.java))
    }


}

