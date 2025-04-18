package com.example.composedemo.test1.anim.test4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 滑动事件
 */
class AnimTest4Activity5 : ComponentActivity() {
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

/**
 * 编译不通过，不知道怎么回事
 */
@Composable
fun Test5() {
//    val squareSize = 48.dp
//
//    val swipeableState = rememberSwipeableState(0)
//    val sizePx = with(LocalDensity.current) { squareSize.toPx() }
//    val anchors = mapOf(0f to 0, sizePx to 1) // Maps anchor points (in px) to states
//
//    Box(
//        modifier = Modifier
//            .width(96.dp)
//            .height(squareSize)
//            .swipeable(
//                state = swipeableState,
//                anchors = anchors,
//                thresholds = { from, to -> FractionalThreshold(0.3f) },
//                orientation = Orientation.Horizontal
//            )
//            .background(Color.Red)
//    ) {
//        Box(
//            Modifier
//                .offset { IntOffset(swipeableState.offset.value.roundToInt(), 0) }
//                .size(squareSize)
//                .background(Color.DarkGray)
//        )
//    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview5() {
    Test5()
}
