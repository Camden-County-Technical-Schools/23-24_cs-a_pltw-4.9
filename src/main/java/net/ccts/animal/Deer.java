package net.ccts.animal;

import net.ccts.data.*;
/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }

 private Hooved hooved = new Hooved() {

@Override
    public void sleep() {
        System.out.println("snort");
        hooved.sleep(); 
 }
    };

}