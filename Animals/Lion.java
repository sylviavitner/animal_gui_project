package Animals;

import javax.swing.JLabel;


public abstract class Lion extends Animal {
    static String[] buttonType = {"Lion","Scar"};
    public Lion(String name){
        super(name,buttonType);
    }
    public Lion(String name,String[] buttonType){
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
            case "Mufasa":
                new Mufasa(name);
                break;
            case "Scar":
                new Scar(name);
            default:
                System.out.println("Unknown Lion type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    public class Mufasa extends Lion{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"RAW- i mean ROAR...","Sprinting through the Savannah...","Rips into buffalo..."};
        public Mufasa(String name){
            super(name,buttonType);
        }
        
        public void loadAnimalWindow(String name) {
            //create a new instance of the AnimalWindow class
            switch(name) {
                case "Sound":
                    perform(actions[0]);
                    break;
                case "Eat":
                    perform(actions[2]);
                    break;
                case "Move":
                    perform(actions[1]);
                    break;
                case "WIKIPEDIAAAAAAAA":
                    String url = "https://en.wikipedia.org/wiki/Mufasa";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Lion type: " + name);
                    break;
            }
        }


    }
    public class Scar extends Animals.Lion{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Muahahaha...", "Slinks around...", "Sinking Teeth into hyenas....",};
        public Scar(String name){
            super(name,buttonType);
        }
        
        public void loadAnimalWindow(String name) {
            //create a new instance of the AnimalWindow class
            switch(name) {
                case "Sound":
                    perform(actions[0]);
                    break;
                case "Eat":
                    perform(actions[1]);
                    break;
                case "Move":
                    perform(actions[2]);
                    break;
                case "WIKIPEDIAAAAAAAA":
                    String url = "https://en.wikipedia.org/wiki/Scar_(The_Lion_King)";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Lion type: " + name);
                    break;
            }
        }
    }
    
}
