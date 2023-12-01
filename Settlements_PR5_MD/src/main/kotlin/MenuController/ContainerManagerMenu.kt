package MenuController

class ContainerManagerMenu
{
    private val _Menu: IMenu
    private val _TypeOfLinearity: ITypeOfLinearity

    constructor(menu: IMenu, typeOfLinearity: ITypeOfLinearity)
    {
        _Menu = menu
        _TypeOfLinearity = typeOfLinearity
    }

    public fun MenuAssembly()
    {
        _TypeOfLinearity.Linearity(_Menu.ValidateMenu())
    }
}