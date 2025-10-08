package nature;

public abstract class Canine extends Animal {
    public Canine(String name){
        super(name);

    }
    public void roam(){
        System.out.println("like canines roam in packs...");
        hungerLevel = hungerLevel + 1; 
    }
    
}
