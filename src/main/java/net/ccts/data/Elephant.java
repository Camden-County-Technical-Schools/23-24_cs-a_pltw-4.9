package net.ccts.data;

public class Elephant extends Animal{
public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
{
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The new arrival is and Elephant.")
}
public Elephant()
{
}

public void trumpet()
{
    System.out.println("The Elephant blows its trumpet.");
}

}



