package com.example.composedemo.test1.customview.oval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 简单使用
 */
class OvalActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test2()
                }
            }
        }
    }
}

@Composable
fun Test2() {
    val topLeft = Offset(100f, 100f)
    val ovalSize = Size(600f, 800f)

    Canvas(modifier = Modifier.size(360.dp)) {
        drawRect(
            color = Color.Blue,
            topLeft = topLeft,
            size = ovalSize
        )
        drawOval(
            color = Color.Red,
            topLeft = topLeft,
            size = ovalSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview2() {
    Test2()
}
