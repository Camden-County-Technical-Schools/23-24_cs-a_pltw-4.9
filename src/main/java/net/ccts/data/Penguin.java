package net.ccts.data;

public class Penguin extends Animal{
    public Penguin(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public Penguin() {

    }

    public void fish() {
        System.out.println("Penguin fish");
    }
}