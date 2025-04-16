package com.example.composedemo.test1.lazyverticalgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * LazyVerticalGrid 设置列数
 */
class LazyVerticalGridActivity3 : ComponentActivity() {
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
    val photos = arrayListOf<Int>()
    for (index in 0..20) {
        photos.add(R.drawable.ic_launcher_background)
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(count = 3)
    ) {
        items(photos.toArray()) { photo ->
            Image(painter = painterResource(photo as Int), "", modifier = Modifier.padding(2.dp))
        }
    }


}

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestPreview2() {
    Test2()
}
