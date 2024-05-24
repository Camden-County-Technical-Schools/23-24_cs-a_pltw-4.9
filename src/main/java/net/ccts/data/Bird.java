package net.ccts.data;

/*
 * Activity 4.9.2
 */
public abstract class Bird extends Animal
{
  public void Barking()
  {
    System.out.println("The Bird Barks.");
  }

  public void Squawk()
  {
    System.out.println("The Bird Squawking");
  }

  public Bird(String food, boolean nocturnal, double aveLifeSpan) {   
    super(food, nocturnal, aveLifeSpan);
  }
}