package MenuController

class Menu
{
    private var ListMenu: MutableList<ContentMenu> = mutableListOf()

    private fun Expansion(expansion: IExpansion)
    {
        expansion.Perform()
    }

    public fun Create(itemMenu: ContentMenu)
    {
        ListMenu.add(itemMenu)
    }

    fun Read()
    {
        for(item in ListMenu)
        {
            println(item.toString())
        }
    }

    public fun FindObj(obj: Int): IExpansion?
    {
        return ListMenu
            .filter { it.Item == obj }
            .map { it.Expansion }
            .firstOrNull()
    }

    public fun CompleteItemMenu(item: Int)
    {
        FindObj(item)?.let { Expansion(it) }
    }
}