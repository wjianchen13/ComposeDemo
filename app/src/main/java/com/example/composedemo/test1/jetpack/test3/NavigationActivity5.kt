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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ui.theme.ComposeDemoTheme

/**
 * 解析参数类型
 */
class NavigationActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test5()
                }
            }
        }
    }
}

@Composable
fun Test5(
    startDestination: String = "one_page"
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("one_page") {
            OnePage5(navController)
        }
        composable("two_page/{name}/{age}",
            arguments = listOf(
                navArgument("name") {type = NavType.StringType},
                navArgument("age") {type = NavType.IntType}
            )
        ) {
            TwoPage5(
                it.arguments?.getString("name", "") ?: "",
                it.arguments?.getInt("age") ?: 0
            )
        }
    }
}

@Composable
fun OnePage5(navController: NavHostController) {
    BasePage5("One") {
        navController.navigate("two_page/Zhujiang/18")
    }
}

@Composable
fun TwoPage5(content: String, age: Int) {
    val context = LocalContext.current
    BasePage5("Two") {
        Toast.makeText(context, "${content}今年${age}", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun BasePage5(content: String, onClick: () -> Unit) {
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
fun TestPreview5() {
    Test5()
}
