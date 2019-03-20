package BuilderPattern.builder.foodsBuilder;

import BuilderPattern.builder.Item;
import BuilderPattern.builder.Packing;
import BuilderPattern.builderImpl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
