package AbstractFactoryPattern.factoryproducer;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factory.CoatFactory;
import AbstractFactoryPattern.factory.TrouserFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        AbstractFactory factorytype = null;
        if ("coat".equalsIgnoreCase(choice)){
            factorytype = new CoatFactory();
        }else if ("trouser".equalsIgnoreCase(choice)){
            factorytype = new TrouserFactory();
        }
        return factorytype;
    }
}
