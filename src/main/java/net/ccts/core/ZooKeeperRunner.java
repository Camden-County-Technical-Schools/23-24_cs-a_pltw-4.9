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
        /*
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();
         */

        Lion lion = new Lion("meat", true, 20.0);
        lion.sleep();

        // step 25
        Gorilla gorilla = new Gorilla("bamboo", false, 35.0);
        gorilla.sleep();
        gorilla.forage();

        // step 27
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.sleep();

        System.out.println();

        // step 29
        Hippo hippo = new Hippo("plants", false, 40.0);
        hippo.sleep();

        System.out.println();

        Monkey monkey = new Monkey("fruit", false, 20.0);
        monkey.sleep();
        monkey.forage();

        System.out.println();

        Deer deer = new Deer("grass", false, 15.0);
        deer.sleep();
        
        Penguin penguin = new Penguin("fish", false, 20.0);
        penguin.eat();

        System.out.println();
        
        Owl owl = new Owl("mice,insects", true, 4.0);
        owl.eat();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();


        System.out.println("done");

        zoo.add(giraffe);
        zoo.add(deer);
        zoo.add(hippo);
        zoo.add(monkey);
        zoo.add(gorilla);
        zoo.add(elephant);
        zoo.add(lion);
        zoo.add(owl);
        zoo.add(penguin);
        zoo.add(tiger);

        for (Animal animal : zoo) {
            animal.speak();
        }

        giraffe.sleep();
        deer.sleep();
        hippo.sleep();
        monkey.sleep();
        gorilla.sleep();
        monkey.forage();
        gorilla.forage();
    }

}
