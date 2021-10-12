import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List instruments;


    public Inventory()
    {
        instruments = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, GuitarSpec spec)
    {

        Instrument instrument = new Guitar(serialNumber, price, spec) {
        };
        instruments.add(instrument);
    }

    public void addInstrument(String serialNumber, double price, MandolinSpec spec)
    {

        Instrument instrument = new Mandolin(serialNumber, price, spec) {
        };
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNumber)
    {
        for(Iterator i = instruments.iterator(); ((Iterator) i).hasNext();)
        {
            Instrument instrument = (Instrument) i.next();
            if(instrument.getSerialNumber().equals(serialNumber))
            {
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec)
    {
        List matchingGuitars = new LinkedList();

        for (Iterator i = instruments.iterator(); i.hasNext(); )
        {
            Guitar guitars = (Guitar) i.next();
            if(guitars.getSpec().matches(searchSpec)){
                matchingGuitars.add(guitars);
            }



        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec)
    {
        List matchingMandolin= new LinkedList();

        for (Iterator i = instruments.iterator(); i.hasNext(); )
        {
            Mandolin mandolin = (Mandolin)i.next();
            if(mandolin.getSpec().matches(searchSpec)){
                matchingMandolin.add(instruments);
            }



        }
        return matchingMandolin;
    }
}