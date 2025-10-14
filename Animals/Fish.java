package Animals;

import javax.swing.JLabel;


public abstract class Fish extends Animal {
    static String[] buttonType = {"Barracuda","AlligatorGar"};
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
    public void loadAnimalWindow(String name) 
    {
        //create a new instance of the AnimalWindow class
        switch(name) {
            case "Barracuda":
                new Barracuda(name);
                break;
            case "AlligatorGar":
                new AlligatorGar(name);
            default:
                System.out.println("Unknown Fish type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }
    public class Barracuda extends Fish{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"fwsh fwsh fwsh...","Lurking in the water...","Chomp..."};
        public Barracuda(String name){
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
                    String url = "https://en.wikipedia.org/wiki/Barracuda";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Fish type: " + name);
                    break;
            }
        }


    }
    public class AlligatorGar extends Animals.Fish{
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"See you later...", "swim swim swim...", "Tear through flesh...",};
        public AlligatorGar(String name){
            super(name,buttonType);
        }
        
        public void loadAnimalWindow(String name) {
            //create a new instance of the AnimalWindow class
            switch(name) 
            {
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
                    String url = "https://en.wikipedia.org/wiki/Alligator_gar";
                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (java.io.IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Unknown Fish type: " + name);
                    break;
            }
        }
    }
    
}

