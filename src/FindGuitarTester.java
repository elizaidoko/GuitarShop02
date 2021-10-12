import java.util.Iterator;
import java.util.List;
import java.lang.*;

public class FindGuitarTester {

    public static void main(String[] args)
    {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec( Builder.FENDER, "Stratocastor",
                Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,6);

        List matchingGuitars = inventory.search(whatLookingFor);

        if (matchingGuitars != null)
        {
            System.out.println("You might like these: \n");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext();)
            {
                Guitar guitar = (Guitar)i.next();
                System.out.println("\n\nWe have a: ");
                System.out.println(guitar.getSerialNumber() + "\n" +
                        guitar.getPrice() + " \n" +
                        guitar.getSpec().getBuilder()+ "\n" +
                        guitar.getSpec().getModel()+ "\n" +
                        guitar.getSpec().getType()+ "\n" +
                        guitar.getSpec().getBackWood()+ "\n" +
                        guitar.getSpec().getTopWood());
            }
        }
        else
        {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory)
    {
        //add guitars to the inventory
        GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,6);
        GuitarSpec spec1 = new GuitarSpec((Builder.AIRLINE, "Stratocastor",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER,12);
        MandolinSpec mandolinSpec1 = new MandolinSpec(Builder.FENDER, "Stratocastor",Type.ELECTRIC,Wood.OAK,Wood.OAK,Style.F);
        MandolinSpec mandolinSpec2 = new MandolinSpec(Builder.AIRLINE, "Stratocastor",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER,Style.F);

        inventory.addInstrument("V00001",
                1499.99,
                spec
                );

        inventory.addInstrument("V00002",
                1699.99,
                spec);
    }
}