package MenuController

import isNumeric

class Cycle : ITypeOfLinearity
{
    override fun Linearity(menu: Menu)
    {
        var controller: String?

        do
        {
            println("Введите цифру для дейтвия.")
            menu.Read()
            controller = readln()
            if(isNumeric(controller))
                menu.CompleteItemMenu(controller.toInt())
        } while (controller != "0")
    }
}