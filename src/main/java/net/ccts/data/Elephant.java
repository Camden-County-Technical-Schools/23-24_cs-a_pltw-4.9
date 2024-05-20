package net.ccts.data;

public class Elephant extends Animal {
    
    public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new elephant has arrived.");
    }

    public Elephant() {
        
    }

    public void trumpet() {
        System.out.println("* elephant makes trumpet sounds*");
    }

    public void forage() {
        System.out.println("*elephant makes foraging sounds");
    }
}