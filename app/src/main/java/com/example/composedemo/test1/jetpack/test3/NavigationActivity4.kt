package com.example.composedemo.test1.jetpack.test3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 传递多个参数
 */
class NavigationActivity4 : ComponentActivity() {
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

@Composable
fun Test4(
    startDestination: String = "one_page"
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("one_page") {
            OnePage4(navController)
        }
        composable("two_page/{name}/{age}") {
            TwoPage4(
                it.arguments?.getString("name", "") ?: "",
                it.arguments?.getString("age", "") ?: ""
            )
        }
    }
}

@Composable
fun OnePage4(navController: NavHostController) {
    BasePage4("One") {
        navController.navigate("two_page/Zhujiang/18")
    }
}

@Composable
fun TwoPage4(content: String, age: String) {
    val context = LocalContext.current
    BasePage4("Two") {
        Toast.makeText(context, "${content}今年${age}", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun BasePage4(content: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(content, fontSize = 35.sp, modifier = Modifier.clickable { onClick() })
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview4() {
    Test4()
}
