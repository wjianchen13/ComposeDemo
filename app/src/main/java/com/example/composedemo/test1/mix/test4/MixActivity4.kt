package com.example.composedemo.test1.mix.test4

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.example.composedemo.databinding.ComposeLoginBinding
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * View使用Compose
 */
class MixActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    Test1()
                }
            }
        }
    }
}

@Composable
fun Test1() {
    Text(
        "第9章",
        modifier = Modifier.fillMaxWidth(),
        fontSize = 50.sp,
        textAlign = TextAlign.Center
    )

}

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
