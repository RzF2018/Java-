package FactoryPattern;

import FactoryPattern.factory.AnimalFactory;
import FactoryPattern.animal.Animal;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getType("Cat");
        animal1.eat();

        Animal animal2 = animalFactory.getType("dog");
        animal2.eat();

        Animal animal3 = animalFactory.getType("fish");
        animal3.eat();
    }
}
