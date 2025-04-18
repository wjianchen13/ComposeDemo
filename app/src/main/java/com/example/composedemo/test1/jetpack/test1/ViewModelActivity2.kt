package com.example.composedemo.test1.jetpack.test1

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 *
 */
class ViewModelActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test2()
                }
            }
        }
    }
}

@Composable
fun Test2() {
    val context = LocalContext.current
    val sp = context.getSharedPreferences("count_file", Context.MODE_PRIVATE)
    val defaultCount = sp.getInt("DEFAULT_COUNT", 0)
    val viewModel: TwoViewModel = viewModel(factory = TwoViewModelFactory(defaultCount))
    val count by viewModel.count.observeAsState(defaultCount)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(count.toString(), modifier = Modifier.padding(10.dp))
        Button(onClick = {
            val counts = count + 2
            viewModel.onCountChanged(counts)
            sp.edit {
                putInt("DEFAULT_COUNT", counts)
            }
        }) {
            Text("Add Count")
        }
        Button(onClick = {
            sp.edit().clear().apply()
            viewModel.onCountChanged(0)
        }, modifier = Modifier.padding(10.dp)) {
            Text("Clear Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview2() {
    Test2()
}
