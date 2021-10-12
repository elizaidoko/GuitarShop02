public enum Type {
    Acoustic, Electric;

    public String toString(){
        switch (this)
        {
            case Acoustic: return "Acoustic";
            case Electric: return "Electric";
            default: return "Alder";
        }
    }
}
