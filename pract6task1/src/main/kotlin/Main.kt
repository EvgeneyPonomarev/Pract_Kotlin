fun sumFunctions(vararg functions: (Any) -> Int): (Any) -> Int {
    return { input ->
        var sum = 0
        for (function in functions) {
            sum += function(input)
        }
        sum
    }
}

fun main() {
    // Пример использования sumFunctions

    // Функция, возвращающая квадрат числа
    val square: (Int) -> Int = { x -> x * x }

    // Функция, возвращающая длину строки
    val stringLength: (String) -> Int = { s -> s.length }

    // Функция, возвращающая хэш-код объекта
    val hashCode: (Any) -> Int = { obj -> obj.hashCode() }

    // Функция, возвращающая первую цифру числа
    val firstDigit: (Int) -> Int = { x -> x.toString().first().toInt() }

    // Создание новой функции, суммирующей результаты функций square и stringLength
    val sumFunction = sumFunctions(square, stringLength)

    // Вызов новой функции с параметром "Hello" и вывод результата
    val result1 = sumFunction("Hello")
    println("Сумма результатов функций square и stringLength: $result1")

    // Создание новой функции, суммирующей результаты функций hashCode и firstDigit
    val sumFunction2 = sumFunctions(hashCode, firstDigit)

    // Вызов новой функции с параметром 123 и вывод результата
    val result2 = sumFunction2(123)
    println("Сумма результатов функций hashCode и firstDigit: $result2")
}