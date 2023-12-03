package com.sujith.jetpackcomposedemo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.constraintlayout.compose.ConstraintSet

class ConstraintLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val constrains = ConstraintSet{
                val greenBox=createRefFor("greenBox")
                val redBox=createRefFor("redBox")
            }
        }
    }
}