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
import com.google.gson.Gson

/**
 * 实体类参数
 */
class NavigationActivity7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Test7()
                }
            }
        }
    }
}

@Composable
fun Test7(
    startDestination: String = "one_page"
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("one_page") {
            OnePage7(navController)
        }
        composable("two_page/{name}/{age}?hobby={hobby}/{people}",
            arguments = listOf(
                navArgument("name") {type = NavType.StringType},
                navArgument("age") {type = NavType.IntType},
                navArgument("hobby") {
                    type = NavType.StringType
                    defaultValue = "踢足球"
//                    nullable=true
                },
                navArgument("people") { type = NavType.StringType },
            )
        ) {
            val defaultPeople = it.arguments?.getString("people", "") ?: ""
            val people = Gson().fromJson(defaultPeople, People::class.java)
            TwoPage7(
                it.arguments?.getString("name", "") ?: "",
                it.arguments?.getInt("age") ?: 0,
                it.arguments?.getString("hobby", "") ?: "",
                people
            )
        }
    }
}

@Composable
fun OnePage7(navController: NavHostController) {
    val people = People("两只手", "两只脚")
    val gson = Gson().toJson(people)
    BasePage6("One") {
        navController.navigate("two_page/Zhujiang/18?hobby=篮球/$gson")
    }
}

@Composable
fun TwoPage7(content: String, age: Int, hobby: String, people: People) {
    val context = LocalContext.current
    BasePage6("Two") {
        Toast.makeText(context, "${content}今年${age}岁,爱好:$hobby, $people", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun BasePage7(content: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(content, fontSize = 35.sp, modifier = Modifier.clickable { onClick() })
    }
}

data class People(val hand: String, val foot: String)

@Preview(showBackground = true)
@Composable
fun TestPreview7() {
    Test7()
}
