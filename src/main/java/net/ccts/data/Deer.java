package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public Deer() {
    
  }

  public void grunt()
  {
    System.out.println("The deer grunts.");
  }

  public void speak()
  {
    this.grunt();
  }

  @Override
    public void sleep() {
        System.out.println("snort");
        super.sleep();
    }

  

}