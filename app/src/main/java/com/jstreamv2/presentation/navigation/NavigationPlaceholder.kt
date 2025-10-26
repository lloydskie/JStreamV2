
package com.jstreamv2.presentation.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

fun setupNavigation(navController: NavHostController) {
	NavHost(navController = navController, startDestination = "home") {
		composable("home") { /* HomeScreen() */ }
		// Add more destinations as needed
	}
}
