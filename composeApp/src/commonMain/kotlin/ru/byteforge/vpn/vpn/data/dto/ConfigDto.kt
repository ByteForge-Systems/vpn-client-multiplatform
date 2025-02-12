package ru.byteforge.vpn.vpn.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConfigDto(
    @SerialName("uuid")
    val uuid: String,
    @SerialName("ip")
    val ipAddress: String,
    @SerialName("key")
    val privateKey: String,
    @SerialName("type")
    val type: String,
    @SerialName("security")
    val security: String,
    @SerialName("encryption")
    val encryption: String?,
    @SerialName("fp")
    val fp: String,
    @SerialName("flow")
    val flow: String,
    @SerialName("sni")
    val sni: String,
    @SerialName("server_name")
    val serverName: String?,
)