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
    val destinations = listOf("home", "search", "mylist", "profile")
    val labels = listOf("Home", "Search", "My List", "Profile")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Search, Icons.Filled.List, Icons.Filled.Person)
    val currentRoute = navController.currentBackStackEntry?.destination?.route
    NavigationBar {
        destinations.forEachIndexed { index, route ->
            NavigationBarItem(
                selected = currentRoute == route,
                onClick = { navController.navigate(route) },
                icon = { Icon(icons[index], contentDescription = labels[index]) },
                label = { Text(labels[index]) }
            )
        }
    }
}
