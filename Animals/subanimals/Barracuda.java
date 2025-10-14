package Animals.subanimals;

public class Barracuda extends Animals.Fish{
    private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
    private static String[] actions = {"Dun dun dun du...", "chomp...", "Races in the water..."};
    public Barracuda (String name){
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
