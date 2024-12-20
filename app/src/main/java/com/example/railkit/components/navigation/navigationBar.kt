package com.example.railkit.components.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigationBar(
    modifier: Modifier,
    navigationViewModel: NavigationViewModel
) {
    val selectedItem by navigationViewModel.selectedItem.collectAsState()

    val items = listOf("Home", "Order", "My")
    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.AccountBox)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.FavoriteBorder, Icons.Outlined.AccountBox)

    NavigationBar (modifier = modifier){  // Use the passed modifier, 用于底部对齐
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index)
                            selectedIcons[index]
                        else
                            unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = {
                    Log.i("Navi", "$index")
                    navigationViewModel.selectItem(index)
                }
            )
        }
    }
}
