package net.ccts.data;

/*
 * Activity 4.9.2
 */
public abstract class Animal
{
    private String food;
    private boolean nocturnal;
    private double aveLifeSpan;

    public Animal()
    {
    }

    // This is the exact same error from other students
    // Please resolve this on your own to receive full credit
    public Animal(String goof, boolean nocturnal, double aveLifeSpan)
    {
     this.food = food;
     this.nocturnal = nocturnal;
     this.aveLifeSpan = aveLifeSpan;
    }

    public void eat()
    {
        System.out.println("This animal's diet consists of " + food + ".");
    }

    public void isNocturnal()
    {
        if (nocturnal)
            System.out.println("This animal is active at night.");
        else
            System.out.println("This animal is active during the day.");
    }

    public void getLifeSpan()
    {
        System.out.println("This animal's life span is " + aveLifeSpan + " years.");
    }

    public void sleep()
    {
        System.out.println("zzzzz");
    }

}