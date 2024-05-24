package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Owl extends Bird
{
public Owl()
{
}
public Owl(String food, boolean nocturnal, double aveLifeSpan)
{
  super(food, nocturnal, aveLifeSpan);
  System.out.println("An owl arrives.");
}
  public void hunt()
  {
    System.out.println("The owl hunts its prey!");
  }
@Override
public void speak()
{
  System.out.println("An owl hoots.");
}
}