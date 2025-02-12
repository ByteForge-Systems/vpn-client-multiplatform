package ru.byteforge.vpn.vpn.data.repository

import ru.byteforge.vpn.core.domain.DataError
import ru.byteforge.vpn.core.domain.Result
import ru.byteforge.vpn.vpn.data.network.RemoteConfigDataSource
import ru.byteforge.vpn.vpn.domain.entity.Config
import ru.byteforge.vpn.vpn.domain.repository.ConfigRepository

class ConfigRepositoryImpl(
    private val remoteConfigDataSource: RemoteConfigDataSource
): ConfigRepository {
    override suspend fun getConfig(): Result<Config, DataError.Remote> {
        TODO("Not yet implemented")
    }
}