package net.ccts.data;

/*
 * Activity 4.9.2
 */

public class Elephant extends Animal
{
  public Elephant(String food, boolean nocturnal, double aveLifeSpan) 
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The new animal arrival is a Elephant.");
  }

  public Elephant() {
    
  }

  public void speak()
  {
    this.trumpet();
  }

  public void trumpet()
  {
    System.out.println("The elephant makes trumpet noises.");
  }


  public void forage()
  {
    System.out.println("The elephant forages for food.");
  }
}
