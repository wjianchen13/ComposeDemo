package com.example.composedemo.test2.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * Column
 */
class ViewActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SimpleWidgetColumn6()
                }
            }
        }
    }
}

@Composable
fun SimpleWidgetColumn6() {
    Column(modifier = Modifier.background(Color.Red)
        .fillMaxSize(),
//        verticalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .align(Alignment.End)
                .background(Color.Green) // 设置背景颜色
                .padding(16.dp) // 可选：添加内边距
                .wrapContentSize() // 可选：使Box宽度充满父容器
        ) {
            Text(
                text = "This is Text1",
                color = Color.Blue,
                fontSize = 26.sp
            )
        }

        Box(
            modifier = Modifier
                .background(Color.Green) // 设置背景颜色
                .padding(16.dp) // 可选：添加内边距
                .wrapContentSize() // 可选：使Box宽度充满父容器
        ) {
            Text(
                text = "This is Text2",
                color = Color.Blue,
                fontSize = 26.sp
            )
        }

        Box(
            modifier = Modifier
                .background(Color.Green) // 设置背景颜色
                .padding(16.dp) // 可选：添加内边距
                .wrapContentSize() // 可选：使Box宽度充满父容器
        ) {
            Text(
                text = "This is Text3",
                color = Color.Blue,
                fontSize = 26.sp
            )
        }
    }
}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview6() {
    SimpleWidgetColumn6()
}
