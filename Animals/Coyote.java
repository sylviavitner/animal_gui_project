package nature;

public class Coyote extends Canine{
    public Coyote(String name){
        super(name);
    }
    public void makeNoise(){
        System.out.println("howl...");
    }
    public void eat(){
        System.out.println("gnaws...");
        hungerLevel = hungerLevel - 2;
    } 

}
