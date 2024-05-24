package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Monkey extends Primate {
  public void climb() {
    System.out.println("The monkey climbs.");
  }

  public void hoot() {
    System.out.println("The monkey hoots.");
  }

  public void howl() {
    System.out.println("The monkey howls.");
  }

  public Monkey(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A Monkey has arrived at the Zoo");
  }

  @Override
  public void speak() {
    hoot();
    howl();
  }

  @Override
  public void forage() {
    System.out.println("The monkey forages for seeds");
  }
}