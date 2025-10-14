package Animals;

import javax.swing.JLabel;

public abstract class Chicken extends Animal {
    static String[] buttonType = {"Leghorn","SilkieChicken"};
    public Chicken(String name){
        super(name,buttonType);
    }
    public Chicken(String name,String[] buttonType){
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
            case "Leghorn":
                new Leghorn(name);
                break;
            case "SilkieChicken":
                new SilkieChicken(name);
            default:
                System.out.println("Unknown butterfly type: " + name);
                break;
        }
    }
    private void printToFrame(String action){
        JLabel label = new JLabel(action);
        frame2.add(label);
    }

    public class Leghorn extends Chicken {
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"Ba-kawk!...","Tp tp tp...", "Ruffles Feathers..."};



        public Leghorn(String name)
        {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name)
        {
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
                    String url = "https://en.wikipedia.org/wiki/Leghorn_chicken";
                    try
                        {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                        }
                        catch(java.io.IOException e)
                        {
                        System.out.println(e.getMessage());
                        }
                    break;
                default:
                System.out.println("Unknown chicken type: " + name);
                break;
                
            }
  
  
        }

    }
    public class SilkieChicken extends Chicken
        {
        private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
        private static String[] actions = {"SCREECH!..." ,"Tsk tsk tsk...", "Ruffles Feathers..."};
        public SilkieChicken(String name)
        {
            super(name, buttonType);
        }
        public void loadAnimalWindow(String name)
        {
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
                String url = "https://en.wikipedia.org/wiki/Silkie";
                try
                    {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    }
                    catch(java.io.IOException e)
                    {
                    System.out.println(e.getMessage());
                    }
                break;
                default:
                System.out.println("Unknown chicken type: " + name);
                break;
                
            }
        }



    }
    
}







 


