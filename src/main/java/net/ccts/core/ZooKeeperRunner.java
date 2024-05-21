package net.ccts.core;

import net.ccts.data.*;

public class ZooKeeperRunner {

    public static void main(String[] args)
    {
        
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        

        // step 15
        
        elephant.forage();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();

        System.out.println();
        



        // step 22
        
        Tiger tiger = new Tiger("meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();
        // step 10
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        System.out.println();
        

        // step 24
        
        Elephant elephant2 = new Elephant();
         

        // step 25
        
        Gorilla gorilla = new Gorilla();
        gorilla.forage();
        gorilla.sleep();

        System.out.println();
        

        // step 27
        
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.sleep();

        System.out.println();
        

        // step 29
        Hippo hippo = new Hippo("grass", false, 50.0);
        hippo.eat();
        hippo.sleep();


        System.out.println();

        Deer deer = new Deer("grass", true, 6.0);
        deer.sleep();

        System.out.println();

        Monkey monkey = new Monkey();
        monkey.sleep();
        monkey.forage();

        System.out.println();

        
        Penguin penguin = new Penguin("fish", false, 20.0);
        penguin.fish();

        System.out.println();

        Owl owl = new Owl("mice,insects", true, 4.0);
        owl.eat();
        

        System.out.println("done");

    }

}
