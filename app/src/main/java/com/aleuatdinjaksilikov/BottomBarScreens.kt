package com.aleuatdinjaksilikov

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route : String,
    val title : String,
    val icon : ImageVector
){
    data object Home : BottomBarScreens(
        route = "home_screen",
        title = "Home",
        icon = Icons.Default.Home
    )

    data object Wallet : BottomBarScreens(
        route = "wallet_screen",
        title = "Wallet",
        icon = Icons.Default.Wallet
    )

    data object Notifications : BottomBarScreens(
        route = "notifications_screen",
        title = "Notifications",
        icon = Icons.Default.Notifications
    )

    data object Account : BottomBarScreens(
        route = "account_screen",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
}