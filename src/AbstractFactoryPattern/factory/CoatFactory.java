package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.clothes.Coat;
import AbstractFactoryPattern.clothes.Trouser;
import AbstractFactoryPattern.clothes.coatimpl.Jacket;
import AbstractFactoryPattern.clothes.coatimpl.Tshirt;

public class CoatFactory extends AbstractFactory{

    @Override
    public Coat makeCoat(String coatType) {
        Coat coat = null;
        if ("jacket".equalsIgnoreCase(coatType)){
            coat = new Jacket();
        }else if ("tshirt".equalsIgnoreCase(coatType)){
            coat = new Tshirt();
        }
        return coat;
    }

    @Override
    public Trouser makeTourser(String trouserType) {
        return null;
    }
}
