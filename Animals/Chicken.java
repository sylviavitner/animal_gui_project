package Animals;

public abstract class Chicken extends Animal {
    public Chicken(String name){
    super(name);

    }
   public void performEat()
    {
        System.out.println("Pecking at grains...");
    }
   public void performSound()
    {
        System.out.println("Bawk!");
    }
    public void performMove(){
        System.out.println("Hops...");
    } 
}

