package com.example.composedemo.test2.modifier

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme
import kotlin.math.roundToInt

/**
 * 使控件可点击、滚动、拖拽
 */
class ModifierActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    HighLevelCompose()
                }
            }
        }
    }
}

//@Composable
//fun HighLevelCompose() {
//    val context = LocalContext.current
//    Box(modifier = Modifier
//        .requiredSize(200.dp)
//        .background(Color.Blue)
//        .clickable {
//            Toast.makeText(context, "Box is clicked", Toast.LENGTH_SHORT).show()
//        }
//    )
//}

//@Composable
//fun HighLevelCompose() {
//    val context = LocalContext.current
//    Column(modifier = Modifier
//        .requiredSize(200.dp)
//        .background(Color.Blue)
//        .verticalScroll(rememberScrollState())
//    ) {
//        repeat(10) {
//            Text(
//                text = "Item $it",
//                color = Color.White,
//                fontSize = 26.sp
//            )
//        }
//    }
//}

//@Composable
//fun HighLevelCompose() {
//    var offsetX by remember { mutableFloatStateOf(0f) }
//    Box(
//        modifier = Modifier
//            .offset { IntOffset(offsetX.roundToInt(), 0) }
//            .requiredSize(200.dp)
//            .background(Color.Blue)
//            .draggable(
//                orientation = Orientation.Horizontal,
//                state = rememberDraggableState { delta ->
//                    offsetX += delta
//                })
//    )
//}

@Composable
fun HighLevelCompose() {
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }
    Box(
        modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .requiredSize(200.dp)
            .background(Color.Blue)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consume()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            }
    )
}




@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview3() {
    PointerInputEvent()
}
