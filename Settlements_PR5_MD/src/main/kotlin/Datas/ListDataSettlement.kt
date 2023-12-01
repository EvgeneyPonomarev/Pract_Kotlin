package Datas

import Datas.InterfacesForDataList.IDataExpansionCreate
import Datas.InterfacesForDataList.IDataExpansionDelete
import Datas.InterfacesForDataList.IDataExpansionFind

class ListDataSettlement :
    IDataExpansionCreate,
    IDataExpansionDelete,
    IDataExpansionFind
{
    public var Settlements: MutableList<Settlement> = mutableListOf()

    public override fun Create(obj: Settlement)
    {
        Settlements.add(obj)
    }

    public override fun Delete(obj: Settlement)
    {
        Settlements.remove(obj)
    }

    public override fun FindObj(obj: Settlement): Settlement?
    {
        return Settlements
            .filter { it.Name.equals(obj.Name) }
            .firstOrNull()
    }
}