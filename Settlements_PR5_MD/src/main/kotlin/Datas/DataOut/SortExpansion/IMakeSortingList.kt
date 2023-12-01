package Datas.DataOut.SortExpansion

import Datas.ListDataSettlement
import Datas.Settlement

interface IMakeSortingList
{
    fun MakeList(listData: ListDataSettlement) : List<Settlement>
}