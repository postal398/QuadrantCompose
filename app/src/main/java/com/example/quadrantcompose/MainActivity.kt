package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
                                modifier = Modifier.fillMaxWidth(0.5f)
                            ) {
                                Text("Text composable")
                                Text("Displays text and follows Material Design guidelines.")
                            }



                            Column(//Правая верхняя
                                modifier = Modifier.fillMaxWidth(0.5f)
                            ) {
                                Text("Image composable")
                                Text("Creates a composable that lays out and draws a given Painter class object.")
                            }
                        } //конец верхнего ряда


                        Row() {//нижний ряд
                            Column(//Левая нижняя
                                modifier = Modifier.fillMaxWidth(0.5f)
                            ) {
                                Text("Row composable")
                                Text("A layout composable that places its children in a horizontal sequence.")
                            }



                            Column(//Правая нижняя
                                modifier = Modifier.fillMaxWidth(0.5f)
                            ) {
                                Text("Column composable")
                                Text("A layout composable that places its children in a vertical sequence.")
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