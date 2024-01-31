package com.example.dint_1_lladosapp.pie

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.dint_1_lladosapp.R
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'pie'.
 * Generated code; do not edit directly
 */
@Composable
fun Pie(
    modifier: Modifier = Modifier,
    inicio: Painter = EmptyPainter(),
    comprar: Painter = EmptyPainter(),
    mensajes: Painter = EmptyPainter(),
    tareas: Painter = EmptyPainter(),
    login: Painter = EmptyPainter(),
    onInicio: () -> Unit = {},
    onComprar: () -> Unit = {},
    onMensaje: () -> Unit = {},
    onTarea: () -> Unit = {},
    onInicioSesion: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        InicioLogin1(
            onInicio = onInicio,
            inicio = inicio,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -140.0.dp,
                    y = 1.0.dp
                )
            )
        )
        ComprarLogin1(
            onComprar = onComprar,
            comprar = comprar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -68.0.dp,
                    y = 1.0.dp
                )
            )
        )
        MensajesLogin1(
            onMensaje = onMensaje,
            mensajes = mensajes,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 5.0.dp,
                    y = 1.0.dp
                )
            )
        )
        TareasLogin1(
            onTarea = onTarea,
            tareas = tareas,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 75.0.dp,
                    y = 1.0.dp
                )
            )
        )
        InicioSessionLogin1(
            onInicioSesion = onInicioSesion,
            login = login,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 145.0.dp,
                    y = 1.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 56)
@Composable
private fun PiePreview() {
    MaterialTheme {
        RelayContainer {
            Pie(
                inicio = painterResource(R.drawable.pie_inicio_login_1),
                onInicio = {},
                comprar = painterResource(R.drawable.pie_comprar_login_1),
                onComprar = {},
                mensajes = painterResource(R.drawable.pie_mensajes_login_1),
                onMensaje = {},
                tareas = painterResource(R.drawable.pie_tareas_login_1),
                onTarea = {},
                login = painterResource(R.drawable.pie_inicio_session_login_1),
                onInicioSesion = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun InicioLogin1(
    onInicio: () -> Unit,
    inicio: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = inicio,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onInicio).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun ComprarLogin1(
    onComprar: () -> Unit,
    comprar: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = comprar,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onComprar).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun MensajesLogin1(
    onMensaje: () -> Unit,
    mensajes: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = mensajes,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onMensaje).requiredWidth(30.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun TareasLogin1(
    onTarea: () -> Unit,
    tareas: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = tareas,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onTarea).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun InicioSessionLogin1(
    onInicioSesion: () -> Unit,
    login: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = login,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onInicioSesion).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
