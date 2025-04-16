package com.example.composedemo.test1.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 使用List itemsIndexed
 */
class LazyColumnActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLazyColumn2()
                }
            }
        }
    }
}

@Composable
fun TestLazyColumn2() {
    val stringList = arrayListOf<String>()
    for (index in 0..10) {
        stringList.add("ind".repeat(index))
    }
    LazyColumn {
        itemsIndexed(stringList) { index, data ->
            Text("Zhujiang:第${index}个数据为$data")
        }
    }

}

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestColumn2Preview() {
    TestLazyColumn2()
}
