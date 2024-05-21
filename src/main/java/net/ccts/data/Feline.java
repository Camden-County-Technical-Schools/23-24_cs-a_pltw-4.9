package net.ccts.data;


public abstract class Feline extends Animal{

    public void roar(){
        System.out.println("The Feline Roars");
    }

    public void growl(){
        System.out.println("The Feline Growls");
    }

    public Feline(){
    }

    public Feline(String food, boolean nocturnal, 
        double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);

    }   

    
}