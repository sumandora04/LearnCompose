package com.notepoint4u.learncompose

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.notepoint4u.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .background(Color.Green)
            ) {
                Text(text = "Hello")
                Text(text = "World")

                Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    //.fillMaxWidth(0.5f)
                    .height(300.dp)
                    .width(200.dp)
                    .background(Color.Cyan)) {
                    Text(text = "Hello")
                    Spacer(modifier = Modifier.absolutePadding(left = 10.dp))
                    Text(text = "World")
                }
            }

            //sdkjtfuysgufidgeiuyrf9ew8yrhn kjywekfhkwl 885bb8a00d74556ca8c713a0aba3720cabc74f2b.
            print("This line changed in master")
            print("This line in Test branch")
            print("This is from Experimental branch")


            Toast.makeText(this,
                "This toast should be in Experimental branch.",
                Toast.LENGTH_SHORT)
                .show()

            println("The Test branch")
        }
    }
}

