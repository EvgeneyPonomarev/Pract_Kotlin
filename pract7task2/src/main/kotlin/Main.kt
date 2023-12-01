class CustomList<T> {
    private var list = mutableListOf<T>()

    fun push(el: T): Boolean {
        list.add(0, el)
        return true
    }

    fun delete(): Boolean {
        if (list.isEmpty()) {
            return false
        } else {
            list.removeAt(0)
            return true
        }
    }

    fun eraseAll() {
        list.clear()
    }

    fun print() {
        for (element in list) {
            println(element)
        }
    }
}

fun main() {
    val customList = CustomList<Int>()

    customList.push(1)
    customList.push(2)
    customList.push(3)

    customList.print()

    customList.delete()

    customList.print()

    customList.eraseAll()

    customList.print()
}