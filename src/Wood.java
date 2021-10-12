public enum Wood
{
    ALDER, MAHOGANY, OAK;

    public String toString()
    {
        switch(this)
        {
            case ALDER: return "Alder";
            case MAHOGANY: return "Mahogany";
            case OAK: return "Oak";
            default: return "Alder";
        }
    }
}