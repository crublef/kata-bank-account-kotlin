package services

import models.Account
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class AccountDepositServiceTest {

    private val accountDepositService = AccountDepositService()

    @Test
    fun `Depositing an amount to my account`() {
        // Data
        val account = Account()

        // Test
        accountDepositService.deposit(account, 100f)

        // Assert
        Assertions.assertEquals(account.balance, 100f)
    }
}