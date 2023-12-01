fun main() {
    readlnOrNull()?.toIntOrNull()?.let { n -> println(generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.takeWhile { it.second < n }.last().first) }
}