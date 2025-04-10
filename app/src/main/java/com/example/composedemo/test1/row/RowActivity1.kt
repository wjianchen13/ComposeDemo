package com.example.composedemo.test1.row

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * Row基础例子
 */
class RowActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android", true)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, isShowName: Boolean) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement= Arrangement.Center,
        verticalAlignment= Alignment.CenterVertically)
    {
        Text("1",fontSize = 40.sp)
        Text("2" ,fontSize= 40.sp)
        Text("3" ,fontSize = 40.sp)
    }
}

@Preview(name = "测试", widthDp = 100, heightDp = 200, showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Zhujiang", false)
}
