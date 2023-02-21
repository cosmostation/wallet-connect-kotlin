package com.trustwallet.walletconnect.models.cosmostation

data class WCCosmostationAccount(
    val name: String,
    val algo: String,
    val pubKey: String,
    val address: ByteArray,
    val bech32Address: String,
)