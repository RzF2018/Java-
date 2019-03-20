package BuilderPattern.builderImpl.foodsImpl;

import BuilderPattern.builder.foodsBuilder.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 28.0f;
    }
}
