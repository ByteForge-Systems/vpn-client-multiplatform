package ru.byteforge.vpn

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ru.byteforge.vpn.app.App
import ru.byteforge.vpn.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "VpnClientMultiplatform",
        ) {
            App()
        }
    }
}