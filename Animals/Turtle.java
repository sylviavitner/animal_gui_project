package animals;

public abstract class Turtle extends Animal{
    public Turtle (String name){
        super(name);
    }
   public void performMove()
    {
        System.out.println("Slow crawl...");
    }

    public void performSound()
    {
        System.out.println("Creakkk...");
    }

    public void performEat()
    {
        System.out.println("Slowly chews lettuce...");
    }
} 

