package com.pluralsight.domain;

import com.pluralsight.interfaces.Flyable;

public class Bird implements Flyable {

    public Bird() {
    }

    @Override
    public void Fly() {

        System.out.println("is flying");

    }
}
