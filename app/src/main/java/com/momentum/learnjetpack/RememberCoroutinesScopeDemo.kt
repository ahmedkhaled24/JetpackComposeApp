package com.momentum.learnjetpack

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutinesScopeDemo(){
    val scope = rememberCoroutineScope()


    Button(onClick = {
        scope.launch {
            delay(1000L)
            println("Hello World!")
        }
    }) {

    }
}