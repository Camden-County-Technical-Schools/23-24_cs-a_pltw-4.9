package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Lion extends Feline
{
    public Lion(String food, boolean nocturnal, double aveLifeSpan) 
  {
    super(food, nocturnal, aveLifeSpan);
  }

  public void huntinPack()
  {
    System.out.println("The lion hunts in packs.");
  }
}