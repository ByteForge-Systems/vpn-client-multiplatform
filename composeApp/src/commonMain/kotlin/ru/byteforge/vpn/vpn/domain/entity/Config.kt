package ru.byteforge.vpn.vpn.domain.entity

data class Config(
    val uuid: String,
    val ipAddress: String,
    val privateKey: String,
    val type: String,
    val security: String,
    val encryption: String?,
    val fp: String,
    val flow: String,
    val sni: String,
    val serverName: String?,
)
