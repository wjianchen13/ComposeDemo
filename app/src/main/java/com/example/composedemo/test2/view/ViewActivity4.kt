package com.example.composedemo.test2.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * Image
 */
class ViewActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SimpleWidgetColumn4()
                }
            }
        }
    }
}

@Composable
fun SimpleWidgetColumn4() {
    Column {

        Image(
            painter = painterResource(id = R.drawable.ic_footer),
            contentDescription = "A dog image"
        )

        val bitmap: ImageBitmap = ImageBitmap.imageResource(id = R.drawable.ic_footer)
        Image(
            bitmap = bitmap,
            contentDescription = "A dog image"
        )

        AsyncImage(
            model = "https://img-blog.csdnimg.cn/20200401094829557.jpg",
            contentDescription = "First line of code"
        )

    }
}



@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview4() {
    SimpleWidgetColumn4()
}
