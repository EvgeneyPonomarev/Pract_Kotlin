import Datas.ListDataSettlement
import MenuController.ContainerManagerMenu
import MenuController.Cycle
import MenuController.ValidationMenu

fun main()
{
    val listData = ListDataSettlement()
    val dIManager = ContainerManagerMenu(ValidationMenu(listData), Cycle())
    dIManager.MenuAssembly()
}