package net.ccts.data;

public abstract class Bird extends Animal {
    
    public void chirp(){
        System.out.println("The bird chirps");
    }


    public Bird(){
    }

    public Bird(String food, boolean nocturnal, 
        double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

}
