package net.ccts.data;

public abstract class Feline extends Animal
{
  public void roar() {
    System.out.println("The feline roars.");
  }
  
  public void growl() {
    System.out.println("The feline growls.");
  }

  public Feline(){

  }

public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives.");
    }

}

