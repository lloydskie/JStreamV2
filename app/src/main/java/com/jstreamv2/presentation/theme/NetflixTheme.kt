package com.jstreamv2.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape

val NetflixRed = Color(0xFFE50914)
val NetflixBackground = Color(0xFF141414)
val NetflixSurface = Color(0xFF181818)
val NetflixCardShape = RoundedCornerShape(8.dp)

val NetflixDarkColorScheme = darkColorScheme(
    primary = NetflixRed,
    onPrimary = Color.White,
    background = NetflixBackground,
    surface = NetflixSurface,
    onBackground = Color.White,
    onSurface = Color.White,
    secondary = Color(0xFFB81D24),
    onSecondary = Color.White,
    tertiary = Color(0xFF221F1F),
    onTertiary = Color.White
)

val NetflixTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Default, // Replace with Bebas Neue if available
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
)

@Composable
fun NetflixTheme(
    useDarkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = NetflixDarkColorScheme,
        typography = NetflixTypography,
        shapes = Shapes(
            small = NetflixCardShape,
            medium = NetflixCardShape,
            large = NetflixCardShape
        ),
        content = content
    )
}
