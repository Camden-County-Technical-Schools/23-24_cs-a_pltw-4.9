package net.ccts.core;

import net.ccts.data.*;

public class ZooKeeperRunner {

    public static void main(String[] args)
    {
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();
        Tiger tiger = new Tiger("Meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();



       
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        System.out.println();
        

        Tiger tiger2 = new Tiger("Meat", true, 17.0);
        Elephant elephant2 = new Elephant("leaves, grasses, roots", false, 60.0);
    

        Gorilla gorilla = new Gorilla();

        System.out.println();
       
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();

        System.out.println();


        Hippo hippo = new Hippo();
        hippo.eat();

        System.out.println();
        
        
        Penguin penguin = new Penguin();
        penguin.fish();

        System.out.println();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        

        System.out.println("done");

    }

}
