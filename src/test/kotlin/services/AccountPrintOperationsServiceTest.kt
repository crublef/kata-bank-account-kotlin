package services

import models.Account
import models.Deposit
import models.Withdrawal
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class AccountPrintOperationsServiceTest {

    private val accountPrintOperationsService = AccountPrintOperationsService()

    @Test
    fun `Printing all operations from my account`() {

        // Data
        val account = Account()
        account.addOperation(Deposit(100f, 0f))
        account.addOperation(Deposit(25f, 100f))
        account.addOperation(Withdrawal(50f, 85f))

        // Test
        val expected = accountPrintOperationsService.print(account)

        // Assert
        assertEquals(expected, "type: Deposit, localDate: 2022-12-30, amount: 100.0 , balance= 0.0/ntype: Deposit, localDate: 2022-12-30, amount: 25.0 , balance= 100.0/ntype: Withdrawal, localDate: 2022-12-30, amount: -50.0 , balance= 85.0")
    }
}