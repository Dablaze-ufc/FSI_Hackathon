package com.phoenix.fsihackathon.data

/**
 * Created by SegunFrancis
 */

data class User(
    val name: String,
    var bankDetails: UserBankDetails,
    val rCode: Int
) {
    constructor() : this("", UserBankDetails(), 0)
}