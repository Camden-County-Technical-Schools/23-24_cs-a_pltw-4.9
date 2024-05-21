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

  public Deer(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An Deer has arrived at the Zoo");
  }
  @Override
  public void sleep() {
    System.out.println("snort");
    super.sleep(); // Call sleep from Hooved
}

}