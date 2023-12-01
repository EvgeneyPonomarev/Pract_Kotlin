import java.util.*

// Класс для представления поселка
data class Village(
    val name: String,
    val developer: String,
    val area: Double,
    val population: Int
)

// Интерфейс для базы данных поселков
interface VillageDatabase {
    fun addVillage(village: Village)
    fun updateVillage(name: String, newVillage: Village)
    fun removeVillage(name: String)
    fun sortBy(field: String)
    fun searchByName(name: String): Village?
    fun displayDatabase()
}

// Класс для управления базой данных поселков
class VillageDatabaseImpl : VillageDatabase {
    private val villages: MutableList<Village> = mutableListOf()

    override fun addVillage(village: Village) {
        villages.add(village)
    }

    override fun updateVillage(name: String, newVillage: Village) {
        val index = findVillageIndex(name)
        if (index != -1) {
            villages[index] = newVillage
        } else {
            println("Поселок с названием $name не найден.")
        }
    }

    override fun removeVillage(name: String) {
        val index = findVillageIndex(name)
        if (index != -1) {
            villages.removeAt(index)
        } else {
            println("Поселок с названием $name не найден.")
        }
    }

    override fun sortBy(field: String) {
        when (field.toLowerCase()) {
            "name" -> villages.sortBy { it.name }
            "developer" -> villages.sortBy { it.developer }
            "area" -> villages.sortBy { it.area }
            "population" -> villages.sortBy { it.population }
            else -> println("Неверное поле для сортировки.")
        }
    }

    override fun searchByName(name: String): Village? {
        return villages.find { it.name == name }
    }

    override fun displayDatabase() {
        villages.forEach { village ->
            println("Название: ${village.name}")
            println("Девелопер: ${village.developer}")
            println("Площадь: ${village.area}")
            println("Количество жителей: ${village.population}")
            println()
        }
    }

    private fun findVillageIndex(name: String): Int {
        return villages.indexOfFirst { it.name == name }
    }
}

// Пример использования базы данных поселков
fun main() {
    val database: VillageDatabase = VillageDatabaseImpl()

    // Добавление поселков
    database.addVillage(Village("Поселок1", "Девелопер1", 100.0, 500))
    database.addVillage(Village("Поселок2", "Девелопер2", 150.0, 700))
    database.addVillage(Village("Поселок3", "Девелопер1", 120.0, 600))

    // Вывод содержимого базы данных
    println("Содержимое базы данных:")
    database.displayDatabase()

    // Изменение информации о поселке
    val newVillage = Village("Поселок2", "Девелопер3", 150.0, 800)
    database.updateVillage("Поселок2", newVillage)

    // Вывод обновленного содержимого базы данных
    println("Обновленное содержимое базы данных:")
    database.displayDatabase()

    // Удаление поселка из базы данных
    database.removeVillage("Поселок1")

    // Вывод обновленного содержимого базы данных
    println("Обновленное содержимое базы данных:")
    database.displayDatabase()

    // Сортировка поселков по площади и вывод содержимого
    database.sortBy("area")
    println("Сортировка поселков по площади:")
    database.displayDatabase()

    // Поиск поселка по названию
    val searchResult = database.searchByName("Поселок3")
    if (searchResult != null) {
        println("Результат поиска:")
        println("Название: ${searchResult.name}")
        println("Девелопер: ${searchResult.developer}")
        println("Площадь: ${searchResult.area}")
        println("Количество жителей: ${searchResult.population}")
    } else {
        println("Поселок с названием Поселок3 не найден.")
    }
}