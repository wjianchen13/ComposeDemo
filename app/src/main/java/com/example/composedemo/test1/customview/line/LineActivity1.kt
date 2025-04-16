package com.example.composedemo.test1.customview.line

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 简单使用
 */
class LineActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test1()
                }
            }
        }
    }
}

@Composable
fun Test1() {
    val start = Offset(100f, 100f)
    val end = Offset(900f, 900f)

    Canvas(modifier = Modifier.size(360.dp)) {
        drawLine(
            color = Color.Red,
            start = start,
            end = end,
            strokeWidth = 30f,
            cap = StrokeCap.Round,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
