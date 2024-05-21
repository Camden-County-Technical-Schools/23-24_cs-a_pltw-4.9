package net.ccts.animal;

import net.ccts.data.*;
public class Elephant extends Animal {

public void forage() {
    System.out.println("The elephant forages for food.");
  }
public void trumpet() {
    System.out.println("The elephants trumpets.");
  }

public Elephant() {
  
}

public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new elephant arrives.");
    }

}
