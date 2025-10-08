package animals;

public class Hippo extends Animal {
    public Hippo(String name){
        super(name);
    }
    public void eat(){
        hungerLevel = hungerLevel - 1;
        System.out.println("slurp...");;
    }
    public void makeNoise(){
        System.out.println("blub...");
    }
}
 