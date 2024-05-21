package net.ccts.data;

/*
 * Activity 4.9.2
 */
public abstract class Primate extends Animal
{
  public void forage()
  {
    System.out.println("The primate forages for food.");
  }

  public Primate(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
  }
}