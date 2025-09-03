package com.example.composedemo.test2.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 结合ViewModel一起使用
 */
class StateActivity6 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CallCounter6()
                }
            }
        }
    }
}

@Composable
fun CallCounter6(modifier: Modifier = Modifier, viewModel: MainViewModel6 = viewModel()) {
    val count by viewModel.count.observeAsState(0)
    val doubleCount by viewModel.doubleCount.observeAsState(0)
    Column {
        Counter(
            count = count,
            onIncrement = { viewModel.incrementCount() },
            modifier.fillMaxWidth()
        )
        Counter(
            count = doubleCount,
            onIncrement = { viewModel.incrementDoubleCount() },
            modifier.fillMaxWidth()
        )
    }
}



@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview6() {
    CallCounter()
}
