package net.ccts.animal;
import net.ccts.data.*;
/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{

  public Gorilla() {
    System.out.println("A gorilla arrives.");
  }
  public void grunt()
  {
    System.out.println("*the gorilla grunts*");
  }

  @Override
  public void forage() {
    System.out.println("The gorilla forages for bamboo shoots.");
  }

  @Override
    public void speak() {
        grunt();
    }
}