//Задание 4
fun findWordByCondition(
    inputString: String,
    lengthCondition: (Int, Int) -> Boolean,
    wordCondition: (String) -> Boolean
): Char? {
    var wordStart = 0
    var firstWordStart = 0
    var firstWordEnd = -1

    for (i in inputString.indices) {
        if (inputString[i] == ' ' || i == inputString.length - 1) {
            val wordEnd = if (i == inputString.length - 1) i else i - 1

            if (wordCondition(inputString.substring(wordStart, wordEnd + 1))) {
                val wordLength = wordEnd - wordStart + 1
                if (lengthCondition(wordLength, firstWordEnd - firstWordStart + 1) || firstWordEnd == -1) {
                    firstWordStart = wordStart
                    firstWordEnd = wordEnd
                }
            }
            wordStart = i + 1
        }
    }
    return if (firstWordEnd != -1 && firstWordEnd - firstWordStart >= 1) {
        inputString[firstWordStart + 1]
    } else {
        null
    }
}

fun main() {
    val writeString = readlnOrNull() ?: ""

    val lengthCondition: (Int, Int) -> Boolean = { newLength, currentLength -> newLength < currentLength }
    val wordCondition: (String) -> Boolean = { it.length % 2 == 0 }

    val twoChar = findWordByCondition(writeString, lengthCondition, wordCondition)

    if (twoChar != null) {
        println("Второй символ в первом коротком слове с четным числом символов: $twoChar")
    } else {
        println("Слово не найдено")
    }
}