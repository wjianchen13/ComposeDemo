package com.example.composedemo.test1.anim.test1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 布局切换动画
 */
class AnimTest1Activity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test4()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Test4() {
    val tabs = ZhuTabs.values()
    var position by remember { mutableStateOf(ZhuTabs.ONE) }
    Scaffold(
        modifier = Modifier.background(Color.Yellow),
        bottomBar = {
            BottomAppBar(modifier = Modifier.background(Color.Green), contentColor = Color.Blue) {
                tabs.forEach { tab ->
                    NavigationBarItem(
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary),
                        icon = { Icon(painterResource(tab.icon), contentDescription = null) },
                        label = { Text(tab.title) },
                        selected = tab == position,
                        onClick = {
                            position = tab
                            Log.e("ZHUJIANG", "BottomNavigationTest: ${tab.title}")
                        },
                        alwaysShowLabel = true,
                        colors = NavigationBarItemDefaults.colors( // 颜色配置
                            selectedIconColor = Color(0xff149ee7),
                            selectedTextColor = Color(0xff149ee7),
                            unselectedIconColor = Color(0xff999999),
                            unselectedTextColor = Color(0xff999999)
                        )

                    )
                }
            }
        }
    ) {
//        when (position) {
//            ZhuTabs.ONE -> One()
//            ZhuTabs.TWO -> Two()
//            ZhuTabs.THREE -> Three()
//            ZhuTabs.FOUR -> Four()
//        }

        Crossfade(targetState = position, label = "") { screen ->
            when (screen) {
                ZhuTabs.ONE -> One()
                ZhuTabs.TWO -> Two()
                ZhuTabs.THREE -> Three()
                ZhuTabs.FOUR -> Four()
            }
        }
    }

}

enum class ZhuTabs(
    val title: String,
    @DrawableRes val icon: Int
) {
    ONE("One", R.drawable.ic_nav_news_normal),
    TWO("Two", R.drawable.ic_nav_tweet_normal),
    THREE("Three", R.drawable.ic_nav_discover_normal),
    FOUR("Fore", R.drawable.ic_nav_my_normal)
}


@Composable
fun One() {
    BaseDefault("One")
}

@Composable
fun Two() {
    BaseDefault("Two")
}

@Composable
fun Three() {
    BaseDefault("Three")
}

@Composable
fun Four() {
    BaseDefault("Four")
}

@Composable
fun BaseDefault(content: String) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(content, fontSize = 50.sp)
    }
}

@Preview(name = "测试", widthDp = 500, heightDp = 1000, showBackground = true)
@Composable
fun TestPreview4() {
    Test4()
}
