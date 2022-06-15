package com.getnerdify.nftmarketplace

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.getnerdify.nftmarketplace.navigations.BottomBar
import com.getnerdify.nftmarketplace.navigations.NavigationItem
import com.getnerdify.nftmarketplace.onboarding.OnBoardingScreen
import com.getnerdify.nftmarketplace.screens.home.HomeScreen
import com.getnerdify.nftmarketplace.screens.stats.StatsScreen
import com.getnerdify.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun RootScreen(
) {
    val navigationController = rememberNavController()
    var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }

    Scaffold(
        bottomBar = {

            if (!shouldShowOnBoarding) {
                BottomBar(navController = navigationController)
            }

        }
    ) {

        NavHost(navController = navigationController,
            startDestination = if (shouldShowOnBoarding) {
                NavigationItem.Login.route
            } else {
                NavigationItem.Stats.route
            }) {
            composable(NavigationItem.Login.route) {
                OnBoardingScreen(
                    navigateAction = {
                        navigationController.navigate(NavigationItem.Home.route)
                        shouldShowOnBoarding = false
                    }
                )
            }

            composable(NavigationItem.Home.route) {
                HomeScreen()
            }

            composable(NavigationItem.Stats.route) {
                StatsScreen()
            }

            composable(NavigationItem.Add.route) {
                Text("Add")
            }

            composable(NavigationItem.Search.route) {
                Text("Search")
            }

            composable(NavigationItem.Profile.route) {
                Text("Profile")
            }
        }

    }
}

@Preview
@Composable

fun RootScreenPreview() {
    NFTMarketplaceTheme {
        RootScreen()
    }
}