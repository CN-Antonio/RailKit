package com.example.railkit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.Button

@Composable
fun SearchTicket() {
    // Create state for the text fields
    val firstInputState = remember { mutableStateOf("北京") }
    val secondInputState = remember { mutableStateOf("香港西九龙") }
    val trainNumber = remember { mutableStateOf("G79") }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row {
            // TextField for the first input
            TextField(
                value = firstInputState.value,
                onValueChange = { firstInputState.value = it }, // Update state on value change
//                label = { Text("First Input") }
            )

            // TextField for the second input
            TextField(
                value = secondInputState.value,
                onValueChange = { secondInputState.value = it }, // Update state on value change
//                label = { Text("Second Input") }
            )
        }

        TextField(
            value = trainNumber.value,
            onValueChange = { trainNumber.value = it }, // Update state on value change
        )

        // Button to submit the inputs
        Button(onClick = { /* Handle button click */ }) {
            Text("查询车票")
        }
    }
}