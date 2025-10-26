package presentation.ui.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import presentation.viewmodel.HomeViewModel

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    // ViewModel scoped to navigation graph
    // val homeViewModel: HomeViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") {
                val vm = androidx.hilt.navigation.compose.hiltViewModel<presentation.viewmodel.HomeViewModel>()
                HomeScreen(viewModel = vm)
            }
            composable("search") {
                val vm = androidx.hilt.navigation.compose.hiltViewModel<presentation.viewmodel.SearchViewModel>()
                SearchScreen(viewModel = vm)
            }
            composable("mylist") {
                val vm = androidx.hilt.navigation.compose.hiltViewModel<presentation.viewmodel.MyListViewModel>()
                MyListScreen(viewModel = vm)
            }
            composable("profile") {
                val vm = androidx.hilt.navigation.compose.hiltViewModel<presentation.viewmodel.PersonViewModel>()
                ProfileScreen(viewModel = vm)
            }
            composable(
                "detail/{mediaId}/{mediaType}",
                arguments = listOf(
                    navArgument("mediaId") { type = NavType.IntType },
                    navArgument("mediaType") { type = NavType.StringType }
                )
            ) { /* DetailScreen() */ }
            composable(
                "player/{streamingUrl}",
                arguments = listOf(navArgument("streamingUrl") { type = NavType.StringType })
            ) { /* PlayerScreen() */ }
            composable(
                "person/{personId}",
                arguments = listOf(navArgument("personId") { type = NavType.IntType })
            ) { /* PersonDetailScreen() */ }
            composable(
                "genre/{genreId}",
                arguments = listOf(navArgument("genreId") { type = NavType.IntType })
            ) { /* GenreBrowseScreen() */ }
            composable(
                "searchresults/{query}",
                arguments = listOf(navArgument("query") { type = NavType.StringType })
            ) { /* SearchResultsScreen() */ }
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController) {
    NavigationBar {
        NavigationBarItem(
            selected = false, // TODO: track selected
            onClick = { navController.navigate("home") },
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("search") },
            icon = { Icon(Icons.Filled.Search, contentDescription = "Search") },
            label = { Text("Search") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("mylist") },
            icon = { Icon(Icons.Filled.List, contentDescription = "My List") },
            label = { Text("My List") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("profile") },
            icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
            label = { Text("Profile") }
        )
    }
}
