package com.halitakca.jetpackcompose2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

// Bu annotation ile Scaffold kullanabiliyoruz ve hata gidiyor.
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SayfaHata(){
    Scaffold(
        topBar = {

        },
        content = {

        }
    )
}

@Composable
fun Sayfa(){
    Column(modifier = Modifier.fillMaxHeight(),
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally) {
        //Yazi(icerik = "Hello Halit !", yaziBoyutu = 15)
        Yazi(icerik = stringResource(id = R.string.textYazi), yaziBoyutu = 24)
        Button(onClick = { }) {
            Text(text = stringResource(id = R.string.buttonYazi), fontSize = 24.sp)
        }
    }

}

@Composable
fun KirmiziKare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Red))
}
@Composable
fun MaviKare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Blue))
}
@Composable
fun Yazi(icerik: String, yaziBoyutu: Int){
    Text(text = icerik, fontSize = yaziBoyutu.sp)
}
// Preview'da bu görünür:   Ve bütün Compose'ların en altında olmalı yoksa altında kalan compose yok sayılıyor.
@Preview(showBackground = true, locale = "tr")  //  locale = ".." ile language belirle
@Composable
fun DefaultPreview() {
    JetpackCompose2Theme {
        Sayfa()
    }
}

/*  Weight Usage
    Row(modifier = Modifier.fillMaxWidth()){
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
            .weight(30f))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Yellow)
            .weight(50f))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue)
            .weight(20f))
//  %50 yellow %30 red %20 blue  on the box view.
    }
 */
/*  Padding Usage
    Row(modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red))
        Text(text = "HELLO !", modifier = Modifier.padding(10.dp))
        // start end top bottom
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue))
    }
 */
/*  Spacer Usage
    Row{
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red))
        Spacer(modifier = Modifier.size(100.dp).background(Color.Yellow))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue))
    }
 */
/*
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
 */