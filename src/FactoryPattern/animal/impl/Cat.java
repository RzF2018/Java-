package FactoryPattern.animal.impl;

import FactoryPattern.animal.Animal;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat::eat() method.");
    }
}
