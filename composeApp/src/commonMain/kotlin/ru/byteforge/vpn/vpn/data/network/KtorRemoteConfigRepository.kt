package ru.byteforge.vpn.vpn.data.network

import io.ktor.client.HttpClient
import ru.byteforge.vpn.core.domain.DataError
import ru.byteforge.vpn.core.domain.Result
import ru.byteforge.vpn.vpn.data.dto.ConfigDto

private const val BASE_URL = "http://"

class KtorRemoteConfigRepository(
    private val httpClient: HttpClient
): RemoteConfigDataSource {

    override suspend fun getConfig(): Result<ConfigDto, DataError.Remote> {
        TODO("Not yet implemented")
    }

}