package net.ccts.data;

public abstract class Feline extends Animal{

    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new feline arrives.");
    }
    
    public Feline() {

    }
    
    public void roar() {
        System.out.println("*feline roars*");
    }

    public void growl() {
        System.out.println("*feline growl*");
    }
}
