//Задание 3
fun main() = println(readlnOrNull()
    ?.split("\\s+")
    ?.filter { it.length % 2 == 0 }
    ?.minByOrNull { it.length }
    ?.getOrNull(1))