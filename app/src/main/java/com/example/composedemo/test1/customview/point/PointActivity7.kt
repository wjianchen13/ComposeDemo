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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 简单使用
 */
class PointActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    Test7()
                }
            }
        }
    }
}

@Composable
fun Test7() {
    val points = arrayListOf(
        Offset(100f, 100f),
        Offset(300f, 300f),
        Offset(500f, 500f),
        Offset(700f, 700f),
        Offset(900f, 900f),
    )

    Canvas(modifier = Modifier.size(360.dp)) {
        drawPoints(
            points = points,
            pointMode = PointMode.Polygon,
            brush = Brush.linearGradient(
                0.0f to Color.Red,
                0.3f to Color.Green,
                0.6f to Color.Yellow,
                1.0f to Color.Blue,
            ),
            strokeWidth = 30f
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview7() {
    Test7()
}


//@Composable
//fun Test7() {
//    val points = arrayListOf(
//        Offset(100f, 100f),
//        Offset(300f, 300f),
//        Offset(500f, 500f),
//        Offset(700f, 700f),
//        Offset(900f, 900f),
//    )
//
//    val points3 = arrayListOf(
//        Offset(0f, 100f),
//        Offset(700f, 300f),
//        Offset(500f, 500f),
//        Offset(700f, 600f),
//        Offset(900f, 200f),
//    )
//
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            brush = Brush.linearGradient(
//                0.0f to Color.Red,
//                0.3f to Color.Green,
//                0.6f to Color.Yellow,
//                1.0f to Color.Blue,
//            ),
//            strokeWidth = 30f
//        )
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DrawPointTestPreview1() {
//    Test7()
//}
