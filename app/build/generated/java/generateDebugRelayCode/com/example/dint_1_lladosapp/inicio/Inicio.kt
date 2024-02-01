package com.example.dint_1_lladosapp.inicio

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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'inicio'.
 * Generated code; do not edit directly
 */
@Composable
fun Inicio(
    modifier: Modifier = Modifier,
    textoInicio: AnnotatedString = AnnotatedString(""),
    botonComprar: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangle2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 0.3594743638684008.dp,
                    y = -191.8402905303307.dp
                )
            )
        )
        CURSOTU1MILLON(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -57.5.dp,
                    y = -191.5.dp
                )
            )
        )
        Rectangle4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -104.0.dp,
                    y = 190.0.dp
                )
            )
        )
        Rectangle5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 81.0.dp,
                    y = 190.0.dp
                )
            )
        )
        En2015SoloTenA50EurosEnMiCuentaDelBancoDormiaEnHabitacionesConMasDe10PersonasYEscapabaDeMiVidaConLasDrogasActualmenteNoBeboNoMeDrogoYNoSalgoDeFiestaSoyMillonarioYGeneroMasDe400kAlMes(
            textoInicio = textoInicio,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -12.5.dp,
                    y = -6.5.dp
                )
            )
        )
        VerMS(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -93.0.dp,
                    y = 194.0.dp
                )
            )
        )
        ComprarAhora(
            botonComprar = botonComprar,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 85.0.dp,
                    y = 191.0.dp
                )
            )
        )
        Ellipse3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.CenterStart,
                offset = DpOffset(
                    x = 290.0.dp,
                    y = -191.25.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 528)
@Composable
private fun InicioPreview() {
    MaterialTheme {
        RelayContainer {
            Inicio(
                textoInicio = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(
                                alpha = 255,
                                red = 255,
                                green = 255,
                                blue = 255
                            )
                        )
                    ) {
                        append("En 2015 solo tenía 50 euros en mi cuenta del banco dormia en habitaciones con mas de 10 personas y escapaba de mi vida con las drogas.\n\nActualmente no bebo ,no me drogo y no salgo de fiesta. Soy ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color(
                                alpha = 255,
                                red = 255,
                                green = 255,
                                blue = 255
                            ),
                            fontFamily = blackHanSans,
                            fontSize = 20.0.sp,
                            fontWeight = FontWeight(400.0.toInt())
                        )
                    ) {
                        append("millonario")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color(
                                alpha = 255,
                                red = 255,
                                green = 255,
                                blue = 255
                            )
                        )
                    ) {
                        append(" y genero mas de 400k al mes")
                    }
                },
                botonComprar = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_rectangle_2),
        modifier = modifier.requiredWidth(318.93475341796875.dp).requiredHeight(41.019779205322266.dp)
    )
}

@Composable
fun CURSOTU1MILLON(modifier: Modifier = Modifier) {
    RelayText(
        content = "CURSO TU1MILLON",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(900.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(401.0.dp)
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_rectangle_4),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Rectangle5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_rectangle_5),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun En2015SoloTenA50EurosEnMiCuentaDelBancoDormiaEnHabitacionesConMasDe10PersonasYEscapabaDeMiVidaConLasDrogasActualmenteNoBeboNoMeDrogoYNoSalgoDeFiestaSoyMillonarioYGeneroMasDe400kAlMes(
    textoInicio: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textoInicio,
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(301.0.dp).requiredHeight(295.0.dp)
    )
}

@Composable
fun VerMS(modifier: Modifier = Modifier) {
    RelayText(
        content = "ver más",
        fontSize = 15.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(900.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(88.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun ComprarAhora(
    botonComprar: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "comprar ahora",
        fontSize = 15.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(900.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.tappable(onTap = botonComprar).requiredWidth(120.0.dp)
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inicio_ellipse_3),
        modifier = modifier.requiredWidth(59.0.dp).requiredHeight(40.5.dp)
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
