package Animals;

import javax.swing.JLabel;



public abstract class Pig extends Animal {
    static String[] buttonType = {"WildBoar","Tamworth"};
    public Pig(String name){
        super(name,buttonType);
    }
    public Pig(String name,String[] buttonType){
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
            case "WildBoar":
                new WildBoar(name);
                break;
            case "Tamworth":
                new Tamworth(name);
            default:
                System.out.println("Unknown Pig type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    public class WildBoar extends Animals.Pig{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Oink Oink...","Nom nom nom...","Waddles..."};
        public WildBoar(String name) {
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
                    String url = "https://en.wikipedia.org/wiki/Wild_boar";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Pig type: " + name);
                    break;
            }
        }
    }

    public class Tamworth extends Animals.Pig{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Oink Oink...","Nom nom nom...","Waddles..."};
        public Tamworth(String name) {
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
                    String url = "https://en.wikipedia.org/wiki/Wild_boar";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Pig type: " + name);
                    break;
            }
        }
    }
}