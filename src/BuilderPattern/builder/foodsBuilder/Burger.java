package BuilderPattern.builder.foodsBuilder;

import BuilderPattern.builder.Item;
import BuilderPattern.builder.Packing;
import BuilderPattern.builderImpl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
