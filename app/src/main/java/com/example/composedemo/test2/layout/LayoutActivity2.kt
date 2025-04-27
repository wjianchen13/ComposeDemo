package com.example.composedemo.test2.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 高级Layout
 */
class LayoutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLayout2()
                }
            }
        }
    }
}

@Composable
fun TestLayout2() {

    SimpleTextRow(modifier = Modifier.wrapContentSize(align = Alignment.TopStart))
}

@Composable
fun SimpleTextRow(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxWidth().height(IntrinsicSize.Max)) {
        Text(
            text = "Text 1\nText 1\nText 1\nText 1\nText 1\nText 1",
            color = Color.Blue,
            fontSize = 30.sp, modifier = modifier.align(Alignment.TopStart)
        )

        Divider(
            modifier = modifier
                .width(8.dp)
                .fillMaxHeight()
                .align(Alignment.TopCenter),
            color = Color.Green
        )

        Text(
            text = "Text 2\nText 2\nText 2\nText 2\nText 2\nText 2",
            color = Color.Red,
            fontSize = 30.sp, modifier = modifier.align(Alignment.TopEnd)
        )
    }
}


@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestLayout2Preview() {
    TestLayout2()
}
