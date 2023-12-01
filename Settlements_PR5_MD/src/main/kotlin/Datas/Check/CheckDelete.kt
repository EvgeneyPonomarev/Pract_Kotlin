package Datas.Check

import Datas.Settlement

class CheckDelete : IDataCheckOneTArg, IUpdateCheckInject
{
    override fun Check(obj: Settlement?): Settlement?
    {
        if (obj != null)
            if (obj.Name != "")
                return obj
        return null
    }
}