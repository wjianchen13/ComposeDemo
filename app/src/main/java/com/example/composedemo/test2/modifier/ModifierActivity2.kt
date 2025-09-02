package com.example.composedemo.test2.modifier

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 处理用户的输入
 */
class ModifierActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    PointerInputEvent()
                }
            }
        }
    }
}

//@Composable
//fun PointerInputEvent() {
//    Box(modifier = Modifier
//        .requiredSize(200.dp)
//        .background(Color.Blue)
//        .pointerInput(Unit) {
//            awaitPointerEventScope {
//                while (true) {
//                    val event = awaitPointerEvent()
//                    Log.d("PointerInputEvent", "event: ${event.type}")
//                }
//            }
//        }
//    )
//}

@Composable
fun PointerInputEvent() {
    Box(modifier = Modifier
        .requiredSize(200.dp)
        .background(Color.Blue)
        .pointerInput(Unit) {
            detectTapGestures {
                Log.d("PointerInputEvent", "Tap")
            }
            // Never reach
        }
        .pointerInput(Unit) {
            detectDragGestures { change, dragAmount ->
                Log.d("PointerInputEvent", "Dragging")
            }
            // Never reach
        }
    )
}



@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview2() {
    PointerInputEvent()
}
