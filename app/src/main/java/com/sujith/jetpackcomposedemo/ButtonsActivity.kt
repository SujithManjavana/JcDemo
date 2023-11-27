package com.sujith.jetpackcomposedemo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class ButtonsActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val snackbarHostState = remember { SnackbarHostState() }

            // Create a coroutineScope for the animation
            val scope = rememberCoroutineScope()
            Scaffold {
                Column (
                    modifier = Modifier.padding(it),
                    horizontalAlignment = Alignment.CenterHorizontally,

                ){

                }
            }
        }
    }
}