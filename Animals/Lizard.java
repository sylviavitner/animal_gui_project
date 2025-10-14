package Animals;

public abstract class Lizard extends Animal implements DietBehavior, MovementBehavior, SoundBehavior
{
    public static String[] buttonType = {"GilaMonster", "GreenIguana"}
    public Lizard (String name)
    {
        super(name, buttonType);
    }
    public Lizard (String name, String[] buttonType2) {
        super(name, buttonType2); 
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


