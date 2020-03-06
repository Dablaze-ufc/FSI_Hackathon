package com.phoenix.fsihackathon.data

import java.util.ArrayList

/**
 * Created by SegunFrancis
 */

object QuestionDataSource {
    private var questions: List<String> = ArrayList()

    private const val question0 = "Welcome to Phoenix Systems\nEnter your unique R code"
    private const val question1 = "Select transaction\n1. Inter-bank Transfer\n2. Check Balance"
    private const val question2 = "Enter Recipient R code"
    private const val question3 = "Enter the amount you want to transfer"
    private const val question4 = "Select the bank you want to transfer from"
    private const val question5 = "Select the bank of the recipient"
    private const val question6 = "Enter OTP"
    private const val question7 = "Transfer Successful"
    private const val question8 = "Select bank"
    private const val question9 = "Select the bank of the recipient you want to transfer to"

    fun getQuestions(): List<String> {
        (questions as ArrayList).add(question0)
        (questions as ArrayList).add(question1)
        (questions as ArrayList).add(question2)
        (questions as ArrayList).add(question3)
        (questions as ArrayList).add(question4)
        (questions as ArrayList).add(question5)
        (questions as ArrayList).add(question6)
        (questions as ArrayList).add(question7)
        (questions as ArrayList).add(question8)
        (questions as ArrayList).add(question9)
        return questions
    }
}