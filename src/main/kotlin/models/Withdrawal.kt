package models

import functions.executeOperation
import functions.withdrawal

class Withdrawal(amount: Float, balance: Float) : AccountOperation(amount = amount, balance = balance) {

    override fun proceed(): Float = executeOperation(balance = balance, amount = amount, operation = withdrawal)

    override fun print(): String = "type: Withdrawal, localDate: $date, amount: -$amount , balance= $balance"
}