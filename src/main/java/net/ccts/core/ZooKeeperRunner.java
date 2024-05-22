package net.ccts.core;

import net.ccts.data.Deer;
import net.ccts.data.Elephant;
import net.ccts.data.Giraffe;
import net.ccts.data.Gorilla;
import net.ccts.data.Hippo;
import net.ccts.data.Monkey;
import net.ccts.data.Owl;
import net.ccts.data.Penguin;
import net.ccts.data.Tiger;

public class ZooKeeperRunner {

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
        /*
        elephant.forage();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();

        System.out.println();
        */


        // step 8:     Tiger tiger = new Tiger();

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
        
        Tiger tiger2 = new Tiger();
        Elephant elephant2 = new Elephant();
         

        // step 25
        
        Gorilla gorilla = new Gorilla();
        gorilla.sleep();
        gorilla.forage();

        System.out.println();
        
        // Overide
        Deer deer = new Deer();
        deer.sleep();
        
        Monkey monkey = new Monkey();
        monkey.sleep();
        monkey.forage();
        // step 27
        
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
        giraffe.sleep();

        System.out.println();
        

        // step 29
        Hippo hippo = new Hippo(null, false, 0);
        hippo.eat();
        hippo.sleep();

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
