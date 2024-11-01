package com.example.railkit.pages

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainPage(string: String) {
    TextField(
        value = string,
        onValueChange = { /* TODO: handle text changes */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    )
}