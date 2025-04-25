package com.example.composedemo.test1.mix.test7

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.databinding.ActivityMix6Binding
import com.example.composedemo.databinding.ActivityShareWidgetBinding

/**
 * 创建Android View和Compose中通用的控件
 */
class MixActivity7 : ComponentActivity() {

    private lateinit var  shareWidgetBinding: ActivityShareWidgetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shareWidgetBinding = ActivityShareWidgetBinding.inflate(layoutInflater)
        setContentView(shareWidgetBinding.root)
        initView()
    }

    private fun initView() {
        shareWidgetBinding.apply {
            shareComposeView.setContent {
                WebViewPage()
            }
        }
    }
}

@Composable
fun Test1() {

}

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
