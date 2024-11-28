package com.example.railkit.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Page2(){
    Card(modifier = Modifier.fillMaxSize()) {
        Box (modifier = Modifier){
            Text("Page2")
        }
    }
}