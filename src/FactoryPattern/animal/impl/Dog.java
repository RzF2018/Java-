package FactoryPattern.animal.impl;

import FactoryPattern.animal.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog::eat() method.");
    }
}
