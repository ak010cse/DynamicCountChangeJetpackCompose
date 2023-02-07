package com.arvind.dynamiccountchangejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.dynamiccountchangejetpackcompose.ui.theme.DynamicCountChangeJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicCountChangeJetpackComposeTheme {
                var count by remember {
                    mutableStateOf(0)
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(text = count.toString(), fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = { count++ }) {
                        Text(text = "Add", fontSize = 18.sp)

                    }
                }
            }
        }
    }
}

