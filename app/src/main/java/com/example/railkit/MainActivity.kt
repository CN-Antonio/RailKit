package com.example.railkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

import com.example.railkit.components.navigation.BottomNavigationBar
import com.example.railkit.components.navigation.NavigationViewModel
import com.example.railkit.pages.MainPage
import com.example.railkit.pages.Page2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // CRTheme{// 12306 Blue}
            MaterialTheme { MainScreen() }
        }
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}

@Composable
fun MainScreen() {

    val navigationViewModel: NavigationViewModel = viewModel()
    val selectedItem by navigationViewModel.selectedItem.collectAsState()

    val navController = rememberNavController()

    Box(modifier = Modifier
        .fillMaxSize() // MainPage的Box占满整屏
        .background(Color(0xFFF5F5F5))
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()  // 避开状态栏
        ){
            NavHost(navController, startDestination = "home"){
                composable("home") {
                    MainPage(
                    "MainPage: $selectedItem",
                    modifier = Modifier)
                }
                composable("order") {
                    Page2()
                }
            }
            when (selectedItem){
                0 -> {navController.navigate("home")}
                1 -> {navController.navigate("order")}
//                2 ->
            }
        }
        BottomNavigationBar(
            modifier = Modifier
                .align(BottomCenter)
                .fillMaxWidth(),
            navigationViewModel = navigationViewModel
        )
    }
}