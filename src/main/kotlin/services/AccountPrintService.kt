package services

import models.Account
import java.util.stream.Collectors

const val LINE_BREAK = "/n"

class AccountPrintOperationsService {

    fun print(account: Account): String {
        return account.listOperations().stream().map { it.print() }.collect(Collectors.joining(LINE_BREAK))
    }
}