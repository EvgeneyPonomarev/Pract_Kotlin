import java.util.regex.Pattern

fun checkWhileLoop(input: String): Boolean {

    val argwhile = "\\s*[a-zA-Z_]+[a-zA-Z0-9_]*\\s*(?:<|<=|>|>=|==|<>)\\s*'((?:[^']|'')*)'\\s*do"
    val regex = "^while$argwhile(?:\\s*while$argwhile\\s*do)*\\s*writeln\\s*\\(\\s*((?:(?:-?\\d+|[a-zA-Z_]+[a-zA-Z0-9_]*)\\s*[-+*/]\\s*)+(?:-?\\d+|[a-zA-Z_]+[a-zA-Z0-9_]*))\\s*\\);\\s*$"
    val pattern = Pattern.compile(regex)
    val matcher = pattern.matcher(input)

    return matcher.matches()
}

fun main() {
    print("Введите строку: ")
    val input = readLine() ?: ""
    if (checkWhileLoop(input)) {
        println("Готово")
    } else {
        println("Неверно")
    }
}