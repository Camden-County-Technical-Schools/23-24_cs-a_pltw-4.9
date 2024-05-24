package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public void groan()
  {
    System.out.println("The hippo groans.");
  }

  public Hippo(){
    
  }

  @Override

  public void speak(){
    groan();
  }
  
}