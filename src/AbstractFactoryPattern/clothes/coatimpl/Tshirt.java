package AbstractFactoryPattern.clothes.coatimpl;

import AbstractFactoryPattern.clothes.Coat;

public class Tshirt implements Coat {

    @Override
    public void makecoat() {
        System.out.println("make a T-shirt");
    }
}
