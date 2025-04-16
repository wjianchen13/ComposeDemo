package com.example.composedemo.test1.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 多Type
 */
class LazyColumnActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLazyColumn4()
                }
            }
        }
    }
}

@Composable
fun TestLazyColumn4() {
    val charList = arrayListOf<Chat>()
    charList.apply {
        add(Chat("你好啊小江"))
        add(Chat("你在干啥呢"))
        add(Chat("想问你个事"))
        add(Chat("没干啥，还在写代码啊！", false))
        add(Chat("啥事啊大哥？", false))
        add(Chat("没事。。。"))
        add(Chat("好吧。。。", false))
    }
    LazyColumn {
        items(charList) { data ->
            if (data.isLeft) {
                Column(modifier = Modifier.padding(end = 15.dp)) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        data.content, modifier = Modifier.fillMaxWidth().height(25.dp)
                            .background(Color.Yellow)
                    )
                }
            } else {
                Column(modifier = Modifier.padding(start = 15.dp)) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        data.content, modifier = Modifier.fillMaxWidth()
                            .background(Color.Green).height(25.dp)
                    )
                }
            }
        }
    }

}

data class Chat(val content: String, val isLeft: Boolean = true)

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestColumn4Preview() {
    TestLazyColumn4()
}
