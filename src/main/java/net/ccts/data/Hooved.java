package net.ccts.data;


/*
 * Activity 4.9.2
 */
public abstract class Hooved extends Animal
{
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
    public Hooved(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
    }
}