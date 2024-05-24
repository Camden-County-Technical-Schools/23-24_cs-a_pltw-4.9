package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Tiger extends Feline {
  public void huntAlone() {
    System.out.println("The Tiger hunts alone.");
  }

  public void swim() {
    System.out.println("The Tiger swims.");
  }

  public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A Tiger has arrived at the Zoo");
  }

  @Override
  public void speak() {
    growl();
  }
}