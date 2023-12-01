package MenuController.MenuItems

import MenuController.IExpansion

class MenuExit : IExpansion
{
    override fun Perform()
    {
        println("Выход")
    }
}