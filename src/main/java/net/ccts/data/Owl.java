package net.ccts.data;

public class Owl extends Animal {
    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }
    public Owl() {

    }

    public void hunt() {
        System.out.println("Owl Hunts");
    }
}
