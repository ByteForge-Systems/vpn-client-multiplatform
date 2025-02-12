package ru.byteforge.vpn.vpn.domain.usecase

import ru.byteforge.vpn.vpn.domain.repository.ConfigRepository

class GetConfigUseCase(
    private val repository: ConfigRepository
) {
    suspend operator fun invoke() = repository.getConfig()
}