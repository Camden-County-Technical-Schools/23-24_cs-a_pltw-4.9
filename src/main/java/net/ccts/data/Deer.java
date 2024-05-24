package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }

  public Deer(String food, boolean nocturnal, 
                double aveLifeSpan)
    {
    super(food, nocturnal, aveLifeSpan);
    }           
  public void sleep()
  {
    System.out.println("snort");
    super.sleep();
  }      
  public void speak()
  {
    this.grunt();
  }
}