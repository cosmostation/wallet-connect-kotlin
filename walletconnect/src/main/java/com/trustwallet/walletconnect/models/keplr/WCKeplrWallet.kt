package com.trustwallet.walletconnect.models.keplr

data class WCKeplrWallet(
    val name: String,
    val algo: String,
    val pubKey: String,
    val address: ByteArray,
    val bech32Address: String,
    val isNanoLedger: Boolean
)