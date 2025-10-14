package Animals;

import Animals.subanimals.Monarch;
import Animals.subanimals.Swallowtail;

public abstract class Butterfly extends Animal {
    // String animalType1 = "Monarch";
    // String animalType2 = "Swallowtail";
    String[] animalType = {"Monarch","Swallowtail"};
    public Butterfly(String name){
        super(name);
    }
    public void performEat()
    {
        System.out.println("Drinking milkweed...");
    }
    public void performMove()
    {
        System.out.println("Flap flap flap...");
    }

    public void performSound()
    {
        System.out.println("Wsp wsp wsp...");
    }

    public void loadAnimalWindow(String name) {
        //create a new instance of the AnimalWindow class
        switch(name) {
            case "1":
                new Monarch(name);
                break;
            case "2":
                new Swallowtail(name);
            default:
                System.out.println("Unknown butterfly type: " + name);
                break;
        }
    }
    
}

 
