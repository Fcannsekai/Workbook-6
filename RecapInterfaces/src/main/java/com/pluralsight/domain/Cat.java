package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;

public class Cat implements IAnimal {


    @Override
    public void makeSound() {

        System.out.println("Meow");

    }
}
