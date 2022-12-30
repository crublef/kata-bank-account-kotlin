package models

import interfaces.IAccountOperation
import java.time.LocalDate

abstract class AccountOperation(val date: LocalDate = LocalDate.now(), val amount: Float, val balance: Float): IAccountOperation