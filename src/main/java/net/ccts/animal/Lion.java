package net.ccts.animal;
import net.ccts.data.*;
public class Lion extends Feline
{
  public void huntInPack()
  {
    
    System.out.println("The lion hunts in a pack.");
  }
  public Lion(String food, boolean nocturnal, 
                double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
public void speak()
  {
    super.roar();
  }

}