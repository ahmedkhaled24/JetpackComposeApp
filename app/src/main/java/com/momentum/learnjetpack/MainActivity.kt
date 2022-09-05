package com.momentum.learnjetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray)) {
                Text(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)){
                        append("A")
                    }

                    append("hme")

                    withStyle(style = SpanStyle(color = Color.Blue, fontSize = 50.sp)){
                        append("d")
                    }
                }, color = Color.White, fontSize = 40.sp)
            }


//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(Color(0xFF101010))) {
//
//                Text(text = buildAnnotatedString() {
//                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)){
//                        append("J")
//                    }
//
//                    append("etpack ")
//
//                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)){
//                        append("C")
//                    }
//
//                    append("ompose")
//                },
//                color = Color.White,
//                fontSize = 30.sp,
//                textDecoration = TextDecoration.Underline)
//            }
        }
    }
}





