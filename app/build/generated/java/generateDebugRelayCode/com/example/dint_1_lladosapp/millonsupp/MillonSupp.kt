package com.example.dint_1_lladosapp.millonsupp

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dint_1_lladosapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * This composable was generated from the UI Package 'millon_supp'.
 * Generated code; do not edit directly
 */
@Composable
fun MillonSupp(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Precios(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -146.0.dp
                )
            )
        ) {
            TU1MILLON(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -63.0.dp,
                        y = -27.0.dp
                    )
                )
            )
            Boton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -82.5.dp,
                        y = 27.0.dp
                    )
                )
            )
            Seleccionar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -79.5.dp,
                        y = 25.0.dp
                    )
                )
            )
        }
        Precios1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            LladosLife(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -68.5.dp,
                        y = -27.0.dp
                    )
                )
            )
            Boton1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -82.5.dp,
                        y = 27.0.dp
                    )
                )
            )
            Seleccionar1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -79.5.dp,
                        y = 25.0.dp
                    )
                )
            )
        }
        Precios2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 146.0.dp
                )
            )
        ) {
            PanzaLife(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -68.5.dp,
                        y = -27.0.dp
                    )
                )
            )
            Boton2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -82.5.dp,
                        y = 27.0.dp
                    )
                )
            )
            Seleccionar2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -79.5.dp,
                        y = 25.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 528)
@Composable
private fun MillonSuppPreview() {
    MaterialTheme {
        RelayContainer {
            MillonSupp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun TU1MILLON(modifier: Modifier = Modifier) {
    RelayText(
        content = "TU1MILLON",
        fontSize = 32.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(800.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Boton(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.millon_supp_boton),
        modifier = modifier.requiredWidth(110.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Seleccionar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Seleccionar",
        fontSize = 16.0.sp,
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Precios(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 24,
            green = 207,
            blue = 20
        ),
        isStructured = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(319.0.dp).requiredHeight(110.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 25.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun LladosLife(modifier: Modifier = Modifier) {
    RelayText(
        content = "Llados life",
        fontSize = 32.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(800.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(138.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Boton1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.millon_supp_boton1),
        modifier = modifier.requiredWidth(110.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Seleccionar1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Seleccionar",
        fontSize = 16.0.sp,
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Precios1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 119,
            green = 112,
            blue = 112
        ),
        isStructured = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(319.0.dp).requiredHeight(110.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 25.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun PanzaLife(modifier: Modifier = Modifier) {
    RelayText(
        content = "Panza life",
        fontSize = 32.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.36181640625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(800.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(138.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Boton2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.millon_supp_boton2),
        modifier = modifier.requiredWidth(110.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Seleccionar2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Seleccionar",
        fontSize = 16.0.sp,
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Precios2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(319.0.dp).requiredHeight(110.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 25.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 168,
            red = 7,
            green = 7,
            blue = 7
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
