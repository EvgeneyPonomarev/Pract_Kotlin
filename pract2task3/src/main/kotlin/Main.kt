//Задание 3.1
fun calculateSumOfDigits(number: Int, condition: (Int) -> Boolean = { it % 3 == 0 }): Int {
    var n = number
    var sum = 0
    var position = 1

    while (n > 0) {
        val digit = n % 10
        if (condition(position)) {
            sum += digit
        }
        n /= 10
        position++
    }
    return sum
}

fun main(args: Array<String>) {
    val numberString = readlnOrNull() ?: ""
    val numberInt: Int? = numberString.toIntOrNull()

    if (numberInt != null) {
        val sum = calculateSumOfDigits(numberInt)
        println("$sum")
    } else {
        println("неверно")
    }
}