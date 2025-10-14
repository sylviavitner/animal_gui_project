package animals;

public abstract class Snake extends Animal {
    public Snake (String name)
    {
        super(name);

    }
    public void performMove()
    {
        System.out.println("Slithering...");
    }
    public void performSound()
    {
        System.out.println("Hissss...");
    }

    public void performEat()
    {
        System.out.println("Swallows food whole...");
    }
    
}



