package Animals.subanimals;
public class Leghorn extends Animals.Chicken
{
  private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
  private static String[] actions = {"Ba-kawk!..." "Tp tp tp...", "Ruffles Feathers..."};
  public Leghorn(String name)
  {
    super(name, buttonType);
  }
  public void loadanimalWindow(String name)
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
  
  
