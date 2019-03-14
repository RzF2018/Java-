package FactoryPattern.animal.impl;

import FactoryPattern.animal.Animal;

public class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish::eat() method.");
    }
}
