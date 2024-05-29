package net.ccts.core;

import net.ccts.data.*;
import java.util.ArrayList;

public class ZooKeeperRunner {

    private static final ArrayList<Animal> zoo = new ArrayList<>();

    public static void main(String[] args)
    {
        // step 14
        
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        zoo.add(elephant);
        

        // step 15
        
        elephant.forage();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();

        System.out.println();

        Tiger tiger = new Tiger("meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();
        zoo.add(tiger);
        
        // step 10
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        System.out.println();
        

        // step 24
        
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();
        

        Gorilla gorilla = new Gorilla();
        gorilla.sleep();
        gorilla.forage();
        System.out.println();
        zoo.add(gorilla);

        
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.sleep();
        zoo.add(giraffe);
        System.out.println();
        

        // step 29
        Hippo hippo = new Hippo();
        hippo.eat();
        hippo.sleep();
        zoo.add(hippo);
        System.out.println();

        
        Penguin penguin = new Penguin();
        penguin.fish();
        zoo.add(penguin);

        System.out.println();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        zoo.add(owl);
        Deer deer = new Deer();
        deer.sleep();
        zoo.add(deer);
        
        Monkey monkey = new Monkey();
        monkey.sleep();
        monkey.forage();
        zoo.add(monkey);

        Lion lion = new Lion("meat", true, 17.0);
        zoo.add(lion);

        int counter = 0;

        while(counter < zoo.size()) {
            Animal A = zoo.get(counter);
            A.speak();

            counter++;
        }

        System.out.println("done");

    }

}
