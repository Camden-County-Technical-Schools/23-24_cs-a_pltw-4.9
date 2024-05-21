package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Owl extends Bird
{
  public void Squawk()
  {
    System.out.println("The Owl howls.");
  }
  
  public void swim()
  {
    System.out.println("The Owl barks.");
  }

  public Owl(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Two Owls has arrived at the Zoo");
  }
}