//Задание 2.1
//В программах, сделанных в задании №1, вынесите проверяемое условие (то есть то условие, что сформулировано в задании) в отдельную single-expression функцию
fun isNumberValid(number: Int): Boolean = number % 3 == 0

fun calculateSumOfEveryThirdDigit(number: Int): Int {
    var n = number
    var sum = 0
    var position = 1

    while (n > 0) {
        val digit = n % 10
        if (isNumberValid(number)) {
            sum += digit
        }
        n /= 10
        position++
    }
    return sum
}

fun main(args: Array<String>) {
    val numberString = readLine() ?: ""
    val numberInt = numberString.toIntOrNull()

    if (numberInt != null) {
        val sum = calculateSumOfEveryThirdDigit(numberInt)
        if (sum != 404) {
            println("$sum")
        } else {
            println("не очень")
        }
    } else {
        println("не очень")
    }
}