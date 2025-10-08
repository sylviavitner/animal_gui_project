package animals;

public class Lion extends Feline{
    public Lion(String name){
        super(name);
    }
    public void eat(){
        System.out.println("rip with teeth...");
        hungerLevel = hungerLevel - 2;
    }
    public void makeNoise(){
        System.out.println("roar...");
    }
}
 