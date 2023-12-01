fun main() {
    println("Введите число:")
    val number = readlnOrNull()?.toIntOrNull() ?: return

    // Проверяем ограничение на количество цифр
    if (number !in 0..9999) {
        println("Ошибка: число должно содержать не более 4 цифр")
        return
    }

    var sum = 0
    var position = 1

    // Считаем сумму цифр, стоящих на позициях, номера которых кратны трём
    var tempNumber = number
    while (tempNumber > 0) {
        if (position % 3 == 0) {
            sum += tempNumber % 10
        }

        tempNumber /= 10
        position++
    }

    println("Сумма цифр на позициях, номера которых кратны трём: $sum")
}