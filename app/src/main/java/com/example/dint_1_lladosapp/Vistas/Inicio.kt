package com.example.dint_1_lladosapp.Vistas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dint_1_lladosapp.cabecera.Cabecera
import com.example.dint_1_lladosapp.data.Routes
import com.example.dint_1_lladosapp.pie.Pie


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaInicio(navController: NavHostController) {
    Scaffold(
        topBar = {
            Cabecera(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp), titulo = "Inicio",
                onLogo = {navController.navigate(Routes.Inicio.routes)},
                onAjuste = {navController.navigate(Routes.Preferencia.routes)})
        },
        bottomBar = {
            Pie(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
                onInicio = {navController.navigate(Routes.Inicio.routes)},
                onComprar = {navController.navigate(Routes.Compras.routes)},
                onMensaje = {navController.navigate(Routes.Mensaje.routes)},
                onTarea = {navController.navigate(Routes.SalaTu1millon.routes)},
                onInicioSesion = {navController.navigate(Routes.InicioSesion.routes)})
        },

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.

                    It also contains some basic inner content, such as this text.

                    You have pressed the floating action button  times.
                """.trimIndent(),
            )
        }
    }
}
