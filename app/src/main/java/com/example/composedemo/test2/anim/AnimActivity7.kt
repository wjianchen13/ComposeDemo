package com.example.composedemo.test2.anim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 例子
 */
class AnimActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLayout7()
                }
            }
        }
    }
}

@Composable
fun TestLayout7() {
    AnimationProgressBar7(modifier = Modifier.wrapContentSize(align = Alignment.TopStart))
}

@Composable
fun AnimationProgressBar7(modifier: Modifier = Modifier) {
    var progress by remember { mutableFloatStateOf(0f) }
    val animationProgress by animateFloatAsState(targetValue = progress, label = "progress")
    Column(modifier = modifier) {
        Button(onClick = { progress += 0.2f }) {
            Text(text = "Next Progress")
        }
        LinearProgressIndicator(progress = animationProgress)
    }
}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestLayout7Preview() {
    TestLayout7()
}
