package Datas.Check

import Datas.Settlement

interface IUpdateCheckInject
{
    fun Check(obj: Settlement?): Settlement?
}