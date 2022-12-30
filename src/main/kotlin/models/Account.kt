package models

import interfaces.IAccountOperation

data class Account(var balance: Float = 0f) {
    private var operations: MutableList<IAccountOperation> = mutableListOf()

    fun listOperations(): List<IAccountOperation> {
        return operations
    }

    fun addOperation(operation: IAccountOperation) {
        operations.add(operation)
    }
}
