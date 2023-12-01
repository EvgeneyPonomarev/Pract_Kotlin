package Datas.DataOut.SortExpansion

import Datas.ListDataSettlement
import Datas.Settlement

class SortDesc : IMakeSortingList
{
    override fun MakeList(listData: ListDataSettlement): List<Settlement>
    {
        return listData.Settlements
            .sortedByDescending { it.Name }
            .map { it }
    }
}