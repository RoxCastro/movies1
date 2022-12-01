package com.example.movies.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movies.ui.theme.MoviesTheme


@Composable
fun Peliculas() {
    MoviesTheme {
        val navController = rememberNavController()
        val navigationActions = remember(NavController) {
            PeliculasActions(navController)
        }
        PeliculasNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetail
        )
    }
}