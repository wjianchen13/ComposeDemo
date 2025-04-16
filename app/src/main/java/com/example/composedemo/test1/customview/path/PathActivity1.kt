package com.example.composedemo.test1.customview.path

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
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 绘制路径
 */
class PathActivity1 : ComponentActivity() {
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
    val path = Path()
    //path.addRect(Rect(100f, 200f, 500f, 890f))
    path.moveTo(100f, 300f)
    path.lineTo(100f, 700f)
    path.lineTo(800f, 700f)
    path.lineTo(900f, 300f)
    path.lineTo(600f, 100f)
    path.close()
    Canvas(modifier = Modifier.size(360.dp)) {
        drawPath(
            path = path, color = Color.Red,
            style = Stroke(width = 10f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
