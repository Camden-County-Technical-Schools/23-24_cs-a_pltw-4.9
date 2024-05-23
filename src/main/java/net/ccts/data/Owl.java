package net.ccts.data;

public class Owl extends Bird {
    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }
    public Owl() {

    }

    public void hunt() {
        System.out.println("Owl Hunts");
    }

    @Override
    public void speak() {
        System.out.println("An owl hoots.");
    }
}
