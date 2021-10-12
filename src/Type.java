public enum Type {
    CLASSICAL, ACOUSTIC, ELECTROACOUSTIC, ELECTRIC, FENDER;

    public String toString()
    {
        switch(this)
        {
            case CLASSICAL: return "Classical";
            case ACOUSTIC: return "Acoustic";
            case ELECTROACOUSTIC: return "Electroacoustic";
            case ELECTRIC: return "Electric";
            case FENDER: return "Fender";
            default: return "Classical";
        }
    }
}
