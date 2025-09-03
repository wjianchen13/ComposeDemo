package com.example.composedemo.test2.modifier

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.composedemo.R

/**
 * Compose Modifier
 */
class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2_modifier)
    }

    /**
     * 修改尺寸、布局、行为和样式
     */
    fun onTest1(v: View) {
        startActivity(Intent(this, ModifierActivity1::class.java))
    }

    /**
     * 处理用户的输入
     */
    fun onTest2(v: View) {
        startActivity(Intent(this, ModifierActivity2::class.java))
    }

    /**
     * 使控件可点击、滚动、拖拽
     */
    fun onTest3(v: View) {
        startActivity(Intent(this, ModifierActivity3::class.java))
    }

    /**
     * 串接顺序有影响
     */
    fun onTest4(v: View) {
        startActivity(Intent(this, ModifierActivity4::class.java))
    }

    /**
     * 为Composable函数增加Modifier参数
     */
    fun onTest5(v: View) {
        startActivity(Intent(this, ModifierActivity5::class.java))
    }

}

