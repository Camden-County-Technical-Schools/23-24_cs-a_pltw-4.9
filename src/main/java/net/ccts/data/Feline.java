package net.ccts.data;

/*
 * Activity 4.9.2
 */
public abstract class Feline extends Animal
{
public Feline(String food, boolean nocturnal, double aveLifeSpan)
{
    super(food, nocturnal, aveLifeSpan);
}
  public void roar()
  {
    System.out.println("The feline roars.");
  }
  public void growl()
  {
    System.out.println("The feline growls.");
  }
}