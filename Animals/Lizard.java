package Animals;

import javax.swing.JLabel;



public abstract class Lizard extends Animal {
    static String[] buttonType = {"GillaMonster","GreenIguana"};
    public Lizard(String name){
        super(name,buttonType);
    }
    public Lizard(String name,String[] buttonType){
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
            case "GilaMonster":
                new GilaMonster(name);
                break;
            case "GreenIguana":
                new GreenIguana(name);
            default:
                System.out.println("Unknown Lizard type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    public class GilaMonster extends Animals.Lizard{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Grrrrr...","Nom nom nom...","Slither slither..."};
        public GilaMonster(String name) {
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
                    String url = "https://en.wikipedia.org/wiki/Gila_monster";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown lizard type: " + name);
                    break;
            }
        }
    }

    public class GreenIguana extends Animals.Lizard{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Grrrrr...","Nom nom nom...","Slither slither..."};
        public GreenIguana(String name) {
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
                    String url = "https://en.wikipedia.org/wiki/Green_iguana";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown lizard type: " + name);
                    break;
            }
        }
    }


    
}