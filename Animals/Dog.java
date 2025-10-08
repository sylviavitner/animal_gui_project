package animals;

public class Dog extends Canine implements Pet{
    public Dog(String name){
        super(name);
    }
    public void eat(){
        System.out.println("slop...");
        hungerLevel = hungerLevel - 3;
    }
    public void makeNoise(){
        System.out.println("bark...");
    }
    public void play(){
        System.out.println("run...");
    } 
    public void beFriendly(){
        System.out.println("nuzzles...");
    }
}
