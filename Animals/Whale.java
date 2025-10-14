package Animals;

import javax.swing.JLabel;



public abstract class Whale extends Animal {
    static String[] buttonType = {"Killer","Beluga"};
    public Whale(String name){
        super(name,buttonType);
    }
    public Whale(String name,String[] buttonType){
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
            case "Killer":
                new Killer(name);
                break;
            case "Beluga":
                new Beluga(name);
            default:
                System.out.println("Unknown Whale type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }

    public class Killer extends Animals.Whale{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"High pitched whistle...","Chomps....","Glides through water..."};
        public Killer(String name) {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name) {
            switch (name) {
                case "sound":
                    perform(actions[0]);
                    break;
                case "Eat":
                    perform(actions[1]);
                    break;
                case "Move":
                    perform(actions[2]);
                    break;
                case "WIKIPEDIAAAAAAAA":
                    String url = "https://en.wikipedia.org/wiki/Killer_whale";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Whale type: " + name);
                    break;
            }
        }
    }

    public class Beluga extends Animals.Whale{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"High pitched whistle...","Chomps....","Glides through water..."};
        public Beluga(String name) {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name) {
            switch (name) {
                case "sound":
                    perform(actions[0]);
                    break;
                case "Eat":
                    perform(actions[1]);
                    break;
                case "Move":
                    perform(actions[2]);
                    break;
                case "WIKIPEDIAAAAAAAA":
                    String url = "https://en.wikipedia.org/wiki/Beluga_whale";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Whale type: " + name);
                    break;
            }
        }
    }
    
}