package com.example.composedemo.test1.anim.test2

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 多动画同步
 */
class AnimTest2Activity5 : ComponentActivity() {
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

@SuppressLint("UnusedTransitionTargetStateParameter")
@Composable
fun Test5() {

    var boxState: BoxState by remember { mutableStateOf(BoxState.Small) }
    val transition = updateTransition(targetState = boxState, label = "transition")
    val color by transition.animateColor(label = "color") {
        boxState.color
    }
    val size by transition.animateDp(label = "size") {
        boxState.size
    }
    val offset by transition.animateDp(label = "offset") {
        boxState.offset
    }
    val angle by transition.animateFloat(label = "angle") {
        boxState.angle
    }
    Column(Modifier.padding(16.dp).size(360.dp)) {
        Button(
            onClick = { boxState = !boxState }
        ) {
            Text("Transition Test")
        }
        Box(
            Modifier.padding(top = 20.dp)
                .rotate(angle)
                .size(size)
                .offset(x = offset)
                .background(color)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TestPreview5() {
    Test5()
}

private sealed class BoxState(val color: Color, val size: Dp, val offset: Dp, val angle: Float) {
    operator fun not() = if (this is Small) Large else Small

    object Small : BoxState(Blue, 60.dp, 20.dp, 0f)
    object Large : BoxState(Red, 90.dp, 50.dp, 45f)
}
