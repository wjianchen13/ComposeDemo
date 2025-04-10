package com.example.composedemo.test1.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
 * Box基础例子
 */
class BoxActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row {
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier.size(100.dp).background(Color.Gray),
            ) {
                Text("1", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("2", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.size(100.dp).background(Color.Cyan),
            ) {
                Text("3", fontSize = 20.sp)
            }
        }
        Row {
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.size(100.dp).background(Color.DarkGray),
            ) {
                Text("4", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(100.dp).background(Color.Green),
            ) {
                Text("5", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.size(100.dp).background(Color.Red),
            ) {
                Text("6", fontSize = 20.sp)
            }
        }

        Row {
            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("7", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier.size(100.dp).background(Color.Yellow),
            ) {
                Text("8", fontSize = 20.sp)
            }
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.size(100.dp).background(Color.Magenta),
            ) {
                Text("9", fontSize = 20.sp)
            }
        }

    }
}

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}
