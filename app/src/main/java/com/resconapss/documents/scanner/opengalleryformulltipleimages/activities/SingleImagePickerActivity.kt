package com.resconapss.documents.scanner.opengalleryformulltipleimages.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.resconapss.documents.scanner.opengalleryformulltipleimages.screen.SingleImagePickerScreen

class SingleImagePickerActivity : ComponentActivity() {
    @OptIn(ExperimentalPermissionsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
          SingleImagePickerScreen()
        }
    }
    @Preview(showBackground = true, device = Devices.PIXEL_4_XL)
    @Composable
    fun show_preview()
    {
       SingleImagePickerScreen()
    }
}
