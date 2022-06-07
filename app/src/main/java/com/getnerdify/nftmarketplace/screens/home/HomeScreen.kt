package com.getnerdify.nftmarketplace.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.getnerdify.nftmarketplace.components.CategoryList
import com.getnerdify.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun HomeScreen (){
    Scaffold(
        backgroundColor = Color(33, 17, 52)
    ) {
        Column(
            Modifier.padding(horizontal = 16.dp)
        ) {
            CategoryList()
        }
    }
}

@Composable
@Preview
fun PreviewHomeScreen(){
    NFTMarketplaceTheme {
        HomeScreen()
    }
}