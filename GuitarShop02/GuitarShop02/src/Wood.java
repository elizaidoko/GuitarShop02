public enum Wood {
    Alder, Mahogany, Oak;

    public String toString(){
        switch (this)
        {
            case Alder: return "Alder";
            case Mahogany: return "Mahogany";
            case Oak: return "Oak";
            default: return "Alder";
        }
    }
}
