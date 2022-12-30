package functions

inline fun executeOperation(amount: Float, balance: Float, operation: (Float, Float) -> Float): Float = operation(amount, balance)