package net.ccts.animal; 
import net.ccts.data.*;
/*
 * Activity 4.9.2
 */
public abstract class Bird extends Animal {
    public Bird(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new bird animal arrives.");
      }
    
      public Bird() {
    
      
      }
      public void chirp() {
        System.out.println("The bird chirps");
      }
}