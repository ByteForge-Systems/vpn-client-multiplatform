package ru.byteforge.vpn.vpn.presentation.connect_screen

import ru.byteforge.vpn.vpn.domain.entity.Config

data class ConnectState(
    val isLoading: Boolean = true,
    val config: Config? = null
)
