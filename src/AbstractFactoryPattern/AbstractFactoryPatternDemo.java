package AbstractFactoryPattern;

import AbstractFactoryPattern.clothes.Coat;
import AbstractFactoryPattern.clothes.Trouser;
import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factoryproducer.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get coatFactory
        AbstractFactory coatFactory = FactoryProducer.getFactory("coat");
        Coat jacket = coatFactory.makeCoat("jacket");
        jacket.makecoat();

        Coat tshirt = coatFactory.makeCoat("tshirt");
        tshirt.makecoat();

        //get trouserFactory
        AbstractFactory trouseFactory = FactoryProducer.getFactory("trouser");
        Trouser pants = trouseFactory.makeTourser("pants");
        pants.maketrouser();

        Trouser shorts = trouseFactory.makeTourser("shorts");
        shorts.maketrouser();
    }
}
