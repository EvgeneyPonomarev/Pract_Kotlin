package Datas.DataOut.SortExpansion

import Datas.ListDataSettlement
import Datas.Settlement

class Sort : IMakeSortingList
{
    override fun MakeList(listData: ListDataSettlement): List<Settlement>
    {
        return listData.Settlements
            .sortedBy { it.Name }
            .map { it }
    }
}