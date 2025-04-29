package com.example.composedemo.test2.anim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * AnimatedContent
 */
class AnimActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLayout5()
                }
            }
        }
    }
}

@Composable
fun TestLayout5() {
    DynamicTabContent5(modifier = Modifier.wrapContentSize(align = Alignment.TopStart))
}

@Composable
fun DynamicTabContent5(modifier: Modifier = Modifier) {
    var tab by remember { mutableIntStateOf(0) }
    Button(onClick = { tab = (tab + 1) % 3 }, modifier = modifier) {
        Text(text = "Next Tab")
    }
    AnimatedContent(targetState = tab, label = "Tab") { tab ->
        when (tab) {
            0 -> TabZero5(modifier)
            1 -> TabOne5(modifier)
            2 -> TabTwo5(modifier)
        }
    }
}


@Composable
fun TabZero5(modifier: Modifier = Modifier) {
    Text(
        text = "Tab 0",
        fontSize = 36.sp,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun TabOne5(modifier: Modifier = Modifier) {
    Text(
        text = "Tab 1",
        fontSize = 36.sp,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun TabTwo5(modifier: Modifier = Modifier) {
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
fun TestLayout5Preview() {
    TestLayout5()
}
