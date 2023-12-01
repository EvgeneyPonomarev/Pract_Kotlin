package Datas.DataOut

import Datas.InterfacesForDataList.IDataExpansionRead
import Datas.Settlement

class OutSettlement : IDataExpansionRead
{
    override fun Read(obj: Settlement): String
    {
        return "Название - ${obj.Name}, " +
                "двелопер - ${obj.Developer}, " +
                "площадь - ${obj.Square}, " +
                "количество жителей - ${obj.NumberInhabitants}."
    }
}