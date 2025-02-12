package ru.byteforge.vpn

import androidx.compose.ui.window.ComposeUIViewController
import ru.byteforge.vpn.app.App
import ru.byteforge.vpn.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
){ App() }