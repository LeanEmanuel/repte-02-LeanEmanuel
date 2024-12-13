package com.example.repte02.model

sealed class Routes(val route: String)  {
    object LaunchScreen: Routes("launchScreen")
    object PersonajeScreen: Routes("personajeScreen")
    object NombreScreen: Routes("nombreScreen")

}