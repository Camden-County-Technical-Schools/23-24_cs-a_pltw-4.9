package net.ccts.animal;
import net.ccts.data.*;

/*
 * Activity 4.9.2
 */
public class Owl extends Bird
{
  public Owl(String food, boolean nocturnal, double aveLifeSpan) 
  {
    super(food, nocturnal, aveLifeSpan);
  }

  public Owl() {
    
  }

  public void hunt()
  {
    System.out.println("The owl went on a hunt.");
  }
}