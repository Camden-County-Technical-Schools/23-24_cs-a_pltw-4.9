package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public Gorilla()
  {
    System.out.println("A gorilla arrives.");
  }

  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  @Override
    public void sleep() {
        System.out.println("The gorilla forages for bamboo shoots");
    }
}