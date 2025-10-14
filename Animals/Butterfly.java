package animals;

public abstract class Butterfly extends Animal {
    public Butterfly(String name){
        super(name);
    }
public void performEat()
    {
        System.out.println("Drinking milkweed...");
    }
    public void performMove()
    {
        System.out.println("Flap flap flap...");
    }

    public void performSound()
    {
        System.out.println("Wsp wsp wsp...");
    }
}

 
