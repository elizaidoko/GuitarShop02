public class GuitarSpec extends InstrumentSpec {

    private int numStrings;


    public GuitarSpec(Builder builder,String model, Type type, Wood backWood, Wood topWood, int numStrings){
        super(builder,model,type,backWood,topWood);
        this.numStrings = numStrings;
    }


    public int getNumStrings() {
        return numStrings;
    }


    public Boolean matches(GuitarSpec otherSpec){

            if (super.getBuilder() != otherSpec.getBuilder())
                return false;

            String model = otherSpec.getModel().toLowerCase();
            if ((model != null) && (model.equals("")) &&
                    (!model.equals(model.toLowerCase())))
                return false;

            if (super.getType() != otherSpec.getType())
                return false;

            if (numStrings != otherSpec.getNumStrings())
                return false;

            if (super.getBackWood() != otherSpec.getBackWood())
                return false;

            if (super.getBackWood() !=otherSpec.getTopWood())
                return false;

            return true;
    }
}
