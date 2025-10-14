package Animals;

import javax.swing.JLabel;


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
    public class Monarch extends Butterfly{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Flap flap flap...","Wsp wsp wsp...","Drinking milkweed..."};
        public Monarch(String name){
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
                    String url = "https://en.wikipedia.org/wiki/Monarch_butterfly";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown butterfly type: " + name);
                    break;
            }
        }


    }
    public class Swallowtail extends Animals.Butterfly{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"ps ps ps...", "Drinking Thistle...", "flap flap flap...",};
        public Swallowtail(String name){
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
                    String url = "https://en.wikipedia.org/wiki/Swallowtail_butterfly";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown butterfly type: " + name);
                    break;
            }
        }
    }
    
}

 


