package com.momentum.learnjetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.momentum.learnjetpack.ui.theme.LearnJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {




        }
    }
}

//----------------LESSON 2 --------------------
//Row(
//modifier = Modifier
//.width(300.dp)
//.fillMaxHeight(1f)
//.background(Color.Gray),
//verticalAlignment = Alignment.CenterVertically,
//horizontalArrangement = Arrangement.SpaceAround) {
//    Text(text = "Hello")
//    Text(text = "World")
//    Text(text = "Ahmed")
//}


//----------------LESSON 3 --------------------
//Column(
//modifier = Modifier
//.background(Color.Cyan)
//.fillMaxHeight(0.7f)
//.fillMaxWidth()
//.border(5.dp, Color.Magenta)
//.padding(5.dp)
//.border(5.dp, Color.Red)
//.padding(5.dp)
//.border(5.dp, Color.White)
//.padding(5.dp)
//.border(5.dp, Color.Black)
//.padding(10.dp)
//.border(5.dp, Color.Yellow)
//.padding(5.dp)
//.border(5.dp, Color.Green)
//.padding(5.dp)
//.border(5.dp, Color.Blue)
//.padding(5.dp)
//.border(5.dp, Color.Black)
//.padding(10.dp)
//) {
//
//    Text(text = "Hello", modifier = Modifier
//        .offset(30.dp, 30.dp)
//        .clickable {
//            Toast.makeText(this@MainActivity, "Click", Toast.LENGTH_SHORT).show()
//        })
//    Spacer(modifier = Modifier.height(50.dp))
//    Text(text = "World")
//    Spacer(modifier = Modifier.height(50.dp))
//    Text(text = "Ahmed")
//}
