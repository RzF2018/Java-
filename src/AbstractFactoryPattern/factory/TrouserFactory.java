package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.clothes.Coat;
import AbstractFactoryPattern.clothes.Trouser;
import AbstractFactoryPattern.clothes.trouserimpl.Pants;
import AbstractFactoryPattern.clothes.trouserimpl.Shorts;

public class TrouserFactory extends AbstractFactory {
    @Override
    public Coat makeCoat(String coatType) {
        return null;
    }

    @Override
    public Trouser makeTourser(String trouserType) {
        Trouser trouser = null;
        if ("pants".equalsIgnoreCase(trouserType)){
            trouser = new Pants();
        }else if ("shorts".equalsIgnoreCase(trouserType)){
            trouser = new Shorts();
        }
        return trouser;
    }
}
