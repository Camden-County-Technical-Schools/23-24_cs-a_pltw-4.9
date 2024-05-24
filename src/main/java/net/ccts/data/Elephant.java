package net.ccts.data;


public class Elephant extends Animal{
    public void trumpet(){
        System.out.println("The Elephant sounds like a trumpet.");
    }

    public void forage(){
        System.out.println("The Elephant forages for food.");
    }

    public Elephant(){
        
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The Elephant has arrived");

    }   

    @Override

    public void speak(){
        trumpet();
    }
}