package com.example.composedemo.test2.derivedstateof

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.test2.derivedstateof.DerivedStateOfActivity2.Companion.TAG
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * LazyColumn 基础使用
 */
class DerivedStateOfActivity2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestDerivedStateOf2()
                }
            }
        }
    }

    companion object {
        val TAG = DerivedStateOfActivity2::class.java.simpleName
    }
}

@Composable
fun TestDerivedStateOf2() {
    MainLayout2()
}

//@Composable
//fun MainLayout2() {
//    Log.d(TAG, "MainLayout Recomposed")
//    val state = rememberLazyListState()
//    Box {
//        ScrollableList2(state)
//        val shouldShowAddButton = state.firstVisibleItemIndex == 0
//        AddButton(shouldShowAddButton)
//    }
//}

@Composable
fun MainLayout2() {
    Log.d(TAG, "MainLayout Recomposed")
    val state = rememberLazyListState()
    Box {
        ScrollableList2(state)
        val shouldShowAddButton by remember {
            derivedStateOf { state.firstVisibleItemIndex == 0 }
        }
        AddButton(shouldShowAddButton)
    }
}


@Composable
fun ScrollableList2(state: LazyListState) {
    val list = ('A'..'Z').map { it.toString() }
    LazyColumn(state = state) {
        items(list) { letter ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = letter,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentHeight(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun BoxScope.AddButton(isVisible: Boolean) {
    if (isVisible) {
        FloatingActionButton(
            onClick = { /*TODO*/},
            shape = CircleShape,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp)
        ) {
            Icon(Icons.Filled.Add, "Add Button")
        }
    }
}



@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestDerivedStateOf2Preview() {
    TestDerivedStateOf2()
}



