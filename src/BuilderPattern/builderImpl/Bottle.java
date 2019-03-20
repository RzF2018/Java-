package BuilderPattern.builderImpl;

import BuilderPattern.builder.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle pack method";
    }
}
