package net.ccts.core;

import net.ccts.data.*;
import net.ccts.animal.*;

public class ZooKeeperRunner {

    public static void main(String[] args)
    {

        Deer deer1 = new Deer();
        deer1.sleep();
        Deer2 deer2 = new Deer2();
        deer2.sleep();

        // step 14
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();

        // step 15
        elephant.forage();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();

        System.out.println();

        Tiger tiger = new Tiger("meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();

        // step 10
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        System.out.println();

        // step 24
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();

        Gorilla gorilla = new Gorilla();

        System.out.println();

        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.sleep(); // Add sleep method call for Giraffe

        System.out.println();

        // step 29
        Hippo hippo = new Hippo();
        hippo.eat();
        hippo.sleep(); // Add sleep method call for Hippo

        System.out.println();

        Penguin penguin = new Penguin();
        penguin.fish();

        System.out.println();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();

        // Adding the new code according to the requirement
        System.out.println();

        Monkey monkey = new Monkey();
        monkey.sleep();
        monkey.forage();

        System.out.println();

        Gorilla gorilla2 = new Gorilla();
        gorilla2.sleep();
        gorilla2.forage();

        System.out.println("done");
    }
}
