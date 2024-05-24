package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }

  public Giraffe(){

  }

  public Giraffe(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The Tiger has arrived");
  }   
  @Override

  public void speak(){
    hum();
  }

    
}