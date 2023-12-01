// Найдите второй символ в первом самом коротком слове в строке с четным числом
//символов (в строке указываются только слова, разделенные одним или несколькими
//пробелами).
fun processWords(
    inputString: String,
    comparison: (Int, Int) -> Boolean,
    condition: (Int) -> Boolean
): Char? {
    var wordStart = 0
    var selectedWordStart = 0
    var selectedWordEnd = -1

    for (i in inputString.indices) {
        if (inputString[i] == ' ' || i == inputString.length - 1) {
            val wordEnd = if (i == inputString.length - 1) i else i - 1
            val wordLength = wordEnd - wordStart + 1

            if (condition(wordLength) &&
                (selectedWordEnd == -1 || comparison(wordLength, selectedWordEnd - selectedWordStart + 1))
            ) {
                selectedWordStart = wordStart
                selectedWordEnd = wordEnd
            }
            wordStart = i + 1
        }
    }

    return if (selectedWordEnd != -1 && selectedWordEnd - selectedWordStart >= 1) {
        inputString[selectedWordStart + 1]
    } else {
        null
    }
}

fun main() {
    val inputString = readlnOrNull() ?: ""

    val findShortestEvenLengthWord: (Int, Int) -> Boolean = { current, selected -> current < selected }
    val isWordEvenLength: (Int) -> Boolean = { it % 2 == 0 }

    val secondChar = processWords(inputString, findShortestEvenLengthWord, isWordEvenLength)

    println("Второй символ в первом коротком слове с четным числом символов: $secondChar")
}