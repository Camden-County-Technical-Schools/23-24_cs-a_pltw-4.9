package net.ccts.data;


/*
 * Activity 4.9.2
 */
public abstract class Hooved extends Animal
{
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }

  @Override 
  public void sleep() {
    System.out.println("zz bleat zzz"); 
    super.sleep(); 
  }

}