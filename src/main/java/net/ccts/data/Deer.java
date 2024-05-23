package net.ccts.data;

/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
//    @Override
//    public void speak() {
//      grunt();
//    }

    public void grunt() {
        System.out.println("Deer grunts");
    }
    @Override
    public void sleep() {
        System.out.print("snort");
        super.sleep();
    }
}