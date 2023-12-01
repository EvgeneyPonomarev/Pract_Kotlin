package MenuController.MenuItems

import Datas.Check.CheckCreate
import Datas.Injection.ManagerDataCreateContainer
import Datas.ListDataSettlement
import Datas.Settlement
import MenuController.IExpansion
import isNumeric

class MenuCreate : IExpansion, IUpdateInject
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Добавление.")
        print("Введите название: ")
        val name: String = readln()
        print("Введите девелопера: ")
        val developer: String = readln()
        print("Площадь: ")
        val square: String = readln()
        print("Количество жителей: ")
        val numberInhabitants: String = readln()
        if (isNumeric(square) && isNumeric(numberInhabitants))
        {
            val squareDouble: Double = square.toDouble()
            val numberInhabitantsInt: Int = numberInhabitants.toInt()
            val settlement = Settlement(name, developer, squareDouble, numberInhabitantsInt)
            val managerCreate = ManagerDataCreateContainer(CheckCreate(), _ListData, settlement)
            managerCreate.Expansion()
        }
    }
}