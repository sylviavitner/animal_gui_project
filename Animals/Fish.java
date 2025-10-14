package animals;

public abstract class Fish extends Animal{
    public Fish(String name){
        super(name);
    }
    public void performEat(){
        System.out.println("glub glub...");
    }
    public void performSound(){
        System.out.println("blub...");
    }
    public void performMove(){
        System.out.println("wsh...");
    }
     
}

