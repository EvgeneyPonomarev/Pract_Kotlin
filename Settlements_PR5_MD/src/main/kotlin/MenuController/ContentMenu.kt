package MenuController

class ContentMenu
{
    public var Item: Int
        get() = field
        private set(value) { field = value }

    public var Content: String
        get() = field
        private set(value) { field = value }

    public var Expansion: IExpansion
        get() = field
        private set(value) { field = value }

    constructor(item: Int, content: String, expansion: IExpansion)
    {
        Item = item
        Content = content
        Expansion = expansion
    }

    public override fun toString(): String
    {
        return "${Item} - ${Content}"
    }
}