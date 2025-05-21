package com.pluralsight.domain;

import com.pluralsight.interfaces.Flyable;

public class Eagle implements Flyable {


    @Override
    public void Fly() {

        System.out.println("Flies");

    }
}
