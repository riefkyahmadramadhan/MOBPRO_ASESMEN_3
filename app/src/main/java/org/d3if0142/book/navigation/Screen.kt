package org.d3if0142.book.navigation

sealed class Screen(val route: String) {
    object Home : Screen("mainScreen")
    object About : Screen("aboutScreen")
}