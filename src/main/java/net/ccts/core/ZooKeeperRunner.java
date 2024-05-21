package net.ccts.core;

import net.ccts.data.*;

public class ZooKeeperRunner {

    public static void main(String[] args)
    {

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

        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        //System.out.println();
        

        // step 24
        /*
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();
         */

        // step 25
        /*
        Gorilla gorilla = new Gorilla();

        System.out.println();
        */

        // step 27
        /*
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();

        System.out.println();
        */

        // step 29
        Hippo hippo = new Hippo();
        hippo.eat();

        System.out.println();

        /*
        Penguin penguin = new Penguin();
        penguin.fish();

        System.out.println();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        */

        System.out.println("done");

    }

}
