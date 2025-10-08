package animals;

public abstract class Feline extends Animal {
    public Feline(String name){
    super(name);

    }
    public void roam(){
        System.out.println("felines like to roam alone...");
        hungerLevel = hungerLevel + 1;
    }
    public void sleep(){
        System.out.println("taking a cat nap...");
        hungerLevel = 10;
    }
    public void makeNoise(){
        System.out.println("meow...");
    } 
}
