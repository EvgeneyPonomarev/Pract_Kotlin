package MenuController

import Datas.ListDataSettlement
import MenuController.MenuItems.*

class ValidationMenu : IMenu
{
    private val _ListData: ListDataSettlement

    constructor(listData: ListDataSettlement)
    {
        _ListData = listData
    }

    override fun ValidateMenu(): Menu
    {
        var menu: Menu = Menu()

        menu.Create(ContentMenu(1, "Добавление", MenuCreate(_ListData)))
        menu.Create(ContentMenu(2, "Просмотр", MenuRead(_ListData)))
        menu.Create(ContentMenu(3, "Изменение", MenuUpdate(_ListData)))
        menu.Create(ContentMenu(4, "Удаление", MenuDelete(_ListData)))
        menu.Create(ContentMenu(5, "Сортировка", MenuSort(_ListData)))
        menu.Create(ContentMenu(6, "Поиск", MenuFind(_ListData)))
        menu.Create(ContentMenu(0, "Выход", MenuExit()))

        return menu
    }
}