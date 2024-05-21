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

  @Override 

  public void forage() {
    System.out.println("Teh gorilla forages for bamboo shoots."); 
    super.forage(); 
  }
}