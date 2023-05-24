package com.abdo.creditagricole.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
fun rememberFastfood(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "fastfood",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(2.15f, 15f)
                quadToRelative(-0.475f, 0f, -0.775f, -0.338f)
                quadToRelative(-0.3f, -0.337f, -0.225f, -0.762f)
                quadToRelative(0.475f, -2.475f, 2.65f, -3.688f)
                quadTo(5.975f, 9f, 8.55f, 9f)
                reflectiveQuadToRelative(4.75f, 1.212f)
                quadToRelative(2.175f, 1.213f, 2.65f, 3.688f)
                quadToRelative(0.075f, 0.425f, -0.225f, 0.762f)
                quadToRelative(-0.3f, 0.338f, -0.775f, 0.338f)
                close()
                moveToRelative(15.9f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.4f)
                lineToRelative(1.4f, -14f)
                horizontalLineTo(11.3f)
                lineToRelative(-0.1f, -0.875f)
                quadToRelative(-0.05f, -0.45f, 0.238f, -0.787f)
                quadToRelative(0.287f, -0.338f, 0.737f, -0.338f)
                horizontalLineToRelative(3.875f)
                verticalLineTo(2f)
                quadToRelative(0f, -0.425f, 0.287f, -0.713f)
                quadTo(16.625f, 1f, 17.05f, 1f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadToRelative(0.287f, 0.288f, 0.287f, 0.713f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.9f)
                quadToRelative(0.45f, 0f, 0.75f, 0.325f)
                reflectiveQuadToRelative(0.25f, 0.775f)
                lineTo(21.4f, 21.55f)
                quadToRelative(-0.075f, 0.6f, -0.537f, 1.025f)
                quadTo(20.4f, 23f, 19.75f, 23f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(1.4f)
                horizontalLineToRelative(-1.4f)
                close()
                moveToRelative(-4.725f, -8f)
                quadToRelative(-0.725f, -1f, -2.037f, -1.5f)
                quadTo(9.975f, 11f, 8.5f, 11f)
                quadToRelative(-1.475f, 0f, -2.787f, 0.5f)
                quadTo(4.4f, 12f, 3.675f, 13f)
                close()
                moveTo(8.5f, 13f)
                close()
                moveTo(2f, 19f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(1f, 18.425f, 1f, 18f)
                reflectiveQuadToRelative(0.288f, -0.712f)
                quadTo(1.575f, 17f, 2f, 17f)
                horizontalLineToRelative(13f)
                quadToRelative(0.425f, 0f, 0.713f, 0.288f)
                quadToRelative(0.287f, 0.287f, 0.287f, 0.712f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(15.425f, 19f, 15f, 19f)
                close()
                moveToRelative(0f, 4f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(1f, 22.425f, 1f, 22f)
                reflectiveQuadToRelative(0.288f, -0.712f)
                quadTo(1.575f, 21f, 2f, 21f)
                horizontalLineToRelative(13f)
                quadToRelative(0.425f, 0f, 0.713f, 0.288f)
                quadToRelative(0.287f, 0.287f, 0.287f, 0.712f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(15.425f, 23f, 15f, 23f)
                close()
            }
        }.build()
    }
}


@Composable
fun rememberCardTravel(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "card_travel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 6f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(8.175f, 2f, 9f, 2f)
                horizontalLineToRelative(6f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(17f, 3.175f, 17f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 7.175f, 22f, 8f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 19.825f, 2f, 19f)
                verticalLineTo(8f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 6f, 4f, 6f)
                close()
                moveToRelative(-3f, 8f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.025f)
                quadToRelative(0f, 0.425f, -0.288f, 0.7f)
                quadTo(16.425f, 10f, 16f, 10f)
                reflectiveQuadToRelative(-0.712f, -0.288f)
                quadTo(15f, 9.425f, 15f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineToRelative(1.025f)
                quadToRelative(0f, 0.425f, -0.287f, 0.7f)
                quadTo(8.425f, 10f, 8f, 10f)
                reflectiveQuadToRelative(-0.713f, -0.288f)
                quadTo(7f, 9.425f, 7f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                close()
                moveToRelative(5f, -8f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                close()
                moveTo(4f, 19f)
                verticalLineTo(8f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberPayments(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "payments",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14f, 13f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(11f, 10f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(14f, 7f)
                quadToRelative(1.25f, 0f, 2.125f, 0.875f)
                reflectiveQuadTo(17f, 10f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(14f, 13f)
                close()
                moveToRelative(-7f, 3f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.588f)
                quadTo(5f, 14.825f, 5f, 14f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(6.175f, 4f, 7f, 4f)
                horizontalLineToRelative(14f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(23f, 5.175f, 23f, 6f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 0.825f, -0.587f, 1.412f)
                quadTo(21.825f, 16f, 21f, 16f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(10f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(20.175f, 12f, 21f, 12f)
                verticalLineTo(8f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.588f)
                quadTo(19f, 6.825f, 19f, 6f)
                horizontalLineTo(9f)
                quadToRelative(0f, 0.825f, -0.588f, 1.412f)
                quadTo(7.825f, 8f, 7f, 8f)
                verticalLineToRelative(4f)
                quadToRelative(0.825f, 0f, 1.412f, 0.587f)
                quadTo(9f, 13.175f, 9f, 14f)
                close()
                moveToRelative(-6f, 6f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(1f, 18.825f, 1f, 18f)
                verticalLineTo(8f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(1.575f, 7f, 2f, 7f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadTo(3f, 7.575f, 3f, 8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(16f)
                quadToRelative(0.425f, 0f, 0.712f, 0.288f)
                quadToRelative(0.288f, 0.287f, 0.288f, 0.712f)
                reflectiveQuadToRelative(-0.288f, 0.712f)
                quadTo(19.425f, 20f, 19f, 20f)
                close()
                moveToRelative(4f, -6f)
                verticalLineTo(6f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberHomeWork(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "home_work",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1.4f)
                lineToRelative(-2f, -1.45f)
                quadToRelative(0f, -0.8f, 0.588f, -1.375f)
                quadTo(11.175f, 3f, 12f, 3f)
                horizontalLineToRelative(9f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(23f, 4.175f, 23f, 5f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(21.825f, 21f, 21f, 21f)
                close()
                moveToRelative(0f, -9.975f)
                close()
                moveTo(1f, 20f)
                verticalLineToRelative(-7.975f)
                quadToRelative(0f, -0.5f, 0.225f, -0.925f)
                quadToRelative(0.225f, -0.425f, 0.625f, -0.7f)
                lineToRelative(5f, -3.575f)
                quadTo(7.375f, 6.45f, 8f, 6.45f)
                quadToRelative(0.625f, 0f, 1.15f, 0.375f)
                lineToRelative(5f, 3.575f)
                quadToRelative(0.4f, 0.275f, 0.625f, 0.7f)
                quadToRelative(0.225f, 0.425f, 0.225f, 0.925f)
                verticalLineTo(20f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(14.425f, 21f, 14f, 21f)
                horizontalLineTo(9f)
                verticalLineToRelative(-5f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(1f, 20.425f, 1f, 20f)
                close()
                moveToRelative(2f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                lineTo(8f, 8.45f)
                lineTo(3f, 12f)
                close()
                moveToRelative(8f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineTo(5f)
                verticalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberMonetizationOn(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "monetization_on",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.975f, 19f)
                quadToRelative(0.35f, 0f, 0.613f, -0.262f)
                quadToRelative(0.262f, -0.263f, 0.262f, -0.613f)
                verticalLineToRelative(-0.375f)
                quadToRelative(1.25f, -0.225f, 2.15f, -0.975f)
                quadToRelative(0.9f, -0.75f, 0.9f, -2.225f)
                quadToRelative(0f, -1.05f, -0.6f, -1.925f)
                reflectiveQuadTo(12.9f, 11.1f)
                quadToRelative(-1.5f, -0.5f, -2.075f, -0.875f)
                quadToRelative(-0.575f, -0.375f, -0.575f, -1.025f)
                quadToRelative(0f, -0.65f, 0.463f, -1.025f)
                quadToRelative(0.462f, -0.375f, 1.337f, -0.375f)
                quadToRelative(0.5f, 0f, 0.875f, 0.175f)
                reflectiveQuadToRelative(0.625f, 0.475f)
                quadToRelative(0.25f, 0.3f, 0.563f, 0.413f)
                quadToRelative(0.312f, 0.112f, 0.587f, -0.013f)
                quadToRelative(0.375f, -0.15f, 0.513f, -0.513f)
                quadToRelative(0.137f, -0.362f, -0.063f, -0.662f)
                quadToRelative(-0.4f, -0.575f, -0.987f, -0.975f)
                quadToRelative(-0.588f, -0.4f, -1.263f, -0.45f)
                verticalLineToRelative(-0.375f)
                quadToRelative(0f, -0.35f, -0.263f, -0.613f)
                quadTo(12.375f, 5f, 12.025f, 5f)
                reflectiveQuadToRelative(-0.612f, 0.262f)
                quadToRelative(-0.263f, 0.263f, -0.263f, 0.613f)
                verticalLineToRelative(0.375f)
                quadToRelative(-1.25f, 0.275f, -1.95f, 1.1f)
                quadToRelative(-0.7f, 0.825f, -0.7f, 1.85f)
                quadToRelative(0f, 1.175f, 0.688f, 1.9f)
                quadToRelative(0.687f, 0.725f, 2.162f, 1.25f)
                quadToRelative(1.575f, 0.575f, 2.188f, 1.025f)
                quadToRelative(0.612f, 0.45f, 0.612f, 1.175f)
                quadToRelative(0f, 0.825f, -0.588f, 1.212f)
                quadToRelative(-0.587f, 0.388f, -1.412f, 0.388f)
                quadToRelative(-0.65f, 0f, -1.175f, -0.313f)
                quadToRelative(-0.525f, -0.312f, -0.875f, -0.937f)
                quadToRelative(-0.2f, -0.35f, -0.525f, -0.475f)
                reflectiveQuadToRelative(-0.65f, 0f)
                quadToRelative(-0.35f, 0.125f, -0.512f, 0.475f)
                quadToRelative(-0.163f, 0.35f, -0.013f, 0.675f)
                quadToRelative(0.4f, 0.85f, 1.075f, 1.387f)
                quadToRelative(0.675f, 0.538f, 1.625f, 0.738f)
                verticalLineToRelative(0.425f)
                quadToRelative(0f, 0.35f, 0.263f, 0.613f)
                quadToRelative(0.262f, 0.262f, 0.612f, 0.262f)
                close()
                moveTo(12f, 22f)
                quadToRelative(-2.075f, 0f, -3.9f, -0.788f)
                quadToRelative(-1.825f, -0.787f, -3.175f, -2.137f)
                quadToRelative(-1.35f, -1.35f, -2.137f, -3.175f)
                quadTo(2f, 14.075f, 2f, 12f)
                reflectiveQuadToRelative(0.788f, -3.9f)
                quadToRelative(0.787f, -1.825f, 2.137f, -3.175f)
                quadToRelative(1.35f, -1.35f, 3.175f, -2.138f)
                quadTo(9.925f, 2f, 12f, 2f)
                reflectiveQuadToRelative(3.9f, 0.787f)
                quadToRelative(1.825f, 0.788f, 3.175f, 2.138f)
                quadToRelative(1.35f, 1.35f, 2.137f, 3.175f)
                quadTo(22f, 9.925f, 22f, 12f)
                reflectiveQuadToRelative(-0.788f, 3.9f)
                quadToRelative(-0.787f, 1.825f, -2.137f, 3.175f)
                quadToRelative(-1.35f, 1.35f, -3.175f, 2.137f)
                quadTo(14.075f, 22f, 12f, 22f)
                close()
                moveToRelative(0f, -10f)
                close()
                moveToRelative(0f, 8f)
                quadToRelative(3.325f, 0f, 5.663f, -2.337f)
                quadTo(20f, 15.325f, 20f, 12f)
                reflectiveQuadToRelative(-2.337f, -5.663f)
                quadTo(15.325f, 4f, 12f, 4f)
                reflectiveQuadTo(6.338f, 6.337f)
                quadTo(4f, 8.675f, 4f, 12f)
                reflectiveQuadToRelative(2.338f, 5.663f)
                quadTo(8.675f, 20f, 12f, 20f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberVideogameAsset(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "videogame_asset",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 18f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 16.825f, 2f, 16f)
                verticalLineTo(8f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 6f, 4f, 6f)
                horizontalLineToRelative(16f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 7.175f, 22f, 8f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 18f, 20f, 18f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(4f, -1f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(9f, 14.425f, 9f, 14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(11f, 12.425f, 11f, 12f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(10.425f, 11f, 10f, 11f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -0.425f, -0.287f, -0.713f)
                quadTo(8.425f, 9f, 8f, 9f)
                reflectiveQuadToRelative(-0.713f, 0.287f)
                quadTo(7f, 9.575f, 7f, 10f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                quadToRelative(-0.425f, 0f, -0.713f, 0.287f)
                quadTo(5f, 11.575f, 5f, 12f)
                reflectiveQuadToRelative(0.287f, 0.712f)
                quadTo(5.575f, 13f, 6f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 0.425f, 0.287f, 0.712f)
                quadTo(7.575f, 15f, 8f, 15f)
                close()
                moveToRelative(6.5f, 0f)
                quadToRelative(0.625f, 0f, 1.062f, -0.438f)
                quadTo(16f, 14.125f, 16f, 13.5f)
                reflectiveQuadToRelative(-0.438f, -1.062f)
                quadTo(15.125f, 12f, 14.5f, 12f)
                reflectiveQuadToRelative(-1.062f, 0.438f)
                quadTo(13f, 12.875f, 13f, 13.5f)
                reflectiveQuadToRelative(0.438f, 1.062f)
                quadTo(13.875f, 15f, 14.5f, 15f)
                close()
                moveToRelative(3f, -3f)
                quadToRelative(0.625f, 0f, 1.062f, -0.438f)
                quadTo(19f, 11.125f, 19f, 10.5f)
                reflectiveQuadToRelative(-0.438f, -1.062f)
                quadTo(18.125f, 9f, 17.5f, 9f)
                reflectiveQuadToRelative(-1.062f, 0.438f)
                quadTo(16f, 9.875f, 16f, 10.5f)
                reflectiveQuadToRelative(0.438f, 1.062f)
                quadTo(16.875f, 12f, 17.5f, 12f)
                close()
                moveTo(4f, 16f)
                verticalLineTo(8f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
    }
}