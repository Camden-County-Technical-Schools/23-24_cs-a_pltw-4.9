package net.ccts.data;


/*
 * Activity 4.9.2
 */
public abstract class Hooved extends Animal
{

  public Hooved(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("S new hovved animal arrives.");
  }

  public Hooved() {

  
  }
  
  @Override
  public void sleep() {
    System.out.println("zzz bleat zzz");
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}