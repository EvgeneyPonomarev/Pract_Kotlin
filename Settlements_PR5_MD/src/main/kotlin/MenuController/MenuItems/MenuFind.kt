package MenuController.MenuItems

import Datas.Check.CheckDelete
import Datas.DataOut.OutSettlement
import Datas.DataOut.Output
import Datas.Injection.ManagerDataFindContainer
import Datas.ListDataSettlement
import Datas.Settlement
import MenuController.IExpansion

class MenuFind : IExpansion
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Поиск.")
        print("Введите название: ")
        val name: String = readln()
        val settlement = Settlement(name)
        val managerFind = ManagerDataFindContainer(CheckDelete(), OutSettlement(), Output(), _ListData, settlement)
        managerFind.Expansion()
    }
}