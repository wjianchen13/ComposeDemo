package com.example.composedemo.test1.anim

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.anim.test1.AnimTest1Activity
import com.example.composedemo.test1.anim.test2.AnimTest2Activity
import com.example.composedemo.test1.anim.test3.AnimTest3Activity
import com.example.composedemo.test1.anim.test4.AnimTest4Activity
import com.example.composedemo.test1.customview.arc.ArcActivity
import com.example.composedemo.test1.customview.circle.CircleActivity
import com.example.composedemo.test1.customview.image.ImageActivity
import com.example.composedemo.test1.customview.line.LineActivity
import com.example.composedemo.test1.customview.mode.ModeActivity
import com.example.composedemo.test1.customview.oval.OvalActivity
import com.example.composedemo.test1.customview.path.PathActivity
import com.example.composedemo.test1.customview.point.PointActivity
import com.example.composedemo.test1.customview.rect.RectActivity

/**
 * 动画
 */
class AnimActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim)
    }

    /**
     * 简单使用动画
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, AnimTest1Activity::class.java))
    }

    /**
     * 低级别动画
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, AnimTest2Activity::class.java))
    }

    /**
     * 自定义动画
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, AnimTest3Activity::class.java))
    }

    /**
     * 手势
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, AnimTest4Activity::class.java))
    }

    /**
     *
     */
    fun onTest5(v: View) {

    }

    /**
     *
     */
    fun onTest6(v: View) {

    }

    /**
     *
     */
    fun onTest7(v: View) {

    }

    /**
     *
     */
    fun onTest8(v: View) {

    }

    /**
     *
     */
    fun onTest9(v: View) {

    }

}

