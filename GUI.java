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
        
        for (String name : animalNames) {
            JButton button = createAnimalButton(name);
            animalButtonPanel.add(button);
        }
        frame.add(animalButtonPanel, BorderLayout.CENTER);
    }

    private void loadAnimalWindow(String name) {
        JFrame animalFrame = new JFrame(name);
        animalFrame.setSize(400, 400);
        animalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        animalFrame.setVisible(true);
    }

    private void displayFrame() {
        frame.pack();
        frame.setVisible(true);
    }

}
