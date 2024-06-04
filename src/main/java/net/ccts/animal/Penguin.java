package net.ccts.animal;
import net.ccts.data.*;
public class Penguin extends Bird{
    public Penguin(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public Penguin() {

    }

    public void fish() {
        System.out.println("Penguin fish");
    }

    @Override
    public void speak() {
        System.out.println("A penguin is silent.");
    }
}