package net.ccts.data;


public abstract class Elephant extends Animal {

    public void trumpet() {
        System.out.println("The elephant trumpets their trunk.");
    }

    public void forage() {
        System.out.println("The elephant forages for food.");
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        System.out.println("The elephant has arrived.");
        super(food, nocturnal, aveLifeSpan);
    }
    public Elephant {
        
    }

}