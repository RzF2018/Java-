package AbstractFactoryPattern.clothes.trouserimpl;

import AbstractFactoryPattern.clothes.Trouser;

public class Shorts implements Trouser {
    @Override
    public void maketrouser() {
        System.out.println("make a shorts");
    }
}
