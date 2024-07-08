package com.resconapss.documents.scanner.opengalleryformulltipleimages.screen

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.annotation.SuppressLint
import androidx.activity.result.PickVisualMediaRequest
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.google.accompanist.permissions.ExperimentalPermissionsApi


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MultipleImaePickerScreen() {
    var selectedImageUris by remember {
        // It won't work with mutableStateListOf
        mutableStateOf<List<Uri>>(emptyList())
    }

    val multiplePhotoPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickMultipleVisualMedia(),
        onResult = { uris -> selectedImageUris = uris }
    )
    Box(modifier = Modifier.fillMaxSize())
    {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {

            Box(modifier = Modifier.fillMaxWidth().weight(1.8f))
            {
                LazyColumn(
                Modifier.fillMaxSize()) {


                items(selectedImageUris) { uri ->
                    AsyncImage(
                        model = uri,
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth().padding(10.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }


            }
            Box(modifier = Modifier.fillMaxWidth().weight(0.2f))
            {
                Button( modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(10.dp).align(Alignment.Center),
                    onClick = {
                        multiplePhotoPickerLauncher.launch(
                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                        )
                    }
                ) {
                    Text(text = " Click to Pick Multiple photo")
                }
            }

        }
    }




}

@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
   MultipleImaePickerScreen()
}
