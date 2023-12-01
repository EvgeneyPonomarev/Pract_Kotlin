package Datas.Injection

import Datas.Check.IUpdateCheckInject
import Datas.DataOut.IDataOutputNullArgs
import Datas.InterfacesForDataList.IDataExpansionRead
import Datas.ListDataSettlement
import Datas.Settlement

class ManagerDataFindContainer : IDataListInject
{
    private val _CheckFindElement: IUpdateCheckInject
    private val _ConvertStr: IDataExpansionRead
    private val _Output: IDataOutputNullArgs
    private val _ListData: ListDataSettlement
    private val _Obj: Settlement

    constructor(check: IUpdateCheckInject, convertStr: IDataExpansionRead,
                output: IDataOutputNullArgs, listData: ListDataSettlement, obj: Settlement)
    {
        _CheckFindElement = check
        _ConvertStr = convertStr
        _Output = output
        _ListData = listData
        _Obj = obj
    }

    override fun Expansion()
    {
        if (_CheckFindElement.Check(_Obj) != null)
            _Output.Output(_ConvertStr.Read(_ListData.FindObj(_Obj)!!))
    }
}