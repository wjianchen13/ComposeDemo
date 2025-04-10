package com.example.composedemo.test1.row

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Row
 */
class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_row)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, RowActivity1::class.java))
    }




}

