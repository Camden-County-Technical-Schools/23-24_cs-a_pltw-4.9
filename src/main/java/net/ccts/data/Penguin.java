package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Penguin extends Bird
{
public Penguin()
{
}
  public void fish()
  {
    System.out.println("The penguin fishes for its food.");
  }
@Override
public void speak()
{
  System.out.println("A penguin is silent.");
}
}