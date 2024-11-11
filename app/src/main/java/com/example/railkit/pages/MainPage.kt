package com.example.railkit.pages

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*
import androidx.compose.material3.*
import androidx.navigation.compose.rememberNavController
import com.example.railkit.components.App_Grid


@Composable
fun MainPage(
    string: String
) {
    val navController = rememberNavController()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 8.dp)
        ){
            Card( // 查询车票
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Train Search",
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card( // Services
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                App_Grid()
            }
            Card( // News
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "News",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
