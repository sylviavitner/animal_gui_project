package animals;

public class Ocelot extends Feline{
    public Ocelot(String name){
        super(name);
    }
    public void eat(){
        System.out.println("pick...");
        hungerLevel = hungerLevel - 3;
    }
}
 