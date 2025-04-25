package com.example.composedemo.test1.mix.test5

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.composedemo.R

/**
 * View使用Compose Fragment
 */
class MixActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mix5)
        var f = ComposeFragment()
        supportFragmentManager.beginTransaction().add(R.id.flyt_test, f).commit();
    }



}

