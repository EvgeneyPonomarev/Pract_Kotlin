//В строке указано несколько неотрицательных целых чисел, разделенных пробелами (по одному пробелу между числами).
// Какие цифры присутствуют ровно в одном числе дважды?
fun main() {
    val inputString = readlnOrNull() ?: ""
    val doubleDigitCount = IntArray(10)
    var isDuplicate = false

    var startIndex = 0
    var endIndex = 0

    while (endIndex <= inputString.length) {
        while (endIndex < inputString.length && !inputString[endIndex].isWhitespace()) {
            endIndex++
        }

        if (startIndex < endIndex) {
            val blockLength = endIndex - startIndex
            var hasDuplicate = false
            val digitCount = IntArray(10)

            for (i in 0..<blockLength) {
                val char = inputString[startIndex + i]
                if (char.isDigit()) {
                    val digitValue = char.digitToInt()
                    digitCount[digitValue]++

                    if (digitCount[digitValue] == 2) {
                        doubleDigitCount[digitValue]++
                        hasDuplicate = true
                    } else if (digitCount[digitValue] == 3) {
                        doubleDigitCount[digitValue]--
                    }
                }
            }

            if (hasDuplicate) {
                isDuplicate = true
            }
        }
        startIndex = endIndex + 1
        endIndex++
    }

    var duplicateDigits = ""
    for (i in 0..<10) {
        if (doubleDigitCount[i] == 1) {
            duplicateDigits += "$i "
        }
    }

    if (isDuplicate) {
        println("Цифры, которые присутствуют ровно в одном числе дважды: $duplicateDigits")
    } else {
        println("Нет цифр, которые присутствуют ровно в одном числе дважды.")
    }
}