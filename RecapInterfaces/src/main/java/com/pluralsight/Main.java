package com.pluralsight;

import com.pluralsight.domain.Bird;
import com.pluralsight.domain.Dog;
import com.pluralsight.domain.Eagle;
import com.pluralsight.interfaces.Flyable;
import com.pluralsight.interfaces.Swimmable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Flyable flyNow = new Bird();
        flyNow.Fly();

        Flyable flyer = new Eagle();
        Swimmable swimmer = new Dog();
        swimmer.Swim();
        List<Flyable> flyers = new ArrayList<>();
        flyers.add(new Bird());
        flyers.add(new Eagle());
        flyers.add(new Bird());
        flyers.add(new Bird());
        flyers.add(new Bird());
        flyers.add(new Bird());
        flyers.add(new Dog());

        for (Flyable f : flyers) {
            f.Fly();  // all fly differently, but we treat them the same!
        }

        launchIntoSky(new Eagle());

    }

    public static void launchIntoSky(Flyable flyer) {
        flyer.Fly();
    }
// This loop doesn’t care *what* kind of flyer it is—just that it can fly!
    // This makes the code reusable, scalable, and super flexible

   for (Flyable f : flyers) {
        f.Fly();
    }
}