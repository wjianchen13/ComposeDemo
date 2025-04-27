package com.example.composedemo.test2.derivedstateof

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test2.lazylayout.LazyLayoutActivity1

/**
 * derivedStateOf
 */
class DerivedStateOfActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_derived_state_of)
    }

    /**
     * test1
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, DerivedStateOfActivity1::class.java))
    }

    /**
     * test2
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, DerivedStateOfActivity2::class.java))
    }

    /**
     * test3
     */
    fun onTest3(v: View) {

    }


}

