package com.avtocontrol.testcompose.navigation

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.avtocontrol.testcompose.util.Action
import com.avtocontrol.testcompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true}
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

}