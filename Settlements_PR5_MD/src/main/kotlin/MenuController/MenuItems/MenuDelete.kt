package MenuController.MenuItems

import Datas.Check.CheckDelete
import Datas.Injection.ManagerDataDeleteContainer
import Datas.ListDataSettlement
import Datas.Settlement
import MenuController.IExpansion

class MenuDelete : IExpansion, IUpdateInject
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Удаление.")
        print("Введите название: ")
        val name: String = readln()
        val settlement = Settlement(name)
        val managerDelete = ManagerDataDeleteContainer(CheckDelete(), _ListData, _ListData, settlement)
        managerDelete.Expansion()
    }
}