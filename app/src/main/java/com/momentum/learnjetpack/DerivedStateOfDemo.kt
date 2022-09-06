package com.momentum.learnjetpack

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun DerivedStateOfDemo(){
    var counter by remember {
        mutableStateOf(0)
    }
    
    val counterText = "The counter is $counter"
    Button(onClick = { counter++ }) {
        Text(text = counterText)
        
    }
}