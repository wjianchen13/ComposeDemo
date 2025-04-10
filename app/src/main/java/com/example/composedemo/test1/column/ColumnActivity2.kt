package com.example.composedemo.test1.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * SpaceEvenly SpaceAround SpaceBetween 测试
 * SpaceEvenly 控件和屏幕的距离一样
 * SpaceAround 控件和上下距离3等分
 * SpaceBetween 上下两个控件靠边，距离平均分
 */
class ColumnActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestColumn2()
                }
            }
        }
    }
}

@Composable
fun TestColumn2() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Green),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start,
    ) {
        DefaultText("1")
        DefaultText("2")
        DefaultText("3")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        DefaultText("4")
        DefaultText("5")
        DefaultText("6")
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.End,
    ) {
        DefaultText("7")
        DefaultText("8")
        DefaultText("9")
    }

}

@Composable
fun DefaultText(text: String) {
    Text(
        text,
        modifier = Modifier.size(100.dp)
            .background(Color.Red),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestColumn2Preview() {
    TestColumn2()
}
