package com.example.viewmodel_jetpack

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel(
    val helloWorld: String
): ViewModel() {
    /**
     * we are make this "private set" bcz
     * we don't want to make this accessable from UI
     * this is accessable only within this VM
     */
    var backgroundColor by mutableStateOf(Color.Red)
        private set

    fun changeBackGroundColor() {
        backgroundColor = Color.Blue
    }
}