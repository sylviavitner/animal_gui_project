package animals;

public abstract class Lion extends Animal{
    public Lion(String name){
        super(name);
    }
    public void performEat()
    {
        System.out.println("Rip into the meal.");
    }
    public void performMove()
    {
         System.out.println("Slink around the tall gras...");
    }
    public void performSound()
    {
        System.out.println("A might roar...");
    }
}

 
