package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
public Elephant()
{
}
public Elephant(String food, boolean nocturnal, double aveLifeSpan)
{
  super(food, nocturnal, aveLifeSpan);
  System.out.println("The new Animal arrival is an elephant.");
}
  public void trumpet()
  {
    System.out.println("The elephant hoots and hollars.");
  }
  public void forage()
  {
    System.out.println("The elephant forages for food.");
  }
}