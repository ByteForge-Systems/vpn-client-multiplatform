package ru.byteforge.vpn.di

import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.byteforge.vpn.vpn.presentation.connect_screen.ConnectViewModel

expect val platformModule: Module

val sharedModule = module {
    viewModelOf(::ConnectViewModel)
}