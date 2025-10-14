
import Animals.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI {
    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String NAME = "Planet Zoo 2";
    private JFrame frame;
    private JPanel animalButtonPanel;
    private final String[] animalNames = {
        "Butterfly", "Chicken", "Fish", "Lion", "Lizard",
        "Monkey", "Pig", "Snake", "Turtle", "Whale"
    };

    public GUI() {
        createFrame();
        setButtons();
        displayFrame();
    }

    public void createFrame() {
        frame = new JFrame();
        frame.setTitle(NAME);
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

    private JButton createAnimalButton(String name) {
        JButton button = new JButton(name);
        
        ImageIcon icon = new ImageIcon("images/" + name.toLowerCase() + ".jpg");
        Image scaledImage = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        button.setIcon(icon);
        //button press action creates a call to the loadAnimalWindow method
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadAnimalWindow(name);
            }
        });

        return button;
    }

    public void setButtons() {
        animalButtonPanel = new JPanel(new GridLayout(2, 5, 10, 10));
        animalButtonPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        //using a for-each loop to create buttons for each animal
        for (String name : animalNames) {
            JButton button = createAnimalButton(name);
            animalButtonPanel.add(button);
        }
        frame.add(animalButtonPanel, BorderLayout.CENTER);
    }

    private void loadAnimalWindow(String name) {
        switch (name) {
            case "Butterfly":
                    Butterfly butterfly = new Butterfly("butterfly") {};
                break;
            case "Chicken":
                    Chicken chicken = new Chicken("chicken") {};
                break;
            case "Fish":
                    Fish fish = new Fish("fish") {};
                break;
            case "Lion":
                    Lion lion = new Lion("lion") {};
                break;
            case "Lizard":
                    Lizard lizard = new Lizard("lizard") {};
                break;
            case "Monkey":
                    Monkey monkey = new Monkey("monkey") {};
                break;
            case "Pig":
                    Pig pig = new Pig("pig - not a cop") {};
                break;
            case "Snake":
                    Snake snake = new Snake("snake") {};
                break;
            case "Turtle":
                    Turtle turtle = new Turtle("turtle") {};
                break;
            case "Whale":
                    Whale whale = new Whale("whale") {};
                break;

            default:
                throw new AssertionError();
        }

        
        




        
        


    }

    private void displayFrame() {
        frame.pack();
        frame.setVisible(true);
    }

}
