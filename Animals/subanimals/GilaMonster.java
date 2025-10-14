package Animals.subanimals;

import Animals.Lizard;

public class GilaMonster extends Animals.Lizard{
    private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
    public GilaMonster(String name) {
        super(name, buttonType);
    }
    public void loadAnimalWindow(String name) {
        switch (name) {
            case "sound":
                performSound();
                break;
            case "Eat":
                performEat();
                break;
            case "Move":
                performMove();
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
