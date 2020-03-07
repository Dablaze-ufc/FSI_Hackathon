package com.phoenix.fsihackathon.data

/**
 * Created by SegunFrancis
 */
data class UserBankDetails(var bankName: List<String>, var bankBalance: List<Double>) {
    constructor(): this(emptyList<String>(), emptyList<Double>())
}