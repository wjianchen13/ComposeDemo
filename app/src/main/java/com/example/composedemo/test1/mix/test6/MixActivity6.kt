package com.example.composedemo.test1.mix.test6

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.databinding.ActivityMix6Binding

/**
 * 在布局中使用Compose
 */
class MixActivity6 : ComponentActivity() {

    private lateinit var  activityMix6Binding: ActivityMix6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMix6Binding = ActivityMix6Binding.inflate(layoutInflater)
        setContentView(activityMix6Binding.root)
        initView()
    }

    private fun initView() {
        activityMix6Binding.apply {
            composeView.setContent {
                Button(onClick = {
                    Toast.makeText(this@MixActivity6,mainEditName.text.toString(), Toast.LENGTH_LONG).show()
                }){
                    Text("ComposeView")
                }
            }
        }
    }
}

@Composable
fun Test1() {

}

@Preview(showBackground = true)
@Composable
fun TestPreview1() {
    Test1()
}
