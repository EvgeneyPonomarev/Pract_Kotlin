package Datas

class Settlement
{
    var Name: String = "Название"
        get() = field
        private set(value) { field = value }

    var Developer: String = "Девелопер"
        get() = field
        private set(value) { field = value }

    var Square: Double = 0.0
        get() = field
        private set(value) { field = value }

    var NumberInhabitants: Int = 0
        get() = field
        private set(value) { field = value }

    constructor(name: String)
    {
        Name = name
    }

    constructor(name: String, developer: String, square: Double, numberInhabitants: Int)
    {
        Name = name
        Developer = developer
        Square = square
        NumberInhabitants = numberInhabitants
    }
}