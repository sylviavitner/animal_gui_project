package animals;

public class Wolf extends Canine {
    public Wolf(String name){
        super(name);

    }
    public void eat(){
        System.out.println("rip with teeth...");
        hungerLevel = hungerLevel - 2 ;
    }
    public void makeNoise(){
        System.out.println("growl...");
    }
} 
