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
class NavigationActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test6()
                }
            }
        }
    }
}

@Composable
fun Test6(
    startDestination: String = "one_page"
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("one_page") {
            OnePage6(navController)
        }
        composable("two_page/{name}/{age}?hobby={hobby}",
            arguments = listOf(
                navArgument("name") {type = NavType.StringType},
                navArgument("age") {type = NavType.IntType},
                navArgument("hobby") {
                    type = NavType.StringType
                    defaultValue = "踢足球"
//                    nullable=true
                }
            )
        ) {
            TwoPage6(
                it.arguments?.getString("name", "") ?: "",
                it.arguments?.getInt("age") ?: 0,
                it.arguments?.getString("hobby", "") ?: ""
            )
        }
    }
}

@Composable
fun OnePage6(navController: NavHostController) {
    BasePage6("One") {
        navController.navigate("two_page/Zhujiang/18?hobby=篮球")
    }
}

@Composable
fun TwoPage6(content: String, age: Int, hobby: String) {
    val context = LocalContext.current
    BasePage6("Two") {
        Toast.makeText(context, "${content}今年${age}岁,爱好:$hobby", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun BasePage6(content: String, onClick: () -> Unit) {
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
fun TestPreview6() {
    Test6()
}
