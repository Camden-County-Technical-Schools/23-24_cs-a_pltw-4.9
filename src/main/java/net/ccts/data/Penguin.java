package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Penguin extends Animal
{
  public void fish()
  {
    System.out.println("The penguin fishes.");
  }
  public Penguin(String food, boolean nocturnal, 
                double aveLifeSpan)
    {
    super(food, nocturnal, aveLifeSpan);
    }                 

}
