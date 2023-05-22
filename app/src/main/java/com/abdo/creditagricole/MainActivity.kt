package com.abdo.creditagricole

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.abdo.creditagricole.navigation.root.Graph
import com.abdo.creditagricole.navigation.root.RootNavGraph
import com.abdo.creditagricole.ui.theme.CreditAgricoleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CreditAgricoleTheme {
                val navHostController = rememberNavController()
                RootNavGraph(
                    navHostController = navHostController,
                    startDestination = Graph.MAIN_GRAPH
                )
            }
        }
    }
}
