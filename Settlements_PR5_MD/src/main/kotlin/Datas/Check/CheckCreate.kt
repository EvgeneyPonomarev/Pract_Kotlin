package Datas.Check

import Datas.Settlement

class CheckCreate : IDataCheckOneTArg, IUpdateCheckInject
{
    override fun Check(obj: Settlement?): Settlement?
    {
        if (obj != null)
            if (obj.Name != "" && obj.Developer != "" && obj.Square >= 0.0 && obj.NumberInhabitants > 0)
                return obj;
        return null
    }
}
