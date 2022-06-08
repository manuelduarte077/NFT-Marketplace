package com.getnerdify.nftmarketplace.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

            Text(
                "Trending collections",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )

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