package com.example.railkit.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
) {
    var showMenu by remember { mutableStateOf(false) }
    var currentOpt by remember { mutableStateOf("Menu") }
    val options = listOf("Item1","Item2","Item3")

    TopAppBar(
        title = { Text(title) },
        modifier = Modifier.fillMaxWidth(),
        actions = {
            // Menu Button
            IconButton(onClick = { showMenu = true }) {
                /*Debug*/Text(currentOpt)
                Icon(Icons.Filled.MoreVert, contentDescription = "Options")
            }


            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false }
            ){
                options.forEach{ option ->
                    DropdownMenuItem(
                        text = {Text(text = option)},
                        onClick = {
                            /*Debug*/currentOpt = option
                            showMenu = false
                    })
                }
            }
        }
    )
}