package com.example.repte02.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun PersonajeScreen(navController: NavController, repteViewModel: RepteViewModel) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Image(
                painter = painterResource(
                    id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier.size(400.dp)
            )

            mostrarImagenes(modifier = Modifier)

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { navController.navigate(Routes.NombreScreen.route) }
            ) {
                Text(
                    text = "Continuar"
                )
            }
        }
    }
}

@Composable
fun mostrarImagenes(modifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.gomah
                ),
                contentDescription = null,
                modifier = modifier.clickable {

                }

                )
            Image(
                painter = painterResource(
                    id = R.drawable.goku
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Image(
                painter = painterResource(
                    id = R.drawable.vegeta
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

        }
        Row(
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.piccolo
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Image(
                painter = painterResource(
                    id = R.drawable.supreme
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Image(
                painter = painterResource(
                    id = R.drawable.masked_majin
                ),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PersonajeScreenPreview() {
    val mockNavController = rememberNavController()
    val repteViewModel = RepteViewModel()
    PersonajeScreen(
        navController = mockNavController, repteViewModel = repteViewModel
    )
}