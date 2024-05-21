package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Lion extends Feline
{
  public void huntinPack()
  {
    System.out.println("The Lion hunts.");
  }

  public Lion(String food, boolean nocturnal, double aveLifeSpan) {   
      super(food, nocturnal, aveLifeSpan);
  }
}