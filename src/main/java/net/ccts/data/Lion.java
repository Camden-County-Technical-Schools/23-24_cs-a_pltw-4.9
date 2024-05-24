package net.ccts.data;


public class Lion extends Feline{
    public void huntinPack()
    {
        System.out.println("Lions hunt in a pack");
    }

    public Lion(){
        
    }

    @Override

    public void speak(){
        super.roar();
    }
}
