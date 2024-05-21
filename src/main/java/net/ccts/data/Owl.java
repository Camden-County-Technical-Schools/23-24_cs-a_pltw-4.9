package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Owl extends Animal
{
  public void hunt()
  {
    System.out.println("The Owl hunts.");
  }
  public Owl(String food, boolean nocturnal, 
                double aveLifeSpan)
    {
    super(food, nocturnal, aveLifeSpan);
    }                 

}
