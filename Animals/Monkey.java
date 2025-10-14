package Animals;

import javax.swing.JLabel;



public abstract class Monkey extends Animal {
    static String[] buttonType = {"Monarch","Swallowtail"};
    public Monkey(String name){
        super(name,buttonType);
    }
    public Monkey(String name,String[] buttonType){
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