package com.momentum.learnjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.momentum.learnjetpack.ui.theme.LearnJetpackTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //--lesson 6 -- part 1 --
//            Column(Modifier.fillMaxSize()) {
//                val color = remember { mutableStateOf(Color.Red) }
//                ColorBox(modifier = Modifier.weight(1f).fillMaxSize())
//                Box(modifier = Modifier.background(color.value).weight(1f).fillMaxSize())
//            }
            //--lesson 6 -- part 1 --


            //--lesson 6 -- part 2 --
            Column(Modifier.fillMaxSize()) {
                val color = remember { mutableStateOf(Color.Yellow) }
                ColorBox2(modifier = Modifier.weight(1f).fillMaxSize()){
                    color.value = it
                }
                Box(modifier = Modifier.background(color.value).weight(1f).fillMaxSize())
            }
            //--lesson 6 -- part 2 --


        }
    }
}

//--lesson 6 -- part 1 --
@Composable
fun ColorBox(modifier: Modifier = Modifier){
    val color = remember { mutableStateOf(Color.Yellow) }
    Box(modifier = modifier.background(color.value).clickable {
        color.value = Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f)
    })
}
//--lesson 6 -- part 1 --


//--lesson 6 -- part 2 --
@Composable
fun ColorBox2(modifier: Modifier = Modifier, updateColor : (Color) -> Unit){
    Box(modifier = modifier.background(Color.Red).clickable {
        updateColor(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f))
    })
}
//--lesson 6 -- part 2 --





