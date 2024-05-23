package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }
  @Override
  public void sleep()
    {
      System.out.println("Snort");
      super.sleep();
    }
  
   public void speak(){
    this.grunt;
   }      

}