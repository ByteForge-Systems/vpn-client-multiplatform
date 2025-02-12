package ru.byteforge.vpn.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import ru.byteforge.vpn.vpn.presentation.connect_screen.ConnectScreenRoot
import ru.byteforge.vpn.vpn.presentation.connect_screen.ConnectViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<ConnectViewModel>()
        ConnectScreenRoot(
            viewModel = viewModel
        )
    }
}