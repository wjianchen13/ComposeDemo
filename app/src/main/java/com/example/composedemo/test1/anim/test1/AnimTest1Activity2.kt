package com.example.composedemo.test1.anim.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideOut
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 *
 */
class AnimTest1Activity2 : ComponentActivity() {
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
    val visible = remember { mutableStateOf(true) }
    Column(modifier = Modifier.size(360.dp).padding(10.dp)) {
        Button(onClick = { visible.value = !visible.value }) {
            Text("可见行动画")
        }
        AnimatedVisibility(
            visible = visible.value,
            enter = slideIn(initialOffset = { IntOffset(400, 400) }) + expandIn()+ fadeIn(),
            exit = slideOut(targetOffset = { IntOffset(400, 400) }) + shrinkOut()
        ) {
            Text(
                text = "天青色等烟雨，而我在等你，炊烟袅袅升起，隔江千万里", modifier = Modifier.size(150.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview2() {
    Test2()
}
