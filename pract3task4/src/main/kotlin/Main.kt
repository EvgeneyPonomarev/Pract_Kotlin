fun main() {
    val numbers = readlnOrNull()?.takeIf { it.matches(Regex("\\d+( \\d+)*")) }?.
    split(" ")?.
    mapNotNull { it.getOrNull(1)?.digitToInt() }?.
    fold(0) { acc, digit -> (acc and digit).inv() }.
    let {if (it != null) {
        println("Побитовая стрелка Пирса вторых цифр всех чисел: $it")
    } else {
        println("Ввод некорректный.")
    }
    }
}