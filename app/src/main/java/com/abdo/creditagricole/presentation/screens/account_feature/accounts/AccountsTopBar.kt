@file:OptIn(ExperimentalMaterial3Api::class)

package com.abdo.creditagricole.presentation.screens.account_feature.accounts

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.abdo.creditagricole.R

@Composable
fun AccountsTopBar(
    scrollBehavior: TopAppBarScrollBehavior,
    @StringRes titleRes: Int
) {
    CenterAlignedTopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = titleRes),
                style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
        }
    )
}

@Preview
@Composable
fun AccountsTopBarPreview() {
    AccountsTopBar(titleRes = R.string.my_accounts, scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior())
}