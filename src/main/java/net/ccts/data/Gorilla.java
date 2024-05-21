package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  public Gorilla(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A Gorilla has arrived at the Zoo");
  }

  @Override
  public void forage() {
    System.out.println("The gorilla forages for bamboo shoots");
  }
}