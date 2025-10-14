package animals; 
public abstract class Animal {

    protected String name; 

    public Animal(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public abstract void performMove();
    public abstract void performSound();
    public abstract void performEat();
}

