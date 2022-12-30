package services

import models.Account
import models.Deposit

class AccountDepositService {

    fun deposit(account: Account, amount: Float) {
        val deposit = Deposit(amount = amount, balance = account.balance)
        account.balance = deposit.proceed()
        account.addOperation(deposit)
    }
}