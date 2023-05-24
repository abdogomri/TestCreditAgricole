@file:OptIn(ExperimentalMaterial3Api::class)

package com.abdo.creditagricole.presentation.screens.account_feature.operations

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.abdo.creditagricole.navigation.Screen

@Composable
fun OperationsScreen(
    operationsScreenUiState: OperationsScreenUiState,
    onBackPressed: () -> Unit
) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            OperationsTopBar(
                titleRes = Screen.Operations.titleResourceId,
                scrollBehavior = scrollBehavior,
                onBackPressed = onBackPressed
            )
        },
        content = {
            OperationsContent(
                paddingValues = it,
                operationUiData = operationsScreenUiState.uiData
            )
        }
    )
}