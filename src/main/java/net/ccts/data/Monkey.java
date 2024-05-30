package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Monkey extends Primate
{
  public Monkey()
  {
    System.out.println("A monkey arrives.");
  }

  public void climb()
  {
    System.out.println("The monkey climbs.");
  }
  
  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public void howl()
  {
    System.out.println("The monkey howls.");
  }

  public void speak()
  {
    this.hoot();
    this.howl();
  }

  @Override
    public void forage() {
        System.out.println("The monkey forages for seeds");
    }
  
}