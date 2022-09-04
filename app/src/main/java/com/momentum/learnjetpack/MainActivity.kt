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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.momentum.learnjetpack.ui.theme.LearnJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxHeight(0.7f)
                    .fillMaxWidth()
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
            ) {

                val painter = painterResource(id = R.drawable.photo)
                val desc = "Car in the street"
                val title = "This is Car"

                //Image 1
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {
                    ImageCrop(painter = painter, desc = desc, title = title)
                }

                //Image 2
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {
                    ImageCropWithoutBrush(painter = painter, desc = desc, title = title)
                }

            }

        }
    }
}

@Composable
fun ImageCropWithoutBrush(painter: Painter, desc: String, title: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        //box image
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = desc,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            //box text on image
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}


@Composable
fun ImageCrop(
    painter: Painter,
    desc: String,
    title: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp
    ) {

        Box(modifier = Modifier.height(300.dp)) {
            //setImage
            Image(painter = painter, contentDescription = desc, contentScale = ContentScale.Crop)

            //set brush
            Box(modifier = Modifier.fillMaxSize().background(brush = Brush.verticalGradient(colors = listOf(Color.Transparent, Color.Black), startY = 300f)))

            //set text
            Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.BottomStart) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 15.sp))
            }
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
