package day2

data class Policy(val character: Char, val amount: IntRange) {
    fun checkMatch(input: String) : Boolean {
        return (input.length > amount.first-1 && input[amount.first-1] == character) xor (input.length > amount.last-1 && input[amount.last-1] == character)
    }
}
