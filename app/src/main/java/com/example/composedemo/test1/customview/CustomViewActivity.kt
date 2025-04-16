package com.example.composedemo.test1.customview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
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
 * CustomView
 */
class CustomViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)
    }

    /**
     * 绘制点
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, PointActivity::class.java))
    }

    /**
     * 绘制线
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LineActivity::class.java))
    }


    /**
     * 绘制矩形
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, RectActivity::class.java))
    }

    /**
     * 绘制圆
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, CircleActivity::class.java))
    }

    /**
     * 绘制椭圆
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, OvalActivity::class.java))
    }

    /**
     * 绘制圆弧
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, ArcActivity::class.java))
    }

    /**
     * 绘制图片
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, ImageActivity::class.java))
    }

    /**
     * 绘制路径
     */
    fun onTest8(v: View) {
        startActivity(Intent(this, PathActivity::class.java))
    }

    /**
     * 混合模式
     */
    fun onTest9(v: View) {
        startActivity(Intent(this, ModeActivity::class.java))
    }

}

