package com.example.railkit.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigationBar(
    modifier: Modifier
) {
//    val items = listOf(
//        NavigationItem("Home", Icons.Filled.Home),
//        NavigationItem("Search", Icons.Filled.Search),
//        NavigationItem("Favorites", Icons.Filled.Favorite),
//        NavigationItem("Profile", Icons.Filled.Person),
//        NavigationItem("Settings", Icons.Filled.Settings)
//    )

    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Order", "My")
    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Star)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.FavoriteBorder, Icons.Outlined.AccountBox)

    NavigationBar (modifier = modifier){  // Use the passed modifier, 用于底部对齐
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}

