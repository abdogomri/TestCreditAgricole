package com.abdo.creditagricole.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdo.creditagricole.presentation.models.AccountUiData
import com.abdo.creditagricole.presentation.models.BanksUiData
import com.abdo.creditagricole.presentation.models.OperationUiData
import com.abdo.creditagricole.ui.theme.Elevation

@Composable
fun CollapsibleBankItem(
    banksUiData: BanksUiData,
    onAccountClicked: (OperationUiData) -> Unit
) {
    val localDensity = LocalDensity.current
    var componentHeight by remember { mutableStateOf(0.dp) }
    var accountsVisibility by rememberSaveable { mutableStateOf(false) }

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
            Column(modifier = Modifier.fillMaxWidth()) {
                CollapsibleBankItemHeader(
                    bankName = banksUiData.bankName,
                    balance = banksUiData.balance,
                    currency = banksUiData.currency,
                    onBankHeaderClicked = { accountsVisibility = it }
                )
                AnimatedVisibility(visible = accountsVisibility) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        banksUiData.accounts.forEach {
                            AccountItem(
                                accountUiData = it,
                                onItemClicked = onAccountClicked
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun CollapsibleBankItemHeader(
    bankName: String,
    balance: Double,
    currency: String,
    onBankHeaderClicked: (Boolean) -> Unit
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    val angle: Float by animateFloatAsState(
        targetValue = if (expanded) 180f else 0f
    )
    Row {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(start = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier.weight(4f),
                text = bankName,
                style = TextStyle(fontSize = MaterialTheme.typography.bodyMedium.fontSize)
            )
            Text(
                textAlign = TextAlign.End,
                text = "$balance $currency",
                style = getBalanceTextStyle(balance = balance)
            )
            IconButton(
                modifier = Modifier.rotate(degrees = angle),
                onClick = {
                    expanded = !expanded
                    onBankHeaderClicked(expanded)
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Drop Down Icon"
                )
            }
        }
    }
}

@Preview
@Composable
fun BankSectionItemPreview() {
    val fakeData = AccountUiData(
        accountId = "0",
        holderName = "Corinne Martin",
        accountLabel = "Compte Mozaïc",
        balance = 2022331.84,
        operations = OperationUiData(
            balance = 2022331.84,
            currency = "",
            holderName = "",
            accountLabel = "",
            operations = mapOf(),
        )
    )
    CollapsibleBankItem(
        banksUiData = BanksUiData(
            bankName = "CA Languedoc",
            balance = 2022331.84,
            accounts = listOf(
                fakeData,
                fakeData.copy(accountId = "1"),
                fakeData.copy(accountId = "2")
            )
        ),
        onAccountClicked = {}
    )


}

