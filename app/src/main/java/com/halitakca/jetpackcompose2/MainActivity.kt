package com.halitakca.jetpackcompose2

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halitakca.jetpackcompose2.ui.theme.JetpackCompose2Theme

// Run edince bu görünür:
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa(){
    Column (
        modifier = Modifier.fillMaxWidth()
            ){
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
        )
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Yellow)
        )
    }
    Row (
        modifier = Modifier.fillMaxHeight()
    ){
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
        )
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Yellow)
        )
    }

}


// Preview'da bu görünür:   Ve bütün Compose'ların en altında olmalı yoksa altında kalan compose yok sayılıyor.
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose2Theme {
        Sayfa()
    }
}