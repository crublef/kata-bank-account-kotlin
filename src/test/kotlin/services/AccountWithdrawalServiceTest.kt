package services

import models.Account
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class AccountWithdrawalServiceTest {
    private val accountWithdrawalService = AccountWithdrawalService()

    @Test
    fun `Withdrawing an amountfrom my account`() {
        // Data
        val account = Account()

        // Test
        accountWithdrawalService.withdrawal(account, 100f)

        // Assert
        Assertions.assertEquals(account.balance, -100f)
    }
}