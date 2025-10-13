package animals;

public abstract class Lizard extends Animal
{
    public Lizard (String name)
    {
        super(name);
    }
  public void performMove()
    {
    System.out.println("Skittering around...");
    }

    public void performSound()
    {
    System.out.println("Sksksks...");
    }
    public void performEat()
    {
    System.out.println("Kills insect with tongue...");
    }

}

