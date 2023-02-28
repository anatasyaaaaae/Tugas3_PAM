package edu.uksw.fti.pam.pam_activity_intent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ButtonNavItems (
    val title: String,
    val icon: ImageVector,
    val screen_route: String
    ) {
    object Home: ButtonNavItems("Home", Icons.Default.Home, "home")
    object Article: ButtonNavItems("Article", Icons.Default.Search, "article")
    object Profile: ButtonNavItems("Profile", Icons.Default.Home, "profile")
}