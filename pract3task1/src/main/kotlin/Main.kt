//Задание 1
fun main(args: Array<String>) {
    println((readlnOrNull() ?: "").toIntOrNull()?.toString()?.reversed()?.mapIndexed { index, char -> if ((index + 1) % 3 == 0) char.digitToIntOrNull() ?: 0 else 0 }?.sum()?.let { if (it > 0) it.toString() else "неверно" })
}