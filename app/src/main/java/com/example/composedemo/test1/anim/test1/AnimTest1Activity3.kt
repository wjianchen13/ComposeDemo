package com.example.composedemo.test1.anim.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideOut
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 布局大小动画
 */
class AnimTest1Activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test3()
                }
            }
        }
    }
}

@Composable
fun Test3() {
    val expend = remember { mutableStateOf(false) }
    Column(modifier = Modifier.size(360.dp).padding(10.dp)) {
        Text(
            text = "朋友圈一般指的是腾讯微信上的一个社交功能，于微信4.0版本2012年4月19日更新时上线 [1]  ，" +
                    "用户可以通过朋友圈发表文字和图片，同时可通过其他软件将文章或者音乐分享到朋友圈。" +
                    "用户可以对好友新发的照片进行“评论”或“赞”，其他用户只能看相同好友的评论或赞。",
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .animateContentSize(),
            maxLines = if (expend.value) Int.MAX_VALUE else 2
        )
        Text(if (expend.value) "收起" else "全文", color = Color.Blue, modifier = Modifier.clickable {
            expend.value = !expend.value
        })

    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview3() {
    Test3()
}
