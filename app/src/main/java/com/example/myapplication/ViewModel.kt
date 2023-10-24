package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

        var click = remember { mutableStateOf(false)}


}