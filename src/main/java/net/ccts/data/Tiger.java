package net.ccts.data;

public class Tiger extends Feline{
public Tiger(String food, boolean nocturnal, 
                double aveLifeSpan)
{
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The new arrival is and Tiger.")
}
public Tiger()
{
}

public void growl()
{
    System.out.println("The Tiger growls.");
}

}



