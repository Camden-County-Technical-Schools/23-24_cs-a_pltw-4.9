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

  public void speak()
  {
    this.grunt();
  }

  @Override
    public void forage() {
        System.out.println("The gorilla forages for bamboo shoots");
    }
}