package ru.byteforge.vpn.vpn.presentation.connect_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ru.byteforge.vpn.core.presentation.SandYellow

@Composable
fun ConnectScreenRoot(
    viewModel: ConnectViewModel
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    ConnectScreen(
        state = state,
        onAction = { action ->
                viewModel.onAction(action)
            }
    )
}

@Composable
private fun ConnectScreen(
    state: ConnectState,
    onAction: (ConnectAction) -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SandYellow),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { onAction(ConnectAction.ConnectVpn) },
            modifier = Modifier
                .size(200.dp),
            shape = CircleShape
        ) {
            Text(
                text = "Connect"
            )
        }
    }
}