package Animals;

import javax.swing.JLabel;

import Animals.subanimals.Monarch;
import Animals.subanimals.Swallowtail;

public abstract class Butterfly extends Animal {
    static String[] buttonType = {"Monarch","Swallowtail"};
    public Butterfly(String name){
        super(name,buttonType);
    }
    public Butterfly(String name,String[] buttonType){
        super(name,buttonType);
    }
    public void perform(String action){
        createFrame();
        printToFrame(action);
        displayFrame();

    }
    public void loadAnimalWindow(String name) {
        //create a new instance of the AnimalWindow class
        switch(name) {
            case "Monarch":
                new Monarch(name);
                break;
            case "Swallowtail":
                new Swallowtail(name);
            default:
                System.out.println("Unknown butterfly type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    
}

 


