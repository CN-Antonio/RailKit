package com.example.railkit.pages

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*


@Composable
fun MainPage(string: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))  // Light gray background
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 8.dp)
        ){
            Card( // 查询车票
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFFFFF)),
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
                // Functions: n×5 layout
                // max 3×5 with page scroll
                Text(
                    text = "Functions",
                    modifier = Modifier.padding(16.dp)
                )
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
//定位，显示最近车站，点击跳转车站相关选项