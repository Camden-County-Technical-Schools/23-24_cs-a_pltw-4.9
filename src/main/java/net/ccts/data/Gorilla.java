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
        System.out.println("The gorilla forages for bamboo shoots");
    }

    @Override
    public void sleep() {
        System.out.println("Gorilla sleeps in nests");
    }
}