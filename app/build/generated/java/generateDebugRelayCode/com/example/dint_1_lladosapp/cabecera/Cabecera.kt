package com.example.dint_1_lladosapp.cabecera

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dint_1_lladosapp.R
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'cabecera'.
 * Generated code; do not edit directly
 */
@Composable
fun Cabecera(
    modifier: Modifier = Modifier,
    titulo: String = "",
    ajuste: Painter = EmptyPainter(),
    onLogo: () -> Unit = {},
    onAjuste: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Inicio(
            titulo = titulo,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -39.5.dp,
                    y = 0.5.dp
                )
            )
        )
        Logo(
            onLogo = onLogo,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -146.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Ajuste(
            onAjuste = onAjuste,
            ajuste = ajuste,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 152.47999954223633.dp,
                    y = -0.18879985809326172.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 56)
@Composable
private fun CabeceraPreview() {
    MaterialTheme {
        RelayContainer {
            Cabecera(
                titulo = "Inicio",
                onLogo = {},
                ajuste = painterResource(R.drawable.cabecera_ajuste),
                onAjuste = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Inicio(
    titulo: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = titulo,
        fontSize = 24.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(800.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(137.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun Logo(
    onLogo: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onLogo).requiredWidth(68.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Ajuste(
    onAjuste: () -> Unit,
    ajuste: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = ajuste,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onAjuste).requiredWidth(24.959999084472656.dp).requiredHeight(27.622400283813477.dp)
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
