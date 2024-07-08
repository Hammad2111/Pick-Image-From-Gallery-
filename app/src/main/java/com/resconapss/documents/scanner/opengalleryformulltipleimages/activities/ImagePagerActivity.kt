package com.resconapss.documents.scanner.opengalleryformulltipleimages.activities

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.pager.ExperimentalPagerApi

class ImagePagerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val imageUris: List<Uri> = intent.getParcelableArrayListExtra("imageUris") ?: emptyList()

        setContent {
            ImagePagerScreen(imageUris = imageUris)
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ImagePagerScreen(imageUris: List<Uri>) {
    val pagerState = rememberPagerState()

    if (imageUris.isEmpty()) {
        Text(text = "No images selected", modifier = Modifier.padding(16.dp))
    } else {
        HorizontalPager(
            count = imageUris.size,
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            val uri = imageUris[page]

        }
        AsyncImage(
            model = imageUris,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}