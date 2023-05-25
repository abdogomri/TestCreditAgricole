package com.creditagricole.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.creditagricole.ui.R
import com.creditagricole.ui.models.Operation
import com.creditagricole.ui.models.OperationCategory
import com.creditagricole.ui.theme.Elevation


@Composable
fun OperationItem(
    operation: Operation
) {
    val iconBackgroundColor: Color = MaterialTheme.colorScheme.surfaceVariant
    val localDensity = LocalDensity.current
    var componentHeight by remember { mutableStateOf(0.dp) }
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
    ) {
        Spacer(modifier = Modifier.width(14.dp))
        Surface(
            modifier = Modifier
                .width(2.dp)
                .height(componentHeight + 14.dp),
            tonalElevation = Elevation.Level1
        ) {}
        Spacer(modifier = Modifier.width(20.dp))
        Surface(
            modifier = Modifier
                .clip(Shapes().medium)
                .onGloballyPositioned {
                    componentHeight = with(localDensity) {
                        it.size.height.toDp()
                    }
                },
            tonalElevation = Elevation.Level1
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 14.dp, end = 10.dp)
                    .padding(vertical = 14.dp),
            ) {
                Icon(
                    imageVector = operation.operationType.iconImage.invoke(),
                    contentDescription = stringResource(R.string.operation_icon),
                    modifier = Modifier
                        .size(40.dp)
                        .padding(8.dp)
                        .drawBehind {
                            drawCircle(
                                color = iconBackgroundColor,
                                radius = this.size.maxDimension
                            )
                        },
                    tint = Color.Unspecified
                )
                Column(
                    modifier = Modifier
                        .weight(4f)
                        .padding(start = 14.dp),
                ) {
                    Text(
                        text = operation.operationTitle,
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = stringResource(id = operation.operationType.categoryRes),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
                Text(
                    text = "${operation.amount} ${operation.currency}",
                    style = getAmountTextStyle(operation.amount),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}

@Preview
@Composable
fun OperationItemPreview() {
    OperationItem(
        operation = Operation(
            operationType = OperationCategory.LEISURE,
            operationTitle = "Orange",
            amount = "-15,99",
        )
    )
}