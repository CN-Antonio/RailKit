package com.example.railkit.pages

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*
import androidx.compose.material3.*
import com.example.railkit.components.TopBar
import com.example.railkit.components.App_Grid
import com.example.railkit.components.SearchTicket


@Composable
fun MainPage(
    string: String,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
        ){
            TopBar("RailKit")
            Card( // 查询车票
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp), // 正确
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = string, //"Train Search",
                    modifier = Modifier.padding(16.dp)
                )
                SearchTicket()
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
