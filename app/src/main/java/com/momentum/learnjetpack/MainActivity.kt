package com.momentum.learnjetpack

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
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
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()
            Scaffold(modifier = Modifier.fillMaxWidth(), scaffoldState = scaffoldState) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp))
                {
                    TextField(
                        value = textFieldState,
                        label = { Text(text = "Enter your name") },
                        onValueChange = { textFieldState = it },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow), onClick = {
                        scope.launch {
                            if (textFieldState.isEmpty()){
                                scaffoldState.snackbarHostState.showSnackbar("Ekteb esmak ya 3m elnas", "3enya", SnackbarDuration.Short)
                            } else {
                                scaffoldState.snackbarHostState.showSnackbar("Ezayak ya $textFieldState", "Tmam", SnackbarDuration.Short)
                            }
                        }
                    }) {
                        Text(text = "Doos hena", color = Color.Blue, fontSize = 20.sp )
                    }
                }
            }

        }
    }
}

