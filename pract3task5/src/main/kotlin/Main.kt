fun main() {
    val students = readlnOrNull()?.split(",")?.map { it.trim().split(" ") }
        ?.let { list ->
            require(list.all { it -> it.size >= 3 && it.drop(2).all { it.toDoubleOrNull() != null } }) {
                "Ошибка: Некорректные данные о студентах."
            }
            list.map { it[0] + " " + it[1] to it.drop(2).map(String::toDouble).average() }
        }
        ?.sortedWith(compareByDescending<Pair<String, Double>> { it.second }.thenBy { it.first })
        ?.let { students ->
            students.take(3) + students.drop(3).takeWhile { it.second == students[2].second }
        }

    require(students != null) { "Ошибка: Некорректный ввод данных. Программа завершена." }

    students.forEach { println("${it.first} ${it.second}") }
}

//Улендеев Дима 2, Резчиков Вова 3, Мурашов Анатолий 3, Власов Тимофей 4, Зимин Иван 5, Седов Георгий 2