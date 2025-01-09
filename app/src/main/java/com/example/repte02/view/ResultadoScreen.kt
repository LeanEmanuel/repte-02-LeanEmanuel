package com.example.repte02.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.repte02.R
import com.example.repte02.model.Routes
import com.example.repte02.viewmodel.RepteViewModel

@Composable
fun ResultadoScreen(
    navController: NavController,
    repteViewModel: RepteViewModel
) {

    val currentImage = repteViewModel.currentImage.observeAsState()
    val nombre = repteViewModel.nombre.observeAsState("")

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier.size(400.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            currentImage.value?.let { imageRes ->
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
            Text(
                text = nombre.value ?: "Sin nombre",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Button(
                onClick = { navController.navigate(Routes.PersonajeScreen.route) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 16.dp)
            ) {
                Text(text = "Tornar")
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResultadoScreenPreview() {
    val mockNavController = rememberNavController()
    val repteViewModel = RepteViewModel()
    ResultadoScreen(
        navController = mockNavController, repteViewModel = repteViewModel
    )
}

