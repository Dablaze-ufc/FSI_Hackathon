package com.phoenix.fsihackathon.data

/**
 * Created by SegunFrancis
 */
object UserDataSource {
    private var usersList: List<User> = ArrayList()
    private val user1 = User(
        "John Doe",
        UserBankDetails(listOf("FCMB", "Zenith Bank", "Access Bank"), listOf(1822.11, 3582.25, 232190.0)),
        24281
    )
    private val user2 = User(
        "Clark Peterson",
        UserBankDetails(listOf("UBA", "Zenith Bank", "Union Bank"), listOf(822.50, 3582.1, 922190.25)),
        29012
    )
    private val user3 = User(
        "Andrea Romero",
        UserBankDetails(listOf("First Bank", "GTB", "Access Bank"), listOf(13822.50, 673582.1, 93190.11)),
        90221
    )
    private val user4 = User(
        "Natasha Brownfield",
        UserBankDetails(listOf("Union Bank", "Diamond Bank", "Zenith Bank"), listOf(413822.10, 582.50, 2190.0)),
        32181
    )
    private val user5 = User(
        "Mike Johnson",
        UserBankDetails(listOf("Unity Bank", "Keystone Bank", "MainStreet Bank"), listOf(73822.25, 82.1, 2190.50)),
        12381
    )

    fun getData(): List<User> {
        (usersList as ArrayList).add(user1)
        (usersList as ArrayList).add(user2)
        (usersList as ArrayList).add(user3)
        (usersList as ArrayList).add(user4)
        (usersList as ArrayList).add(user5)
        return usersList
    }
}