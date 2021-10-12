public enum Builder {
    AIRLINE, KOLL, BURNS, CORT,FENDER;

    public String toString(){
        switch (this)
        {
            case AIRLINE: return "Airline";
            case CORT: return "Cort";
            case KOLL: return "Koll";
            case BURNS: return "Burns";
            case FENDER: return "Fender";
            default: return "Koll";
        }
    }
}
