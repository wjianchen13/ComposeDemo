package com.example.composedemo.test1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R
import com.example.composedemo.test1.anim.AnimActivity
import com.example.composedemo.test1.bottomnavigationview.BottomNavigationActivity
import com.example.composedemo.test1.box.BoxActivity
import com.example.composedemo.test1.column.ColumnActivity
import com.example.composedemo.test1.constraintlayout.ConstraintLayoutActivity
import com.example.composedemo.test1.customview.CustomViewActivity
import com.example.composedemo.test1.jetpack.JetpackActivity
import com.example.composedemo.test1.lazycolumn.LazyColumnActivity
import com.example.composedemo.test1.lazyrow.LazyRowActivity
import com.example.composedemo.test1.lazyverticalgrid.LazyVerticalGridActivity
import com.example.composedemo.test1.mix.MixActivity
import com.example.composedemo.test1.modifier.ModifierActivity
import com.example.composedemo.test1.row.RowActivity
import com.example.composedemo.test1.scaffold.ScaffoldActivity

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

    /**
     * Modifier 修饰符
     */
    fun onModifier(v: View) {
        startActivity(Intent(this, ModifierActivity::class.java))
    }

    /**
     * Scaffold 脚手架
     */
    fun onScaffold(v: View) {
        startActivity(Intent(this, ScaffoldActivity::class.java))
    }

    /**
     * ConstraintLayout
     */
    fun onConstraintLayout(v: View) {
        startActivity(Intent(this, ConstraintLayoutActivity::class.java))
    }

    /**
     * LazyColumn 竖向列表
     */
    fun onLazyColumn(v: View) {
        startActivity(Intent(this, LazyColumnActivity::class.java))
    }

    /**
     * LazyRow 横向列表
     */
    fun onLazyRow(v: View) {
        startActivity(Intent(this, LazyRowActivity::class.java))
    }

    /**
     * LazyVerticalGrad 网格列表
     */
    fun onLazyVerticalGrid(v: View) {
        startActivity(Intent(this, LazyVerticalGridActivity::class.java))
    }

    /**
     * BottomNavigationView 底部导航栏
     */
    fun onBottomNavigationView(v: View) {
        startActivity(Intent(this, BottomNavigationActivity::class.java))
    }

    /**
     * CustomView
     */
    fun onCustomView(v: View) {
        startActivity(Intent(this, CustomViewActivity::class.java))
    }

    /**
     * 动画
     */
    fun onAnim(v: View) {
        startActivity(Intent(this, AnimActivity::class.java))
    }

    /**
     * Jetpack
     */
    fun onJetpack(v: View) {
        startActivity(Intent(this, JetpackActivity::class.java))
    }

    /**
     * 与旧的Android View搭配使用
     */
    fun onMix(v: View) {
        startActivity(Intent(this, MixActivity::class.java))
    }

}

