package Animals;

public abstract class Monkey extends Animal
{
    public Monkey(String name){
        super(name);
    }
    public void performEat(){
        System.out.println("aahhhh");
    }
    public void performSound(){
        System.out.println("ooh aah...");
    }
    public void performMove(){
        System.out.println("Swinging from the vines...");
    } 
}

