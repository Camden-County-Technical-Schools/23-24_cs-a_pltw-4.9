package net.ccts.data;
public abstract class Elephant extends Animal(){
    public void trumpet(){
        System.out.println("The elephants trumpets its trunk");
    }
    public void forage(){
        System.out.println("The elephant forages");
    }
    public void speak(){
        this.trumpet;
    }
}