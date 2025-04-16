package com.example.composedemo.test1.customview.point

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
class PointActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test5()
                }
            }
        }
    }
}

@Composable
fun Test5() {
    val points = arrayListOf(
        Offset(100f, 100f),
        Offset(300f, 300f),
        Offset(500f, 500f),
        Offset(700f, 700f),
        Offset(900f, 900f),
    )

    val points2 = arrayListOf(
        Offset(900f, 100f),
        Offset(700f, 300f),
        Offset(500f, 500f),
        Offset(300f, 700f),
        Offset(100f, 900f),
    )

    Canvas(modifier = Modifier.size(360.dp)) {
        drawPoints(
            points = points,
            pointMode = PointMode.Polygon,
            color = Color.Blue,
            strokeWidth = 130f,
            cap = StrokeCap.Butt
        )
        drawPoints(
            points = points2,
            pointMode = PointMode.Polygon,
            color = Color.Blue,
            strokeWidth = 130f,
            cap = StrokeCap.Square
        )
    }
}

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestPreview5() {
    Test5()
}
