package BuilderPattern.builderImpl.foodsImpl;

import BuilderPattern.builder.foodsBuilder.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 44.0f;
    }
}
