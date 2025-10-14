package Animals.subanimals;
public class SilkieChicken extends Animals.Chicken
{
  private static String[] buttonType = {"Sound","Eat", "Move", "WIKIPEDIAAAAAAAA"};
  private static String[] actions = {"SCREECH!..." "Tsk tsk tsk...", "Ruffles Feathers..."};
  public SilkieChicken(String name)
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
