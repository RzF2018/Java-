package FactoryPattern.factory;

import FactoryPattern.animal.Animal;
import FactoryPattern.animal.impl.Cat;
import FactoryPattern.animal.impl.Dog;
import FactoryPattern.animal.impl.Fish;

public class AnimalFactory {
    //使用getType方法获取形状类型对象
    public Animal getType(String rationType){
        Animal animal =null;
        if (rationType == null){
            animal = null;
        }
        if (rationType.equalsIgnoreCase("cat")){
            animal = new Cat();
        }else if (rationType.equalsIgnoreCase("dog")){
            animal = new Dog();
        }else if (rationType.equalsIgnoreCase("fish")){
            animal = new Fish();
        }
        return animal;
    }
}
