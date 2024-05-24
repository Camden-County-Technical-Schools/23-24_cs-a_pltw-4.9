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
        zoo.add(elephant);

        


        Tiger tiger = new Tiger("meat", true, 17.0);
        tiger.swim();
        tiger.huntAlone();

        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();
        tiger.getLifeSpan();

        System.out.println();
        zoo.add(tiger);

        

        
        
        //Tiger tiger2 = new Tiger();

       // Elephant elephant2 = new Elephant();
        

        
        Gorilla gorilla = new Gorilla();
        gorilla.grunt();


        System.out.println();
        zoo.add(gorilla);

        

       
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.hum();

        giraffe.eat();
        giraffe.isNocturnal();
        giraffe.getLifeSpan();

        System.out.println();
        zoo.add(giraffe);


        Deer deer = new Deer();
        deer.grunt();
        zoo.add(deer);

        Monkey monkey = new Monkey();
        monkey.speak();
        zoo.add(monkey);
        

        // step 29
        Hippo hippo = new Hippo();
        hippo.eat();
    
        System.out.println();
        zoo.add(hippo);


        
        Penguin penguin = new Penguin();
        penguin.fish();

        System.out.println();
        zoo.add(penguin);


        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        
        zoo.add(owl);


        for(Animal a : zoo){
            a.speak();
        } 

        System.out.println("done");

    }

}
