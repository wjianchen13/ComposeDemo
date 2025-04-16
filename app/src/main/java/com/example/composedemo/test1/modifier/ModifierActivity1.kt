package com.example.composedemo.test1.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * Column基础例子
 */
class ModifierActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestModifier1()
                }
            }
        }
    }
}

@Composable
fun TestModifier1() {
//    Text("Zhujiang", modifier = Modifier.padding(55.dp).background(Color.Blue))
//    Text("Zhujiang", modifier = Modifier.fillMaxSize())// 宽高都充满父布局
//    Text("Zhujiang", modifier = Modifier.fillMaxWidth())// 只充满宽
//    Text("Zhujiang", modifier = Modifier.fillMaxHeight())// 只充满高
//    Text("Zhujiang", modifier = Modifier.size(100.dp))// 宽高都为100dp
//    Text("Zhujiang", modifier = Modifier.size(width = 100.dp, height = 110.dp))// 宽为100dp,高为110dp

//    Box(modifier = Modifier.fillMaxSize()) {
//        Spacer(Modifier.matchParentSize().background(Color.Red))
//        Text("Zhujiang",fontSize = 30.sp)
//    }

    Row(Modifier.fillMaxSize().padding(top = 10.dp)) {
        Box(Modifier.weight(2f).height(50.dp).background(Color.Blue))
        Box(Modifier.weight(1f).height(50.dp).background(Color.Red))
    }

//    Box(modifier = Modifier.size(50.dp).background(Color.Green).clickable {
//
//    }) {
//
//    }

}

@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestColumn1Preview() {
    TestModifier1()
}
