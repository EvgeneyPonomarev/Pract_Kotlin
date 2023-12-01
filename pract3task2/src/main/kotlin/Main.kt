//Задание 2
fun main() = generateSequence { readlnOrNull() }.

map { it.split(" ").
filter { word -> word.length % 2 == 0 && word.isNotEmpty() }.
minByOrNull { word -> word.length }?.
lastOrNull() ?: ' ' }.
forEach(::println)