package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column (horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
            ){
        Text()
        Bouton()
        Bouton2()
    }

}

@Composable
fun Bouton2() {
    Button(
        onClick = { }

    ) {

        Spacer(Modifier.size(ButtonDefaults.IconSpacing))

        Text(text = "Prochaine question")

    }
}

@Composable
fun Text() {
    Text(
        text = "Text initial",

    )
}
@Composable
fun Bouton() {
    Button(
        onClick = { }

    ) {

        Spacer(Modifier.size(ButtonDefaults.IconSpacing))

        Text(text = "Cliquez-moi")

    }

}


