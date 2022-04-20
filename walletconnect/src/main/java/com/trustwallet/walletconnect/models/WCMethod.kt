package com.trustwallet.walletconnect.models

import com.google.gson.annotations.SerializedName

enum class WCMethod {
    @SerializedName("wc_sessionRequest")
    SESSION_REQUEST,

    @SerializedName("wc_sessionUpdate")
    SESSION_UPDATE,

    @SerializedName("eth_sign")
    ETH_SIGN,

    @SerializedName("personal_sign")
    ETH_PERSONAL_SIGN,

    @SerializedName("eth_signTypedData")
    ETH_SIGN_TYPE_DATA,

    @SerializedName("eth_signTransaction")
    ETH_SIGN_TRANSACTION,

    @SerializedName("eth_sendTransaction")
    ETH_SEND_TRANSACTION,

    @SerializedName("bnb_sign")
    BNB_SIGN,

    @SerializedName("bnb_tx_confirmation")
    BNB_TRANSACTION_CONFIRM,

    @SerializedName("get_accounts")
    GET_ACCOUNTS,

    @SerializedName("trust_signTransaction")
    SIGN_TRANSACTION,

    @SerializedName("keplr_enable_wallet_connect_v1")
    KEPLR_ENABLE_V1,

    @SerializedName("keplr_get_key_wallet_connect_v1")
    KEPLR_GET_KEY_V1,

    @SerializedName("keplr_sign_amino_wallet_connect_v1")
    KEPLR_SIGN_AMINO_V1,

    @SerializedName("cosmostation_wc_accounts_v1")
    COSMOSTATION_WC_ACCOUNTS_V1,

    @SerializedName("cosmostation_wc_sign_tx_v1")
    COSMOSTATION_WC_SIGN_TX_V1;
}