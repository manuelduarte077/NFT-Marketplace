package com.getnerdify.nftmarketplace.screens.stats

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.getnerdify.nftmarketplace.models.rankings
import com.getnerdify.nftmarketplace.ui.theme.NFTMarketplaceTheme


@Composable
fun StatsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                content = {
                    Column {
                        Text(
                            "Stats",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.fillMaxWidth(),
                            color = Color.White
                        )
                    }
                },
                backgroundColor = Color.Transparent,
                elevation = 0.dp
            )
        },
        backgroundColor = Color(33, 17, 52)
    ) {
        Column(
            Modifier.padding(bottom = 30.dp)
        ) {
            Card(
                backgroundColor = Color.White.copy(0.15f),
                elevation = 0.dp,
                border = BorderStroke(1.5.dp, Color.White.copy(0.5f)),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.padding(16.dp, 20.dp)
            ) {
                RankingTable(rankings)
            }
        }
    }
}

@Preview
@Composable
fun StatScreenPreview() {
    NFTMarketplaceTheme {
        StatsScreen()
    }
}