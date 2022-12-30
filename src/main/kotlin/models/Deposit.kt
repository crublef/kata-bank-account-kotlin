package models

import functions.deposit
import functions.executeOperation

class Deposit(amount: Float, balance: Float) : AccountOperation(amount = amount, balance = balance) {

    override fun proceed(): Float = executeOperation(amount = amount, balance = balance, deposit)

    override fun print(): String = "type: Deposit, localDate: $date, amount: $amount , balance= $balance"
}