package com.getnerdify.nftmarketplace.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.getnerdify.nftmarketplace.models.categories
import com.getnerdify.nftmarketplace.models.nfts
import com.getnerdify.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun NFTList() {
    LazyRow(
        modifier = Modifier.padding(vertical = 30.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(nfts) { nft ->
            NFTCard(
                title = nft.title,
                subtitle = nft.subTitle,
                image = painterResource(id = nft.image),
                likes = nft.likes,
                eth = nft.eth
            )
        }
    }
}

@Preview
@Composable
fun PreviewNFTList() {
    NFTMarketplaceTheme {
        NFTList()
    }
}