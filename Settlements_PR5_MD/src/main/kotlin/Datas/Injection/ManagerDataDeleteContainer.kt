package Datas.Injection

import Datas.Check.IDataCheckOneTArg
import Datas.InterfacesForDataList.IDataExpansionDelete
import Datas.InterfacesForDataList.IDataExpansionFind
import Datas.Settlement

class ManagerDataDeleteContainer : IDataListInject
{
    private val _DataCheckOneTArg: IDataCheckOneTArg
    private val _DataFind: IDataExpansionFind
    private val _DataExpansionDelete: IDataExpansionDelete

    private val _Obj: Settlement

    constructor(dataCheckOneTArg: IDataCheckOneTArg,
                dataFind: IDataExpansionFind,
                dataExpansionDelete: IDataExpansionDelete,
                obj: Settlement)
    {
        _DataCheckOneTArg = dataCheckOneTArg
        _DataFind = dataFind
        _DataExpansionDelete = dataExpansionDelete
        _Obj = obj
    }

    override fun Expansion()
    {
        if (_DataCheckOneTArg.Check(_Obj) != null)
            if (_DataFind.FindObj(_Obj) != null)
                _DataExpansionDelete.Delete(_DataFind.FindObj(_Obj)!!)
    }
}