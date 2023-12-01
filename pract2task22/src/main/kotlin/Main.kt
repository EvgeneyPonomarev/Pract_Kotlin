//Задание 2.2
tailrec fun calculateSumOfEveryThirdDigitTailRec(
    number: Int,
    position: Int = 1,
    sum: Int = 0
): Int {
    if (number == 0) {
        return sum
    }

    val digit = number % 10
    val newSum = if (isNumberValid(number)) {
        sum + digit
    } else {
        sum
    }

    return calculateSumOfEveryThirdDigitTailRec(number / 10, position + 1, newSum)
}

fun isNumberValid(number: Int): Boolean = number % 3 == 0

fun main(args: Array<String>) {
    val numberString = readLine() ?: ""
    val numberInt = numberString.toIntOrNull()

    if (numberInt != null) {
    } else {
        println("неверно")
    }
}