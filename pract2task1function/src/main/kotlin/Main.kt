//Задание 1.1
//В строке указано несколько неотрицательных целых чисел, разделенных пробелами
//(по одному пробелу между числами). Какие цифры присутствуют ровно в одном числе
//дважды?
fun calculateSumOfEveryThirdDigit(number: Int): Int {
    var n = number
    var sum = 0
    var position = 1

    while (n > 0) {
        val digit = n % 10
        if (position % 3 == 0) {
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
        val sum = calculateSumOfEveryThirdDigit(numberInt)
        println("$sum")
    } else {
        println("неверно")
    }
}