package Animals;

public abstract class Pig extends Animal {
    public Pig(String name){
        super(name);

    }
    public void performEat(){
        System.out.println("Trough slop...");
    }
    public void performSound(){
        System.out.println("oink...");
    }
    public void performMove()
    {
        System.out.println("Waddle...");
    }
} 

