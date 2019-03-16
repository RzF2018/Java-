package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.clothes.Coat;
import AbstractFactoryPattern.clothes.Trouser;

public abstract class AbstractFactory {
    public abstract Coat makeCoat(String coatType);
    public abstract Trouser makeTourser(String trouserType);
}
