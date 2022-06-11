package com.getnerdify.nftmarketplace.screens.stats

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.getnerdify.nftmarketplace.components.customTabOffset
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

            CustomTabComponent()

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

@Composable
fun CustomTabComponent() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabData = listOf(
        "Ranking" to Icons.Default.Assessment,
        "Activity" to Icons.Default.TrackChanges
    )
    TabRow(
        selectedTabIndex = tabIndex,
        backgroundColor = Color.Transparent,
        contentColor = Color.White,
        divider = {
            TabRowDefaults.Divider(
                thickness = 1.dp,
                color = Color(66, 34, 104)
            )
        },
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.customTabOffset(tabPositions[tabIndex]),
                height = 4.dp,
                color = Color(148, 103, 255)
            )
        }
    ) {
        tabData.forEachIndexed { index, pair ->
            Tab(
                selected = tabIndex == index,
                onClick = {
                    tabIndex = index
                },
                content = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(bottom = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = pair.second, contentDescription = null)
                        Text(
                            pair.first,
//                            style = NFTTypography.h6
                        )
                    }
                }
            )
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