package com.pluralsight.domain;

import com.pluralsight.interfaces.Flyable;
import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.Swimmable;

public class Dog implements IAnimal, Swimmable, Flyable {

    @Override
    public void makeSound() {


        System.out.println("Woof!");

    }


    @Override
    public void Swim() {

    }

    @Override
    public void Fly() {

    }
}
