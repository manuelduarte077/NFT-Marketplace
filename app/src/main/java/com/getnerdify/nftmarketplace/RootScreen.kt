package com.getnerdify.nftmarketplace

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.getnerdify.nftmarketplace.screens.home.HomeScreen

@Composable
fun RootScreen(){
    Scaffold () {
        HomeScreen()
    }
}

