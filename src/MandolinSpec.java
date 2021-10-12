public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder,String model, Type type, Wood backWood, Wood topWood, Style style){
        super(builder,model,type,backWood,topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public Boolean matches(MandolinSpec otherSpec){

        if (super.getBuilder() != otherSpec.getBuilder())
            return false;

        String model = otherSpec.getModel().toLowerCase();
        if ((model != null) && (model.equals("")) &&
                (!model.equals(model.toLowerCase())))
            return false;

        if (super.getType() != otherSpec.getType())
            return false;

        if (style != otherSpec.getStyle())
            return false;

        if (super.getBackWood() != otherSpec.getBackWood())
            return false;

        if (super.getBackWood() !=otherSpec.getTopWood())
            return false;

        return true;
    }
}
