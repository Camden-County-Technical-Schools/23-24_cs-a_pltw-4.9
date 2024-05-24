package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Elephant extends Animal {
  public void trumpet() {
    System.out.println("The Elephant trumpets.");
  }

  public void forage() {
    System.out.println("The Elephant forages.");
  }

  public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An Elephant has arrived at the Zoo");
  }
  
  @Override
  public void speak() {
    trumpet();
  }
}