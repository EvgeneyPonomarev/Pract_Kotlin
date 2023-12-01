package MenuController.MenuItems

import Datas.DataOut.SortExpansion.ValidateSortMenu
import Datas.ListDataSettlement
import MenuController.ContainerManagerMenu
import MenuController.IExpansion
import MenuController.Linear

class MenuSort : IExpansion
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        val managerMenu = ContainerManagerMenu(ValidateSortMenu(_ListData), Linear())
        managerMenu.MenuAssembly()
    }
}