package com.example.repte02.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R
import com.example.repte02.model.Routes
import com.example.repte02.viewmodel.RepteViewModel

@Composable
fun Routes.ResultadoScreen(navController: NavController, repteViewModel: RepteViewModel){
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier.size(400.dp)
            )

            //Image
            //Text
        }
    }
}