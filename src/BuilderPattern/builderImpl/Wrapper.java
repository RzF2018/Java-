package BuilderPattern.builderImpl;

import BuilderPattern.builder.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper pack method";
    }
}
