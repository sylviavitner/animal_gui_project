package Animals;

public abstract class Whale extends Animal {
    public Whale(String name)
    {
        super(name);
    }
    public void performMove()
    {
        System.out.println("Swimming...");
    }
    public void performSound()
    {
        System.out.println("Awoo...");
    }
    public void performEat()
    {
        System.out.println("Eating plankton...");
    }
    
}

 
