package com.example.composedemo.test1.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme
import kotlinx.coroutines.launch

/**
 * 回到顶部
 */
class LazyColumnActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeDemoTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLazyColumn7()
//                }
//            }
        }
    }
}

@Composable
fun TestLazyColumn7() {
    val dataList = arrayListOf<Int>()
    for (index in 0..100) {
        dataList.add(index)
    }

    val listState = rememberLazyListState()
    LazyColumn(state = listState) {
        items(dataList) { data ->
            Text("Zhujiang:$data")
        }
    }

    val coroutineScope = rememberCoroutineScope()

    Button(modifier = Modifier.size(60.dp),
        onClick = {
            coroutineScope.launch {
                // Animate scroll to the first item
                listState.animateScrollToItem(index = 0)
            }
        }
    ){
        Text("Top")
    }

}

@Preview(name = "测试", widthDp = 200, heightDp = 400, showBackground = true)
@Composable
fun TestColumn7Preview() {
    TestLazyColumn7()
}
