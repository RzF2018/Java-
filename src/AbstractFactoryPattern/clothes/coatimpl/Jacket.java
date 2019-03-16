package AbstractFactoryPattern.clothes.coatimpl;

import AbstractFactoryPattern.clothes.Coat;

public class Jacket implements Coat {
    @Override
    public void makecoat() {
        System.out.println("make a jacket");
    }
}
