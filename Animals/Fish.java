package Animals;

import javax.swing.JLabel;



public abstract class Fish extends Animal {
    static String[] buttonType = {"Barracuda","Swallowtail"};
    public Fish(String name){
        super(name,buttonType);
    }
    public Fish(String name,String[] buttonType){
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
            case "Barracuda":
                new Barracuda(name);
                break;
            case "Swallowtail":
                new Swallowtail(name);
            default:
                System.out.println("Unknown Fish type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    
    public class Barracuda extends Animals.Fish
    {
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Dun dun dun du...", "chomp...", "Races in the water..."};
        public Barracuda (String name)
        {
            super(name,buttonType);
        }
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
                    String url = "https://en.wikipedia.org/wiki/Barracuda";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown fish type: " + name);
                    break;
            }
        }
    }

}
