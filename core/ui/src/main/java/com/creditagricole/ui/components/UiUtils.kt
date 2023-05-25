package com.creditagricole.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.creditagricole.ui.theme.PositiveColor

@Composable
fun getBalanceTextStyle(balance: Double): TextStyle {
    return if (balance <= 0) {
        TextStyle(
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
    } else {
        TextStyle(
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun getAmountTextStyle(balance: String): TextStyle {
    return if (balance.contains('+')) {
        TextStyle(
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            color = PositiveColor,
            fontWeight = FontWeight.Bold
        )
    } else {
        TextStyle(
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}