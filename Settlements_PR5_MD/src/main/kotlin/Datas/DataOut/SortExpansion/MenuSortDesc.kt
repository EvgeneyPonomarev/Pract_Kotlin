package Datas.DataOut.SortExpansion

import Datas.DataOut.OutSettlement
import Datas.DataOut.Output
import Datas.Injection.ManagerDataReadContainer
import Datas.Injection.ManagerDataSortContainer
import Datas.ListDataSettlement
import MenuController.IExpansion

class MenuSortDesc : IExpansion
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun Perform()
    {
        println("Сортировка по убыванию:")
        val managerSort = ManagerDataSortContainer(_ListData, SortDesc(), ManagerDataReadContainer(Output(), OutSettlement()))
        managerSort.Expansion()
    }
}