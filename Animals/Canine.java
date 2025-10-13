package animals;

public abstract class Canine extends Animal {
    public Canine (String name)
    {
        super(name);

    }
    public void performMove()
    {
        System.out.println("Prowling...");
    }
    public void performSound()
    {
        System.out.println("Howling"...);
    }

    public void performEat()
    {
        System.out.println("Eating meat...");
    }
    
}

