package com.example.composedemo.test1.mix.test2

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.widget.CalendarView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composedemo.ui.theme.ComposeDemoTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * 简单控件使用
 */
class MixActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Test1()
                    WebViewPage()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Test1() {
//    val webView = rememberWebViewWithLifecycle()
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("WebView测试") },
//                navigationIcon = {
//                    IconButton(onClick = {
//                        Log.e("WebViewPage", "WebViewPage: 点击返回按钮")
//                    }) {
//                        Icon(Icons.Filled.ArrowBack, "")
//                    }
//                },
//            )
//        },
//        content = {
//            AndroidView(
//                factory = {
//                    webView
//                }, modifier = Modifier.fillMaxSize().background(Color.Red),
//                update = { webView ->
//                    // 设置支持JavaScript
//                    val webSettings = webView.settings
//                    webSettings.javaScriptEnabled = true
//                    webView.loadUrl("https://www.qq.com/")
//                }
//            )
//        }
//    )
}

//@Composable
//fun rememberWebViewWithLifecycle(): WebView {
//    val context = LocalContext.current
//    val webView = remember {
//        WebView(context)
//    }
//    val lifecycleObserver = rememberWebViewLifecycleObserver(webView)
//    val lifecycle = LocalLifecycleOwner.current.lifecycle
//    DisposableEffect(lifecycle) {
//        lifecycle.addObserver(lifecycleObserver)
//        onDispose {
//            lifecycle.removeObserver(lifecycleObserver)
//        }
//    }
//
//    return webView
//}
//
//@Composable
//private fun rememberWebViewLifecycleObserver(webView: WebView): LifecycleEventObserver =
//    remember(webView) {
//        LifecycleEventObserver { _, event ->
//            when (event) {
//                Lifecycle.Event.ON_RESUME -> webView.onResume()
//                Lifecycle.Event.ON_PAUSE -> webView.onPause()
//                Lifecycle.Event.ON_DESTROY -> webView.destroy()
//                else -> Log.e("WebView", event.name)
//            }
//        }
//    }

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
