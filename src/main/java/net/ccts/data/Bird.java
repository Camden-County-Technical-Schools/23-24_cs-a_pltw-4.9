package net.ccts.data;


/*
 * Activity 4.9.2
 */
public abstract class Bird extends Animal
{
public Bird()
{
}
public Bird(String food, boolean nocturnal, double aveLifeSpan)
{
  super(food, nocturnal, aveLifeSpan);
}
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}