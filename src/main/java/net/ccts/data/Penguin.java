package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Penguin extends Bird
{
  public void Squawk()
  {
    System.out.println("The Penquin squawks.");
  }
  
  public void swim()
  {
    System.out.println("The Penguin swims.");
  }

  public Penguin(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A Penguin has arrived at the Zoo");
  }
}