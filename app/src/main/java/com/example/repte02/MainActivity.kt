package com.example.repte02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.repte02.model.Routes
import com.example.repte02.ui.theme.Repte02Theme
import com.example.repte02.view.LaunchScreen
import com.example.repte02.view.PersonajeScreen
import com.example.repte02.viewmodel.RepteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repteViewModel: RepteViewModel by viewModels<RepteViewModel>()
        enableEdgeToEdge()
        setContent {
            Repte02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Repte02(
                        modifier = Modifier.padding(innerPadding),
                        repteViewModel = repteViewModel
                    )
                }
            }
        }
    }
}


@Composable
fun Repte02(modifier: Modifier = Modifier, repteViewModel: RepteViewModel) {
    val navigationController = rememberNavController()
    NavHost(
        navController = navigationController,
        startDestination = Routes.LaunchScreen.route
    ) {
        composable(Routes.LaunchScreen.route) { LaunchScreen(navigationController) }
        composable(Routes.PersonajeScreen.route) { PersonajeScreen(navigationController, repteViewModel) }
    }
}


