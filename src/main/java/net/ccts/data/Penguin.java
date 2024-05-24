package net.ccts.data;

public class Penguin extends Bird
{
    public void fish(){
        System.out.println("The bird fishes");
    }

    @Override

    public void speak(){
        System.out.println("A penguin is silent");
    }


}
