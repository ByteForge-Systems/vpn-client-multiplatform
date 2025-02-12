package ru.byteforge.vpn.vpn.data.network

import ru.byteforge.vpn.core.domain.DataError
import ru.byteforge.vpn.core.domain.Result
import ru.byteforge.vpn.vpn.data.dto.ConfigDto

interface RemoteConfigDataSource {
    suspend fun getConfig(): Result<ConfigDto, DataError.Remote>
}