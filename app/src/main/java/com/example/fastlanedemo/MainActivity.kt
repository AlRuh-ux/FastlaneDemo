package com.example.fastlanedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Roohi")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Hello Roohi here! Welcome to Fastlane Demo!",
            modifier = modifier
        )

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Button clicked Yaay! 😊",
                    Toast.LENGTH_SHORT
                ).show()
            }
        ) {
            Text(text = "Click me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Roohi")
}