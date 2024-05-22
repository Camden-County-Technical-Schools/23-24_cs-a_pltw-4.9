package net.ccts.animal; 
import net.ccts.data.*;

public class Tiger extends Feline {

public void huntAlone() {
System.out.println("The tiger hunts alone.");
}

public void swim() {
System.out.println("The tiger swims.");
}

public Tiger() {

}

public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new tiger arrives.");
    }

}