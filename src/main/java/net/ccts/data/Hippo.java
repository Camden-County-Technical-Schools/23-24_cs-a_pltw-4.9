package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved {
  public void groan() {
    System.out.println("The hippo groans.");
  }

  public Hippo(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A Hippo has arrived at the Zoo");
  }

  @Override
  public void speak() {
    groan();
  }

  @Override
  public void sleep() {
    System.out.println("zzz bleat zzz");
  }
}