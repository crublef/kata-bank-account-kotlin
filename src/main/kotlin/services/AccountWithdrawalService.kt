package services

import models.Account
import models.Withdrawal

class AccountWithdrawalService {

    fun withdrawal(account: Account, amount: Float) {
        val withdrawal = Withdrawal(amount = amount, balance = account.balance)
        account.balance = withdrawal.proceed()
        account.addOperation(withdrawal)
    }
}