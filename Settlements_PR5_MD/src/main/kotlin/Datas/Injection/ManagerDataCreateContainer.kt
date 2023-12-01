package Datas.Injection

import Datas.Check.IDataCheckOneTArg
import Datas.InterfacesForDataList.IDataExpansionCreate
import Datas.Settlement

class ManagerDataCreateContainer : IDataListInject
{
    private val _DataCheckCreate: IDataCheckOneTArg
    private val _DataExpansionCreate: IDataExpansionCreate

    private val _Obj: Settlement

    constructor(dataCheckCreate: IDataCheckOneTArg, dataExpansionCreate: IDataExpansionCreate, obj: Settlement)
    {
        _DataCheckCreate = dataCheckCreate
        _DataExpansionCreate = dataExpansionCreate
        _Obj = obj
    }

    override fun Expansion()
    {
        if (_DataCheckCreate.Check(_Obj) != null)
            _DataExpansionCreate.Create(_Obj)
    }
}