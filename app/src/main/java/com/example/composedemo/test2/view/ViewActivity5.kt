package com.example.composedemo.test2.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * ProgressIndicator
 * 需要升级
 * implementation("androidx.compose.material3:material3:1.2.0-rc01")
 * 否则会报错：
 * https://blog.csdn.net/Jocerly/article/details/135937186
 */
class ViewActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SimpleWidgetColumn5()
                }
            }
        }
    }
}

@Composable
fun SimpleWidgetColumn5() {
    Column {

        CircularProgressIndicator(
            color = Color.Green,
            strokeWidth = 6.dp)

        LinearProgressIndicator(
            color = Color.Blue,
            trackColor = Color.Gray
        )

    }
}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview5() {
    SimpleWidgetColumn5()
}
