package com.example.railkit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

// Functions: n×5 layout
// max 3×5 with page scroll
@Composable
fun App_Grid() {
    val items = (1..15).toList()  // Create a list of 15 items
    val rows = (items.size + 2) / 5  // Calculate the number of rows

    LazyColumn(
        modifier = Modifier.padding(16.dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        // Loop through the number of rows
        for (rowIndex in 0 until rows) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Create 3 items per row
                    for (columnIndex in 0 until 5) {
                        val itemIndex = rowIndex * 5 + columnIndex
                        if (itemIndex < items.size) {  // Check if the index is within bounds
                            RailServiceItem(
                                icon = Icons.Default.Home,  // Replace with your icon
                                title = "Item ${items[itemIndex]}"  // Replace with actual titles
                            )
                        } else {
                            Spacer(modifier = Modifier.weight(1f))  // Empty space for missing items
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RailServiceItem(icon: ImageVector, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
//            .weight(1f)  // Allow items to take equal space
            .padding(8.dp)
    ) {
        IconButton(onClick = { /* Handle click */ }) {
            Icon(imageVector = icon, contentDescription = title)
        }
        Text(text = title, modifier = Modifier.padding(top = 4.dp))
    }
}