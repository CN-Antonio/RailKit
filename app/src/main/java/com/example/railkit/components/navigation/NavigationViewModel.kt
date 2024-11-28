package com.example.railkit.components.navigation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class NavigationViewModel : ViewModel() {

    /* Default Page Index */
    private val _selectedItem = MutableStateFlow(0) // 可观察状态的
    val selectedItem: StateFlow<Int>  = _selectedItem.asStateFlow() //.asStateFlow()转换为只读状态


    init {
        viewModelScope.launch {
            selectedItem.collect { item->
                _selectedItem.value = item
                Log.i("NavigationViewModel", "item: $item")
            }
        }

    }

//    fun getSelectedItem():Int = selectedItem.value

    fun selectItem(index: Int){
        _selectedItem.value = index
    }
}
