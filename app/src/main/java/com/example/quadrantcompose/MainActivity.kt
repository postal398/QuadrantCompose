package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {

                    Column() {//Материнская колонка


                        Row() {//Верхний ряд
                            Column( //Левая верхняя
                                modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f).background(
                                    Color.Green)



                            ) {
                                Text("Text composable", textAlign = TextAlign.Center)
                                Text("Displays text and follows Material Design guidelines.", textAlign = TextAlign.Center)
                            }



                            Column(//Правая верхняя
                                modifier = Modifier.fillMaxWidth(1f).fillMaxHeight(0.5f).background(
                                    Color.Yellow)
                            ) {
                                Text("Image composable", textAlign = TextAlign.Center)
                                Text("Creates a composable that lays out and draws a given Painter class object.", textAlign = TextAlign.Center)
                            }
                        } //конец верхнего ряда


                        Row() {//нижний ряд
                            Column(//Левая нижняя
                                modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f).
                                background(Color.Cyan)
                            ) {
                                Text("Row composable", textAlign = TextAlign.Center)
                                Text("A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Center)
                            }



                            Column(//Правая нижняя
                                verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.fillMaxWidth(1f).fillMaxHeight(1f)
                                    .background(Color.LightGray)
                            ) {
                                Text("Column composable",
                                    textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(end = 16.dp))
                                Text("A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Center)
                            }
                        } //Конец нижнего ряда
                    }//Конец материнской Column



                }//Конец Surface

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuadrantComposeTheme {
        Greeting("Android")
    }
}