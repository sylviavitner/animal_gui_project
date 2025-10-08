package nature; 
public abstract class Animal {
    protected String name; 
    protected int hungerLevel = 0;

    public Animal(String name){
        this.name = name;

    }
    public int getHungerLevel(){
        return hungerLevel; 
    }
    public String getName(){
        return name;
    }
    public void setHungerLevel(int hungerLevel){
        if(hungerLevel <= 10 && hungerLevel >= 0){
            this.hungerLevel = hungerLevel;
        }else if(hungerLevel>10){
            this.hungerLevel = 10;
        }else if(hungerLevel<0){
            this.hungerLevel = 0;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void sleep(){
        hungerLevel = 10; 
        System.out.println("sleeping...");
    }
    public void roam(){
        hungerLevel = hungerLevel + 1;
        System.out.println("moving around"); 
    }
    public abstract void eat();
    public abstract void makeNoise();

    
    
    
    

}