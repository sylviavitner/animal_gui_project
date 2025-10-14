package Animals;

import javax.swing.JLabel;



public abstract class Turtle extends Animal {
    static String[] buttonType = {"Snapping Turtle","Box Turtle"};
    public Turtle(String name){
        super(name,buttonType);
    }
    public Turtle(String name,String[] buttonType){
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
            case "Snapping Turtle":
                new Snapping(name);
                break;
            case "Box Turtle":
                new Box(name);
            default:
                System.out.println("Unknown Turtle type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }

    public class Snapping extends Animals.Turtle{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Low groan","Chomp....","Slowly walks..."};
        public Snapping(String name) {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name) {
            switch (name) {
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
                    String url = "https://en.wikipedia.org/wiki/Common_snapping_turtle";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Turtle type: " + name);
                    break;
            }
        }
    }

    public class Box extends Animals.Turtle{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Low groan","Chomp....","Slowly walks..."};
        public Box(String name) {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name) {
            switch (name) {
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
                    String url = "https://en.wikipedia.org/wiki/Common_box_turtle";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Turtle type: " + name);
                    break;
            }
        }
    }
    
}