package net.ccts.core;
import java.util.ArrayList;
import net.ccts.data.*;

public class ZooKeeperRunner {
private static final ArrayList<Animal> zoo = new ArrayList<Animal>();
    public static void main(String[] args)
    {
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        zoo.add(elephant);
        elephant.trumpet();
        elephant.eat();
        elephant.isNocturnal();
        elephant.getLifeSpan();
        Tiger tiger = new Tiger("Meat", true, 17.0);
        zoo.add(tiger);
        tiger.swim();
        tiger.huntAlone();



       
        tiger.growl();
        tiger.eat();
        tiger.isNocturnal();

        System.out.println();
        

        Tiger tiger2 = new Tiger("Meat", true, 17.0);
        zoo.add(tiger2);
        Elephant elephant2 = new Elephant("leaves, grasses, roots", false, 60.0);
    

        Gorilla gorilla = new Gorilla();
        zoo.add(gorilla);
        System.out.println();
       
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        zoo.add(giraffe);
        giraffe.eat();

        System.out.println();


        Hippo hippo = new Hippo();
        zoo.add(hippo);
        hippo.eat();

        System.out.println();
        
        
        Penguin penguin = new Penguin();
        zoo.add(penguin);
        penguin.fish();
        System.out.println();

        Owl owl = new Owl();
        zoo.add(owl);
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
        

        System.out.println("done");
        System.out.println("override project!");
        Giraffe giraffe2 = new Giraffe("leaves", false, 25.0);
        Deer deer2 = new Deer();
        zoo.add(deer2);
        Hippo hippo2 = new Hippo();
        Monkey monkey = new Monkey();
        zoo.add(monkey);
        Gorilla gorilla2 = new Gorilla();
        giraffe2.sleep();
        deer2.sleep();
        hippo2.sleep();
        monkey.sleep();
        gorilla2.sleep();
        monkey.forage();
        gorilla2.forage();
   int counter = 0;
   while (counter < zoo.size()){
    zoo.get(counter).speak();
    counter ++;
   }
    
    }
}
