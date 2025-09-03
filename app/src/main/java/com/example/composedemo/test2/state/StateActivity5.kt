package com.example.composedemo.test2.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

/**
 * 状态提升
 */
class StateActivity5 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CallCounter2()
                }
            }
        }
    }

}

@Composable
fun CallCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    Counter(
        count = count,
        onIncrement = { count++ },
        modifier
    )
}

@Composable
fun CallCounter2(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    var doubleCount by rememberSaveable { mutableStateOf(0) }
    Column {
        Counter(
            count = count,
            onIncrement = { count++ },
            modifier.fillMaxWidth()
        )
        Counter(
            count = doubleCount,
            onIncrement = { doubleCount += 2 },
            modifier.fillMaxWidth()
        )
    }
}


@Composable
fun Counter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$count",
            fontSize = 50.sp
        )
        Button(
            onClick = { onIncrement() }
        ) {
            Text(
                text = "Click me",
                fontSize = 26.sp
            )
        }
    }
}


@Preview(name = "测试", widthDp = 1000, heightDp = 2000, showBackground = true)
@Composable
fun TestAnim1Preview5() {
    CallCounter()
}
