package com.getnerdify.nftmarketplace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.getnerdify.nftmarketplace.onboarding.OnBoardingScreen
import com.getnerdify.nftmarketplace.ui.theme.NFTMarketplaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFTMarketplaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RootScreen()
                }
            }
        }
    }
}

@Composable
@Preview
fun PreviewMainScreen (){
    NFTMarketplaceTheme {
        OnBoardingScreen()
    }
}