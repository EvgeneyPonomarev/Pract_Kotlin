package Datas.Injection

import MenuController.MenuItems.IUpdateInject

class ManagerDataUpdateContainer : IDataListInject
{
    private val _Delete: IUpdateInject
    private val _Add: IUpdateInject

    constructor(delete: IUpdateInject, add: IUpdateInject)
    {
        _Delete = delete
        _Add = add
    }

    override fun Expansion()
    {
        _Delete.Perform()
        _Add.Perform()
    }
}