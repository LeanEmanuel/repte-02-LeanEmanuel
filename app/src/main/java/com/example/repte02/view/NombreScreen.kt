package com.example.repte02.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R
import com.example.repte02.model.Routes
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.repte02.viewmodel.RepteViewModel

@Composable
fun NombreScreen(
    navController: NavController,
    repteViewModel: RepteViewModel
) {

    var nombre by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = painterResource(
                    id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp)
                    .padding(top = 16.dp)
            )

            //TextField

            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Nom del personatge") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    repteViewModel.setNombre(nombre)
                    navController.navigate(Routes.ResultadoScreen.route)
                },
                enabled = nombre.isNotBlank(),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 16.dp)
            ) {
                Text(
                    text = "Mostrar"
                )
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NombreScreenPreview() {
    val mockNavController = rememberNavController()
    val repteViewModel = RepteViewModel()
    NombreScreen(
        navController = mockNavController, repteViewModel = repteViewModel
    )
}
