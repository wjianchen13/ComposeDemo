package com.example.composedemo.test2.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 串接顺序有影响
 */
class ModifierActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    IconImage5()
                }
            }
        }
    }
}

@Composable
fun IconImage4() {
    Image(
        painter = painterResource(id = R.drawable.ic_test2),
        contentDescription = "Icon Image",
        modifier = Modifier
            .wrapContentSize()
            .background(Color.Gray)
            .border(5.dp, Color.Magenta, CircleShape)
            .clip(CircleShape)
    )
}

@Composable
fun IconImage5() {
    Image(
        painter = painterResource(id = R.drawable.ic_test2),
        contentDescription = "Icon Image",
        modifier = Modifier
            .wrapContentSize()
            .border(5.dp, Color.Magenta, CircleShape)
            .clip(CircleShape)
            .background(Color.Gray)
    )
}

@Composable
fun IconImage6() {
    Image(
        painter = painterResource(id = R.drawable.ic_test2),
        contentDescription = "Icon Image",
        modifier = Modifier
            .wrapContentSize()
            .background(Color.Gray)
            .border(5.dp, Color.Magenta, CircleShape)
            .padding(18.dp)
            .clip(CircleShape)
    )
}

@Composable
fun IconImage7() {
    Image(
        painter = painterResource(id = R.drawable.ic_test2),
        contentDescription = "Icon Image",
        modifier = Modifier
            .wrapContentSize()
            .background(Color.Gray)
            .padding(18.dp)
            .border(5.dp, Color.Magenta, CircleShape)
            .clip(CircleShape)
    )
}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview4() {
    IconImage6()
}
