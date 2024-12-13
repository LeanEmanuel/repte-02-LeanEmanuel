package com.example.repte02.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.repte02.R
import com.example.repte02.model.Routes

@Composable
fun LaunchScreen (navController: NavController){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),

        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier.size(400.dp)

            )
        }

        Button(
            onClick = {navController.navigate(Routes.PersonajeScreen.route)}
        ) {
            Text (
                text = "Entrar"
            )
        }



    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LaunchScreenPreview() {
    val mockNavController = rememberNavController()
    LaunchScreen(navController = mockNavController)
}
