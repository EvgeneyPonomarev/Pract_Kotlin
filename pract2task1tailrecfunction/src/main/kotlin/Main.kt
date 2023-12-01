//Задание 1.2
// Найдите второй символ в первом самом коротком слове в строке с четным числом
//символов (в строке указываются только слова, разделенные одним или несколькими
//пробелами).
tailrec fun calculateSumOfEveryThirdDigitTailRec(
    number: Int,
    position: Int = 1,
    sum: Int = 0
): Int {
    if (number == 0) {
        return sum
    }

    val digit = number % 10
    val newSum = if (position % 3 == 0) {
        sum + digit
    } else {
        sum
    }

    return calculateSumOfEveryThirdDigitTailRec(number / 10, position + 1, newSum)
}

fun main(args: Array<String>) {
    val numberString = readlnOrNull() ?: ""
    val numberInt: Int? = numberString.toIntOrNull()

    if (numberInt != null) {
        val sum = calculateSumOfEveryThirdDigitTailRec(numberInt)
        println("$sum")
    } else {
        println("неверно")
    }
}