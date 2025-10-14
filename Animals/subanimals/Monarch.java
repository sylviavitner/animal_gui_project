package Animals.subanimals;

public class Monarch extends Animals.Butterfly{
    private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
    public Monarch(String name){
        super(name,buttonType);
    }
	
    public void loadAnimalWindow(String name) {
        //create a new instance of the AnimalWindow class
        switch(name) {
            case "Sound":
                performSound();
                break;
            case "Eat":
                performEat();
                break;
            case "Move":
                performMove();
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
