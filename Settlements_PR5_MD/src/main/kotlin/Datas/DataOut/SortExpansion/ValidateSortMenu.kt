package Datas.DataOut.SortExpansion

import Datas.ListDataSettlement
import MenuController.ContentMenu
import MenuController.IMenu
import MenuController.Menu
import MenuController.MenuItems.MenuExit

class ValidateSortMenu : IMenu
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun ValidateMenu(): Menu
    {
        val menu: Menu = Menu();

        menu.Create(ContentMenu(1, "Сортировка по возрастанию:", MenuSort(_ListData)));
        menu.Create(ContentMenu(2, "Сортировка по убыванию:", MenuSortDesc(_ListData)));
        menu.Create(ContentMenu(0, "Выход", MenuExit()));

        return menu;
    }
}