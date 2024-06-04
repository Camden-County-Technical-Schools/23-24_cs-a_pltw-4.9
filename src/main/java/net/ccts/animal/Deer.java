package net.ccts.animal;

import net.ccts.data.*;
/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{

  @Override
  public void speak() {
    grunt();
  }

  public void grunt()
  {
    System.out.println("The deer grunts.");
  }

  @Override
  public void sleep() {
    System.out.println("snort");
    super.sleep();
  }
}