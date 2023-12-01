package Datas.Injection

import Datas.DataOut.SortExpansion.IMakeSortingList
import Datas.DataOut.SortExpansion.ISoringOutput
import Datas.ListDataSettlement

class ManagerDataSortContainer : IDataListInject
{
    private val _ListData: ListDataSettlement
    private val _SortingList: IMakeSortingList
    private val _Output: ISoringOutput

    constructor(
        listData: ListDataSettlement,
        sortingList: IMakeSortingList,
        output: ISoringOutput
    ) {
        _ListData = listData
        _SortingList = sortingList
        _Output = output
    }

    override fun Expansion()
    {
        _Output.Output(_SortingList.MakeList(_ListData))
    }
}