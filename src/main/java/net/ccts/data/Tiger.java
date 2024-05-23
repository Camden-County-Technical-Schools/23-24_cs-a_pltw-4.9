package net.ccts.data;

public class Tiger extends Feline {

    public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new tiger has arrived.");
    }
    
    public Tiger() {
        
    }

    public void huntAlone() {
        System.out.println("The tiger hunts alone.");
    }

    public void swim() {
        System.out.println("The tiger swims.");
    }

    @Override
    public void speak() {
        super.growl();
    }
}
