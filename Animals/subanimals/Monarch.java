package Animals.subanimals;

public class Monarch extends Animals.Butterfly{
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
