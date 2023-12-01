//Задание 3.2
tailrec fun calculateSumOfDigitsTailRec(
    number: Int,
    position: Int = 1,
    sum: Int = 0,
    condition: (Int) -> Boolean =  { it % 3 == 0 }
): Int {
    if (number == 0) {
        return sum
    }

    val digit = number % 10
    val newSum = if (condition(position)) {
        sum + digit
    } else {
        sum
    }

    return calculateSumOfDigitsTailRec(number / 10, position + 1, newSum, condition)
}

fun main(args: Array<String>) {
    val numberString = readlnOrNull() ?: ""
    val numberInt: Int? = numberString.toIntOrNull()

    if (numberInt != null) {
        val sum = calculateSumOfDigitsTailRec(numberInt)
        println("$sum")
    } else {
        println("не очень")
    }
}