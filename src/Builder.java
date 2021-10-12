public enum Builder {
 AIRLINE, KOLL, BURNS, CORT, FENDER;

 public String toString()
 {
   switch(this)
   {
    case AIRLINE: return "Airline";
    case KOLL: return "Koll";
    case BURNS: return "Burns";
    case CORT: return "Cort";
    case FENDER: return "Fender";
    default: return "Cort";
   }
 }
}
