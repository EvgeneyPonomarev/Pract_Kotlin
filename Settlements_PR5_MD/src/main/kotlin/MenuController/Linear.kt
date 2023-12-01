package MenuController

import isNumeric

class Linear : ITypeOfLinearity
{
    override fun Linearity(menu: Menu)
    {
        menu.Read()
        val controller: String = readln()
        if (isNumeric(controller))
            menu.CompleteItemMenu(controller.toInt())
    }
}