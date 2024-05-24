package net.ccts.data;

public class Owl extends Bird {
    public void hunt(){
        System.out.println("The owl hunts");
    }

    public Owl(){
        
    }
    public Owl(String food, boolean nocturnal, 
        double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The Tiger has arrived");

    } 
    
    @Override

    public void speak(){
        System.out.println("An owl hoots");
    }


}
