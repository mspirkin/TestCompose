package com.avtocontrol.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.avtocontrol.testcompose.navigation.SetupNavigation
import com.avtocontrol.testcompose.ui.theme.TestComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)
                

            }
        }
    }
}

