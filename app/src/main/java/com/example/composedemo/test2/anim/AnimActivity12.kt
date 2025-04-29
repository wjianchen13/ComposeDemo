package com.example.composedemo.test2.anim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme
import kotlin.reflect.KProperty

/**
 * enter和exit动画
 */
class AnimActivity12 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLayout12()
                }
            }
        }
    }
}

@Composable
fun TestLayout12() {
    DynamicTabContent12(modifier = Modifier.wrapContentSize(align = Alignment.TopStart))
}

@Composable
fun DynamicTabContent12(modifier: Modifier = Modifier) {
    var tab by remember { mutableIntStateOf(0) }
    Button(onClick = { tab = (tab + 1) % 3 }, modifier = modifier) {
        Text(text = "Next Tab")
    }
    AnimatedContent(targetState = tab, transitionSpec = {
        (slideInHorizontally())
            .togetherWith(slideOutHorizontally())
    }, label = "Tab") { tab ->
        when (tab) {
            0 -> TabZero12(modifier)
            1 -> TabOne12(modifier)
            2 -> TabTwo12(modifier)
        }
    }
}

@Composable
fun TabZero12(modifier: Modifier = Modifier) {
    Text(
        text = "Tab 0",
        fontSize = 36.sp,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun TabOne12(modifier: Modifier = Modifier) {
    Text(
        text = "Tab 1",
        fontSize = 36.sp,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun TabTwo12(modifier: Modifier = Modifier) {
    Text(
        text = "Tab 2",
        fontSize = 36.sp,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}


@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestLayout12Preview() {
    TestLayout12()
}
