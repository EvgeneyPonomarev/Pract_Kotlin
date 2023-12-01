package Datas.Injection

import Datas.DataOut.IDataOutputNullArgs
import Datas.DataOut.SortExpansion.ISoringOutput
import Datas.InterfacesForDataList.IDataExpansionRead
import Datas.Settlement

class ManagerDataReadContainer : IDataListInject, ISoringOutput
{
    private val _OutputNullArgs: IDataOutputNullArgs
    private val _DataExpansionRead: IDataExpansionRead

    private var _Obj: List<Settlement> = mutableListOf()

    constructor(dataOutputNullArgs: IDataOutputNullArgs, dataExpansionRead: IDataExpansionRead, obj: List<Settlement>)
    {
        _OutputNullArgs = dataOutputNullArgs
        _DataExpansionRead = dataExpansionRead
        _Obj = obj
    }

    constructor(dataOutputNullArgs: IDataOutputNullArgs, dataExpansionRead: IDataExpansionRead)
    {
        _OutputNullArgs = dataOutputNullArgs
        _DataExpansionRead = dataExpansionRead
    }

    override fun Expansion()
    {
        for (o in _Obj)
        {
            _OutputNullArgs.Output(_DataExpansionRead.Read(o))
        }
    }

    override fun Output(list: List<Settlement>)
    {
        for (obj in list)
        {
            _OutputNullArgs.Output(_DataExpansionRead.Read(obj));
        }
    }
}