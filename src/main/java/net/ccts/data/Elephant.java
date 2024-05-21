package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
  public void trumpet()
  {
    System.out.println("The elephant trumpets.");
  }
  public void forage()
  {
    System.out.println("The elephant forages for food.");
  }

  public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
        System.out.println("New elephant has arrived");

  }

public Elephant(){}

}

