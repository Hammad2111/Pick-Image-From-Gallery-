package com.resconapss.documents.scanner.opengalleryformulltipleimages.screen

import android.app.Activity
import android.content.Intent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.resconapss.documents.scanner.opengalleryformulltipleimages.activities.MultipleImagePickerActivity
import com.resconapss.documents.scanner.opengalleryformulltipleimages.activities.MultipleImagePickerinNextScreenActivity
import com.resconapss.documents.scanner.opengalleryformulltipleimages.activities.ShowMultipleImageinViewPagerActivity
import com.resconapss.documents.scanner.opengalleryformulltipleimages.activities.SingleImagePickerActivity


@Composable
fun HomeScreen( context:Activity) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White))
    {
        Column(modifier= Modifier
            .fillMaxWidth()
            .wrapContentSize()
            .align(Alignment.Center)) {


            Button( modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
                onClick = {

                    val intent= Intent(context,SingleImagePickerActivity::class.java)
                    context.startActivity(intent)


                }
            ) {
                Text(text = "Single Photo Picker")
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp))
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
                onClick = {

                    val intent= Intent(context, MultipleImagePickerActivity::class.java)
                    context.startActivity(intent)


                }
            ) {
                Text(text = "Multiple Photo Picker")
            }

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp))
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
                onClick = {

                    val intent= Intent(context, ShowMultipleImageinViewPagerActivity::class.java)
                    context.startActivity(intent)


                }
            ) {
                Text(text = "Multiple Photo in view pager")
            }

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp))
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
                onClick = {

                    val intent= Intent(context, MultipleImagePickerinNextScreenActivity::class.java)
                    context.startActivity(intent)


                }
            ) {
                Text(text = "Show Photo in next Screen")
            }




        }
    }

}

