fun isNumeric(s: String): Boolean
{
    return try
    {
        s.toDouble()
        true
    }
    catch (e: NumberFormatException)
    {
        false
    }
}