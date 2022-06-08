package com.getnerdify.nftmarketplace

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.getnerdify.nftmarketplace.navigations.NavigationItem
import com.getnerdify.nftmarketplace.screens.home.HomeScreen

@Composable
fun RootScreen() {
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) {
        HomeScreen()
    }
}

@Composable
fun BottomBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Stats,
        NavigationItem.Add,
        NavigationItem.Search,
        NavigationItem.Profile
    )

    BottomNavigation(
        backgroundColor = Color(33, 17, 52),
        contentColor = Color.White
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Image(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        modifier = Modifier.size(30.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = false,
                selected = false,
                onClick = { }
            )
        }
    }
}