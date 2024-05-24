package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  public Gorilla(){

    System.out.println("The Gorilla has Arrived");
  }

  @Override

  public void speak(){
    grunt();
  }
}