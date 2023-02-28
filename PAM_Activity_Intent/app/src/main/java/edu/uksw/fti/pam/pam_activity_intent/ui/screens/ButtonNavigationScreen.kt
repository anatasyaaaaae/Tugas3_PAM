package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import edu.uksw.fti.pam.pam_activity_intent.ui.ButtonNavItems

@Composable
fun navigationGraph(
    navController: NavController
) {
    NavHost(
        navController = navController,
        startDestination = ButtonNavItems.Home.screen_route,
        builder =
    ) {
        composable(ButtonNavItems.Home.screen_route) {
            HomeScreen("android")
        }
        composable(ButtonNavItems.Article.screen_route) {
            ArticleScreen()
        }
        composable(ButtonNavItems.Profile.screen_route) {
            ProfileScreen()
        }

    }
}

@Composable
fun ButtonNavigation(
    navController: NavController
){
    val items = ListOf(
        ButtonNavItems.Home,
        ButtonNavItems.Article,
        ButtonNavItems.Profile,
    )
    androidx.compose.material.button
}