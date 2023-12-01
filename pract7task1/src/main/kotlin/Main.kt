fun main() {
    val multiplyFunc = multiplyFunctions(::square, ::triple)
    val result = multiplyFunc(2)
    println(result)
    println()
}

fun <T> multiplyFunctions(vararg functions: (T) -> Int): (T) -> Int {
    return { param ->
        var result = 1
        for (function in functions) {
            result *= function(param)
        }
        result
    }
}

fun square(x: Int): Int {
    return x * x
}

fun triple(x: Int): Int {
    return x * 3
}