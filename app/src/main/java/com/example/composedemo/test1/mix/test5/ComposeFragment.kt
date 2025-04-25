package com.example.composedemo.test1.mix.test5

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidViewBinding
import androidx.fragment.app.Fragment
import com.example.composedemo.R
import com.example.composedemo.databinding.ComposeLoginBinding

class ComposeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return ComposeView(requireContext()).apply {
//            setContent {
//                NineTheme {
//                    AndroidViewBindingPage()
//                }
//            }
//        }

        return LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            addView(ComposeView(requireContext()).apply {
                id = R.id.compose_one
                setContent {
                    AndroidViewBindingPage()
                }
            })
            addView(Button(requireContext()).apply {
                id = R.id.compose_btn
                text = "Compose"
            })
            addView(ComposeView(requireContext()).apply {
                id = R.id.compose_two
                setContent {
                    Text("测试Compose")
                }
            })
        }
    }

}

private const val TAG = "AndroidViewBindingPage"

@Composable
fun AndroidViewBindingPage() {
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