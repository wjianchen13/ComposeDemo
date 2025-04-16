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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 复杂粘性标题
 */
class LazyColumnActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestLazyColumn6()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TestLazyColumn6() {
    val letters = arrayListOf("A", "B", "C", "D", "E")
    val contactList = arrayListOf<Contact>()
    val nameList = arrayListOf<String>()
    for (index in 0..5) {
        nameList.add("路人$index")
    }
    for (index in letters.iterator()) {
        contactList.add(Contact(letters = index, nameList))
    }

    LazyColumn {
        contactList.forEach { (letter, nameList) ->
            stickyHeader {
                Text(
                    letter,
                    modifier = Modifier.padding(10.dp).background(Color.Green)
                        .fillMaxWidth(), textAlign = TextAlign.Center,
                    fontSize = 35.sp
                )
            }

            items(nameList) { contact ->
                Text(
                    contact,
                    modifier = Modifier.padding(10.dp).background(Color.Red).height(50.dp)
                        .fillMaxWidth(), textAlign = TextAlign.Center,
                    fontSize = 35.sp
                )
            }
        }
    }

}

data class Contact(val letters: String, val nameList: List<String>)

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestColumn6Preview() {
    TestLazyColumn6()
}
