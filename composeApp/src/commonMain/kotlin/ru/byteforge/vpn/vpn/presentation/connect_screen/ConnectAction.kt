package ru.byteforge.vpn.vpn.presentation.connect_screen

import ru.byteforge.vpn.vpn.domain.entity.Config

sealed interface ConnectAction {
    data object ConnectVpn: ConnectAction
    data class OnSelectedServerChanged(val config: Config): ConnectAction
}