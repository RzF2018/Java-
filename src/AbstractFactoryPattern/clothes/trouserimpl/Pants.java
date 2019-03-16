package AbstractFactoryPattern.clothes.trouserimpl;

import AbstractFactoryPattern.clothes.Trouser;

public class Pants implements Trouser {
    @Override
    public void maketrouser() {
        System.out.println("make a pants");
    }
}
