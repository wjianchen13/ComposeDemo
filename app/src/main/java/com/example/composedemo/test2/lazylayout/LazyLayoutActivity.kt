package com.example.composedemo.test2.lazylayout

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
 * Lazy Layout
 */
class LazyLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazy_layout)
    }

    /**
     * LazyColumn 基础使用
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, LazyLayoutActivity1::class.java))
    }

    /**
     * LazyColumn 带下标
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, LazyLayoutActivity2::class.java))
    }

    /**
     * LazyColumn 设置边距
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, LazyLayoutActivity3::class.java))
    }

    /**
     * LazyColumn 设置边距
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, LazyLayoutActivity4::class.java))
    }

    /**
     * LazyColumn 设置边距
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, LazyLayoutActivity5::class.java))
    }

    /**
     * LazyColumn 设置边距
     */
    fun onTest6(v: View) {
        startActivity(Intent(this, LazyLayoutActivity6::class.java))
    }

    /**
     * rememberLazyListState
     */
    fun onTest7(v: View) {
        startActivity(Intent(this, LazyLayoutActivity7::class.java))
    }

    /**
     * 嵌套滚动
     */
    fun onTest8(v: View) {
        startActivity(Intent(this, LazyLayoutActivity8::class.java))
    }

    /**
     * 嵌套滚动
     */
    fun onTest9(v: View) {
        startActivity(Intent(this, LazyLayoutActivity9::class.java))
    }

    /**
     * 拼接不同类型子项
     */
    fun onTest10(v: View) {
        startActivity(Intent(this, LazyLayoutActivity10::class.java))
    }

    /**
     * 提升Lazy Layout性能
     */
    fun onTest11(v: View) {
        startActivity(Intent(this, LazyLayoutActivity11::class.java))
    }


}

