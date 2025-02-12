package ru.byteforge.vpn.vpn.data.mapper

import ru.byteforge.vpn.vpn.data.dto.ConfigDto
import ru.byteforge.vpn.vpn.domain.entity.Config

fun ConfigDto.toConfig(): Config {
    return Config(
        uuid = uuid,
        ipAddress = ipAddress,
        privateKey = privateKey,
        type = type,
        security = security,
        encryption = encryption,
        fp = fp,
        flow = flow,
        sni = sni,
        serverName = serverName,
    )
}