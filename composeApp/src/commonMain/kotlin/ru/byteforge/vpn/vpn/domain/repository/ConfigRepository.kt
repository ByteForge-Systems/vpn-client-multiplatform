package ru.byteforge.vpn.vpn.domain.repository

import ru.byteforge.vpn.core.domain.DataError
import ru.byteforge.vpn.core.domain.Result
import ru.byteforge.vpn.vpn.domain.entity.Config

interface ConfigRepository {
    suspend fun getConfig(): Result<Config, DataError.Remote>
}