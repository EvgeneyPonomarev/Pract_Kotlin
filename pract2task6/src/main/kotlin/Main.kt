fun createReverseIterator(input: String): () -> Char? {
    var index = input.length - 1

    return {
        if (index >= 0) {
            val char = input[index]
            index--
            char
        } else {
            null
        }
    }
}

fun main() {
    val inputString = "Hello, World!"
    val reverseIterator = createReverseIterator(inputString)

    var char: Char?
    do {
        char = reverseIterator()
        if (char != null) {
            print(char)
        }
    } while (char != null)
}