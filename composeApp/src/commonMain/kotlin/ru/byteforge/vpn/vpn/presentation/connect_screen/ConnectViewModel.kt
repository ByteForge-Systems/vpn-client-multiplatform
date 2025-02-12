package ru.byteforge.vpn.vpn.presentation.connect_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ConnectViewModel(

): ViewModel() {

    private val _state = MutableStateFlow(ConnectState())
    val state = _state.asStateFlow()


    fun onAction(action: ConnectAction) {
        when (action) {
            is ConnectAction.ConnectVpn -> {
                connect()
            }
            is ConnectAction.OnSelectedServerChanged -> {
                _state.update { it.copy(
                    config = action.config
                )}
            }
        }
    }

    private fun connect() {

    }
}