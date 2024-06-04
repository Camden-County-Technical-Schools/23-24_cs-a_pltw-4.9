package net.ccts.core;

import net.ccts.data.*;
import net.ccts.animal.*;

public class ZooKeeperRunner {

    private static final ArrayList<Animal> ZOO = new ArrayList<>();

    public static void main(String[] args)
    {

        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        elephant.eat();
        elephant.getLifeSpan();
        elephant.isNocturnal();

        // step 14
        /*
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        */

        // step 15
        
        elephant.forage();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();
        ZOO.add(elephant);

        System.out.println();
        


        // step 8:     Tiger tiger = new Tiger();

        // step 22

        Tiger tiger = new Tiger("meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();
        // step 10
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();
        ZOO.add(tiger);

        System.out.println();
        

        // step 24
        
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();
         

        // step 25
        
        Gorilla gorilla = new Gorilla();
        gorilla.sleep();
        gorilla.forage();
        ZOO.add(gorilla);

        System.out.println();
        
        // Overide
        Deer deer = new Deer();
        deer.sleep();
        ZOO.add(deer);
        
        Monkey monkey = new Monkey();
        monkey.sleep();
        monkey.forage();
        ZOO.add(monkey);
        // step 27
        
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.sleep();
        ZOO.add(giraffe);

        System.out.println();
        

        // step 29
        Hippo hippo = new Hippo(null, false, 0);
        hippo.eat();
        hippo.sleep();
        ZOO.add(hippo);

        System.out.println();

        
        Penguin penguin = new Penguin();
        penguin.fish();
        ZOO.add(penguin);

        System.out.println();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        ZOO.add(owl);

        for (Animal a : ZOO) {
            a.speak();
        }
        

        System.out.println("done");

    }

}