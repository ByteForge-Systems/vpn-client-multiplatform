package ru.byteforge.vpn

import android.app.Application
import org.koin.android.ext.koin.androidContext
import ru.byteforge.vpn.di.initKoin

class VpnApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@VpnApplication)
        }
    }
}