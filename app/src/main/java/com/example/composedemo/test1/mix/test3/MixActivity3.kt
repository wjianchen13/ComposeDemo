package com.example.composedemo.test1.mix.test3

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.example.composedemo.databinding.ComposeLoginBinding
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 使用xml布局
 */
class MixActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test1()
                }
            }
        }
    }
}

@Composable
fun Test1() {
    AndroidViewBinding(
        factory = { inflate, parent, attachToParent ->
            ComposeLoginBinding.inflate(inflate, parent, attachToParent)
        },
        modifier = Modifier.fillMaxSize(),
        update = {
            btnLogin.setOnClickListener {
                val name = editName.text.toString().trim()
                val password = editPassword.text.toString().trim()
                toLogin(name, password)
            }
        }
    )

}

fun toLogin(name: String, password: String) {
    if (name.isEmpty() || password.isEmpty()) {
        Log.e(TAG, "toLogin: 请输入完整信息")
        return
    }
    Log.e(TAG, "toLogin: 登录信息为：name:${name},password:${password}")
}
@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
