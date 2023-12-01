package MenuController.MenuItems

import Datas.Injection.ManagerDataUpdateContainer
import Datas.ListDataSettlement
import MenuController.IExpansion

class MenuUpdate : IExpansion
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Обновление.")
        val managerUpdate = ManagerDataUpdateContainer(MenuDelete(_ListData), MenuCreate(_ListData))
        managerUpdate.Expansion()
    }
}