package MenuController.MenuItems

import Datas.DataOut.OutSettlement
import Datas.DataOut.Output
import Datas.Injection.ManagerDataReadContainer
import Datas.ListDataSettlement
import MenuController.IExpansion

class MenuRead : IExpansion
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Чтение.")
        val managerRead = ManagerDataReadContainer(Output(), OutSettlement(), _ListData.Settlements)
        managerRead.Expansion()
    }
}